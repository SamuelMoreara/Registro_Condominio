
package Controlador;
import Modelo.Pago;
import Modelo.PagoSQL;
import Modelo.Deuda;
import Modelo.DeudaSQL;
import Modelo.DeudaE;
import Modelo.DeudaESQL;
import Modelo.Casa;
import Modelo.CasaSQL;
import Controlador.RegistroCuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author ARANAGA
 */
public class Pagos {
    Pago modeloPago = new Pago();
    PagoSQL modeloPagoSQL = new PagoSQL();
    DeudaE modeloDeudaE = new DeudaE();
    DeudaESQL modeloDeudaESQL = new DeudaESQL();
    Casa modeloCasa = new Casa();
    CasaSQL modeloCasaSQL = new CasaSQL();
    RegistroCuenta cuenta = new RegistroCuenta();
    
    Tasa tasa = new Tasa();
    int casa = 0, tasaDolares = 0;
    float dolaresPago, dolaresDeuda, dolaresRestante, bolivaresConvertidos;
    int bolivaresPago, bolivaresDeuda, bolivaresRestante, dolaresConvertidos, estado;

    public void pagar(int eleccion, int tasax, Pago modeloP, Pago modelo_pago_antiguo, DeudaE modeloDE){
        modeloPago = modeloP;
        modeloDeudaE = modeloDE;
        casa = modeloPago.getNumero_casa2();
        tasaDolares = tasax;
        
        //Seleccion: Registrar - Modificar
        switch(eleccion){
            case 1: //Registrar
                    if(modeloPagoSQL.registrar(modeloPago)){
                        llamar_comparacion();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Error detectado en el proceso de registro");
                    }
                    break;
            case 2: //Modificar
                    if(modeloPagoSQL.modificar(modeloPago)){
                        compararRegistros(modelo_pago_antiguo, modeloPago);
                        llamar_comparacion();
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Error al modificar el modelo");
                    }
                    break;
            }
    }
    
    private void llamar_comparacion(){
        if(compararMontos()){
            cuenta.actualizarCuenta(modeloPago,modeloDeudaE,casa);
            actualizar_deuda_casa(casa);                
        }
        else{
            JOptionPane.showMessageDialog(null,"Error detectado en el proceso de comparacion");
        }
    }
    
    public void actualizar_deuda_casa(int casa){
        float deuda_dolares = 0;
        int deuda_bolivares = 0;
        
        deuda_dolares = modeloDeudaESQL.obtener_total_deuda_dolares(casa);
        deuda_bolivares = modeloDeudaESQL.obtener_total_deuda_bolivares(casa);
        
        System.out.println("DD: "+deuda_dolares);
        System.out.println("DB: "+deuda_bolivares);
        
        if(modeloCasaSQL.actualizar_deuda_restante(casa, deuda_dolares, deuda_bolivares)){
            System.out.println("Deuda Restante de Casa: Actualizada");
        }
        else{
            System.out.println("Deuda Restante de Casa: Error");
        }
    }
    
    private boolean compararMontos(){
        //Metodo para comparar los montos y aplicar proceso necesario
        
        inicializar_variables_calculo();
        
            //OBTENCION DEL MONTO DE DEUDA - DESDE BD
            if(modeloDeudaESQL.obtenerMonto(modeloDeudaE)){
                
                comprobar_deuda_casa();
                
                convertir_dinero();

                //VERIFICACION DE PAGO Y DEUDA
                //1) Si el pago cubre la deuda
                if(registrar_pago_completo()){
                    return true;
                }
                
                //2) Si el pago es mayor que la deuda
                if(registrar_pago_mayor()){
                    return true;
                }
                
                //3) Si el pago es menor que la deuda
                if(registrar_pago_menor()){
                    return true;
                }
                
            }
            return false;
    }
    
    private void compararRegistros(Pago modelo_antiguo, Pago modelo_nuevo){
        Deuda deuda = new Deuda();
        DeudaE deudae_antigua = new DeudaE();
        DeudaE deudae_nueva = new DeudaE();
        DeudaSQL deudaSQL = new DeudaSQL();
        
        float fondo_dolares_remover = 0, operacion_dolares = 0;
        int fondo_bolivares_remover = 0, operacion_bolivares = 0;
        
        if( modelo_antiguo.getNumero_casa2() != modelo_nuevo.getNumero_casa2() ||
            modelo_antiguo.getId_deuda2().equals(modelo_nuevo.getId_deuda2()) ||
            modelo_antiguo.getMonto_dolares() != modelo_nuevo.getMonto_dolares() ||
            modelo_antiguo.getMonto_bolivares() != modelo_nuevo.getMonto_bolivares()){
            
            //Buscar a la DeudaE, Cuenta y Casa (por credito y estado)
            inicializar_variables_calculo();
                
            dolaresPago = modelo_antiguo.getMonto_dolares();
            dolaresDeuda = deuda.getMonto_dolares();
            bolivaresPago = modelo_antiguo.getMonto_bolivares();
            bolivaresDeuda = deuda.getMonto_bolivares();
            
            convertir_dinero();    
            
            deuda.setId_deuda(modelo_antiguo.getId_deuda2());
            
            if(deudaSQL.buscar(deuda)){
                deudae_antigua.setId_deuda2(modelo_antiguo.getId_deuda2());
                deudae_antigua.setNumero_casa3(modelo_antiguo.getNumero_casa2());
                modeloDeudaESQL.obtenerDeudaRestante(deudae_antigua);
            
                if(deudae_antigua.getDeuda_restante_dolares() >= 0){
                    if(dolaresPago > 0 && dolaresDeuda > 0){
                        operacion_dolares = dolaresDeuda -(deudae_antigua.getDeuda_restante_dolares() +
                            dolaresPago);
                        
                        if(operacion_dolares <= 0){
                            deudae_nueva.setDeuda_restante_dolares(0); 
                        }
                        else{
                            deudae_nueva.setDeuda_restante_dolares(operacion_dolares); 
                        }  
                    }
                    
                    if(bolivaresPago > 0 && dolaresDeuda > 0){
                        operacion_dolares = dolaresDeuda -(deudae_antigua.getDeuda_restante_dolares() +
                            bolivaresConvertidos); 
                    
                        if(operacion_dolares <= 0){
                            deudae_nueva.setDeuda_restante_dolares(0);
                        }
                        else{
                            deudae_nueva.setDeuda_restante_dolares(operacion_dolares);
                        }  
                    } 
                }
                
                if(deudae_antigua.getDeuda_restante_bolivares() >= 0){
                    if(bolivaresPago > 0 && bolivaresDeuda > 0){
                        operacion_bolivares = bolivaresDeuda -(deudae_antigua.getDeuda_restante_bolivares() +
                        bolivaresPago);
                        
                        if(operacion_bolivares <= 0){
                            deudae_nueva.setDeuda_restante_bolivares(0); 
                        }
                        else{
                            deudae_nueva.setDeuda_restante_bolivares(operacion_bolivares); 
                        }
                    }
                    
                    if(dolaresPago > 0 && bolivaresDeuda > 0){
                        operacion_bolivares = bolivaresDeuda -(deudae_antigua.getDeuda_restante_bolivares() +
                        dolaresConvertidos);
                        
                        if(operacion_bolivares <= 0){
                            deudae_nueva.setDeuda_restante_bolivares(0); 
                        }
                        else{
                            deudae_nueva.setDeuda_restante_bolivares(operacion_bolivares); 
                        }
                    }
                }
                
                deudae_nueva.setId_deuda2(modelo_antiguo.getId_deuda2());
                deudae_nueva.setNumero_casa3(modelo_antiguo.getNumero_casa2());
                deudae_nueva.setEstado("No pagada");
                
                if(modeloDeudaESQL.modificar_deuda_restante(deudae_nueva)){
                    System.out.println("Estado y Deuda Restante: Modificados");
                }
            }
        }
        
        if(modelo_antiguo.getNumero_casa2() != modelo_nuevo.getNumero_casa2()){
            //Buscar el monto de la deuda, compararla con el monto pagado antiguo,
            //determinar si el credito es por esta, eliminarlo de ser necesario
                
            if(dolaresDeuda > 0){
                if(dolaresPago > dolaresDeuda){
                    fondo_dolares_remover = dolaresPago - dolaresDeuda;
                }
                    
                if(bolivaresConvertidos > dolaresDeuda){
                    dolaresRestante = bolivaresConvertidos - dolaresDeuda;
                    fondo_bolivares_remover = tasa.transformaraBolivares(dolaresRestante,tasaDolares);
                }
            }
            if(bolivaresDeuda > 0){
                if(bolivaresPago > bolivaresDeuda){
                    fondo_bolivares_remover = 
                            bolivaresPago - bolivaresDeuda;
                }
                    
                if(dolaresConvertidos > bolivaresDeuda){
                    bolivaresRestante = dolaresConvertidos - bolivaresDeuda;
                    fondo_dolares_remover = tasa.transformaraDolares(bolivaresRestante,tasaDolares);
                }
            }
                
            modeloCasa.setNumero_casa(modelo_antiguo.getNumero_casa2());
            modeloCasaSQL.solicitarSaldoFondo(modeloCasa);
                
            modeloCasa.setFondo_dolares(
                    modeloCasa.getFondo_dolares() - fondo_dolares_remover);
            modeloCasa.setFondo_bolivares(
                    modeloCasa.getFondo_bolivares() - fondo_bolivares_remover);
                
            if(modeloCasaSQL.añadirFondo(modeloCasa)){
                System.out.println("Modificacion de fondo en casa antigua: "
                        + "Completado");
            }
        }
    }
    
    private void inicializar_variables_calculo(){
        //JUSTIFICACION DE CADA VARIABLE EN ORDEN RESPECTIVO    
        
        //Pago realizado en dolares, deuda en dolares, Dolares restantes de calculos, 
        //resultado de conversion de bolivares a dolares
        dolaresPago = 0; 
        dolaresDeuda = 0; 
        dolaresRestante = 0; 
        bolivaresConvertidos = 0;
        
        //Pago realizado en bolivares, deuda en bolivares, bolivares restantes de calculos, 
        //resultado de conversion de dolares a bolivares
        //Variable utilizada como pase de parametro para busqueda en metodos de BD
        bolivaresPago = 0;
        bolivaresDeuda = 0;
        bolivaresRestante = 0; 
        dolaresConvertidos = 0;
    }
    
    private void comprobar_deuda_casa(){
        
        //COMPROBACION DE CUANTO DEBE LA CASA
        //Si solo debe una parte
        if(modeloDeudaE.getDeuda_restante_dolares() > 0 || modeloDeudaE.getDeuda_restante_bolivares() > 0){
            //Asignacion de deuda restante
            dolaresDeuda = modeloDeudaE.getDeuda_restante_dolares();
            bolivaresDeuda = modeloDeudaE.getDeuda_restante_bolivares();
        }
        //Si debe la deuda completa
        else{
            //Asignacion de deuda completa
            dolaresDeuda = modeloDeudaE.getMonto_dolares();
            bolivaresDeuda = modeloDeudaE.getMonto_bolivares();
        }
        //Asignacion del monto pagado
        dolaresPago = modeloPago.getMonto_dolares();
        bolivaresPago = modeloPago.getMonto_bolivares();
        
    }
    
    private void convertir_dinero(){
        //CONVERSION DE DINERO MEDIANTE TASA 
        //Si el pago es en bolivares y la deuda en dolares
        if(bolivaresPago > 0 && dolaresDeuda > 0){ 
            bolivaresConvertidos = convertirBolivares(bolivaresPago);
        }
                
        //Si el pago es en dolares y la deuda en bolivares
        if(dolaresPago > 0 && bolivaresDeuda > 0){
            dolaresConvertidos = convertirDolares(dolaresPago);
        }   
    }
    
    private boolean registrar_pago_completo(){
        
        if(dolaresPago == dolaresDeuda && bolivaresPago == bolivaresDeuda ||
            bolivaresConvertidos == dolaresDeuda && dolaresConvertidos == bolivaresDeuda){
            modeloDeudaE.setEstado("Pagada");
                    
            //Indicar que la deuda ha sido pagada
            if(modeloDeudaESQL.cambiarEstado(modeloDeudaE)){
                
                //Verificar si la casa tiene mas deudas
                estado = modeloDeudaESQL.obtenerEstadoPago(modeloDeudaE);
                
                //Cambiar estado a solvente de no tener
                if(estado == 0){modeloCasaSQL.cambiarEstado(2, casa);}
                        
                JOptionPane.showMessageDialog(null, "Pago realizado "
                        + "exitosamente. Deuda cubierta");
                return true;
                
            }
            
            //Eliminar deuda restante en la deuda de la casa
            modeloDeudaE.setDeuda_restante_dolares(0);
            modeloDeudaE.setDeuda_restante_bolivares(0);
            
            if(modeloDeudaESQL.actualizarDeudaRestante(modeloDeudaE)){
                return true;
            }
        }
        return false;
    }
    
    private boolean registrar_pago_mayor(){
        Casa modeloCasa = new Casa();
        
        if(dolaresPago > dolaresDeuda && bolivaresPago == bolivaresDeuda || 
                dolaresPago == dolaresDeuda && bolivaresPago > bolivaresDeuda ||
                bolivaresConvertidos > dolaresDeuda && dolaresConvertidos == bolivaresDeuda ||
                bolivaresConvertidos == dolaresDeuda && dolaresConvertidos > bolivaresDeuda){
                
            //Calculo de dinero restante para agregar en fondo de casa
            if(dolaresPago > dolaresDeuda && bolivaresPago == bolivaresDeuda){
                dolaresRestante = dolaresPago - dolaresDeuda;
                bolivaresRestante = 0;
            }

            if(dolaresPago == dolaresDeuda && bolivaresPago > bolivaresDeuda){
                bolivaresRestante = bolivaresPago - bolivaresDeuda;
                dolaresRestante = 0;
            }

            if(bolivaresConvertidos > dolaresDeuda && dolaresConvertidos == bolivaresDeuda){
                dolaresRestante = bolivaresConvertidos - dolaresDeuda;
                bolivaresRestante = tasa.transformaraBolivares(dolaresRestante,tasaDolares);
                dolaresRestante = 0;
            }
            
            if(bolivaresConvertidos == dolaresDeuda && dolaresConvertidos > bolivaresDeuda){
                bolivaresRestante = dolaresConvertidos - bolivaresDeuda;
                dolaresRestante = tasa.transformaraDolares(bolivaresRestante,tasaDolares);
                bolivaresRestante = 0;
            }

            //Indicar que la deuda ha sido pagada
            modeloDeudaE.setEstado("Pagada");
            
            if(modeloDeudaESQL.cambiarEstado(modeloDeudaE)){
                
                //Verificar si la casa tiene mas deudas
                estado = modeloDeudaESQL.obtenerEstadoPago(modeloDeudaE);
                //Cambiar estado a solvente de no tener
                if(estado == 0){modeloCasaSQL.cambiarEstado(2, casa);}
                        
                JOptionPane.showMessageDialog(null, "Pago realizado "
                        + "exitosamente. Deuda cubierta");
                        
                //Añadir fondo o credito a casa por dinero restante
                
                modeloCasa.setNumero_casa(casa);
                
                if(modeloCasaSQL.solicitarSaldoFondo(modeloCasa)){
                    modeloCasa.setFondo_dolares(modeloCasa.getFondo_dolares() + 
                            dolaresRestante);

                    modeloCasa.setFondo_bolivares(modeloCasa.getFondo_bolivares()
                            + bolivaresRestante);
               
                    if(modeloCasaSQL.añadirFondo(modeloCasa)){
                        JOptionPane.showMessageDialog(null, "Dinero restante "
                                + "añadido al credito disponible de la casa");
                        return true;
                    }
                }
                return false;
            }
              
            //Eliminar deuda restante en la deuda de la casa
            modeloDeudaE.setDeuda_restante_dolares(0);
            modeloDeudaE.setDeuda_restante_bolivares(0);
            
            if(modeloDeudaESQL.actualizarDeudaRestante(modeloDeudaE)){
                return true;
            }
        }
        return false;

    }
    
    private boolean registrar_pago_menor(){

            if(dolaresPago == dolaresDeuda && bolivaresPago < bolivaresDeuda ||
                    dolaresPago < dolaresDeuda && bolivaresPago == bolivaresDeuda){ 
                
                dolaresRestante = dolaresDeuda - dolaresPago;
                bolivaresRestante = bolivaresDeuda - bolivaresPago;
                      
                if(dolaresRestante > 0){
                    JOptionPane.showMessageDialog(null, "Pago realizado "
                            + "exitosamente. Sin embargo, la deuda no ha "
                            + "sido pagada. Debe "+dolaresRestante+" $");
                }
                if(bolivaresRestante > 0){
                    JOptionPane.showMessageDialog(null, "Pago realizado"
                                        + "exitosamente. Sin embargo, la deuda no ha "
                                    + "sido pagada. Debe Bs "+bolivaresRestante);
                }
            }
            
            if(bolivaresConvertidos > 0 && bolivaresConvertidos < dolaresDeuda
                    && dolaresConvertidos == bolivaresDeuda||
                   bolivaresConvertidos == dolaresDeuda && dolaresConvertidos > 0
                    && dolaresConvertidos < bolivaresDeuda){
                
                dolaresRestante = dolaresDeuda - bolivaresConvertidos;
                bolivaresRestante = bolivaresDeuda - dolaresConvertidos;
          
                if(dolaresRestante > 0){
                    JOptionPane.showMessageDialog(null, "Pago realizado "
                            + "exitosamente. Sin embargo, la deuda no ha "
                            + "sido pagada. Debe "+dolaresRestante+" $");
                }
                if(bolivaresRestante > 0){
                    JOptionPane.showMessageDialog(null, "Pago realizado "
                            + "exitosamente. Sin embargo, la deuda no ha "
                            + "sido pagada. Debe Bs "+bolivaresRestante);
                }
            }
            //Añadir deuda restante en la deuda de la casa
            if(modeloDeudaESQL.obtenerDeudaRestante(modeloDeudaE)){
                
                modeloDeudaE.setDeuda_restante_dolares(dolaresRestante);
                modeloDeudaE.setDeuda_restante_bolivares(bolivaresRestante);

                if(modeloDeudaESQL.actualizarDeudaRestante(modeloDeudaE)){
                    return true;
                }
            }
        return false;
    }
    
    private float convertirBolivares(int bolivaresPago){
        bolivaresConvertidos = 0;
            if(tasaDolares > 0){
                bolivaresConvertidos = tasa.transformaraDolares(bolivaresPago,tasaDolares);
            }
            if(tasaDolares == 0){
                JOptionPane.showMessageDialog(null, "Ha registrado un pago en bolivares "
                + "que corresponde a una deuda en dolares. Por favor, ingrese "
                + "la tasa del dolar actual para realizar la conversion. De esta "
                + "manera, se confirmara si la deuda ha sido saldada");
                        
                String tasaActual = JOptionPane.showInputDialog("Tasa de Dolar Actual");
                
                tasaDolares = Integer.parseInt(tasaActual); 
                bolivaresConvertidos = tasa.transformaraDolares(bolivaresPago,tasaDolares);
                modeloPagoSQL.agregarTasa(modeloPago.getId_pago(),tasaDolares);
            }
        return bolivaresConvertidos;
    }
    
    private int convertirDolares(float dolaresPago){
        dolaresConvertidos = 0;
        if(tasaDolares > 0){
            dolaresConvertidos = tasa.transformaraBolivares(dolaresPago,tasaDolares);
        }
        if(tasaDolares == 0){
            JOptionPane.showMessageDialog(null, "Ha registrado un pago en dolares "
            + "que corresponde a una deuda en dolares. Por favor, ingrese "
            + "la tasa del dolar actual para realizar la conversion. De esta "
            + "manera, se confirmara si la deuda ha sido saldada");
                        
            String tasaActual = JOptionPane.showInputDialog("Tasa de Dolar Actual");
            
            tasaDolares = Integer.parseInt(tasaActual); 
            dolaresConvertidos = tasa.transformaraBolivares(dolaresPago,tasaDolares);
            modeloPagoSQL.agregarTasa(modeloPago.getId_pago(),tasaDolares);
        }
        return dolaresConvertidos;
    }
}
