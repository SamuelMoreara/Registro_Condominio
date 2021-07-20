
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
public class FacturaBalanceSQL extends Conexion{
    //BALANCE GENERAL
    public boolean sumatoriaAseoD(Balance balance, String fechaI, String fechaL){
        //Sumatoria Aseo en Dolares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS1AB' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setAseo_dolares(rs.getFloat(1));
                
                return true;
            }
            else{
                balance.setAseo_dolares(0);
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
    
    public boolean sumatoriaAseoB(Balance balance, String fechaI, String fechaL){
        //Sumatoria Aseo en Bolivares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS1AB' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setAseo_bolivares(rs.getInt(1));
                
                return true;
            }
            else{
                balance.setAseo_bolivares(0);
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
    
    public boolean sumatoriaVED(Balance balance, String fechaI, String fechaL){
        //Sumatoria Vigilancia Externa Dolares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS3VE' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setVigilancia_externa_dolares(rs.getFloat(1));
                
                return true;
            }
            else{
                balance.setVigilancia_externa_dolares(0);
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
    
    public boolean sumatoriaVEB(Balance balance, String fechaI, String fechaL){
        //Sumatoria Vigilancia Externa Bolivares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS3VE' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setVigilancia_externa_bolivares(rs.getInt(1));
                
                return true;
            }
            else{
                balance.setVigilancia_externa_bolivares(0);
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
    
    public boolean sumatoriaVID(Balance balance, String fechaI, String fechaL){
        //Sumatoria Vigilancia Interna Dolares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS2VI' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setVigilancia_interna_dolares(rs.getFloat(1));
                
                return true;
            }
            else{
                balance.setVigilancia_interna_dolares(0);
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
    
    public boolean sumatoriaVIB(Balance balance, String fechaI, String fechaL){
        //Sumatoria Vigilancia Interna Bolivares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS2VI' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setVigilancia_interna_bolivares(rs.getInt(1));
                
                return true;
            }
            else{
                balance.setVigilancia_interna_bolivares(0);
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
    
    public boolean sumatoriaCE1D(Balance balance, String fechaI, String fechaL){
        //Sumatoria Cuota Especial 1 en Dolares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS4C1' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setCuota_especial1_dolares(rs.getFloat(1));
                
                return true;
            }
            else{
                balance.setCuota_especial1_dolares(0);
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
    
    public boolean sumatoriaCE1B(Balance balance, String fechaI, String fechaL){
        //Sumatoria Cuota Especial 1 en Bolivares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS4C1' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setCuota_especial1_bolivares(rs.getInt(1));
                
                return true;
            }
            else{
                balance.setCuota_especial1_bolivares(0);
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
    
    public boolean sumatoriaCE2D(Balance balance, String fechaI, String fechaL){
        //Sumatoria Cuota Especial 2 en Dolares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS5C2' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setCuota_especial2_dolares(rs.getFloat(1));
                
                return true;
            }
            else{
                balance.setCuota_especial2_dolares(0);
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
    
    public boolean sumatoriaCE2B(Balance balance, String fechaI, String fechaL){
        //Sumatoria Cuota Especial 2 en Bolivares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS5C2' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setCuota_especial2_bolivares(rs.getInt(1));
                
                return true;
            }
            else{
                balance.setCuota_especial2_bolivares(0);
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
    
    public boolean sumatoriaCE3D(Balance balance, String fechaI, String fechaL){
        //Sumatoria Cuota Especial 3 en Dolares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS6C3' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setCuota_especial3_dolares(rs.getFloat(1));
                
                return true;
            }
            else{
                balance.setCuota_especial3_dolares(0);
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
    
    public boolean sumatoriaCE3B(Balance balance, String fechaI, String fechaL){
        //Sumatoria Cuota Especial 3 en Bolivares
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM factura WHERE "
                + "id_servicio3 = 'BLBS6C3' AND fecha_emision BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setCuota_especial3_bolivares(rs.getInt(1));
                
                return true;
            }
            else{
                balance.setCuota_especial3_bolivares(0);
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
}
