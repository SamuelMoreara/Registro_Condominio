
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ARANAGA
 */
public class CuentaSQL extends Conexion{
    public boolean inicializar(int año, int mes, int casa){
        //Metodo para insertar valores en BD
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO cuenta (pago_dolares,pago_bolivares,"
                + "deuda_dolares,deuda_bolivares,numero_casa4,año2,mes2) VALUES "
                + "(0,0,0,0,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa);
            ps.setInt(2, año);
            ps.setInt(3, mes);
            ps.execute();
            
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: "+q.getMessage());
            }
        }
    }
    
    public ResultSet buscar(int año, int mes){
        //Metodo para buscar un campo especifico en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT numero_casa4, pago_dolares, pago_bolivares,"
                + "deuda_dolares, deuda_bolivares FROM cuenta WHERE año2 = ? AND "
                + "mes2 = ? ORDER BY numero_casa4";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, año);
            ps.setInt(2, mes);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs;
            }
            
            return null;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            return null;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: "+q.getMessage());
            }
        }
    }
    
    public boolean modificar(Cuenta cuenta){
        //Metodo par modificar valores en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE cuenta SET pago_dolares = ?, pago_bolivares = ?, "
                + "deuda_dolares = ?, deuda_bolivares = ? WHERE numero_casa4 = ? "
                + "AND año2 = ? AND mes2 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, cuenta.getPago_dolares());
            ps.setInt(2, cuenta.getPago_bolivares());
            ps.setFloat(3, cuenta.getDeuda_dolares());
            ps.setInt(4, cuenta.getDeuda_bolivares());
            ps.setInt(5, cuenta.getNumero_casa4());
            ps.setInt(6, cuenta.getAño2());
            ps.setInt(7, cuenta.getMes2());
            
            ps.execute();
            
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null, "Error al cerrar conexion: "+q.getMessage());
            }
        }
    }
}
