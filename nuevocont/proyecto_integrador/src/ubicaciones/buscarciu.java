/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubicaciones;

import clases.controlformularios;
import clientes.clientesprov;
import clientes.modielic;
import clientes.modielie;
import clientes.modielip;
import clientes.nuevoc;
import clientes.nuevoe;
import clientes.nuevop;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.imagenes;

/**
 *
 * @author usuario
 */
public class buscarciu extends javax.swing.JFrame {

    private conexion conec = new conexion();
    public static int estadob = 0;
    private static String ciudad;

    /**
     * Creates new form buscarciu
     */
    public buscarciu() {
        initComponents();
        arran();
        controlformularios cen = new controlformularios();
        this.setBounds(cen.xget(this.getWidth()), cen.yget(this.getHeight()), this.getWidth(), this.getHeight());
    }

    public static String ciudadget() {
        return ciudad;
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
        btnseleccionar = new javax.swing.JButton();
        btnciudad = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblpais = new javax.swing.JLabel();
        btnprovincia = new javax.swing.JButton();
        btnpais = new javax.swing.JButton();
        cbciudad = new javax.swing.JComboBox();
        cbpais = new javax.swing.JComboBox();
        cbprovincia = new javax.swing.JComboBox();
        lblprovincia = new javax.swing.JLabel();
        lblciudad = new javax.swing.JLabel();

        setFont(new java.awt.Font("Orator Std", 0, 14)); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("Localizar ubicacion");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        btnseleccionar.setBackground(new java.awt.Color(255, 255, 255));
        btnseleccionar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        btnciudad.setBackground(new java.awt.Color(255, 255, 255));
        btnciudad.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnciudad.setText("...");
        btnciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnciudadActionPerformed(evt);
            }
        });

        btncancelar.setBackground(new java.awt.Color(255, 255, 255));
        btncancelar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblpais.setBackground(new java.awt.Color(255, 255, 255));
        lblpais.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblpais.setText("País");

        btnprovincia.setBackground(new java.awt.Color(255, 255, 255));
        btnprovincia.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnprovincia.setText("...");
        btnprovincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprovinciaActionPerformed(evt);
            }
        });

        btnpais.setBackground(new java.awt.Color(255, 255, 255));
        btnpais.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnpais.setText("...");
        btnpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaisActionPerformed(evt);
            }
        });

        cbciudad.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbciudadActionPerformed(evt);
            }
        });

        cbpais.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbpais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbpaisActionPerformed(evt);
            }
        });

        cbprovincia.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbprovincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbprovinciaActionPerformed(evt);
            }
        });

        lblprovincia.setBackground(new java.awt.Color(255, 255, 255));
        lblprovincia.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblprovincia.setText("Provincia");

        lblciudad.setBackground(new java.awt.Color(255, 255, 255));
        lblciudad.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblciudad.setText("Ciudad");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(btnseleccionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancelar))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpais)
                            .addComponent(lblprovincia)
                            .addComponent(lblciudad))
                        .addGap(23, 23, 23)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbpais, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbprovincia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnpais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(13, 13, 13)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpais)
                    .addComponent(cbpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnpais, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblprovincia)
                    .addComponent(cbprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnprovincia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblciudad)
                    .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnseleccionar)
                    .addComponent(btncancelar))
                .addGap(32, 32, 32))
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

    private void btnciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnciudadActionPerformed
        buscarciud ciudadn = new buscarciud();
        dialogo jd = new dialogo(ciudadn, true);
        jd.setContentPane(ciudadn.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        estadob = 1;
    }//GEN-LAST:event_btnciudadActionPerformed

    private void cbpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbpaisActionPerformed
        conec.conectar();
        String consulta = "select * from paises where paises.nombre_pais='" + cbpais.getSelectedItem() + "'";
        int indice = conec.consultac1get(consulta, "cod_pais");
        consulta = "select * from provincias where provincias.cod_pais=" + indice + " and estado_provincia=1";
        cbprovincia.setModel(conec.consultacget(consulta, "nombre_provincia"));
        conec.desconectar();

    }//GEN-LAST:event_cbpaisActionPerformed

    private void cbprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbprovinciaActionPerformed
        conec.conectar();
        String consulta = "select * from provincias where provincias.nombre_provincia='" + cbprovincia.getSelectedItem() + "'";
        int indice = conec.consultac1get(consulta, "cod_provincia");
        consulta = "select * from ciudades where ciudades.cod_provincia=" + indice + " and estado_ciudad=1";
        cbciudad.setModel(conec.consultacget(consulta, "nombre_ciudad"));
        conec.desconectar();
    }//GEN-LAST:event_cbprovinciaActionPerformed

    private void cbciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbciudadActionPerformed

    }//GEN-LAST:event_cbciudadActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened
    private void arran() {
        imagenes p = new imagenes("/proyecto_integrador/imagenes/fondo_gris.jpg");
        this.add(p);
        this.repaint();

        conec.conectar();
        String consulta = "select * from paises where estado_pais=1";
        cbpais.setModel(conec.consultacget(consulta, "nombre_pais"));
        conec.desconectar();
    }
    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);

    }//GEN-LAST:event_btncancelarActionPerformed

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        ciudad = cbciudad.getSelectedItem().toString();
        if (clientesprov.estadobget() == 0) {
            nuevoc.txtciudad.setText(cbciudad.getSelectedItem().toString());
        } else if (clientesprov.estadobget() == 1) {
            modielic.txtciudad.setText(cbciudad.getSelectedItem().toString());
        } else if (clientesprov.estadobget() == 2) {
            nuevop.txtciudad.setText(cbciudad.getSelectedItem().toString());
        } else if (clientesprov.estadobget() == 3) {
            modielip.txtciudad.setText(cbciudad.getSelectedItem().toString());
        } else if (clientesprov.estadobget() == 4) {
            nuevoe.txtciudad.setText(cbciudad.getSelectedItem().toString());
        } else if (clientesprov.estadobget() == 5) {
            modielie.txtciudad.setText(cbciudad.getSelectedItem().toString());
        }
        this.setVisible(false);


    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void btnpaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaisActionPerformed
        buscarpa pais = new buscarpa();
        dialogo jd = new dialogo(pais, true);
        jd.setContentPane(pais.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        estadob = 1;
    }//GEN-LAST:event_btnpaisActionPerformed

    private void btnprovinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprovinciaActionPerformed
        buscarpro provincia = new buscarpro();
        dialogo jd = new dialogo(provincia, true);
        jd.setContentPane(provincia.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        estadob = 1;
    }//GEN-LAST:event_btnprovinciaActionPerformed
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
            java.util.logging.Logger.getLogger(buscarciu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(buscarciu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(buscarciu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(buscarciu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new buscarciu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnciudad;
    private javax.swing.JButton btnpais;
    private javax.swing.JButton btnprovincia;
    private javax.swing.JButton btnseleccionar;
    public static javax.swing.JComboBox cbciudad;
    public static javax.swing.JComboBox cbpais;
    public static javax.swing.JComboBox cbprovincia;
    private javax.swing.JLabel jLabel1;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblciudad;
    private javax.swing.JLabel lblpais;
    private javax.swing.JLabel lblprovincia;
    private org.edisoncor.gui.panel.Panel panel3;
    // End of variables declaration//GEN-END:variables
}
