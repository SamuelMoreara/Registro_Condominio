package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ServicioSQL extends Conexion {
    
    public boolean registrar(Servicio ser){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO servicio(id_servicio,nombre_servicio,"
                + "rif_proveedor,nombre_proveedor,apellido_proveedor,nombre_empresa) VALUES(?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, ser.getId_servicio());
            ps.setString(2, ser.getNombre_servicio());
            ps.setString(3, ser.getRif_proveedor());
            ps.setString(4, ser.getNombre_proveedor());
            ps.setString(5, ser.getApellido_proveedor());
            ps.setString(6, ser.getNombre_empresa());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error al registrar: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException ex){
                System.out.println("Error al cerrar conexion: "+ex.getMessage());
            }
        }
    }
    
    public boolean buscar(Servicio ser){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM servicio WHERE id_servicio = ?";
        
        try{
           ps = con.prepareStatement(sql);
           ps.setString(1, ser.getId_servicio());
           rs = ps.executeQuery();
           
           if(rs.next()){
               ser.setNombre_servicio(rs.getString("nombre_servicio"));
               ser.setRif_proveedor(rs.getString("rif_proveedor"));
               ser.setNombre_proveedor(rs.getString("nombre_proveedor"));
               ser.setApellido_proveedor(rs.getString("apellido_proveedor"));
               ser.setNombre_empresa(rs.getString("nombre_empresa"));
               return true;
           }
           return false;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al Buscar: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException ex){
                System.out.println("Error: "+ex.getMessage());
            }
        }
    }
    
    public boolean modificar(Servicio ser){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE servicio SET nombre_servicio = ?,rif_proveedor = ?,"
                + "nombre_proveedor = ?,apellido_proveedor = ?,nombre_empresa = ?"
                + " WHERE id_servicio = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, ser.getNombre_servicio());
            ps.setString(2, ser.getRif_proveedor());
            ps.setString(3, ser.getNombre_proveedor());
            ps.setString(4, ser.getApellido_proveedor());
            ps.setString(5, ser.getNombre_empresa());
            ps.setString(6, ser.getId_servicio());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al Modificar: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException ex){
                System.out.println("Error al cerrar conexion: "+ex.getMessage());
            }
        }
    }
    
    public boolean eliminar (Servicio ser){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "DELETE FROM servicio WHERE id_servicio = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, ser.getId_servicio());
            ps.execute();
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al Eliminar: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException ex){
                System.out.println("Error: "+ex.getMessage());
            }
        }
    }
}
