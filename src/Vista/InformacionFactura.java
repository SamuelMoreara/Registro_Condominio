
package Vista;

import Modelo.Factura;
import Modelo.FacturaSQL;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class InformacionFactura extends javax.swing.JFrame {

    Factura modelo = new Factura();
    FacturaSQL modFacturaSQL = new FacturaSQL();
    
    public InformacionFactura() {
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
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldConcepto = new javax.swing.JTextField();
        jTextFieldMonto = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelNumero = new javax.swing.JLabel();
        jLabelMonto = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jLabelBuscar = new javax.swing.JLabel();
        jComboBoxCodigoServicio = new javax.swing.JComboBox();
        jComboBoxMoneda = new javax.swing.JComboBox();
        jButtonBuscar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
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

        jTextFieldConcepto.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldConcepto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldConcepto.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldConcepto.setBorder(null);
        jTextFieldConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConceptoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, 20));

        jTextFieldMonto.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldMonto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldMonto.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldMonto.setBorder(null);
        jTextFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMontoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 245, 130, 20));

        jTextFieldFecha.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldFecha.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldFecha.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldFecha.setText("Año-Mes-Dia");
        jTextFieldFecha.setBorder(null);
        jTextFieldFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldFechaMouseClicked(evt);
            }
        });
        jTextFieldFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 355, 130, 20));

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

        jLabelNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 150, 40));

        jLabelMonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 40));

        jLabelFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 150, 30));

        jLabelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 150, 30));

        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 150, 30));

        jComboBoxCodigoServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "BLBS1AB", "BLBS2VI", "BLBS3VE", "BLBS4C1", "BLBS5C2", "BLBS6C3" }));
        jComboBoxCodigoServicio.setBorder(null);
        jPanel1.add(jComboBoxCodigoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 150, 30));

        jComboBoxMoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Dólares", "Bolívares" }));
        jComboBoxMoneda.setBorder(null);
        jPanel1.add(jComboBoxMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 150, 30));

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

        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Registrar.png"))); // NOI18N
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.setContentAreaFilled(false);
        jButtonRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, 140, 40));

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

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Eliminar.png"))); // NOI18N
        jButtonEliminar.setBorder(null);
        jButtonEliminar.setContentAreaFilled(false);
        jButtonEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 140, 40));

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Limpiar.png"))); // NOI18N
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 390, 140, 40));

        jButtonCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/1. Inicio de Sesión/Botones/Botón Cerrar.png"))); // NOI18N
        jButtonCerrar.setBorder(null);
        jButtonCerrar.setContentAreaFilled(false);
        jButtonCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 10, 20));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Información Factura Nueva.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        this.setVisible(false);
        limpiar();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jTextFieldConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConceptoActionPerformed

    private void jTextFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMontoActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        registrar(1);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        registrar(2);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jTextFieldBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldBuscarMouseClicked
        jTextFieldBuscar.setText(null);
    }//GEN-LAST:event_jTextFieldBuscarMouseClicked

    private void jTextFieldCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCodigoMouseClicked
        jTextFieldCodigo.setText(null);
    }//GEN-LAST:event_jTextFieldCodigoMouseClicked

    private void jTextFieldFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldFechaMouseClicked
        jTextFieldFecha.setText(null);
    }//GEN-LAST:event_jTextFieldFechaMouseClicked
    
    private void registrar(int eleccion){
        if(jTextFieldCodigo.equals("") || jTextFieldConcepto.equals("") || jTextFieldMonto.equals("") || 
                jTextFieldFecha.equals("") || jComboBoxCodigoServicio.getSelectedItem().toString().equals("Seleccione")
                || jComboBoxMoneda.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Hay campos vacíos. Llene todos los campos");   
        }
        else{
                extraerInformacion();
                switch(eleccion){
                    case 1: if(modFacturaSQL.verificarExistencia(jTextFieldCodigo.getText()) == 0){
                                if(modFacturaSQL.registrar(modelo)){
                                    JOptionPane.showMessageDialog(null,"Registro finalizado exitosamente");
                                }
                                else{
                                    JOptionPane.showMessageDialog(null,"Error al registrar el modelo");
                                }
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Ya existe una factura con el"
                                        + "codigo que usted ingreso. Intente nuevamente");
                            }
                            break;
                    case 2: if(modFacturaSQL.modificar(modelo)){
                                JOptionPane.showMessageDialog(null,"Datos modificados exitosamente");
                            }
                            else{
                                JOptionPane.showMessageDialog(null,"Error al modificar el modelo");
                            }
                            break;
                }
            limpiar();
        }
    }
    
    private void extraerInformacion(){
        modelo.setId_factura(jTextFieldCodigo.getText());
        modelo.setDescripcion(jTextFieldConcepto.getText());
           
        String moneda = jComboBoxMoneda.getSelectedItem().toString();

        if(moneda.equals("Dólares")){
            modelo.setMonto_dolares(Float.parseFloat(jTextFieldMonto.getText()));
        }
        if(moneda.equals("Bolívares")){
            modelo.setMonto_bolivares(Integer.parseInt(jTextFieldMonto.getText()));
        }
            
        modelo.setFecha_emision(jTextFieldFecha.getText());
        modelo.setId_servicio3(jComboBoxCodigoServicio.getSelectedItem().toString());
        
    }
    
    private void buscar(){
        modelo.setId_factura(jTextFieldBuscar.getText());
        
        if(modFacturaSQL.buscar(modelo)){
            jTextFieldCodigo.setText(String.valueOf(modelo.getId_factura()));
            jTextFieldConcepto.setText(modelo.getDescripcion());
            
            if(modelo.getMonto_dolares() > 0){
                jTextFieldMonto.setText(String.valueOf(modelo.getMonto_dolares()));
                jComboBoxMoneda.setSelectedIndex(1);
            }
            if(modelo.getMonto_bolivares() > 0){
                jTextFieldMonto.setText(String.valueOf(modelo.getMonto_bolivares()));
                jComboBoxMoneda.setSelectedIndex(2);
            }
          
            jTextFieldFecha.setText(modelo.getFecha_emision());
            jComboBoxCodigoServicio.setSelectedItem(modelo.getId_servicio3());
        }
        else{
            JOptionPane.showMessageDialog(null,"Factura no encontrada");
        }
    }
    
    private void eliminar(){
        if(jTextFieldCodigo.equals("") || jTextFieldConcepto.equals("") || jTextFieldMonto.equals("") || 
                jTextFieldFecha.equals("")){
            JOptionPane.showMessageDialog(null,"Hay campos vacíos. Llene todos los campos");   
        }
        else{
            modelo.setId_factura(jTextFieldCodigo.getText());
            
            if(modFacturaSQL.eliminar(modelo)){
                JOptionPane.showMessageDialog(null,"Datos eliminados exitosamente");
            }
            else{
                JOptionPane.showMessageDialog(null,"Error al eliminar el modelo");
            }
        }
        limpiar();
    }
    
    private void limpiar(){
        jTextFieldCodigo.setText("Campo Único");
        jTextFieldConcepto.setText(null);
        jTextFieldMonto.setText(null);
        jComboBoxMoneda.setSelectedIndex(0);
        jTextFieldFecha.setText("Año-Mes-Dia");
        jComboBoxCodigoServicio.setSelectedIndex(0);
        jTextFieldBuscar.setText("Buscar");
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
            java.util.logging.Logger.getLogger(InformacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionFactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionFactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonCerrar;
    public javax.swing.JButton jButtonEliminar;
    public javax.swing.JButton jButtonLimpiar;
    public javax.swing.JButton jButtonModificar;
    public javax.swing.JButton jButtonRegistrar;
    public javax.swing.JComboBox jComboBoxCodigoServicio;
    public javax.swing.JComboBox jComboBoxMoneda;
    public javax.swing.JLabel jLabelBuscar;
    public javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFondo;
    public javax.swing.JLabel jLabelHora;
    public javax.swing.JLabel jLabelMonto;
    public javax.swing.JLabel jLabelNumero;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldBuscar;
    public javax.swing.JTextField jTextFieldCodigo;
    public javax.swing.JTextField jTextFieldConcepto;
    public javax.swing.JTextField jTextFieldFecha;
    public javax.swing.JTextField jTextFieldMonto;
    // End of variables declaration//GEN-END:variables
}
