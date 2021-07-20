
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
public class FacturaSQL extends Conexion {
    
    public boolean registrar(Factura factura){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO factura (id_factura, descripcion, monto_dolares, monto_bolivares,"
                + "fecha_emision, id_servicio3) VALUES (?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, factura.getId_factura());
            ps.setString(2, factura.getDescripcion());
            ps.setFloat(3, factura.getMonto_dolares());
            ps.setInt(4, factura.getMonto_bolivares());
            ps.setString(5, factura.getFecha_emision());
            ps.setString(6, factura.getId_servicio3());
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
    
    public boolean buscar(Factura factura){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM factura WHERE id_factura = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, factura.getId_factura());
            rs = ps.executeQuery();
            
            if(rs.next()){
                factura.setDescripcion(rs.getString("descripcion"));
                factura.setMonto_dolares(rs.getFloat("monto_dolares"));
                factura.setMonto_bolivares(rs.getInt("monto_bolivares"));
                factura.setFecha_emision(rs.getString("fecha_emision"));
                factura.setId_servicio3(rs.getString("id_servicio3"));
                
                return true;
            }
            return false;
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
    
    public boolean modificar(Factura factura){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE factura SET descripcion = ?,monto_dolares = ?, monto_bolivares = ?,"
                + "fecha_emision = ?, id_servicio3 = ? WHERE id_factura = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, factura.getDescripcion());
            ps.setFloat(2, factura.getMonto_dolares());
            ps.setInt(3, factura.getMonto_bolivares());
            ps.setString(4, factura.getFecha_emision());
            ps.setString(5, factura.getId_servicio3());
            ps.setString(6, factura.getId_factura());
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
    
    public boolean eliminar(Factura factura){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM factura WHERE id_factura = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, factura.getId_factura());
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
        
        String sql = "SELECT COUNT(*) FROM factura WHERE id_factura = ?";
        
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
