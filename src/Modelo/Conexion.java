
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ARANAGA
 */
public class Conexion {
    private final String base = "administracion_condominio";
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String direccion = "jdbc:mysql://127.0.0.1/"+base;
    private final String usuario = "root";
    private final String contraseña = "";
    public Connection con;
    
    public Connection getConexion(){
        try{
            Class.forName(driver);
            con = DriverManager.getConnection(direccion,usuario,contraseña);
            System.out.println("Base de Datos: Conexion establecida con exito");
        }
        catch(Exception e){
            System.out.println("Base de Datos: Error de conexion");
        }
        return con;
    }
}
