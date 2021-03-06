/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plandecuentas;

import javax.swing.table.DefaultTableModel;
import proyecto_integrador.conexion;

/**
 *
 * @author USUARIO
 */
public class cuentas extends javax.swing.JFrame {

    private conexion conec = new conexion();
    private DefaultTableModel modelo = new DefaultTableModel();
    private int index = 0;
    public static String codigo, cuenta;

    /**
     * Creates new form cuentas
     */
    public cuentas() {
        initComponents();
    }

    private void limpieza() {
        txtcuenta.setText("");
        txtcuenta1.setText("");
        txtcuenta2.setText("");
        tabladatos.setModel(modelo);
        txtbusqueda.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel3 = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        lblbusqueda = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btnseleccionar = new javax.swing.JButton();
        tablaopciones = new javax.swing.JTabbedPane();
        panel1 = new javax.swing.JPanel();
        lblcuenta = new javax.swing.JLabel();
        txtcuenta = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        panel2 = new javax.swing.JPanel();
        lblcuenta1 = new javax.swing.JLabel();
        txtcuenta1 = new javax.swing.JTextField();
        btnaceptar1 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        lblcuenta2 = new javax.swing.JLabel();
        txtcuenta2 = new javax.swing.JTextField();
        btnaceptar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("CUENTAS");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        tabladatos.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabladatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladatos);

        lblbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblbusqueda.setText("Buscar por Nombre");

        txtbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });

        btnseleccionar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        tablaopciones.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tablaopciones.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tablaopciones.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tablaopcionesStateChanged(evt);
            }
        });

        panel1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

        lblcuenta.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblcuenta.setText("Nombre Cuenta");

        txtcuenta.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

        btnaceptar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaceptar))
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblcuenta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcuenta)
                    .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaopciones.addTab("Nuevo", panel1);

        lblcuenta1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblcuenta1.setText("Nombre Cargo");

        txtcuenta1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

        btnaceptar1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnaceptar1.setText("Aceptar");
        btnaceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaceptar1))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblcuenta1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcuenta1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcuenta1)
                    .addComponent(txtcuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaopciones.addTab("Modificar", panel2);

        lblcuenta2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblcuenta2.setText("Nombre Cargo");

        txtcuenta2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

        btnaceptar2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnaceptar2.setText("Aceptar");
        btnaceptar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel4Layout = new javax.swing.GroupLayout(panel4);
        panel4.setLayout(panel4Layout);
        panel4Layout.setHorizontalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel4Layout.createSequentialGroup()
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnaceptar2))
                    .addGroup(panel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblcuenta2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcuenta2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblcuenta2)
                    .addComponent(txtcuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaopciones.addTab("Eliminar", panel4);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tablaopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblbusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnseleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtbusqueda))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(lblbusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnseleccionar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tablaopciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladatosMouseClicked
        index = tabladatos.getSelectedRow();
        codigo = tabladatos.getValueAt(index, 0).toString();
        cuenta = tabladatos.getValueAt(index, 1).toString();
        if (tablaopciones.getSelectedIndex() == 1) {
            if (cuenta != null) {
                txtcuenta1.setText(cuenta);
                txtcuenta1.requestFocus();
            }
        }
        if (tablaopciones.getSelectedIndex() == 2) {
            if (cuenta != null) {
                txtcuenta2.setText(cuenta);
                txtcuenta2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tabladatosMouseClicked

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        conec.conectar();
        final String columnas[] = {"Codigo", "Cuentas"};
        tabladatos.setModel(conec.consultaget("select cod_cuenta,nombre_cuenta from cuentas where estado_cuenta=1 and nombre_cuenta like '" + txtbusqueda.getText() + "%'", columnas));
        conec.desconectar();
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        if (txtcuenta.getText().length() > 0) {
            conec.conectar();
            conec.consultaset("INSERT INTO `alexanderflower`.`cuentas` (`nombre_cuenta`, `estado_cuenta`) VALUES ('" + txtcuenta.getText() + "', '1');");
            conec.desconectar();
            limpieza();
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnaceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptar1ActionPerformed
        conec.conectar();
        conec.consultaset("UPDATE `alexanderflower`.`cuentas` SET `nombre_cuenta`='" + txtcuenta1.getText() + "' WHERE `cod_cuenta`='" + codigo + "';");
        conec.desconectar();
        limpieza();
        txtbusqueda.requestFocus();
    }//GEN-LAST:event_btnaceptar1ActionPerformed

    private void btnaceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptar2ActionPerformed
        conec.conectar();
        conec.consultaset("UPDATE `alexanderflower`.`cuentas` SET `estado_cuenta`='0' WHERE `cod_cuenta`='" + codigo + "';");
        conec.desconectar();
        limpieza();
        txtbusqueda.requestFocus();
    }//GEN-LAST:event_btnaceptar2ActionPerformed

    private void tablaopcionesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tablaopcionesStateChanged
        limpieza();
    }//GEN-LAST:event_tablaopcionesStateChanged

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
            java.util.logging.Logger.getLogger(cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuentas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnaceptar1;
    private javax.swing.JButton btnaceptar2;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblbusqueda;
    private javax.swing.JLabel lblcuenta;
    private javax.swing.JLabel lblcuenta1;
    private javax.swing.JLabel lblcuenta2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTabbedPane tablaopciones;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtcuenta1;
    private javax.swing.JTextField txtcuenta2;
    // End of variables declaration//GEN-END:variables
}
