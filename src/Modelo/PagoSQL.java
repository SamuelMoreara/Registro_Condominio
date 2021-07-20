
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
public class PagoSQL extends Conexion{
    
    public boolean registrar(Pago pago){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO pago (id_pago,monto_dolares,monto_bolivares,"
                + "fecha_pago,descripcion,numero_casa2,id_deuda2) VALUES (?,?,?,?,?,?,?)";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pago.getId_pago());
            ps.setFloat(2, pago.getMonto_dolares());
            ps.setInt(3, pago.getMonto_bolivares());
            ps.setString(4, pago.getFecha_pago());
            ps.setString(5, pago.getDescripcion());
            ps.setInt(6, pago.getNumero_casa2());
            ps.setString(7, pago.getId_deuda2());
            ps.execute();
            
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en registrar: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null,"Error al cerrar conexion: "+q.getMessage());
            }
        }
    }
    
    public boolean buscar(Pago pago){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT * FROM pago WHERE id_pago = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pago.getId_pago());
            rs = ps.executeQuery();
            
            if(rs.next()){
                pago.setMonto_dolares(rs.getFloat("monto_dolares"));
                pago.setMonto_bolivares(rs.getInt("monto_bolivares"));
                pago.setFecha_pago(rs.getString("fecha_pago"));
                pago.setDescripcion(rs.getString("descripcion"));
                pago.setNumero_casa2(rs.getInt("numero_casa2"));
                pago.setId_deuda2(rs.getString("id_deuda2"));
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
    
    public boolean modificar(Pago pago){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE pago SET monto_dolares = ?, monto_bolivares = ?, "
                + "fecha_pago = ?, descripcion = ?, numero_casa2 = ?, id_deuda2 = ?"
                + "WHERE id_pago = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setFloat(1, pago.getMonto_dolares());
            ps.setInt(2, pago.getMonto_bolivares());
            ps.setString(3, pago.getFecha_pago());
            ps.setString(4, pago.getDescripcion());
            ps.setInt(5, pago.getNumero_casa2());
            ps.setString(6, pago.getId_deuda2());
            ps.setString(7, pago.getId_pago());
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
    
    public boolean agregarTasa(String id_pago, int tasaActual){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE pago SET tasa_dolar = ? WHERE id_pago = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, tasaActual);
            ps.setString(2, id_pago);
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
    
    public boolean obtenerMonto(Pago pago){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT monto_dolares, monto_bolivares FROM pago "
                + "WHERE id_deuda2 = ? AND numero_casa2 = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, pago.getId_deuda2());
            ps.setInt(2, pago.getNumero_casa2());
            rs = ps.executeQuery();
            
            if(rs.next()){
                pago.setMonto_dolares(rs.getFloat("monto_dolares"));
                pago.setMonto_bolivares(rs.getInt("monto_bolivares"));
                
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
    
    public boolean consultarPagoGeneralD(Pago pago, String fechaI, String fechaL){
        //Metodo para obtener el monto total de los pagos en dolares que ha hecho una casa en el mes
        //Utilizado en clase RegistroCuenta
        
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_dolares) FROM pago WHERE numero_casa2 = ? "
                + "AND fecha_pago BETWEEN ? AND ?";

        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getNumero_casa2());
            ps.setString(2, fechaI);
            ps.setString(3, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                pago.setMonto_dolares(rs.getFloat(1));
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
    
    public boolean consultarPagoGeneralBs(Pago pago, String fechaI, String fechaL){
        //Metodo para obtener el monto total de los pagos en bolivares que ha hecho una casa en el mes
        //Utilizado en clase RegistroCuenta
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(monto_bolivares) FROM pago WHERE numero_casa2 = ? "
                + "AND fecha_pago BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getNumero_casa2());
            ps.setString(2, fechaI);
            ps.setString(3, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                pago.setMonto_bolivares(rs.getInt(1));

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
    
    //BALANCE GENERAL
    public boolean deudaMorosaD(Balance balance, String fechaI, String fechaL){
        //Metodo para obtener el monto total de los pagos en dolares para saldar
        //deudas cargadas en meses anteriores
        //Utilizada en balance general
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(pago.monto_dolares) FROM pago INNER JOIN deuda "
                + "ON pago.id_deuda2 = deuda.id_deuda WHERE fecha_pago BETWEEN ? "
                + "AND ? AND NOT fecha_carga BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            ps.setString(3, fechaI);
            ps.setString(4, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setDeuda_morosa_dolares(rs.getFloat(1));

                return true;
            }
            else{
                balance.setDeuda_morosa_dolares(0);
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
    
    public boolean deudaMorosaBs(Balance balance, String fechaI, String fechaL){
        //Metodo para obtener el monto total de los pagos en bolivares para saldar
        //deudas cargadas en meses anteriores
        //Utilizada en balance general
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(pago.monto_bolivares) FROM pago INNER JOIN deuda "
                + "ON pago.id_deuda2 = deuda.id_deuda WHERE fecha_pago BETWEEN ? "
                + "AND ? AND NOT fecha_carga BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            ps.setString(3, fechaI);
            ps.setString(4, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setDeuda_morosa_bolivares(rs.getInt(1));

                return true;
            }
            else{
                balance.setDeuda_morosa_bolivares(0);
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
    
    
    public boolean deudaActualD(Balance balance, String fechaI, String fechaL){
        //Metodo para obtener el monto total de los pagos en dolares para saldar
        //deudas cargadas en ese mes
        //Utilizada en balance general
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(pago.monto_dolares) FROM pago INNER JOIN deuda "
                + "ON pago.id_deuda2 = deuda.id_deuda WHERE fecha_pago BETWEEN ?"
                + "AND ? AND fecha_carga BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            ps.setString(3, fechaI);
            ps.setString(4, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setDeuda_actual_dolares(rs.getFloat(1));

                return true;
            }
            else{
                balance.setDeuda_actual_dolares(0);
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
    
    
    public boolean deudaActualBs(Balance balance, String fechaI, String fechaL){
        //Metodo para obtener el monto total de los pagos en bolivares para saldar
        //deudas cargadas en ese mes
        //Utilizada en balance general
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT SUM(pago.monto_bolivares) FROM pago INNER JOIN deuda "
                + "ON pago.id_deuda2 = deuda.id_deuda WHERE fecha_pago BETWEEN ? "
                + "AND ? AND fecha_carga BETWEEN ? AND ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, fechaI);
            ps.setString(2, fechaL);
            ps.setString(3, fechaI);
            ps.setString(4, fechaL);
            rs = ps.executeQuery();
            
            if(rs.next()){
                balance.setDeuda_actual_bolivares(rs.getInt(1));

                return true;
            }
            else{
                balance.setDeuda_actual_bolivares(0);
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
    
    public int verificarExistencia(String id){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT COUNT(*) FROM pago WHERE id_pago = ?";
        
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
