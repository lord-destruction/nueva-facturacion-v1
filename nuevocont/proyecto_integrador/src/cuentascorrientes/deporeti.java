/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentascorrientes;

import clases.letrasn;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import proyecto_integrador.conexion;

/**
 *
 * @author WINDOWS
 */
public class deporeti extends javax.swing.JFrame {

    /**
     * Creates new form deporeti
     */
    public deporeti() {
        initComponents();
        cargar();
    }
    
    private void cargar() {
        lblbanco.setText(listacuentas.ncuenta);
        lblcuenta.setText(listacuentas.ndes);
        dcemision.setDate(fecha);
        conec.conectar();
        int codigo = conec.consultac1get("select count(*) from deporeti", "count(*)");
        conec.desconectar();
        codigo++;
        lblnumero.setText("" + codigo);
    }
    private Date fecha = new Date();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel8 = new org.edisoncor.gui.panel.Panel();
        lblnbanco = new javax.swing.JLabel();
        lblncuenta = new javax.swing.JLabel();
        cbtipo = new javax.swing.JComboBox();
        lbltransaccion = new javax.swing.JLabel();
        lblnumero = new javax.swing.JLabel();
        lblemision = new javax.swing.JLabel();
        dcemision = new com.toedter.calendar.JDateChooser();
        lblmonto = new javax.swing.JLabel();
        txtmonto = new javax.swing.JTextField();
        lblcantidad = new javax.swing.JLabel();
        txtcantidad = new javax.swing.JTextField();
        lblreferencia = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        lblbalance = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblbanco = new javax.swing.JLabel();
        lblcuenta = new javax.swing.JLabel();

        panel8.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel8.setColorSecundario(new java.awt.Color(255, 153, 0));

        lblnbanco.setText("NOMBRE DEL BANCO");

        lblncuenta.setText("Cta Nro. ");

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "DEPOSITO", "RETIRO" }));

        lbltransaccion.setText("Nro. de Transaccion");

        lblnumero.setText("0");

        lblemision.setText("Emision");

        lblmonto.setText("Monto:");

        txtmonto.setText("0");
        txtmonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtmontoKeyPressed(evt);
            }
        });

        lblcantidad.setText("La Cantidad de:");

        txtcantidad.setEnabled(false);

        lblreferencia.setText("Referencia");

        lblbalance.setText("Balance:");

        txtbalance.setText("0");
        txtbalance.setEnabled(false);

        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel8Layout.createSequentialGroup()
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcantidad)
                            .addComponent(lblemision)
                            .addComponent(lblreferencia))
                        .addGap(18, 18, 18)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addComponent(dcemision, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addComponent(lblmonto)
                                .addGap(18, 18, 18)
                                .addComponent(txtmonto, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                            .addComponent(txtcantidad)
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(lblbalance)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtbalance))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel8Layout.createSequentialGroup()
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblnbanco)
                            .addComponent(lblncuenta))
                        .addGap(18, 18, 18)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(lblbanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltransaccion, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblnumero, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbtipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(32, 32, 32))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnaceptar)
                .addGap(26, 26, 26)
                .addComponent(btncancelar)
                .addGap(94, 94, 94))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel8Layout.createSequentialGroup()
                        .addComponent(lbltransaccion)
                        .addGap(7, 7, 7)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblnbanco)
                                    .addComponent(lblbanco, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblncuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(panel8Layout.createSequentialGroup()
                                .addComponent(lblnumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemision)
                            .addComponent(dcemision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblmonto)
                        .addComponent(txtmonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblcantidad)
                    .addComponent(txtcantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblreferencia)
                    .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblbalance)
                        .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        conec.conectar();
        String saldo = (conec.consultac2get("select * from cuentascorr where num_cuentacorr='" + listacuentas.ndes + "' ", "saldo_cuentacorr"));
        int año = dcemision.getCalendar().get(Calendar.YEAR);
        int mes = dcemision.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dcemision.getCalendar().get(Calendar.DAY_OF_MONTH);
        double saldoa = Double.parseDouble(conec.consultac2get("select * from cuentascorr where num_cuentacorr='" + listacuentas.ndes + "' ", "saldo_cuentacorr"));
        
        if (cbtipo.getSelectedIndex() == 0) {
            if (!"".equals(txtreferencia.getText()) && !"0".equals(txtmonto.getText())) {
                conec.consultaset("INSERT INTO `alexanderflower`.`deporeti` (`num_cuentacorr`, `emision`, `tipo_deporeti`, `monto_depo`, `referencia_deporeti`, `estado_deporeti`) VALUES ('" + listacuentas.ndes + "', '" + año + "-" + mes + "-" + dia + "', '" + cbtipo.getSelectedItem().toString() + "', '" + txtbalance.getText() + "', '" + txtreferencia.getText() + "', '1');");
                saldoa = saldoa + Double.parseDouble(txtmonto.getText());
                conec.consultaset("UPDATE `alexanderflower`.`cuentascorr` SET `saldo_cuentacorr`=" + saldoa + " WHERE `num_cuentacorr`='" + listacuentas.ndes + "';");
                JOptionPane.showMessageDialog(this, "Guardado  con exito");
                this.setVisible(false);
            }
        } else if (cbtipo.getSelectedIndex() == 1) {
            if (Double.parseDouble(txtmonto.getText()) < Double.parseDouble(saldo)) {
                
                if (!"".equals(txtreferencia.getText()) && !"0".equals(txtmonto.getText())) {
                    conec.consultaset("INSERT INTO `alexanderflower`.`deporeti` (`num_cuentacorr`, `emision`, `tipo_deporeti`, `monto_depo`, `referencia_deporeti`, `estado_deporeti`) VALUES ('" + listacuentas.ndes + "', '" + año + "-" + mes + "-" + dia + "', '" + cbtipo.getSelectedItem().toString() + "', '" + txtbalance.getText() + "', '" + txtreferencia.getText() + "', '1');");
                    saldoa = saldoa - Double.parseDouble(txtmonto.getText());
                    conec.consultaset("UPDATE `alexanderflower`.`cuentascorr` SET `saldo_cuentacorr`=" + saldoa + " WHERE `num_cuentacorr`='" + listacuentas.ndes + "';");
                     JOptionPane.showMessageDialog(this, "Guardado  con exito");
                this.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Saldo Insuficiente");
            }
        }
        conec.desconectar();
        

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void txtmontoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmontoKeyPressed
        letrasn conver = new letrasn();
        txtcantidad.setText(conver.Convertir(txtmonto.getText(), true));
        
        txtbalance.setText(txtmonto.getText());
    }//GEN-LAST:event_txtmontoKeyPressed
    private conexion conec = new conexion();

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
            java.util.logging.Logger.getLogger(deporeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(deporeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(deporeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(deporeti.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deporeti().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JComboBox cbtipo;
    private com.toedter.calendar.JDateChooser dcemision;
    private javax.swing.JLabel lblbalance;
    private javax.swing.JLabel lblbanco;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lblcuenta;
    private javax.swing.JLabel lblemision;
    private javax.swing.JLabel lblmonto;
    private javax.swing.JLabel lblnbanco;
    private javax.swing.JLabel lblncuenta;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblreferencia;
    private javax.swing.JLabel lbltransaccion;
    private org.edisoncor.gui.panel.Panel panel8;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtmonto;
    private javax.swing.JTextField txtreferencia;
    // End of variables declaration//GEN-END:variables
}
