    package banco;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miriampescadorrojas
 */
public class DetalleCuentaCredito extends javax.swing.JFrame {

    FileWriter output;
    CuentaCredito cuenta;
    Cliente cliente;
    
    public DetalleCuentaCredito() {
        initComponents();
    }
    
    public DetalleCuentaCredito(CuentaCredito c, Cliente cliente) {
        initComponents();
        mostrarDetalleCredito(c);
        this.cuenta=c;
        this.cliente = cliente;
    }
    
    public void mostrarDetalleCredito(CuentaCredito c){
       SimpleDateFormat formato = new SimpleDateFormat("dd'/'MM'/'yyyy");
       
       lblNumCuentaC.setText(String.valueOf(c.getNumero())); 
       txtCredito.setText(String.valueOf(c.getSaldoActual()));
       txtInteres.setText(String.valueOf(c.getInteresAnual()));
       txtCorte.setText(c.getfCorte());
       txtPago.setText(c.getfLimite());
       
      
       DefaultTableModel modelo = (new DefaultTableModel(
            null,
            new String [] {
                "Fecha", "Tipo", "Descripcion ", "Saldo Historico"
            }
        ));
        Object o[]=null;
        for (int i = 0; i < c.getMovtos().size() ; i++) {
            modelo.addRow(o);
            Movimiento mvto = c.getMovtos().get(i);
            modelo.setValueAt(formato.format(mvto.getFecha().getTime()), i, 0);
            modelo.setValueAt(mvto.getTipo(), i, 1);
            modelo.setValueAt(mvto.getConcepto(), i, 2);
            modelo.setValueAt(mvto.getSaldoHistorico(), i, 3);
            
        }
       
        TableMvtos.setModel(modelo);
        //jScrollPane2.setViewportView(TableMvtos);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        lblCuenta = new javax.swing.JLabel();
        lblNumCuentaC = new javax.swing.JLabel();
        lblCredito = new javax.swing.JLabel();
        lblInteres = new javax.swing.JLabel();
        lblCorte = new javax.swing.JLabel();
        lblPago = new javax.swing.JLabel();
        txtCredito = new javax.swing.JTextField();
        txtInteres = new javax.swing.JTextField();
        txtCorte = new javax.swing.JTextField();
        txtPago = new javax.swing.JTextField();
        lblMvtos = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableMvtos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCuenta.setText("Número de cuenta: ");

        lblNumCuentaC.setText("XXXXXX");

        lblCredito.setText("Credito:");
        lblCredito.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                lblCreditoCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        lblInteres.setText("Interes anual:");

        lblCorte.setText("Fecha corte:");

        lblPago.setText("Fecha pago:");

        txtCredito.setEditable(false);
        txtCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCreditoActionPerformed(evt);
            }
        });

        txtInteres.setEditable(false);

        txtCorte.setEditable(false);

        txtPago.setEditable(false);

        lblMvtos.setText("Movimientos");

        TableMvtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Tipo", "Descripcion ", "Saldo Historico"
            }
        ));
        jScrollPane2.setViewportView(TableMvtos);

        jButton2.setText("Solicitar estado de cuenta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Pagar Tarjeta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lblCuenta)
                .addGap(61, 61, 61)
                .addComponent(lblNumCuentaC)
                .addContainerGap(350, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPago)
                        .addGap(18, 18, 18)
                        .addComponent(txtPago))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCorte)
                        .addGap(18, 18, 18)
                        .addComponent(txtCorte))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCredito)
                            .addComponent(lblInteres))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCredito)
                            .addComponent(txtInteres))))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMvtos)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuenta)
                    .addComponent(lblNumCuentaC))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMvtos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCredito)
                            .addComponent(txtCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInteres)
                            .addComponent(txtInteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorte)
                            .addComponent(txtCorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPago)
                            .addComponent(txtPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCreditoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_lblCreditoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCreditoCaretPositionChanged

    private void txtCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCreditoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        SimpleDateFormat formato = new SimpleDateFormat("dd'/'MM'/'yyyy");
        try {
            output = new FileWriter("EstadoCuenta.txt");
            output.write("-----------------------------------------Banca en Linea-----------------------------------");
            output.write("\n");
            output.write("\n");
            output.write("Numero de cuenta: \t" + String.valueOf(cuenta.getNumero())+ "\n");
            output.write("Credito: \t"+ String.valueOf(cuenta.getSaldoActual()));
            output.write("\n");
            output.write("Interes Anual: \t"+ String.valueOf(cuenta.getInteresAnual()));
            output.write("\n");
            output.write("Fecha corte: \t"+cuenta.getfCorte());
            output.write("\n");
            output.write("Fecha pago: \t"+cuenta.getfLimite());
            output.write("\n");
            output.write("--------------------------------Ultimos Movimientos---------------------------------------");
            output.write("\n");
            output.write("\n");
            output.write("Fecha \t\t Tipo  \t\t Saldo Historico \t\t Descripcion");
            output.write("\n");
            for (int i = 0; i < cuenta.getMovtos().size() ; i++) {
                output.write(formato.format(cuenta.getMovtos().get(i).getFecha().getTime()));
                output.write("\t");
                output.write(cuenta.getMovtos().get(i).getTipo().toString());
                output.write("\t\t");
                output.write(String.valueOf(cuenta.getMovtos().get(i).getSaldoHistorico()));
                output.write("\t\t\t");
                output.write(cuenta.getMovtos().get(i).getConcepto());
                output.write("\n");
            }
            
            JOptionPane.showMessageDialog(null, "Se genero el estado de cuenta ");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al generar el archivo ");
        }finally{
            try {
                output.close();
            } catch (IOException ex) {
                Logger.getLogger(DetalleCuentaCredito.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
       PagrTarjetaC pagar = new PagrTarjetaC(cuenta, cliente);
       pagar.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMvtos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCorte;
    private javax.swing.JLabel lblCredito;
    private javax.swing.JLabel lblCuenta;
    private javax.swing.JLabel lblInteres;
    private javax.swing.JLabel lblMvtos;
    private javax.swing.JLabel lblNumCuentaC;
    private javax.swing.JLabel lblPago;
    private javax.swing.JTextField txtCorte;
    private javax.swing.JTextField txtCredito;
    private javax.swing.JTextField txtInteres;
    private javax.swing.JTextField txtPago;
    // End of variables declaration//GEN-END:variables
}
