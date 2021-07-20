

package Controlador;

import Modelo.Conexion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author ARANAGA
 */
public class Reporte {
    @SuppressWarnings("unchecked")
    
    public void generar(int eleccion, int valor, int valor2){
        try {
            Conexion con = new Conexion();
            Connection conn = con.getConexion();
            
            LocalDateTime fecha_actual = LocalDateTime.now();
            Fecha fecha = new Fecha();
            int año = fecha_actual.getYear();
            int mes = fecha_actual.getMonthValue();
            String nombre_mes = fecha.nombreMes(mes);
            int dia = fecha.diasMeses(mes);
            
            String nombreReporte = nombreReporte(eleccion);
            
            JasperReport reporte = null;

            Map parametro = new HashMap();
           
            reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/"+nombreReporte));
            JasperPrint jprint = JasperFillManager.fillReport(reporte, null, conn);
           
            if(eleccion == 1){
                 for(int i=0;i<2;i++){
                     if(i == 0){
                         parametro.put("Año",valor);
                     }
                     else{
                         parametro.put("Mes",valor2);
                     }
                     jprint = JasperFillManager.fillReport(reporte, parametro, conn);
                 }
             }
            if(eleccion == 2){
                for(int i=0;i<4;i++){
                    if(i == 0){
                        System.out.println(valor);
                        parametro.put("numero_casa",valor);
                    }
                    if(i == 1){
                        parametro.put("Año",año);
                    }
                    if(i == 2){
                        parametro.put("Mes",nombre_mes);
                    }
                    else{
                        parametro.put("Dia",dia);
                    }
                    jprint = JasperFillManager.fillReport(reporte, parametro, conn);
                }
            } 
            
            JasperViewer view = new JasperViewer(jprint, false);
            
            view.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            
            view.setVisible(true);
   
        } catch (JRException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al cargar Reporte");
        }  
    }
    
    private boolean crearPDF(JasperPrint jprint, String nombre_archivo){
        try {
            File pdf = File.createTempFile(nombre_archivo,".pdf");
            
            try {
                System.out.println("Exportado a: "+pdf.getAbsolutePath());
                JasperExportManager.exportReportToPdfStream(jprint, new FileOutputStream(pdf));
                return true;
            }
            catch (JRException ex) {
                Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"Exportar PDF - Error: "+ex.getMessage());
                return false;
            } 
        }
        catch (IOException ex) {
            Logger.getLogger(Reporte.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Creacion de Archivo - Error: "+ex.getMessage());
            return false;
        }
    }
    
    private String nombreReporte(int eleccion){
        String nombre = " ";
    
        switch(eleccion){
            case 1: nombre = "BalanceGeneral.jasper"; break;
            case 2: nombre = "Solvencia.jasper"; break;
            case 3: nombre = "ListadoMorosos.jasper"; break;
            case 4: nombre = "ListadoPropietarios.jasper"; break;
        }
 
        return nombre;
    }
}
