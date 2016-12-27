/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacion;

import clases.controlformularios;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import productos.nuevopro;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.panel;

/**
 *
 * @author USUARIO
 */
public class productove extends javax.swing.JFrame {

    private int index;
    private final conexion conec = new conexion();
    public static String codigo = "", producto = "", cantidadi, cantidadmi, cantidadma, proveedor, subcategoria, bodega, unidad, cantidaduni, precio;
    DefaultTableModel listado[][] = new DefaultTableModel[5][1];
    DefaultTableModel listado1[][] = new DefaultTableModel[5][1];

    /**
     * Creates new form productove
     */
    public productove() {
        initComponents();
        controlformularios cen = new controlformularios();
        this.setBounds(cen.xget(this.getWidth()), cen.yget(this.getHeight()), this.getWidth(), this.getHeight());
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
        jLabel3 = new javax.swing.JLabel();
        btnseleccionar = new javax.swing.JButton();
        lblingreso = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        rdproducto = new javax.swing.JRadioButton();
        btncancelar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        rdcodigo = new javax.swing.JRadioButton();
        lblbusqueda = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("BUSCAR PRODUCTO");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        btnseleccionar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnseleccionar.setText("Agregar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        lblingreso.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblingreso.setText("BUSCAR POR:");

        tabladatos.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

        rdproducto.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdproducto.setText("producto");
        rdproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdproductoActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btncancelar.setText("Terminar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnnuevo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        rdcodigo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdcodigo.setText("Código");
        rdcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdcodigoActionPerformed(evt);
            }
        });

        lblbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblbusqueda.setText("INGRESELA BUSQUEDA:");

        txtbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtbusqueda.setToolTipText("Ingresa la Informacion Aqui ");
        txtbusqueda.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtbusquedaHierarchyChanged(evt);
            }
        });
        txtbusqueda.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtbusquedaInputMethodTextChanged(evt);
            }
        });
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(17, 94, Short.MAX_VALUE)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnseleccionar)
                                .addGap(69, 69, 69)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblbusqueda)
                                .addGap(8, 8, 8)
                                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblingreso)
                                .addGap(87, 87, 87)
                                .addComponent(rdcodigo)
                                .addGap(36, 36, 36)
                                .addComponent(rdproducto)))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblingreso)
                    .addComponent(rdcodigo)
                    .addComponent(rdproducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbusqueda)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnnuevo)
                    .addComponent(btnseleccionar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void limpieza() {
        DefaultTableModel nuevos = new DefaultTableModel();
        txtbusqueda.setText("");
        txtbusqueda.requestFocus();
        tabladatos.setModel(nuevos);
    }
    private void rdcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdcodigoActionPerformed
        limpieza();
    }//GEN-LAST:event_rdcodigoActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevopro prod = new nuevopro();
        dialogo jd = new dialogo(prod, true);
        jd.setContentPane(prod.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtbusquedaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtbusquedaHierarchyChanged

    }//GEN-LAST:event_txtbusquedaHierarchyChanged

    private void txtbusquedaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtbusquedaInputMethodTextChanged

    }//GEN-LAST:event_txtbusquedaInputMethodTextChanged

    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed
        conec.conectar();
        final String[] columnas = {"Código", "Producto", "Stock Actual", "Precio"};
        String consulta = "";

        if (rdcodigo.isSelected()) {
            consulta = "select cod_producto,nombre_producto,cantidadi_producto,precio_producto from productos where bodega_producto =2 and cod_producto like '%" + txtbusqueda.getText() + "%' and estado_producto=1";
        } else if (rdproducto.isSelected()) {
            consulta = "select cod_producto,nombre_producto,cantidadi_producto,precio_producto from productos where bodega_producto =2 and nombre_producto like '%" + txtbusqueda.getText() + "%' and estado_producto=1";
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una opción");
        }
        tabladatos.setModel(conec.consultaget(consulta, columnas));

        conec.desconectar();
    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void rdproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdproductoActionPerformed
        limpieza();
    }//GEN-LAST:event_rdproductoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        index = tabladatos.getSelectedRow();
        if (facturaventa.carrito1.comprobacion(tabladatos.getValueAt(index, 0).toString()) == true) {
            for (int i = 0; i < 4; i++) {
                if (i == 2) {
                    facturaventa.carrito1.datosset("1", facturaventa.x, i);
                } else {
                    facturaventa.carrito1.datosset(tabladatos.getValueAt(index, i).toString(), facturaventa.x, i);
                }
            }
            facturaventa.x++;
            facturaventa.carrito1.copiado1();
            facturaventa.carrito1.copiado2();
        } else {
            JOptionPane.showMessageDialog(this, "Este Producto ya esta");
        }
    }//GEN-LAST:event_btnseleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(productove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productove().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblbusqueda;
    private javax.swing.JLabel lblingreso;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JRadioButton rdcodigo;
    private javax.swing.JRadioButton rdproducto;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
