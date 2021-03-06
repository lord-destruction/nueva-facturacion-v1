/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicaciones;

import clases.controlformularios;
import parametros.panelparametros;
import proyecto_integrador.conexion;
import proyecto_integrador.imagenes;
import proyecto_integrador.validaciones;

/**
 *
 * @author usuario
 */
public class modielipa extends javax.swing.JFrame {

    validaciones validar = new validaciones();
    conexion conec = new conexion();

    /**
     * Creates new form modielipa
     */
    public modielipa() {
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
        lbltitulo = new org.edisoncor.gui.label.LabelMetric();
        jLabel1 = new javax.swing.JLabel();
        btneliminar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        btnactualizar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblnombre = new javax.swing.JLabel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        lbltitulo.setForeground(new java.awt.Color(51, 51, 255));
        lbltitulo.setText(".............");
        lbltitulo.setColorDeSombra(new java.awt.Color(255, 255, 255));
        lbltitulo.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        btneliminar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        txtnombre.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        btnactualizar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblnombre.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblnombre.setText("Nombre Pais");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                    .addComponent(lblnombre)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtnombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                    .addGap(0, 279, Short.MAX_VALUE)
                                    .addComponent(btneliminar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnactualizar)
                                    .addGap(18, 18, 18)
                                    .addComponent(btncancelar)
                                    .addGap(10, 10, 10)))
                            .addComponent(jLabel1))))
                .addGap(26, 26, 26))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnombre))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactualizar)
                    .addComponent(btncancelar)
                    .addComponent(btneliminar))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.hide();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        if (txtnombre.getText().length() > 0) {
            conec.conectar();
            String consulta = "UPDATE `alexanderflower`.`paises` SET `nombre_pais`='" + txtnombre.getText() + "' WHERE `cod_pais`='" + codigo + "';";
            conec.consultaset(consulta);
            conec.desconectar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        validar.sololetras(evt);
    }//GEN-LAST:event_txtnombreKeyTyped
    private void cargar() {
        imagenes p = new imagenes("/proyecto_integrador/imagenes/figuras_de_color_rojo_en_3d-1440x900.jpg");
        this.add(p);
        this.repaint();

        if (panelparametros.estadobu == 6) {
            txtnombre.setEnabled(false);
            lbltitulo.setText("Eliminar Información");
            btneliminar.setLocation(btnactualizar.getLocation().x, btnactualizar.getLocation().y);
            btnactualizar.setVisible(false);
        } else if (panelparametros.estadobu == 1) {
            lbltitulo.setText("Actualizar Informacion");
            btneliminar.setVisible(false);
        }
        codigo = buscarpa.codigo;
        txtnombre.setText(buscarpa.nombre);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        if (txtnombre.getText().length() > 0) {
            conec.conectar();
            String consulta = "UPDATE `alexanderflower`.`paises` SET `estado_pais`='0' WHERE `cod_pais`='" + codigo + "';";
            conec.consultaset(consulta);
            conec.desconectar();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btneliminarActionPerformed
    private String codigo;

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
            java.util.logging.Logger.getLogger(modielipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modielipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modielipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modielipa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modielipa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblnombre;
    private org.edisoncor.gui.label.LabelMetric lbltitulo;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
