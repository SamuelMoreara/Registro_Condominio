
package Vista;

import static Controlador.Main.nombre_usuario;
import static Controlador.Main.frmMenu;
import Modelo.Administrador;
import Modelo.AdministradorSQL;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ARANAGA
 */
public class PerfilUsuario extends javax.swing.JFrame {

    Administrador modelo = new Administrador();
    AdministradorSQL modeloSQL = new AdministradorSQL();
    
    public PerfilUsuario() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/Ícono del Programa.png")).getImage());
        setBackground(new Color(0,0,0,0));
        mostrar();
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
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldP1 = new javax.swing.JTextField();
        jTextFieldR1 = new javax.swing.JTextField();
        jTextFieldP2 = new javax.swing.JTextField();
        jTextFieldR2 = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelUsuario1 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelP1 = new javax.swing.JLabel();
        jLabelP2 = new javax.swing.JLabel();
        jLabelR1 = new javax.swing.JLabel();
        jLabelR2 = new javax.swing.JLabel();
        jButtonModificar = new javax.swing.JButton();
        jButtonCerrar1 = new javax.swing.JButton();
        jButtonCambiarContraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldNombre.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldNombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 130, 20));

        jTextFieldApellido.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldApellido.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldApellido.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldApellido.setBorder(null);
        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 130, 20));

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Masculino", "Femenino", "Otro" }));
        jComboBoxSexo.setBorder(null);
        jPanel1.add(jComboBoxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 150, -1));

        jTextFieldEmail.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldEmail.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldEmail.setBorder(null);
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, 130, 20));

        jTextFieldUsuario.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldUsuario.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 130, 20));

        jTextFieldP1.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldP1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldP1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldP1.setBorder(null);
        jTextFieldP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldP1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 130, 20));

        jTextFieldR1.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldR1.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldR1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldR1.setBorder(null);
        jTextFieldR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldR1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 130, 20));

        jTextFieldP2.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldP2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldP2.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldP2.setBorder(null);
        jTextFieldP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldP2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, 130, 20));

        jTextFieldR2.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldR2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldR2.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldR2.setBorder(null);
        jTextFieldR2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldR2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 520, 130, 20));

        jLabelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 150, 40));

        jLabelApellido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, 40));

        jLabelUsuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 150, 40));

        jLabelEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 150, 40));

        jLabelP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 150, 40));

        jLabelP2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 150, 40));

        jLabelR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 150, 40));

        jLabelR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 150, 40));

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Modificar.png"))); // NOI18N
        jButtonModificar.setBorder(null);
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 130, 30));

        jButtonCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/1. Inicio de Sesión/Botones/Botón Cerrar.png"))); // NOI18N
        jButtonCerrar1.setContentAreaFilled(false);
        jButtonCerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 10, 20));

        jButtonCambiarContraseña.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Cambiar Contraseña.png"))); // NOI18N
        jButtonCambiarContraseña.setBorder(null);
        jButtonCambiarContraseña.setContentAreaFilled(false);
        jButtonCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCambiarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 513, 130, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 150, 40));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Perfil de Usuario.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 606));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jTextFieldP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldP1ActionPerformed

    private void jTextFieldP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldP2ActionPerformed

    private void jTextFieldR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldR1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldR1ActionPerformed

    private void jTextFieldR2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldR2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldR2ActionPerformed

    private void jButtonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrar1ActionPerformed
        frmMenu.setEnabled(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrar1ActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarContraseñaActionPerformed
        PerfilContraseña frmCambiarContraseña = new PerfilContraseña();
        frmCambiarContraseña.setVisible(true);
    }//GEN-LAST:event_jButtonCambiarContraseñaActionPerformed
    
    private void modificar(){
        modelo.setNombre(jTextFieldNombre.getText());
        modelo.setApellido(jTextFieldApellido.getText());
        modelo.setSexo(jComboBoxSexo.getSelectedItem().toString());
        modelo.setEmail(jTextFieldEmail.getText());
        modelo.setPregunta1(jTextFieldP1.getText());
        modelo.setPregunta2(jTextFieldP2.getText());
        modelo.setRespuesta1(jTextFieldR1.getText());
        modelo.setRespuesta2(jTextFieldR2.getText());
        
        if(modeloSQL.modificar(modelo)){
            JOptionPane.showMessageDialog(null,"Modificacion completada");
            mostrar();
        }
    }
    
    public void mostrar(){
        modelo.setNombre_usuario(nombre_usuario);
        
        if(modeloSQL.mostrar(modelo)){
            jTextFieldNombre.setText(modelo.getNombre());
            jTextFieldApellido.setText(modelo.getApellido());
            jTextFieldUsuario.setText(nombre_usuario);
            jComboBoxSexo.setSelectedItem(modelo.getSexo());
            jTextFieldEmail.setText(modelo.getEmail());
            jTextFieldP1.setText(modelo.getPregunta1());
            jTextFieldP2.setText(modelo.getPregunta2());
            jTextFieldR1.setText(modelo.getRespuesta1());
            jTextFieldR2.setText(modelo.getRespuesta2());
        }  
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCambiarContraseña;
    public javax.swing.JButton jButtonCerrar1;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JComboBox jComboBoxSexo;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelApellido;
    public javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFondo;
    public javax.swing.JLabel jLabelNombre;
    public javax.swing.JLabel jLabelP1;
    public javax.swing.JLabel jLabelP2;
    public javax.swing.JLabel jLabelR1;
    public javax.swing.JLabel jLabelR2;
    public javax.swing.JLabel jLabelUsuario1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldApellido;
    public javax.swing.JTextField jTextFieldEmail;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldP1;
    public javax.swing.JTextField jTextFieldP2;
    public javax.swing.JTextField jTextFieldR1;
    public javax.swing.JTextField jTextFieldR2;
    public javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
