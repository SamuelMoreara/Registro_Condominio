
package Vista;

//import Modelo.Conexion;
import static Controlador.Main.apellido;
import static Controlador.Main.frmMenu;
import static Controlador.Main.nombre;
import Modelo.Conexion;
import static Vista.Menu.frmMinimenu;
import static Vista.Menu.frmPerfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Servicio extends javax.swing.JFrame {

    InformacionServicio frmInformacionServicios = new InformacionServicio();
    
    public Servicio() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/Ícono del Programa.png")).getImage());
        llenarCajaTexto();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jButtonInformacion = new javax.swing.JButton();
        jButtonMinimizar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jButtonPerfil = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jButtonCargar = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 180, 30));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 210, 940, 460));

        jButtonInformacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Manejar Información.png"))); // NOI18N
        jButtonInformacion.setBorder(null);
        jButtonInformacion.setContentAreaFilled(false);
        jButtonInformacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, 200, 30));

        jButtonMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/1. Inicio de Sesión/Botones/Botón Minimizar.png"))); // NOI18N
        jButtonMinimizar.setBorder(null);
        jButtonMinimizar.setContentAreaFilled(false);
        jButtonMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMinimizarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 17, 20, 10));

        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/1. Inicio de Sesión/Botones/Botón Cerrar.png"))); // NOI18N
        jButtonCerrar.setBorder(null);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(933, 10, 10, 20));

        jButtonPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/2. Menú/Botones/Botón Perfil (Sesión Actual).png"))); // NOI18N
        jButtonPerfil.setBorder(null);
        jButtonPerfil.setContentAreaFilled(false);
        jButtonPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerfilActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 3, 50, 40));

        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/2. Menú/Botones/Botón Menú.png"))); // NOI18N
        jButtonMenu.setBorder(null);
        jButtonMenu.setContentAreaFilled(false);
        jButtonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, -1, 40, 50));

        jButtonCargar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton Cargar Tabla.png"))); // NOI18N
        jButtonCargar.setBorder(null);
        jButtonCargar.setContentAreaFilled(false);
        jButtonCargar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCargarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 100, 20, 30));

        jButtonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Tablas/Botón Regresar.png"))); // NOI18N
        jButtonRegresar.setBorder(null);
        jButtonRegresar.setContentAreaFilled(false);
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Tablas/Botón Regresar (Presionado).png"))); // NOI18N
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 40, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Tablas/Nombres/Nombre Servicios.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, -1, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Tablas/Pantalla para Tablas.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed
        frmMinimenu.setVisible(true);
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMinimizarActionPerformed
        this.setState(ICONIFIED);
    }//GEN-LAST:event_jButtonMinimizarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        frmInformacionServicios.dispose();
        this.dispose();
        frmMenu.setVisible(true);
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacionActionPerformed
        frmInformacionServicios.setVisible(true);
    }//GEN-LAST:event_jButtonInformacionActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerfilActionPerformed
        frmPerfil.setVisible(true);
    }//GEN-LAST:event_jButtonPerfilActionPerformed

    private void jButtonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCargarActionPerformed
        cargarTabla();
    }//GEN-LAST:event_jButtonCargarActionPerformed

    public void cargarTabla(){
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            jTableDatos.setModel(modelo);
            
            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConexion();
            
            String sql = "SELECT * FROM servicio";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMD = rs.getMetaData();
            int cantidadColumnas = rsMD.getColumnCount();
            
            modelo.addColumn("ID");
            modelo.addColumn("Nombre del Servicio");
            modelo.addColumn("RIF del Proveedor");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nombre de la Empresa");
            
            
            while(rs.next()){
                Object[] filas = new Object[cantidadColumnas];
                
                for(int i=0;i<cantidadColumnas;i++){
                    filas[i] = rs.getObject(i+1);
                }
                
                modelo.addRow(filas);
            }
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al insertar datos");
        }
    }
    
    public void llenarCajaTexto(){
        jTextFieldUsuario.setText(nombre+" "+apellido);
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Servicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Servicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCargar;
    private javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonInformacion;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonMinimizar;
    private javax.swing.JButton jButtonPerfil;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    public javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
