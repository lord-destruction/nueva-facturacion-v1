/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientes;

import clases.oayuda;
import java.awt.event.KeyEvent;
import java.io.IOException;
import javax.swing.table.DefaultTableModel;
import proyecto_integrador.conexion;

/**
 *
 * @author WINDOWS
 */
public class departamentos extends javax.swing.JFrame {

    private conexion conec = new conexion();
    private DefaultTableModel modelo = new DefaultTableModel();

    /**
     * Creates new form departamentos
     */
    public departamentos() {
        initComponents();this.setLocationRelativeTo(null);
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
        lbltitulo1 = new org.edisoncor.gui.label.LabelMetric();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        lblbusqueda = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tablaopciones = new javax.swing.JTabbedPane();
        panel2 = new javax.swing.JPanel();
        lbldepartamento1 = new javax.swing.JLabel();
        txtdepartamento1 = new javax.swing.JTextField();
        btnaceptar1 = new javax.swing.JButton();
        panel4 = new javax.swing.JPanel();
        lbldepartamento2 = new javax.swing.JLabel();
        txtdepartamento2 = new javax.swing.JTextField();
        btnaceptar2 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        lbldepartamento = new javax.swing.JLabel();
        txtdepartamento = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        btnayuda = new javax.swing.JButton();

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        lbltitulo1.setForeground(new java.awt.Color(51, 51, 255));
        lbltitulo1.setText("DEPARTAMENTOS");
        lbltitulo1.setColorDeSombra(new java.awt.Color(255, 255, 255));
        lbltitulo1.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

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
        txtbusqueda.setToolTipText("Ingrese la información requería  ");
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        jButton1.setText("Seleccionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tablaopciones.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tablaopciones.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tablaopciones.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tablaopcionesStateChanged(evt);
            }
        });

        lbldepartamento1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lbldepartamento1.setText("Nombre Departamento");

        txtdepartamento1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtdepartamento1.setToolTipText("Seleccione el departamento al que se asigna ");

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
                        .addComponent(lbldepartamento1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdepartamento1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldepartamento1)
                    .addComponent(txtdepartamento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaopciones.addTab("Modificar", panel2);

        lbldepartamento2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lbldepartamento2.setText("Nombre Departamento");

        txtdepartamento2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

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
                        .addComponent(lbldepartamento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdepartamento2, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        panel4Layout.setVerticalGroup(
            panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldepartamento2)
                    .addComponent(txtdepartamento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaopciones.addTab("Eliminar", panel4);

        lbldepartamento.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lbldepartamento.setText("Nombre Departamento");

        txtdepartamento.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

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
                        .addComponent(lbldepartamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdepartamento, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)))
                .addGap(46, 46, 46))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldepartamento)
                    .addComponent(txtdepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnaceptar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaopciones.addTab("Nuevo", panel1);

        btnayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_integrador/imagenes/ayudas.jpg"))); // NOI18N
        btnayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnayudaMouseClicked(evt);
            }
        });
        btnayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnayudaActionPerformed(evt);
            }
        });
        btnayuda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnayudaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblbusqueda)
                            .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tablaopciones))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(btnayuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(lblbusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(tablaopciones, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        if (txtdepartamento.getText().length() > 0) {
            conec.conectar();
            conec.consultaset("INSERT INTO `alexanderflower`.`departamentos` (`nombre_dep`, `estado_dep`) VALUES ('" + txtdepartamento.getText() + "', '1');");
            conec.desconectar();
            limpieza();
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        conec.conectar();
        final String columnas[] = {"Codigo", "Departamento"};
        tabladatos.setModel(conec.consultaget("select cod_dep,nombre_dep from departamentos where estado_dep=1 and nombre_dep like '" + txtbusqueda.getText() + "%'", columnas));
        conec.desconectar();
    }//GEN-LAST:event_txtbusquedaActionPerformed
    private int index = 0;
    public static String codigo, departamento;
    private void tabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladatosMouseClicked
        index = tabladatos.getSelectedRow();
        codigo = tabladatos.getValueAt(index, 0).toString();
        departamento = tabladatos.getValueAt(index, 1).toString();
        if (tablaopciones.getSelectedIndex() == 1) {
            if (departamento != null) {
                txtdepartamento1.setText(departamento);
                txtdepartamento1.requestFocus();
            }
        }
        if (tablaopciones.getSelectedIndex() == 2) {
            if (departamento != null) {
                txtdepartamento2.setText(departamento);
                txtdepartamento2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_tabladatosMouseClicked

    private void btnaceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptar1ActionPerformed
        conec.conectar();
        conec.consultaset("UPDATE `alexanderflower`.`departamentos` SET `nombre_dep`='" + txtdepartamento1.getText() + "' WHERE `cod_dep`='" + codigo + "';");
        conec.desconectar();
        limpieza();
        txtbusqueda.requestFocus();
    }//GEN-LAST:event_btnaceptar1ActionPerformed

    private void btnaceptar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptar2ActionPerformed
        conec.conectar();
        conec.consultaset("UPDATE `alexanderflower`.`departamentos` SET `estado_dep`='0' WHERE `cod_dep`='" + codigo + "';");
        conec.desconectar();
        limpieza();
        txtbusqueda.requestFocus();
    }//GEN-LAST:event_btnaceptar2ActionPerformed

    private void tablaopcionesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tablaopcionesStateChanged
        limpieza();
    }//GEN-LAST:event_tablaopcionesStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnayudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnayudaMouseClicked
        try {
            oayuda ay = new oayuda();
            ay.opena("Manual.pdf");
        } catch (IOException ex) {
        }
    }//GEN-LAST:event_btnayudaMouseClicked

    private void btnayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnayudaActionPerformed

    }//GEN-LAST:event_btnayudaActionPerformed

    private void btnayudaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnayudaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_F1) {
            try {
                oayuda ay = new oayuda();
                ay.opena("Manual.pdf");
            } catch (IOException ex) {
            }
        }
    }//GEN-LAST:event_btnayudaKeyPressed
    private void limpieza() {
        txtdepartamento.setText("");
        txtdepartamento1.setText("");
        txtdepartamento2.setText("");
        tabladatos.setModel(modelo);
        txtbusqueda.setText("");
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
            java.util.logging.Logger.getLogger(departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(departamentos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departamentos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnaceptar1;
    private javax.swing.JButton btnaceptar2;
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbusqueda;
    private javax.swing.JLabel lbldepartamento;
    private javax.swing.JLabel lbldepartamento1;
    private javax.swing.JLabel lbldepartamento2;
    private org.edisoncor.gui.label.LabelMetric lbltitulo1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JPanel panel4;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTabbedPane tablaopciones;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtdepartamento;
    private javax.swing.JTextField txtdepartamento1;
    private javax.swing.JTextField txtdepartamento2;
    // End of variables declaration//GEN-END:variables
}
