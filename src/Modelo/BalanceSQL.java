
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
public class BalanceSQL extends Conexion{
    public boolean inicializar(int año, int mes){
        //Metodo para insertar valores en BD
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO balance (año, mes, deuda_morosa_dolares, "
                + "deuda_morosa_bolivares, deuda_actual_dolares, deuda_actual_bolivares, "
                + "total_ingresos_dolares, total_ingresos_bolivares, aseo_dolares, "
                + "aseo_bolivares, vigilancia_externa_dolares, vigilancia_externa_bolivares, "
                + "vigilancia_interna_dolares, vigilancia_interna_bolivares, "
                + "cuota_especial1_dolares, cuota_especial1_bolivares, "
                + "cuota_especial2_dolares, cuota_especial2_bolivares, "
                + "cuota_especial3_dolares, cuota_especial3_bolivares, "
                + "total_egresos_dolares, total_egresos_bolivares, "
                + "saldo_dolares, saldo_bolivares) VALUES "
                + "(?,?,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, año);
            ps.setInt(2, mes);
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
    
    public boolean comprobarExistencia(int año, int mes){
        //Metodo para saber si ya existe un balance de ese mes
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM balance WHERE año = ? AND mes = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, año);
            ps.setInt(2, mes);
            rs = ps.executeQuery();
            
            if(rs.next()){
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
    
    public boolean buscar(Balance balance){
        //Metodo para buscar un campo especifico en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM balance WHERE año = ? AND mes = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, balance.getAño());
            ps.setInt(2, balance.getMes());
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setDeuda_morosa_dolares(rs.getFloat("deuda_morosa_dolares"));
                balance.setDeuda_morosa_bolivares(rs.getInt("deuda_morosa_bolivares"));
                balance.setDeuda_actual_dolares(rs.getFloat("deuda_actual_dolares"));
                balance.setDeuda_actual_bolivares(rs.getInt("deuda_actual_bolivares"));
                balance.setTotal_ingresos_dolares(rs.getFloat("total_ingresos_dolares"));
                balance.setTotal_ingresos_bolivares(rs.getInt("total_ingresos_bolivares"));
                balance.setAseo_dolares(rs.getFloat("aseo_dolares"));
                balance.setAseo_bolivares(rs.getInt("aseo_bolivares"));
                balance.setVigilancia_externa_dolares(rs.getFloat("vigilancia_externa_dolares"));
                balance.setVigilancia_externa_bolivares(rs.getInt("vigilancia_externa_bolivares"));
                balance.setVigilancia_interna_dolares(rs.getFloat("vigilancia_interna_dolares"));
                balance.setVigilancia_interna_bolivares(rs.getInt("vigilancia_interna_bolivares"));
                balance.setCuota_especial1_dolares(rs.getFloat("cuota_especial1_dolares"));
                balance.setCuota_especial1_bolivares(rs.getInt("cuota_especial1_bolivares"));
                balance.setCuota_especial2_dolares(rs.getFloat("cuota_especial2_dolares"));
                balance.setCuota_especial2_bolivares(rs.getInt("cuota_especial2_bolivares"));
                balance.setCuota_especial3_dolares(rs.getFloat("cuota_especial3_dolares"));
                balance.setCuota_especial3_bolivares(rs.getInt("cuota_especial3_bolivares"));
                balance.setTotal_egresos_dolares(rs.getFloat("total_egresos_dolares"));
                balance.setTotal_egresos_bolivares(rs.getInt("total_egresos_bolivares"));
                balance.setSaldo_dolares(rs.getFloat("saldo_dolares"));
                balance.setSaldo_bolivares(rs.getInt("saldo_bolivares"));
                
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
    
    public boolean modificar(Balance balance){
        //Metodo par modificar valores en BD
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE balance SET deuda_morosa_dolares = ?, "
                + "deuda_morosa_bolivares = ?, deuda_actual_dolares = ?, "
                + "deuda_actual_bolivares = ?, total_ingresos_dolares = ?, "
                + "total_ingresos_bolivares = ?, aseo_dolares = ?, "
                + "aseo_bolivares = ?, vigilancia_externa_dolares = ?, "
                + "vigilancia_externa_bolivares = ?, vigilancia_interna_dolares = ?, "
                + "vigilancia_interna_bolivares = ?, cuota_especial1_dolares = ?, "
                + "cuota_especial1_bolivares = ?, cuota_especial2_dolares = ?, "
                + "cuota_especial2_bolivares = ?, cuota_especial3_dolares = ?, "
                + "cuota_especial3_bolivares = ?, total_egresos_dolares = ?, "
                + "total_egresos_bolivares = ?, saldo_dolares = ?, "
                + "saldo_bolivares = ? WHERE año = ? AND mes = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, balance.getDeuda_morosa_dolares());
            ps.setInt(2, balance.getDeuda_morosa_bolivares());
            ps.setFloat(3, balance.getDeuda_actual_dolares());
            ps.setInt(4, balance.getDeuda_actual_bolivares());
            ps.setFloat(5, balance.getTotal_ingresos_dolares());
            ps.setInt(6, balance.getTotal_ingresos_bolivares());
            ps.setFloat(7, balance.getAseo_dolares());
            ps.setInt(8, balance.getAseo_bolivares());
            ps.setFloat(9, balance.getVigilancia_externa_dolares());
            ps.setInt(10, balance.getVigilancia_externa_bolivares());
            ps.setFloat(11, balance.getVigilancia_interna_dolares());
            ps.setInt(12, balance.getVigilancia_interna_bolivares());
            ps.setFloat(13, balance.getCuota_especial1_dolares());
            ps.setInt(14, balance.getCuota_especial1_bolivares());
            ps.setFloat(15, balance.getCuota_especial2_dolares());
            ps.setInt(16, balance.getCuota_especial2_bolivares());
            ps.setFloat(17, balance.getCuota_especial3_dolares());
            ps.setInt(18, balance.getCuota_especial3_bolivares());
            ps.setFloat(19, balance.getTotal_egresos_dolares());
            ps.setInt(20, balance.getTotal_egresos_bolivares());
            ps.setFloat(21, balance.getSaldo_dolares());
            ps.setInt(22, balance.getSaldo_bolivares());
            ps.setInt(23, balance.getAño());
            ps.setInt(24, balance.getMes());
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
