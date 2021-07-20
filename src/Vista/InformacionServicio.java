package Vista;

import Modelo.Servicio;
import Modelo.ServicioSQL;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InformacionServicio extends javax.swing.JFrame {

    public static Servicio modServicio = new Servicio();
    public static ServicioSQL modservicioSQL = new ServicioSQL();
    
    public InformacionServicio() {
        initComponents();
        setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/Imágenes/Ícono del Programa.png")).getImage());
        setBackground(new Color(0,0,0,0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldNombreP = new javax.swing.JTextField();
        jTextFieldApellidoP = new javax.swing.JTextField();
        jTextFieldNombreE = new javax.swing.JTextField();
        jTextFieldRIF = new javax.swing.JTextField();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelNombreP = new javax.swing.JLabel();
        jLabelApellidoP = new javax.swing.JLabel();
        jLabelNombreE = new javax.swing.JLabel();
        jLabelRif = new javax.swing.JLabel();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCodigo.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldCodigo.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldCodigo.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldCodigo.setText("Campo Único");
        jTextFieldCodigo.setBorder(null);
        jTextFieldCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldCodigoMouseClicked(evt);
            }
        });
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 130, 20));

        jTextFieldNombre.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldNombre.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNombre.setBorder(null);
        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 195, 130, 20));

        jTextFieldNombreP.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldNombreP.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldNombreP.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNombreP.setBorder(null);
        jTextFieldNombreP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombrePActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 130, 20));

        jTextFieldApellidoP.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldApellidoP.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldApellidoP.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldApellidoP.setBorder(null);
        jTextFieldApellidoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoPActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 335, 130, 20));

        jTextFieldNombreE.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldNombreE.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldNombreE.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldNombreE.setBorder(null);
        jTextFieldNombreE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreEActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 425, 130, 20));

        jTextFieldRIF.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldRIF.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldRIF.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRIF.setBorder(null);
        jTextFieldRIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRIFActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldRIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 130, 20));

        jTextFieldBuscar.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldBuscar.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldBuscar.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldBuscar.setText("Buscar");
        jTextFieldBuscar.setBorder(null);
        jTextFieldBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldBuscarMouseClicked(evt);
            }
        });
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 145, 130, 20));

        jLabelCodigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, 40));

        jLabelNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 150, 50));

        jLabelNombreP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelNombreP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 150, 40));

        jLabelApellidoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelApellidoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 150, 30));

        jLabelNombreE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelNombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 150, 50));

        jLabelRif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelRif, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 150, 40));

        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 150, 30));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Buscar (Lupa).png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setContentAreaFilled(false);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 30, 30));

        jButtonModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Modificar.png"))); // NOI18N
        jButtonModificar.setBorder(null);
        jButtonModificar.setContentAreaFilled(false);
        jButtonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 140, 40));

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Limpiar.png"))); // NOI18N
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 140, 40));

        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/1. Inicio de Sesión/Botones/Botón Cerrar.png"))); // NOI18N
        jButtonCerrar.setBorder(null);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, 10, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 150, 20));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 424, 150, 20));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Información Servicio.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
    
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldNombrePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombrePActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombrePActionPerformed

    private void jTextFieldApellidoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoPActionPerformed

    private void jTextFieldRIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRIFActionPerformed

    private void jTextFieldNombreEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreEActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        setVisible(false);
        limpiar();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        registrar(2);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        jTextFieldBuscar.setText(null);
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

    private void jTextFieldCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCodigoMouseClicked
        jTextFieldCodigo.setText(null);
    }//GEN-LAST:event_jTextFieldCodigoMouseClicked
    
    private void registrar(int eleccion){
        if(jTextFieldCodigo.equals("") || jTextFieldNombre.equals("") || jTextFieldNombreP.equals("") ||
                jTextFieldApellidoP.equals("") || jTextFieldNombreE.equals("") || jTextFieldRIF.equals("")){
            JOptionPane.showMessageDialog(null,"Hay campos vacíos. Llene todos los campos");
        }
        else{
            //Extraccion de Informacion ingresada por usuario
            modServicio.setId_servicio(jTextFieldCodigo.getText());
            modServicio.setNombre_servicio(jTextFieldNombre.getText());
            modServicio.setRif_proveedor(jTextFieldRIF.getText());
            modServicio.setNombre_proveedor(jTextFieldNombreP.getText());
            modServicio.setApellido_proveedor(jTextFieldApellidoP.getText());
            modServicio.setNombre_empresa(jTextFieldNombreE.getText());
            
            //Registro - Modificacion en Base de Datos
            switch(eleccion){
                case 1: if(modservicioSQL.registrar(modServicio)){
                            JOptionPane.showMessageDialog(null,"Registro finalizado con éxito"); 
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Error al registrar el modelo");
                        }
                        break;
                case 2: if(modservicioSQL.modificar(modServicio)){
                            JOptionPane.showMessageDialog(null,"Datos modificados exitosamente"); 
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Error al Modificar");
                        } 
                        break;
            }
            limpiar();
        }
    }
    
    private void buscar(){
        if(jTextFieldBuscar.equals("")){
            JOptionPane.showMessageDialog(null, "Campo vacío. Ingrese el codigo del servicio a buscar");
        }
        else{
            modServicio.setId_servicio(jTextFieldBuscar.getText());
            
            if(modservicioSQL.buscar(modServicio)){
                
                jTextFieldCodigo.setText(modServicio.getId_servicio());
                jTextFieldNombre.setText(modServicio.getNombre_servicio());
                jTextFieldNombreP.setText(modServicio.getNombre_proveedor());
                jTextFieldApellidoP.setText(modServicio.getApellido_proveedor());
                jTextFieldNombreE.setText(modServicio.getNombre_empresa());
                jTextFieldRIF.setText(modServicio.getRif_proveedor());
            }
            else{
               JOptionPane.showMessageDialog(null,"Servicio no encontrado");      
            }
        }
    }
    
    private void limpiar(){
        jTextFieldCodigo.setText("Campo Único");
        jTextFieldNombre.setText(null);
        jTextFieldNombreP.setText(null);
        jTextFieldApellidoP.setText(null);
        jTextFieldNombreE.setText(null);;
        jTextFieldRIF.setText(null);
        jTextFieldBuscar.setText("Buscar");
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
            java.util.logging.Logger.getLogger(InformacionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionServicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionServicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonCerrar;
    public javax.swing.JButton jButtonLimpiar;
    public javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabelApellidoP;
    public javax.swing.JLabel jLabelBuscar;
    public javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelFondo;
    public javax.swing.JLabel jLabelNombre;
    public javax.swing.JLabel jLabelNombreE;
    public javax.swing.JLabel jLabelNombreP;
    public javax.swing.JLabel jLabelRif;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldApellidoP;
    public javax.swing.JTextField jTextFieldBuscar;
    public javax.swing.JTextField jTextFieldCodigo;
    public javax.swing.JTextField jTextFieldNombre;
    public javax.swing.JTextField jTextFieldNombreE;
    public javax.swing.JTextField jTextFieldNombreP;
    public javax.swing.JTextField jTextFieldRIF;
    // End of variables declaration//GEN-END:variables
}
