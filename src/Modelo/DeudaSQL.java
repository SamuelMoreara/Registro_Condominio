
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
public class DeudaSQL extends Conexion {
    
    public boolean registrar(Deuda deuda){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO deuda (id_deuda, fecha_carga, descripcion, "
                + "monto_dolares, monto_bolivares, tasa_dolar, id_servicio2) VALUES (?,?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deuda.getId_deuda());
            ps.setString(2, deuda.getFecha_carga());
            ps.setString(3, deuda.getDescripcion());
            ps.setFloat(4, deuda.getMonto_dolares());
            ps.setInt(5, deuda.getMonto_bolivares());
            ps.setInt(6, deuda.getTasa_dolar());
            ps.setString(7, deuda.getId_servicio2());
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
    
    public boolean buscar(Deuda deuda){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM deuda WHERE id_deuda = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deuda.getId_deuda());
            rs = ps.executeQuery();
            
            if(rs.next()){
                deuda.setFecha_carga(rs.getString("fecha_carga"));
                deuda.setDescripcion(rs.getString("descripcion"));
                deuda.setMonto_dolares(rs.getFloat("monto_dolares"));
                deuda.setMonto_bolivares(rs.getInt("monto_bolivares"));
                deuda.setTasa_dolar(rs.getInt("tasa_dolar"));
                deuda.setId_servicio2(rs.getString("id_servicio2"));
            }
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
    
    public boolean modificar(Deuda deuda){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE deuda SET fecha_carga = ?, descripcion = ?, "
                + "monto_dolares = ?, monto_bolivares = ?, id_servicio2 = ?,"
                + "WHERE id_deuda = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deuda.getFecha_carga());
            ps.setString(2, deuda.getDescripcion());
            ps.setFloat(3, deuda.getMonto_dolares());
            ps.setInt(4, deuda.getMonto_bolivares());
            ps.setString(5, deuda.getId_servicio2());
            ps.setString(6, deuda.getId_deuda());
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
    
    public boolean eliminar(Deuda deuda){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM deuda WHERE id_deuda = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deuda.getId_deuda());
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
    
    public int verificarExistencia(String id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT COUNT(*) FROM deuda WHERE id_deuda = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            return 1;
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
