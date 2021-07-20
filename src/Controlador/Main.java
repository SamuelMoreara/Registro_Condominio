
package Controlador;

import Controlador.Inicializacion;
import Modelo.Administrador;
import Modelo.AdministradorSQL;
import Modelo.BalanceSQL;
import Vista.Login;
import Vista.Menu;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;


public class Main {
    public static Login frmLogin;
    public static Menu frmMenu;
    public static String nombre_usuario = "",nombre = "",apellido = "",ultimaentrada = "", cierreBalance = "";
    public static final int casas = 48;
    
    public static void iniciarPrograma(){
        Administrador modelo = new Administrador();
        AdministradorSQL modeloSQL = new AdministradorSQL();
        BalanceSQL balance = new BalanceSQL();
        Inicializacion iniciar = new Inicializacion();
        LocalDateTime fecha = LocalDateTime.now();
        
        int año = 0, mes = 0;
        try{
            //Abrir Menu - Si hay una sesion abierta
            if(modeloSQL.estadoUsuario(modelo) == true){
                iniciar.inicializarDatosUsuario(modelo);

                año = fecha.getYear();
                mes = fecha.getMonthValue();

                if(!balance.comprobarExistencia(año,mes)){
                    if(iniciar.inicializacionContable(año,mes)){
                        JOptionPane.showMessageDialog(null, "Balance y Resumen General del mes: Inicializado");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Balance y Resumen General del mes: Error de carga");
                    }
                }

                frmMenu = new Menu();
                frmMenu.setVisible(true);
            }
            //Abrir Login - Si no hay una sesion abierta
            else{
                frmLogin = new Login();
                frmLogin.setVisible(true);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error al iniciar el "
                    + "programa. Intente nuevamente. Error: "+e.getMessage());
            
            System.exit(1);
        }
    }
    
    //Menu Principal
    public static void main(String [] args){
        iniciarPrograma();
    }
}
