/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public class BancaLinea extends javax.swing.JFrame {
    Cliente cliente;
    /**
     * Creates new form BancaLinea
     */
    public BancaLinea(Cliente cliente) {
        this.cliente = cliente;
        initComponents(); // ya estaba definido
        mostrarDetalles(); // agregue 
    }
    
    public void mostrarDetalles(){
        lblNumCliente.setText(Long.toString(cliente.getIdCliente()));
        lblNombre.setText(cliente.getNombre() + " " + cliente.getApPaterno() + " " + cliente.getApMaterno());
        for(Cuenta c : cliente.getCuentas()){
            if(c instanceof CuentaDebito)
                comboCuentasDebito.addItem(Long.toString(c.getNumero()));
           
            if(c instanceof CuentaCredito)
                comboCuentasCredito.addItem(Long.toString(c.getNumero()));
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNumCliente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        comboCuentasDebito = new javax.swing.JComboBox<>();
        comboCuentasCredito = new javax.swing.JComboBox<>();
        btnDetalleDebito = new javax.swing.JButton();
        btnDetalleCredito = new javax.swing.JButton();
        btnCerrarSesion = new javax.swing.JButton();
        btnServicios = new javax.swing.JButton();
        btnTransferencia = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Banca en línea");

        jLabel1.setText("B I E N V E N I D O       A      T U      B A N C A       E N        L I N E A");

        jLabel2.setText("número de cliente: ");

        lblNumCliente.setText("xxxxx");

        jLabel4.setText("Cuentas débito.");

        jLabel5.setText("Cuentas crédito.");

        comboCuentasDebito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        comboCuentasCredito.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));

        btnDetalleDebito.setText("ver detalle");
        btnDetalleDebito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleDebitoActionPerformed(evt);
            }
        });

        btnDetalleCredito.setText("ver detalle");
        btnDetalleCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetalleCreditoActionPerformed(evt);
            }
        });

        btnCerrarSesion.setText("cerrar sesión");

        btnServicios.setText("Pago servicios ");

        btnTransferencia.setText("Tranferencias");
        btnTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransferenciaActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre:");

        lblNombre.setText("xxxxx");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTransferencia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnServicios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(161, 161, 161))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCerrarSesion)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboCuentasCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDetalleCredito))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboCuentasDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(btnDetalleDebito))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumCliente)
                            .addComponent(lblNombre))))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNumCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblNombre))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboCuentasDebito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalleDebito))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboCuentasCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDetalleCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnServicios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTransferencia)
                .addGap(5, 5, 5)
                .addComponent(btnCerrarSesion))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDetalleDebitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleDebitoActionPerformed
        // TODO add your handling code here:
        // Crear instancia de la ventana 
        
        //DetalleCuentaDebito frameDebito = new DetalleCuentaDebito(cuentaDebito);
        DetalleCuentaDebito frameDebito= new DetalleCuentaDebito();
        frameDebito.setVisible(true);
        
    }//GEN-LAST:event_btnDetalleDebitoActionPerformed

    private void btnDetalleCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetalleCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetalleCreditoActionPerformed

    private void btnTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransferenciaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTransferenciaActionPerformed

    /**
     * @param args the command line arguments
     */
    /*public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BancaLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BancaLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BancaLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BancaLinea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BancaLinea().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrarSesion;
    private javax.swing.JButton btnDetalleCredito;
    private javax.swing.JButton btnDetalleDebito;
    private javax.swing.JButton btnServicios;
    private javax.swing.JButton btnTransferencia;
    private javax.swing.JComboBox<String> comboCuentasCredito;
    private javax.swing.JComboBox<String> comboCuentasDebito;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumCliente;
    // End of variables declaration//GEN-END:variables
}
