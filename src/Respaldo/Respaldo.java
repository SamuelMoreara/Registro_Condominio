
package Respaldo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ARANAGA
 */
public class Respaldo {
    
    public boolean respaldar(){
        try {
            Process p = Runtime.getRuntime().exec("mysqldump -u root -p administracion_condominio");
            
            new HiloLector(p.getErrorStream()).start();
            
            InputStream is = p.getInputStream();
            FileOutputStream fos = new FileOutputStream("Respaldo de Condominio.sql");
            
            byte[] buffer = new byte[1000];
            
            int leido = is.read(buffer);
            
            while(leido > 0){
                fos.write(buffer, 0, leido);
                leido = is.read(buffer);
            }
            
            fos.close();
            
            return true;
        }
        catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }    
    }
    
    public boolean restaurar(){
        try {
            Process p = Runtime.getRuntime().exec("mysql -u root -p administracion_condominio");
            
            new HiloLector(p.getErrorStream()).start();
            
            OutputStream os = p.getOutputStream();
            FileInputStream fis = new FileInputStream("Respaldo de Condominio.sql");
            
            byte[] buffer = new byte[1000];
            
            int leido = fis.read(buffer);
            
            while(leido > 0){
                os.write(buffer, 0, leido);
                leido = fis.read(buffer);
            }
            os.flush();
            os.close();
            fis.close();
            
            return true;
        }
        catch (IOException ex) {
            Logger.getLogger(Respaldo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }   
    }
}
