
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
public class DeudaESQL extends Conexion {
    public boolean registrar(DeudaE deudaE){
        //Metodo para insertar valores en BD
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO deudae (id_deudae, fecha_carga, descripcion, "
                + "monto_dolares, monto_bolivares, estado, id_deuda2, numero_casa3)"
                + " VALUES (?,?,?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deudaE.getId_deudae());
            ps.setString(2, deudaE.getFecha_carga());
            ps.setString(3, deudaE.getDescripcion());
            ps.setFloat(4, deudaE.getMonto_dolares());
            ps.setInt(5, deudaE.getMonto_bolivares());
            ps.setString(6, "No pagada");
            ps.setString(7, deudaE.getId_deuda2());
            ps.setInt(8, deudaE.getNumero_casa3());
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
    
    public boolean buscar(DeudaE deudaE){
        //Metodo para buscar un campo especifico en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM deudae WHERE numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deudaE.getId_deudae());
            rs = ps.executeQuery();
            
            if(rs.next()){
                deudaE.setFecha_carga(rs.getString("fecha_carga"));
                deudaE.setDescripcion(rs.getString("descripcion"));
                deudaE.setMonto_dolares(rs.getFloat("monto_dolares"));
                deudaE.setMonto_bolivares(rs.getInt("monto_bolivares"));
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
    
    public boolean modificar(DeudaE deudaE){
        //Metodo par modificar valores en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE deudae SET fecha_carga = ?, descripcion = ?, "
                + "monto_dolares = ?, monto_bolivares = ? WHERE numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deudaE.getFecha_carga());
            ps.setString(2, deudaE.getDescripcion());
            ps.setFloat(3, deudaE.getMonto_dolares());
            ps.setInt(4, deudaE.getMonto_bolivares());
            ps.setInt(5, deudaE.getNumero_casa3());
            
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
    
    public boolean modificar_deuda_restante(DeudaE deudaE){
        //Metodo par modificar valores en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE deudae SET deuda_restante_dolares = ?, "
                + "deuda_restante_bolivares = ?, estado = ? WHERE numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, deudaE.getDeuda_restante_dolares());
            ps.setInt(2, deudaE.getDeuda_restante_bolivares());
            ps.setString(3, deudaE.getEstado());
            ps.setInt(4, deudaE.getNumero_casa3());
            
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
    
    public boolean saber_deuda_pagada(String id_deuda, int casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT estado FROM deudae WHERE id_deuda2 = ? "
                + "AND numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, id_deuda);
            ps.setInt(2, casa);
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(rs.getString("estado").equals("Pagada")){
                    return true;
                }
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
    
    public boolean obtenerMonto(DeudaE deudaE){
        //Metodo para obtener el mondo de la deuda y si posee una disminucion
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT monto_dolares, monto_bolivares, deuda_restante_dolares, "
                + "deuda_restante_bolivares FROM deudae WHERE id_deuda2 = ? "
                + "AND numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deudaE.getId_deuda2());
            ps.setInt(2, deudaE.getNumero_casa3());
            rs = ps.executeQuery();
            
            if(rs.next()){
                deudaE.setMonto_dolares(rs.getFloat("monto_dolares"));
                deudaE.setMonto_bolivares(rs.getInt("monto_bolivares"));
                deudaE.setDeuda_restante_dolares(rs.getFloat("deuda_restante_dolares"));
                deudaE.setDeuda_restante_bolivares(rs.getInt("deuda_restante_bolivares"));
                
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
    
    public int obtenerEstadoPago(DeudaE deudaE){
        //Metodo para determinar si una deuda ha sido pagada o no
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT COUNT(*) FROM deudae WHERE numero_casa3 = ? "
                + "AND estado = 'No pagada'";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, deudaE.getNumero_casa3());
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
    
    public boolean cambiarEstado(DeudaE deudaE){
        //Metodo para cambiar el estado de una deuda (Pagada - No pagada)
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE deudae SET deuda_restante_dolares = 0, "
                + "deuda_restante_bolivares = 0, estado = ? WHERE id_deuda2 = ? AND "
                + "numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deudaE.getEstado());
            ps.setString(2, deudaE.getId_deuda2());
            ps.setInt(3, deudaE.getNumero_casa3());
            
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
    
    public boolean obtenerDeudaRestante(DeudaE deudaE){
        //Metodo para determinar si una deuda ha sido pagada o no
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT deuda_restante_dolares, deuda_restante_bolivares "
                + "FROM deudae WHERE id_deuda2 = ? AND numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, deudaE.getId_deuda2());
            ps.setInt(2, deudaE.getNumero_casa3());
            rs = ps.executeQuery();
            
            if(rs.next()){
                deudaE.setDeuda_restante_dolares(rs.getFloat("deuda_restante_dolares"));
                deudaE.setDeuda_restante_bolivares(rs.getInt("deuda_restante_bolivares"));
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
    
    public boolean actualizarDeudaRestante(DeudaE deudaE){
        //Metodo para añadir la deuda restante de un pago menor a la deuda total
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE deudae SET deuda_restante_dolares = ?, "
                + "deuda_restante_bolivares = ? WHERE id_deuda2 = ? AND "
                + "numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, deudaE.getDeuda_restante_dolares());
            ps.setInt(2, deudaE.getDeuda_restante_bolivares());
            ps.setString(3, deudaE.getId_deuda2());
            ps.setInt(4, deudaE.getNumero_casa3());
            
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
    
    public boolean consultarDeudaAcumuladaD(DeudaE deudaE, String fechaI, String fechaL){
        //Metodo para obtener el monto total de deudas en dolares que posee una casa en el mes
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM deudae WHERE estado = 'No pagada' "
                + "AND numero_casa3 = ? AND fecha_carga BETWEEN ? AND ?";

        try{
            System.out.println(deudaE.getMonto_dolares());
            System.out.println(deudaE.getNumero_casa3());
            System.out.println(fechaI);
            System.out.println(fechaL);
            
            ps = con.prepareStatement(sql);
            ps.setInt(1, deudaE.getNumero_casa3());
            ps.setString(2, fechaI);
            ps.setString(3, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                deudaE.setMonto_dolares(rs.getFloat(1));
                System.out.println(deudaE.getMonto_dolares());
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
    
    public boolean consultarDeudaAcumuladaBs(DeudaE deudaE, String fechaI, String fechaL){
        //Metodo para obtener el monto total de deudas en bolivares que posee una casa en el mes
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM deudae WHERE estado = 'No pagada' "
                + "AND numero_casa3 = ? AND fecha_carga BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, deudaE.getNumero_casa3());
            ps.setString(2, fechaI);
            ps.setString(3, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                deudaE.setMonto_bolivares(rs.getInt(1));

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
    
    public float obtener_total_deuda_dolares(int casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM deudae WHERE estado = 'No pagada' "
                + "AND numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getFloat(1);
            }
            return 0;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            return 0;
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
    
    public int obtener_total_deuda_bolivares(int casa){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM deudae WHERE estado = 'No pagada' "
                + "AND numero_casa3 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, casa);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 0;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
            return 0;
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
