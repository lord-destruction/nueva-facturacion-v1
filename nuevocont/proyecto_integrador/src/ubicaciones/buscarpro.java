/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicaciones;

import clases.controlformularios;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import parametros.panelparametros;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.imagenes;
import static ubicaciones.buscarciud.ciudad;

/**
 *
 * @author usuario
 */
public class buscarpro extends javax.swing.JFrame {

    private int index;
    private conexion conec = new conexion();
    public static String codigo = "", pais = "", provincia = "";

    /**
     * Creates new form buscarpro
     */
    public buscarpro() {
        initComponents();
        cargar();
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
        lblingreso = new javax.swing.JLabel();
        rdcodigo = new javax.swing.JRadioButton();
        rdprovincia = new javax.swing.JRadioButton();
        rdpais = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        lblbusqueda = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btnseleccionar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowIconified(java.awt.event.WindowEvent evt) {
                formWindowIconified(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("BUSCAR PROVINCIA");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        lblingreso.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblingreso.setText("BUSCAR POR:");

        bgradios.add(rdcodigo);
        rdcodigo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdcodigo.setText("Código");
        rdcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdcodigoActionPerformed(evt);
            }
        });

        bgradios.add(rdprovincia);
        rdprovincia.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdprovincia.setText("Provincia");
        rdprovincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdprovinciaActionPerformed(evt);
            }
        });

        bgradios.add(rdpais);
        rdpais.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        rdpais.setText("Pais");
        rdpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdpaisActionPerformed(evt);
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

        lblbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblbusqueda.setText("INGRESELA BUSQUEDA:");

        txtbusqueda.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
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

        btnseleccionar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(22, 22, 22))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(btnseleccionar)
                        .addGap(37, 37, 37)
                        .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btncancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblingreso)
                    .addComponent(labelMetric7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(lblbusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(rdcodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(rdprovincia)
                                .addGap(45, 45, 45)
                                .addComponent(rdpais))
                            .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblingreso)
                    .addComponent(rdcodigo)
                    .addComponent(rdprovincia)
                    .addComponent(rdpais))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbusqueda)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseleccionar)
                    .addComponent(btnnuevo)
                    .addComponent(btncancelar))
                .addContainerGap(23, Short.MAX_VALUE))
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
private void limpieza() {
        DefaultTableModel nuevos = new DefaultTableModel();
        txtbusqueda.setText("");
        txtbusqueda.requestFocus();
        tabladatos.setModel(nuevos);
    }
    private void rdcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdcodigoActionPerformed
        limpieza();
    }//GEN-LAST:event_rdcodigoActionPerformed

    private void rdprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdprovinciaActionPerformed
        limpieza();
    }//GEN-LAST:event_rdprovinciaActionPerformed

    private void txtbusquedaHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtbusquedaHierarchyChanged

    }//GEN-LAST:event_txtbusquedaHierarchyChanged

    private void txtbusquedaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtbusquedaInputMethodTextChanged

    }//GEN-LAST:event_txtbusquedaInputMethodTextChanged

    private void txtbusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyPressed
        conec.conectar();
        final String[] columnas = {"Código", "Provincia", "País"};
        String consulta = "";
        if (rdcodigo.isSelected()) {
            consulta = "select cod_provincia,nombre_provincia,nombre_pais from paises,provincias where provincias.cod_pais=paises.cod_pais and provincias.cod_provincia like '%" + txtbusqueda.getText() + "%' and estado_provincia=1 and paises.estado_pais=1;";
        } else if (rdprovincia.isSelected()) {
            consulta = "select cod_provincia,nombre_provincia,nombre_pais from paises,provincias where provincias.cod_pais=paises.cod_pais and provincias.nombre_provincia like '%" + txtbusqueda.getText() + "%' and estado_provincia=1 and paises.estado_pais=1;";
        } else if (rdpais.isSelected()) {
            consulta = "select * from paises where paises.nombre_pais='" + txtbusqueda.getText() + "'";
            int indice = conec.consultac1get(consulta, "cod_pais");
            consulta = "select cod_provincia,nombre_provincia,nombre_pais from paises,provincias where provincias.cod_pais=paises.cod_pais and provincias.cod_pais like '%" + indice + "%' and estado_provincia=1 and paises.estado_pais=1;";
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione una opción");
        }
        tabladatos.setModel(conec.consultaget(consulta, columnas));
        conec.desconectar();
    }//GEN-LAST:event_txtbusquedaKeyPressed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        try {
            index = tabladatos.getSelectedRow();
            codigo = tabladatos.getValueAt(index, 0).toString();
            provincia = tabladatos.getValueAt(index, 1).toString();
            pais = tabladatos.getValueAt(index, 2).toString();
            if (buscarciu.estadob == 1) {
                buscarciu.cbprovincia.removeAllItems();
                buscarciu.cbprovincia.addItem(provincia);
                buscarciu.estadob = 0;
            }
            if (nuevaciu.estadob == 1) {
                nuevaciu.cbprovincia.removeAllItems();
                nuevaciu.cbprovincia.addItem(provincia);
                nuevaciu.estadob = 0;
            }
            if (modieliciu.estadob == 1) {
                modieliciu.cbprovincia.removeAllItems();
                modieliciu.cbprovincia.addItem(provincia);
                modieliciu.estadob = 0;
            }
            if (panelparametros.estadobu == 3 || panelparametros.estadobu == 2) {
                modielipro prov1 = new modielipro();
                dialogo jd = new dialogo(prov1, true);
                jd.setContentPane(prov1.getContentPane());
                jd.pack();
                jd.setLocationRelativeTo(null);
                jd.setVisible(true);
            }
            this.setVisible(false);
        } catch (java.lang.ArrayIndexOutOfBoundsException a) {
            JOptionPane.showMessageDialog(this, "Eliga un registro");
        }
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void rdpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdpaisActionPerformed
        limpieza();
    }//GEN-LAST:event_rdpaisActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        nuevapro provin = new nuevapro();
        dialogo jd = new dialogo(provin, true);
        jd.setContentPane(provin.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened
    private void cargar() {
        imagenes p = new imagenes("/proyecto_integrador/imagenes/fondo_gris.jpg");
        this.add(p);
        this.repaint();// TODO add your handling code here:
    }
    private void formWindowIconified(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowIconified
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowIconified

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
    private javax.swing.JRadioButton rdcodigo;
    private javax.swing.JRadioButton rdpais;
    private javax.swing.JRadioButton rdprovincia;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables
}
