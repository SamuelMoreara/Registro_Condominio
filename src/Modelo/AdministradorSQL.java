package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class AdministradorSQL extends Conexion{
    
    public boolean registrar(Administrador admin){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "INSERT INTO administrador(nombre_usuario,contraseña,nombre,apellido,sexo,email,"
                + "pregunta1,pregunta2,respuesta1,respuesta2,sesion,nombre_condominio2) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, admin.getNombre_usuario());
            ps.setString(2, admin.getContraseña());
            ps.setString(3, admin.getNombre());
            ps.setString(4, admin.getApellido());
            ps.setString(5, admin.getSexo());
            ps.setString(6, admin.getEmail());
            ps.setString(7, admin.getPregunta1());
            ps.setString(8, admin.getPregunta2());
            ps.setString(9, admin.getRespuesta1());
            ps.setString(10, admin.getRespuesta2());
            ps.setString(11, "Inactivo");
            ps.setString(12, "Bucare");
            ps.execute();
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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
    
    public boolean mostrar (Administrador admin){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT nombre, apellido, sexo, email, contraseña, "
                + "pregunta1, pregunta2, respuesta1, respuesta2 FROM "
                + "administrador WHERE nombre_usuario = ?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, admin.getNombre_usuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                admin.setNombre(rs.getString("nombre"));
                admin.setApellido(rs.getString("apellido"));
                admin.setSexo(rs.getString("sexo"));
                admin.setEmail(rs.getString("email"));
                admin.setContraseña(rs.getString("contraseña"));
                admin.setPregunta1(rs.getString("pregunta1"));
                admin.setPregunta2(rs.getString("pregunta2"));
                admin.setRespuesta1(rs.getString("respuesta1"));
                admin.setRespuesta2(rs.getString("respuesta2"));
            }
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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
    
    public boolean modificar(Administrador admin){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE administrador SET nombre = ?, apellido = ?, "
                + "sexo = ?, email = ?, contraseña = ?, pregunta1 = ?, "
                + "pregunta2 = ?, respuesta1 = ?, respuesta2 = ? "
                + "WHERE nombre_usuario = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, admin.getNombre());
            ps.setString(2, admin.getApellido());
            ps.setString(3, admin.getSexo());
            ps.setString(4, admin.getEmail());
            ps.setString(5, admin.getContraseña());
            ps.setString(6, admin.getPregunta1());
            ps.setString(7, admin.getPregunta2());
            ps.setString(8, admin.getRespuesta1());
            ps.setString(9, admin.getRespuesta2());
            ps.setString(10, admin.getNombre_usuario());
            ps.execute();
            
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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
    
    public boolean cambiarContraseña(String usuario, String contraseña){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE administrador SET contraseña = ? WHERE nombre_usuario = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, contraseña);
            ps.setString(2, usuario);
            ps.execute();
            
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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
    
    public int existeUsuario(String usuario){ //Revisar - No funciona bien
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT count(*) FROM administrador WHERE nombre_usuario = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            rs = ps.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
            return 1;
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
    
    public boolean login(Administrador admin){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        boolean activo = false;
        
        String sql = "SELECT nombre_usuario,contraseña,nombre,apellido,ultima_entrada,sesion"
                + " FROM administrador WHERE nombre_usuario = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, admin.getNombre_usuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                if(admin.getContraseña().equals(rs.getString(2))){
                    admin.setNombre(rs.getString(3));
                    admin.setApellido(rs.getString(4));
                    admin.setUltimaentrada("2021-06-24");
                    //admin.setUltimaentrada(rs.getString(5));
                    estadoSesion(rs.getString(1),activo);
                    return true;
                }
                else{
                    return false;
                }
            }
            return false;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en BD: "+e.getMessage());
            return false;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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
    
    public boolean estadoSesion(String usuario,boolean activo){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE administrador SET sesion = ? WHERE nombre_usuario = ?";
        
        try{
            ps = con.prepareStatement(sql);
            
            if(activo == true){
                ps.setString(1, "Inactivo");
            }
            else{
                ps.setString(1, "Activo");
            }
            
            ps.setString(2, usuario);
            ps.execute();
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar estado de sesion: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null,"Error al cerrar conexion en estado de sesion: "+q.getMessage());  
            }
        }
    }
    
    public boolean estadoUsuario(Administrador admin){
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        
        String sql = "SELECT nombre_usuario, nombre, apellido, ultima_entrada FROM administrador WHERE sesion = 'Activo'";
        
        try{
            ps = con.prepareStatement(sql);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                admin.setNombre_usuario(rs.getString(1));
                admin.setNombre(rs.getString(2));
                admin.setApellido(rs.getString(3));
                admin.setUltimaentrada(rs.getString(4));
                return true;
            }
            return false;
        }
        catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Error al verificar estado de sesion: "+e.getMessage());
           return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null,"Error al cerrar conexion en estado de sesion: "+q.getMessage());  
            }
        }
    }
    
    public boolean recuperarContraseña(Administrador admin){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        
        String sql = "SELECT contraseña, pregunta1, pregunta2, respuesta1, respuesta2 FROM administrador "
                + "WHERE nombre_usuario = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, admin.getNombre_usuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
                admin.setPregunta1(rs.getString("pregunta1"));
                admin.setPregunta2(rs.getString("pregunta2"));
                admin.setRespuesta1(rs.getString("respuesta1"));
                admin.setRespuesta2(rs.getString("respuesta2"));
                admin.setContraseña(rs.getString("contraseña"));
                return true;
            }
            return false;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error en BD: "+e.getMessage());
            return false;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
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
    
    public boolean actualizarEntrada(String fecha, String usuario){
        PreparedStatement ps = null;
        Connection con = getConexion();
        
        String sql = "UPDATE administrador SET ultima_entrada = ? WHERE nombre_usuario = ?";
        
        try{
            ps = con.prepareStatement(sql);
            
            ps.setString(1, fecha);
            ps.setString(2, usuario);
            ps.execute();
            
            return true;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al actualizar estado de sesion: "+e.getMessage());
            return false;
        }
        finally{
            try{
                con.close();
            }
            catch(SQLException q){
                JOptionPane.showMessageDialog(null,"Error al cerrar conexion en estado de sesion: "+q.getMessage());  
            }
        }
    }
}