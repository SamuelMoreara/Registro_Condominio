
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
public class CasaSQL extends Conexion{
    
    public boolean buscar(Casa casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM casa WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa.getNumero_casa());
            rs = ps.executeQuery();
            
            if(rs.next()){
                casa.setEstado_pago(rs.getString("estado_pago"));
                casa.setCedula_propietario(rs.getString("cedula_propietario"));
                casa.setNombre(rs.getString("nombre"));
                casa.setApellido(rs.getString("apellido"));
                casa.setTelefono(rs.getString("telefono"));
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
    
    public boolean buscarCasaSolvente(Casa casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT estado_pago, cedula_propietario, nombre, apellido "
                + "FROM casa WHERE numero_casa = ? AND estado_pago = 'Solvente'";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa.getNumero_casa());
            rs = ps.executeQuery();
            
            if(rs.next()){
                casa.setEstado_pago(rs.getString("estado_pago"));
                casa.setCedula_propietario(rs.getString("cedula_propietario"));
                casa.setNombre(rs.getString("nombre"));
                casa.setApellido(rs.getString("apellido"));
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
    
    public boolean modificar(Casa casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE casa SET cedula_propietario = ?, nombre = ?,"
                + "apellido = ?, telefono = ? WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, casa.getCedula_propietario());
            ps.setString(2, casa.getNombre());
            ps.setString(3, casa.getApellido());
            ps.setString(4, casa.getTelefono());
            ps.setInt(5, casa.getNumero_casa());
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
    public boolean cambiarEstado(int estado, int casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE casa SET estado_pago = ? WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            
            switch(estado){
                case 1: ps.setString(1, "Moroso"); break;
                case 2: ps.setString(1, "Solvente"); break;
            }
           
            ps.setInt(2, casa);
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
    
    public boolean añadirFondo(Casa casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE casa SET fondo_dolares = ?, fondo_bolivares = ? "
                + "WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, casa.getFondo_dolares());
            ps.setInt(2, casa.getFondo_bolivares());
            ps.setInt(3, casa.getNumero_casa());
            
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
    
    public boolean solicitarSaldoFondo(Casa casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT fondo_dolares, fondo_bolivares FROM casa WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa.getNumero_casa());
            rs = ps.executeQuery();
            
            if(rs.next()){
                casa.setFondo_dolares(rs.getFloat("fondo_dolares"));
                casa.setFondo_bolivares(rs.getInt("fondo_bolivares"));
                
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
    
    public boolean barrerSaldoFondo(Casa casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE casa SET fondo_dolares = 0, fondo_bolivares = 0 WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa.getNumero_casa());
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
    
    public boolean actualizar_deuda_restante(int casa, float deuda_dolares, int deuda_bolivares){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE casa SET total_deuda_dolares = ?, "
                + "total_deuda_bolivares = ? WHERE numero_casa = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, deuda_dolares);
            ps.setInt(2, deuda_bolivares);
            ps.setInt(3, casa);
            
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
