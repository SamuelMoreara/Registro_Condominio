
package Controlador;

import Modelo.Deuda;
import Modelo.DeudaSQL;
import Modelo.DeudaE;
import Modelo.DeudaESQL;
import Modelo.Pago;
import Modelo.Casa;
import Modelo.CasaSQL;
import static Controlador.Main.casas;
import Controlador.Tasa;
import Controlador.Pagos;
import Controlador.RegistroCuenta;
import javax.swing.JOptionPane;

/**
 *
 * @author ARANAGA
 */

public class Deudas {
    
    DeudaSQL modeloDeudaSQL = new DeudaSQL();
    DeudaESQL modeloDeudaESQL = new DeudaESQL();
    CasaSQL modeloCasaSQL = new CasaSQL();
    RegistroCuenta cuenta = new RegistroCuenta();
    DeudaE modeloDeudaE = new DeudaE();
    Deuda modeloDeuda = new Deuda();
    Casa modeloCasa = new Casa();
    
    public void cargar(Deuda modeloDeuda_anterior, DeudaE modeloDeudaE_anterior, Pago modeloPago){
        Pagos pagos = new Pagos();
        int bolivares = 0,estado_casa = 1;
        float dolares = 0;
        
        modeloDeuda = modeloDeuda_anterior;
        modeloDeudaE = modeloDeudaE_anterior;
        
        dolares = modeloDeudaE.getMonto_dolares();
        bolivares = modeloDeudaE.getMonto_bolivares();
        
        String codigo = modeloDeuda.getId_deuda();
        
        if(modeloDeudaSQL.registrar(modeloDeuda)){
            for(int i=0;i<casas;i++){
                modeloDeudaE.setNumero_casa3(i+1);
                modeloDeudaE.setId_deudae(crearId_deuda_individual(codigo,i+1));
                modeloCasa.setNumero_casa(i+1);
                 
                if(modeloDeudaESQL.registrar(modeloDeudaE)){
                    
                    if(modeloCasaSQL.cambiarEstado(estado_casa,i+1)){
                        System.out.println("Deuda a casa "+(i+1)+": Añadida");
                    }
                    
                    verificar_fondo_existente(i, modeloCasa, modeloPago);
                    cuenta.actualizarCuenta(modeloPago,modeloDeudaE,i+1);
                    pagos.actualizar_deuda_casa(i+1);
                    
                    modeloDeudaE.setMonto_dolares(dolares);
                    modeloDeudaE.setMonto_bolivares(bolivares);
                }
                else{
                    System.out.println("Deuda a casa "+(i+1)+": Error");
                }
            }
            
        }
        JOptionPane.showMessageDialog(null,"Carga de deuda finalizado");                      
    }
    
    public void modificar(Deuda modeloDeuda_anterior, DeudaE modeloDeudaE_anterior, Pago modeloPago){
        Pagos pagos = new Pagos();
        int estado_casa = 1;
        String codigo = modeloDeuda.getId_deuda();
        
        modeloDeuda = modeloDeuda_anterior;
        modeloDeudaE = modeloDeudaE_anterior;
        
        if(modeloDeudaSQL.modificar(modeloDeuda)){
            
            for(int i=0;i<casas;i++){
                modeloDeudaE.setNumero_casa3(i+1);
                modeloDeudaE.setId_deudae(crearId_deuda_individual(codigo,i+1));
                modeloCasa.setNumero_casa(i+1);

                if(modeloDeudaESQL.modificar(modeloDeudaE)){
                    
                    if(modeloCasaSQL.cambiarEstado(estado_casa,i+1)){
                        System.out.println("Deuda a casa "+(i+1)+": Modificada");
                    }
                    
                    verificar_fondo_existente(i, modeloCasa, modeloPago);
                    
                    cuenta.actualizarCuenta(modeloPago,modeloDeudaE,i+1);
                    pagos.actualizar_deuda_casa(i+1);
                }
                else{
                    System.out.println("Deuda a casa "+(i+1)+": Error");
                }
            }
            
        }
        JOptionPane.showMessageDialog(null,"Modificacion de deuda finalizado");
    }
    
    private void verificar_fondo_existente(int i, Casa modeloCasa, Pago modeloPago){
        Pagos pagos = new Pagos();
        Pago modeloPago_antiguo = new Pago();
        DeudaE modeloDeudaEFondo = new DeudaE();
        float fondo_dolares = 0;
        int fondo_bolivares = 0;
        String id = "";
        
        modeloDeudaEFondo = modeloDeudaE;
  
        modeloCasaSQL.solicitarSaldoFondo(modeloCasa);
        modeloPago.setId_pago(crearId_pago_fondo());
        modeloPago.setDescripcion("Pago con Credito");
        modeloPago.setMonto_dolares(modeloCasa.getFondo_dolares());
        modeloPago.setMonto_bolivares(modeloCasa.getFondo_bolivares());
        modeloPago.setNumero_casa2(i+1);
        
        //Si el propietario tiene credito en una sola moneda
        if(modeloPago.getMonto_dolares() > 0 && modeloPago.getMonto_bolivares() == 0 || 
                modeloPago.getMonto_dolares() == 0 && modeloPago.getMonto_bolivares() > 0){
            
            modeloCasaSQL.barrerSaldoFondo(modeloCasa);
            pagos.pagar(1,modeloDeuda.getTasa_dolar(),modeloPago,modeloPago_antiguo,modeloDeudaEFondo);
        }
        
        //Si tiene el propietario tiene credito en dos monedas
        if(modeloPago.getMonto_dolares() > 0 && modeloPago.getMonto_bolivares() > 0){
            fondo_dolares = modeloPago.getMonto_dolares();
            fondo_bolivares = modeloPago.getMonto_bolivares();
            id = modeloPago.getId_pago();
            
            modeloCasaSQL.barrerSaldoFondo(modeloCasa);
            
            //Pago 1: Parte en dolares
            
            modeloPago.setId_pago(modeloPago.getId_pago()+"D");
            modeloPago.setMonto_bolivares(0);
            pagos.pagar(1,modeloDeuda.getTasa_dolar(),modeloPago,modeloPago_antiguo,modeloDeudaEFondo);
            modeloPago.setId_pago(id);
            modeloPago.setMonto_bolivares(fondo_bolivares);
               
            //Pago 2: Parte en bolivares
            
            modeloPago.setId_pago(modeloPago.getId_pago()+"BS");
            modeloPago.setMonto_dolares(0);
            pagos.pagar(1,modeloDeuda.getTasa_dolar(),modeloPago,modeloPago_antiguo,modeloDeudaEFondo);
            modeloPago.setId_pago(id);
            modeloPago.setMonto_dolares(fondo_dolares);
        }
    }
    
    private String crearId_deuda_individual(String codigoDeuda, int i){
        /*Metodo que crea un id automatico para la deuda que tendrá cada casa. La estructura será: 
        ID General + Casa a añadir. Por ejemplo: DBLS1 (Codigo) + 24 (Casa)*/
        
        String codigo = codigoDeuda;
        String casa = String.valueOf(i);
        String id = codigo+"-"+casa;
        
        return id;
    }
    
    private String crearId_pago_fondo(){
        //Estructura: 
        //Siglas DPF (Deuda Pagada con Fondo) + ID creado de deuda especifica
        String id = "DPF-"+modeloDeudaE.getId_deudae();
        
        return id;
    }
  
}
