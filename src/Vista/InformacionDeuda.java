package Vista;

import Modelo.Deuda;
import Modelo.DeudaSQL;
import Modelo.DeudaE;
import Modelo.Pago;
import Controlador.Deudas;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class InformacionDeuda extends javax.swing.JFrame {

    
    Deuda modeloDeuda = new Deuda();
    DeudaE modeloDeudaE = new DeudaE();
    Pago modeloPago = new Pago();
    DeudaSQL modeloDeudaSQL = new DeudaSQL();
    Deudas deudas = new Deudas();
    
    
    public InformacionDeuda() {
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
        jTextFieldMonto = new javax.swing.JTextField();
        jTextFieldConcepto = new javax.swing.JTextField();
        jTextFieldFecha = new javax.swing.JTextField();
        jTextFieldBuscar = new javax.swing.JTextField();
        jLabelCodigo = new javax.swing.JLabel();
        jLabelConcepto = new javax.swing.JLabel();
        jLabelMonto = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelBuscar = new javax.swing.JLabel();
        jButtonBuscar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonCerrar = new javax.swing.JButton();
        jComboBoxCodigoServicio = new javax.swing.JComboBox();
        jComboBoxMoneda = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTasa = new javax.swing.JTextField();
        jLabelTasa = new javax.swing.JLabel();
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

        jTextFieldMonto.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldMonto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldMonto.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldMonto.setBorder(null);
        jTextFieldMonto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMontoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 195, 130, 20));

        jTextFieldConcepto.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldConcepto.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldConcepto.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldConcepto.setBorder(null);
        jTextFieldConcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConceptoActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 295, 130, 20));

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
        jPanel1.add(jTextFieldFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 345, 130, 20));

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

        jLabelConcepto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 150, 50));

        jLabelMonto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 150, 30));

        jLabelFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 150, 30));

        jLabelBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 150, 30));

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Buscar (Lupa).png"))); // NOI18N
        jButtonBuscar.setBorder(null);
        jButtonBuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscar.setOpaque(false);
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

        jButtonLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Botones Adicionales/Botón Limpiar.png"))); // NOI18N
        jButtonLimpiar.setBorder(null);
        jButtonLimpiar.setContentAreaFilled(false);
        jButtonLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 330, 140, 30));

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

        jComboBoxCodigoServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "BLBS1AB", "BLBS2VI", "BLBS3VE", "BLBS4C1", "BLBS5C2", "BLBS6C3" }));
        jComboBoxCodigoServicio.setBorder(null);
        jPanel1.add(jComboBoxCodigoServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 150, 30));

        jComboBoxMoneda.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Dólares", "Bolívares" }));
        jComboBoxMoneda.setBorder(null);
        jPanel1.add(jComboBoxMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 150, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 160, 20));

        jTextFieldTasa.setBackground(new java.awt.Color(240, 240, 240));
        jTextFieldTasa.setFont(new java.awt.Font("Microsoft JhengHei", 0, 11)); // NOI18N
        jTextFieldTasa.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldTasa.setBorder(null);
        jTextFieldTasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTasaActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 395, 130, 20));

        jLabelTasa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Botones/Caja de Texto (Registros).png"))); // NOI18N
        jPanel1.add(jLabelTasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 150, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Registros y Comprobaciones/Informacion de Deuda con Tasa.png"))); // NOI18N
        jPanel1.add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        buscar();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jTextFieldMontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMontoActionPerformed

    private void jTextFieldConceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConceptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConceptoActionPerformed

    private void jTextFieldFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaActionPerformed

    private void jButtonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCerrarActionPerformed
        this.setVisible(false);
        limpiar();
    }//GEN-LAST:event_jButtonCerrarActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        registrar(1);
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        registrar(2);
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jTextFieldTasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTasaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTasaActionPerformed

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
 
        if(jTextFieldCodigo.equals("") || jTextFieldMonto.equals("") || jTextFieldConcepto.equals("") ||
                jTextFieldFecha.equals("") || jComboBoxCodigoServicio.getSelectedItem().toString().equals("Seleccione")
                || jTextFieldTasa.equals("")
                || jComboBoxMoneda.getSelectedItem().toString().equals("Seleccione")){
            JOptionPane.showMessageDialog(null,"Hay campos vacíos. Llene todos los campos");
        }
        else{
            if(modeloDeudaSQL.verificarExistencia(jTextFieldCodigo.getText()) == 0){
                extraerInformacion();
                
                System.out.println(modeloDeuda.getId_deuda());
                System.out.println(modeloDeudaE.getId_deuda2());
                
                //Registrar
                if(eleccion == 1){
                    deudas.cargar(modeloDeuda, modeloDeudaE, modeloPago);
                }
                //Modificar
                else{
                    deudas.modificar(modeloDeuda, modeloDeudaE, modeloPago);
                }
            }
            else{
                JOptionPane.showMessageDialog(null,"Ya existe una deuda con el "
                        + "codigo que usted ingreso. Intente nuevamente");   
            }
        }
        limpiar();
    }
    
    private void buscar(){
        modeloDeuda.setId_deuda(jTextFieldBuscar.getText());
        
        if(modeloDeudaSQL.buscar(modeloDeuda)){
            jTextFieldCodigo.setText(modeloDeuda.getId_deuda());
            
            if(modeloDeuda.getMonto_dolares() > 0){
                jTextFieldMonto.setText(String.valueOf(modeloDeuda.getMonto_dolares()));
                jComboBoxMoneda.setSelectedIndex(1);
            }
            if(modeloDeuda.getMonto_bolivares() > 0){
                jTextFieldMonto.setText(String.valueOf(modeloDeuda.getMonto_bolivares()));
                jComboBoxMoneda.setSelectedIndex(2);
            }
            
            jTextFieldConcepto.setText(modeloDeuda.getDescripcion());
            jTextFieldFecha.setText(modeloDeuda.getFecha_carga());
            jTextFieldTasa.setText(String.valueOf(modeloDeuda.getTasa_dolar()));
            jComboBoxCodigoServicio.setSelectedItem(modeloDeuda.getId_servicio2());
        }
        else{
            JOptionPane.showMessageDialog(null,"Deuda no encontrada");
        }
    }
    
    private void extraerInformacion(){
        //Extraccion de Informacion ingresada por usuario
        //Deuda General (DG) y Deuda Especifica (DE)
        //DG indica la informacion a nivel general, en el condominio
        //DE indica la deuda cargada a cada casa. Esta, es para consultas especificas
        
        modeloDeuda.setId_deuda(jTextFieldCodigo.getText());
            
        String moneda = jComboBoxMoneda.getSelectedItem().toString();

        if(moneda.equals("Dólares")){
            modeloDeuda.setMonto_dolares(Float.parseFloat(jTextFieldMonto.getText()));
            modeloDeuda.setMonto_bolivares(0);
            modeloDeudaE.setMonto_dolares(Float.parseFloat(jTextFieldMonto.getText()));
            modeloDeudaE.setMonto_bolivares(0);
        }
        if(moneda.equals("Bolívares")){
            modeloDeuda.setMonto_bolivares(Integer.parseInt(jTextFieldMonto.getText()));
            modeloDeudaE.setMonto_dolares(0);
            modeloDeuda.setMonto_bolivares(Integer.parseInt(jTextFieldMonto.getText()));
            modeloDeudaE.setMonto_dolares(0);
        }

        modeloDeuda.setDescripcion(jTextFieldConcepto.getText());
        modeloDeudaE.setDescripcion(jTextFieldConcepto.getText());
        
        modeloDeuda.setFecha_carga(jTextFieldFecha.getText());
        modeloDeudaE.setFecha_carga(jTextFieldFecha.getText());
        modeloPago.setFecha_pago(jTextFieldFecha.getText());
        
        modeloDeuda.setTasa_dolar(Integer.parseInt(jTextFieldTasa.getText()));
        modeloDeuda.setId_servicio2(jComboBoxCodigoServicio.getSelectedItem().toString());
        
        modeloDeudaE.setEstado("No pagada");
        modeloDeudaE.setId_deuda2(jTextFieldCodigo.getText());
        modeloPago.setId_deuda2(jTextFieldCodigo.getText());
    }
    
    private void limpiar(){
        jTextFieldCodigo.setText("Campo Único");
        jTextFieldMonto.setText(null);
        jComboBoxMoneda.setSelectedIndex(0);
        jTextFieldConcepto.setText(null);  
        jTextFieldFecha.setText("Año-Mes-Dia");;
        jTextFieldTasa.setText(null);
        jComboBoxCodigoServicio.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(InformacionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionDeuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionDeuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonBuscar;
    public javax.swing.JButton jButtonCerrar;
    public javax.swing.JButton jButtonLimpiar;
    public javax.swing.JButton jButtonModificar;
    public javax.swing.JButton jButtonRegistrar;
    public javax.swing.JComboBox jComboBoxCodigoServicio;
    public javax.swing.JComboBox jComboBoxMoneda;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabelBuscar;
    public javax.swing.JLabel jLabelCodigo;
    public javax.swing.JLabel jLabelConcepto;
    public javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFondo;
    public javax.swing.JLabel jLabelMonto;
    public javax.swing.JLabel jLabelTasa;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextFieldBuscar;
    public javax.swing.JTextField jTextFieldCodigo;
    public javax.swing.JTextField jTextFieldConcepto;
    public javax.swing.JTextField jTextFieldFecha;
    public javax.swing.JTextField jTextFieldMonto;
    public javax.swing.JTextField jTextFieldTasa;
    // End of variables declaration//GEN-END:variables
}
