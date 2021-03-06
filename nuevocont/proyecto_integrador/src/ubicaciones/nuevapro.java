/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicaciones;

import clases.controlformularios;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.imagenes;
import proyecto_integrador.validaciones;

/**
 *
 * @author usuario
 */
public class nuevapro extends javax.swing.JFrame {

    private conexion conec = new conexion();
    private validaciones validar = new validaciones();

    /**
     * Creates new form provincia
     */
    public nuevapro() {
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

        panel3 = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        jLabel1 = new javax.swing.JLabel();
        lblpais = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        btnaceptar = new javax.swing.JButton();
        txtprovincia = new javax.swing.JTextField();
        lblprovincia = new javax.swing.JLabel();
        btnbuscarp = new javax.swing.JButton();
        cbpais = new javax.swing.JComboBox();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("Nueva Provincia");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        lblpais.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblpais.setText("Eliga el Pais");

        btncancelar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        btnaceptar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        txtprovincia.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtprovincia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprovinciaKeyTyped(evt);
            }
        });

        lblprovincia.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblprovincia.setText("Nombre Provincia");

        btnbuscarp.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnbuscarp.setText("....");
        btnbuscarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarpActionPerformed(evt);
            }
        });

        cbpais.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel3Layout.createSequentialGroup()
                                    .addComponent(btnaceptar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btncancelar))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel3Layout.createSequentialGroup()
                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblprovincia)
                                        .addComponent(lblpais))
                                    .addGap(18, 18, 18)
                                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(panel3Layout.createSequentialGroup()
                                            .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnbuscarp, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtprovincia))))
                            .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(102, 102, 102))))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarp, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblpais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprovincia)
                    .addComponent(txtprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar)
                    .addComponent(btncancelar))
                .addContainerGap(26, Short.MAX_VALUE))
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
private void cargar() {
        imagenes p = new imagenes("/proyecto_integrador/imagenes/figuras_de_color_rojo_en_3d-1440x900.jpg");
        this.add(p);
        this.repaint();

        conec.conectar();
        String consulta = "select * from paises where estado_pais=1";
        cbpais.setModel(conec.consultacget(consulta, "nombre_pais"));
        conec.desconectar();
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void txtprovinciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprovinciaKeyTyped
        validar.sololetras(evt);
    }//GEN-LAST:event_txtprovinciaKeyTyped

    private void cbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpaisActionPerformed

    }//GEN-LAST:event_cbpaisActionPerformed

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        if (txtprovincia.getText().length() > 0) {
            conec.conectar();
            String consulta = "select * from paises where paises.nombre_pais='" + cbpais.getSelectedItem() + "'";
            int indice = conec.consultac1get(consulta, "cod_pais");
            consulta = "INSERT INTO `alexanderflower`.`provincias` (`nombre_provincia`, `cod_pais`, `estado_provincia`) VALUES ('" + txtprovincia.getText() + "', '" + indice + "','1');";
            conec.consultaset(consulta);
            conec.desconectar();
            txtprovincia.setText("");
            txtprovincia.requestFocus();
        }
    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnbuscarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarpActionPerformed
        buscarpa pais = new buscarpa();
        dialogo jd = new dialogo(pais, true);
        jd.setContentPane(pais.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        estadob = 1;
    }//GEN-LAST:event_btnbuscarpActionPerformed
    public static int estadob = 0;

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
            java.util.logging.Logger.getLogger(nuevapro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(nuevapro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(nuevapro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(nuevapro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new nuevapro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnbuscarp;
    private javax.swing.JButton btncancelar;
    public static javax.swing.JComboBox cbpais;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblpais;
    private javax.swing.JLabel lblprovincia;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JTextField txtprovincia;
    // End of variables declaration//GEN-END:variables
}
