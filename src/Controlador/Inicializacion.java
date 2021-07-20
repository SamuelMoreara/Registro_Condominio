
package Controlador;

import static Controlador.Main.apellido;
import static Controlador.Main.casas;
import static Controlador.Main.nombre;
import static Controlador.Main.nombre_usuario;
import static Controlador.Main.ultimaentrada;
import static Controlador.Main.cierreBalance;
import Controlador.Fecha;
import Modelo.Administrador;
import Modelo.AdministradorSQL;
import Modelo.BalanceSQL;
import Modelo.CuentaSQL;
import javax.swing.JOptionPane;

/**
 *
 * @author ARANAGA
 */
public class Inicializacion {
    //Clase destinada a inicializar el 01 de cada mes nuevos regisros
    BalanceSQL balance = new BalanceSQL();
    CuentaSQL cuenta = new CuentaSQL();
    
    public boolean inicializarDatosUsuario(Administrador modelo){
            AdministradorSQL modeloSQL = new AdministradorSQL();
            Fecha fecha = new Fecha();
            
            nombre_usuario = modelo.getNombre_usuario();
            nombre = modelo.getNombre();
            apellido = modelo.getApellido();
            ultimaentrada = modelo.getUltimaentrada();
            cierreBalance = fecha.proximoCierreBalance();
            
            if(modeloSQL.actualizarEntrada(fecha.obtenerFechaActual(), nombre_usuario)){
                return true;
            }
            return false;
    }
    
    public boolean inicializacionContable(int año, int mes){
        
            if(inicializarBalance(año,mes)){
                System.out.println("Balance Inicializado con exito");
                
                if(inicializarCuenta(año,mes)){
                    System.out.println("Cuenta inicializada con exito");
                    JOptionPane.showMessageDialog(null, "Balance y cuenta de nuevo mes: Creada");
                    
                    return true;
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error la inicializar la cuenta general");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error al inicializar el balance");
            }
        
        return false;
    }
    
    private boolean inicializarBalance(int año, int mes){
        if(balance.inicializar(año, mes)){
            System.out.println("Balance Inicializado");
            return true;
        }
        return false;
    }
    
    private boolean inicializarCuenta(int año, int mes){
        int comprobacion = 0;
        
        for(int i=0;i<casas;i++){
            if(cuenta.inicializar(año,mes,i+1)){
                System.out.println("Cuenta de casa "+(i+1)+": Inicializada");
                comprobacion++;
            }
            else{
                System.out.println("Cuenta de casa "+(i+1)+": Error");
            }
        }
        
        if(comprobacion == 48){
            return true;
        }
        
        return false;
    }
}
