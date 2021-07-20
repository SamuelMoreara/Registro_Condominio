
package Vista;

import Respaldo.Respaldo;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ARANAGA
 */
public class RespaldoR extends javax.swing.JFrame {

    Respaldo respaldo = new Respaldo();
    
    public RespaldoR() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/Ícono del Programa.png")).getImage());
        setBackground(new Color(0,0,0,0));
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
        jButtonRespaldar = new javax.swing.JButton();
        jButtonRestaurar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonRespaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Respaldo/Boton Respaldar.png"))); // NOI18N
        jButtonRespaldar.setBorder(null);
        jButtonRespaldar.setContentAreaFilled(false);
        jButtonRespaldar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRespaldar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Respaldo/Boton Respaldar (Presionado).png"))); // NOI18N
        jButtonRespaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRespaldarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRespaldar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 150, 50));

        jButtonRestaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Respaldo/Boton Restaurar.png"))); // NOI18N
        jButtonRestaurar.setBorder(null);
        jButtonRestaurar.setContentAreaFilled(false);
        jButtonRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRestaurar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Respaldo/Boton Restaurar (Presionado).png"))); // NOI18N
        jButtonRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRestaurarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRestaurar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 150, 50));

        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/1. Inicio de Sesión/Botones/Botón Cerrar.png"))); // NOI18N
        jButtonCerrar.setBorder(null);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 10, 20));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Respaldo/Respaldo.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRestaurarActionPerformed
        if(respaldo.restaurar()){
            JOptionPane.showMessageDialog(null,"Restauracion finalizada exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null,"Restauracion fallida");
        }
    }//GEN-LAST:event_jButtonRestaurarActionPerformed

    private void jButtonRespaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRespaldarActionPerformed
        if(respaldo.respaldar()){
            JOptionPane.showMessageDialog(null,"Restauracion finalizada exitosamente");
        }
        else{
            JOptionPane.showMessageDialog(null,"Restauracion fallida");
        }
    }//GEN-LAST:event_jButtonRespaldarActionPerformed

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
            java.util.logging.Logger.getLogger(RespaldoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RespaldoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RespaldoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RespaldoR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RespaldoR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCerrar;
    private javax.swing.JButton jButtonRespaldar;
    private javax.swing.JButton jButtonRestaurar;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
