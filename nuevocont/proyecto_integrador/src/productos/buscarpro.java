/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productos;

import clases.controlformularios;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.imagenes;
import proyecto_integrador.panel;

/**
 *
 * @author usuario
 */
public class buscarpro extends javax.swing.JFrame {

    private int index;
    private final conexion conec = new conexion();
    public static String codigo = "", producto = "", cantidadi, cantidadmi, cantidadma, proveedor, subcategoria, bodega, unidadc, cantidaduni, precio, unidadv;

    /**
     * Creates new form buscarpro
     */
    public buscarpro() {
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

        bgradios = new javax.swing.ButtonGroup();
        panel3 = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        jLabel1 = new javax.swing.JLabel();
        rdbodega = new javax.swing.JRadioButton();
        rdproveedor = new javax.swing.JRadioButton();
        rdcategoria = new javax.swing.JRadioButton();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        txtbusqueda = new javax.swing.JTextField();
        rdcodigo = new javax.swing.JRadioButton();
        lblingreso = new javax.swing.JLabel();
        btnseleccionar = new javax.swing.JButton();
        lblbusqueda = new javax.swing.JLabel();
        rdproducto = new javax.swing.JRadioButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("BUSCAR PRODUCTO");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        bgradios.add(rdbodega);
        rdbodega.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdbodega.setText("BODEGA");

        bgradios.add(rdproveedor);
        rdproveedor.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdproveedor.setText("PROVEEDOR");

        bgradios.add(rdcategoria);
        rdcategoria.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdcategoria.setText("CATEGORIA");

        btnnuevo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        tabladatos.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabladatos);

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

        bgradios.add(rdcodigo);
        rdcodigo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdcodigo.setText("CODIGO ");
        rdcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdcodigoActionPerformed(evt);
            }
        });

        lblingreso.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblingreso.setText("BUSCAR POR:");

        btnseleccionar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        lblbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblbusqueda.setText("INGRESELA BUSQUEDA:");

        bgradios.add(rdproducto);
        rdproducto.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdproducto.setText("PRODUCTO");
        rdproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdproductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnseleccionar)
                        .addGap(65, 65, 65)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblingreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdproducto)
                                    .addComponent(rdcodigo))
                                .addGap(18, 18, 18)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rdcategoria)
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addComponent(rdproveedor)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdbodega))))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblbusqueda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdcodigo)
                    .addComponent(rdcategoria)
                    .addComponent(lblingreso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdproducto)
                    .addComponent(rdproveedor)
                    .addComponent(rdbodega))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblbusqueda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseleccionar)
                    .addComponent(btnnuevo)
                    .addComponent(btncancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        try {
            index = tabladatos.getSelectedRow();
            codigo = tabladatos.getValueAt(index, 0).toString();
            producto = tabladatos.getValueAt(index, 1).toString();
            unidadc = tabladatos.getValueAt(index, 2).toString();
            cantidadi = tabladatos.getValueAt(index, 3).toString();
            cantidadmi = tabladatos.getValueAt(index, 4).toString();
            cantidadma = tabladatos.getValueAt(index, 5).toString();
            proveedor = tabladatos.getValueAt(index, 6).toString();
            subcategoria = tabladatos.getValueAt(index, 7).toString();
            bodega = tabladatos.getValueAt(index, 8).toString();
            conec.conectar();
            unidadv = conec.consultac2get("select nombre_unidad from unidades,productos where unidades.cod_unidad=productos.unidad_productov and productos.cod_producto=" + codigo + "", "nombre_unidad");
            cantidaduni = tabladatos.getValueAt(index, 9).toString();
            precio = tabladatos.getValueAt(index, 10).toString();
            modielipro nuevo = new modielipro();
            dialogo jd = new dialogo(nuevo, true);
            jd.setContentPane(nuevo.getContentPane());
            jd.pack();
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
            this.setVisible(false);
        } catch (java.lang.ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "Eliga un registro");
        }
    }//GEN-LAST:event_btnseleccionarActionPerformed
    private void limpieza() {
        DefaultTableModel nuevos = new DefaultTableModel();
        txtbusqueda.setText("");
        txtbusqueda.requestFocus();
        tabladatos.setModel(nuevos);
    }
    private void rdcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdcodigoActionPerformed
        limpieza();
    }//GEN-LAST:event_rdcodigoActionPerformed

    private void rdproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdproductoActionPerformed
        limpieza();
    }//GEN-LAST:event_rdproductoActionPerformed

    private void txtbusquedaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtbusquedaHierarchyChanged

    }//GEN-LAST:event_txtbusquedaHierarchyChanged

    private void txtbusquedaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtbusquedaInputMethodTextChanged

    }//GEN-LAST:event_txtbusquedaInputMethodTextChanged

    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed
        conec.conectar();
        final String[] columnas = {"Código", "Producto", "Unidad C", "Cant Inicial", "Cant Minima", "Cant Maxima", "Proveedor", "Categoria", "Bodega", "Cant Contenida", "Precio"};
        String consulta = "";
        if (rdcodigo.isSelected()) {
            consulta = "select cod_producto,nombre_producto,nombre_unidad,cantidadi_producto,cantidadmi_producto,cantidadma_producto,nombre_eproveedor,nombre_subcategoria,nombre_bodega,cantidadauni_producto,precio_producto from productos,proveedores,subcategoria,bodega,unidades where productos.proveedor_producto=proveedores.ruc_proveedor and productos.subcategoria_producto=subcategoria.cod_subcategoria and productos.bodega_producto=bodega.cod_bodega and productos.unidad_productoc=unidades.cod_unidad and cod_producto like '%" + txtbusqueda.getText() + "%' and estado_producto=1";
        } else if (rdproducto.isSelected()) {
            consulta = "select cod_producto,nombre_producto,nombre_unidad,cantidadi_producto,cantidadmi_producto,cantidadma_producto,nombre_eproveedor,nombre_subcategoria,nombre_bodega,cantidadauni_producto,precio_producto from productos,proveedores,subcategoria,bodega,unidades where productos.proveedor_producto=proveedores.ruc_proveedor and productos.subcategoria_producto=subcategoria.cod_subcategoria and productos.bodega_producto=bodega.cod_bodega and productos.unidad_productoc=unidades.cod_unidad and nombre_producto like '%" + txtbusqueda.getText() + "%' and estado_producto=1";
        } else if (rdproveedor.isSelected()) {
            int cod = conec.consultac1get("select * from proveedores where nombre_eproveedor='" + txtbusqueda.getText() + "'", "ruc_proveedor");
            consulta = "select cod_producto,nombre_producto,nombre_unidad,cantidadi_producto,cantidadmi_producto,cantidadma_producto,nombre_eproveedor,nombre_subcategoria,nombre_bodega,cantidadauni_producto,precio_producto from productos,proveedores,subcategoria,bodega,unidades where productos.proveedor_producto=proveedores.ruc_proveedor and productos.subcategoria_producto=subcategoria.cod_subcategoria and productos.bodega_producto=bodega.cod_bodega and productos.unidad_productoc=unidades.cod_unidad and proveedor_producto like '%" + cod + "%' and estado_producto=1";
        } else if (rdcategoria.isSelected()) {
            int cod = conec.consultac1get("select * from subcategoria where nombre_subcategoria='" + txtbusqueda.getText() + "'", "cod_subcategoria");
            consulta = "select cod_producto,nombre_producto,nombre_unidad,cantidadi_producto,cantidadmi_producto,cantidadma_producto,nombre_eproveedor,nombre_subcategoria,nombre_bodega,cantidadauni_producto,precio_producto from productos,proveedores,subcategoria,bodega,unidades where productos.proveedor_producto=proveedores.ruc_proveedor and productos.subcategoria_producto=subcategoria.cod_subcategoria and productos.bodega_producto=bodega.cod_bodega and productos.unidad_productoc=unidades.cod_unidad and subcategoria_producto like '%" + cod + "%' and estado_producto=1";
        } else if (rdbodega.isSelected()) {
            int cod = conec.consultac1get("select * from bodega where nombre_bodega='" + txtbusqueda.getText() + "'", "cod_bodega");
            consulta = "select cod_producto,nombre_producto,nombre_unidad,cantidadi_producto,cantidadmi_producto,cantidadma_producto,nombre_eproveedor,nombre_subcategoria,nombre_bodega,cantidadauni_producto,precio_producto from productos,proveedores,subcategoria,bodega,unidades where productos.proveedor_producto=proveedores.ruc_proveedor and productos.subcategoria_producto=subcategoria.cod_subcategoria and productos.bodega_producto=bodega.cod_bodega and productos.unidad_productoc=unidades.cod_unidad and bodega_producto like '%" + cod + "%' and estado_producto=1";
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una opción");
        }
        tabladatos.setModel(conec.consultaget(consulta, columnas));
        conec.desconectar();
    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevopro prod = new nuevopro();
        dialogo jd = new dialogo(prod, true);
        jd.setContentPane(prod.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargar();
    }//GEN-LAST:event_formWindowOpened
    private void cargar() {
        imagenes p = new imagenes("/proyecto_integrador/imagenes/fondo_gris.jpg");
        this.add(p);
        this.repaint();
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
            java.util.logging.Logger.getLogger(buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarpro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarpro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgradios;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblbusqueda;
    private javax.swing.JLabel lblingreso;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JRadioButton rdbodega;
    private javax.swing.JRadioButton rdcategoria;
    private javax.swing.JRadioButton rdcodigo;
    private javax.swing.JRadioButton rdproducto;
    private javax.swing.JRadioButton rdproveedor;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}