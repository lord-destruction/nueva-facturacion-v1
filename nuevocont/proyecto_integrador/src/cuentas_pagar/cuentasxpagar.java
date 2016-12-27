/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas_pagar;

import clases.controlformularios;
import clientes.buscarp;
import clientes.clientesprov;
import clientes.nuevop;
import cuentas_cobrar.pagosxcobrar;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.panel;

/**
 *
 * @author WINDOWS
 */
public class cuentasxpagar extends javax.swing.JFrame {

    private int index;
    private conexion conec = new conexion();
    public static String codigo = "", nombre = "", ruc = "", empresa = "", nombres = "", apellidos = "", telefono = "", direccion = "", ciudad = "", email = "", codigoms = "", fechacf = "", autorizacion = "", inicio = "", finalizar = "";
    controlformularios cen = new controlformularios();

    /**
     * Creates new form cuentasxpagar
     */
    public cuentasxpagar() {
        initComponents();
        cargar();
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

        btradios = new javax.swing.ButtonGroup();
        tablaopciones = new javax.swing.JTabbedPane();
        panel3 = new org.edisoncor.gui.panel.Panel();
        dchasta = new com.toedter.calendar.JDateChooser();
        txtproveedore = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaestado = new javax.swing.JTable();
        lblestado = new javax.swing.JLabel();
        lblproveedore = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblproveedor = new javax.swing.JLabel();
        txtproveedor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnestadoc = new javax.swing.JButton();
        lblhasta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        dcinicio = new com.toedter.calendar.JDateChooser();
        lbldesde = new javax.swing.JLabel();
        btnmostrar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        dchasta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dchastaFocusGained(evt);
            }
        });
        dchasta.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dchastaAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        txtproveedore.setToolTipText("Ingrese la información requerida ");
        txtproveedore.setEnabled(false);

        tablaestado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaestado);

        lblestado.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        lblestado.setText("Estado de cuenta");

        lblproveedore.setText("Proveedor");

        jLabel1.setText("Nombre Proveedor");

        lblproveedor.setText("Codigo Proveedor");

        txtproveedor.setToolTipText("Ingrese la información requerida ");
        txtproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproveedorActionPerformed(evt);
            }
        });
        txtproveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtproveedorKeyPressed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnestadoc.setText("Mostar Estado de Cuenta");
        btnestadoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnestadocActionPerformed(evt);
            }
        });

        lblhasta.setText("Hasta");

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

        dcinicio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dcinicioFocusGained(evt);
            }
        });
        dcinicio.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                dcinicioAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        lbldesde.setText("Filtro Desde");

        btnmostrar.setText("Buscar");
        btnmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmostrarActionPerformed(evt);
            }
        });

        txtnombre.setToolTipText("Ingrese la información requerida ");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblproveedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtproveedor))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lbldesde)
                                .addGap(42, 42, 42)
                                .addComponent(dcinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblhasta)
                                .addGap(33, 33, 33)
                                .addComponent(dchasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnmostrar)
                        .addGap(34, 34, 34)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lblproveedore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblestado)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(txtproveedore, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnestadoc, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmostrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbldesde)
                                .addComponent(lblhasta))
                            .addComponent(dcinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dchasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblestado)
                                .addGap(11, 11, 11)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblproveedore)
                                    .addComponent(txtproveedore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnestadoc)))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tablaopciones.addTab("BALANCE DE PROVEEDORES", panel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaopciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaopciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void arranque() {
        int año = dcinicio.getCalendar().get(Calendar.YEAR);
        int mes = dcinicio.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dcinicio.getCalendar().get(Calendar.DAY_OF_MONTH);
        int año1 = dchasta.getCalendar().get(Calendar.YEAR);
        int mes1 = dchasta.getCalendar().get(Calendar.MONTH) + 1;
        int dia1 = dchasta.getCalendar().get(Calendar.DAY_OF_MONTH);
        if (txtproveedor.getText().length() == 13) {
            conec.conectar();
            final String[] columnas = {"Codigo", "Ruc", "Proveedor", "Ult. Mov", "Ult. Monto", "Balance Total"};
            String consulta = "select f.codigo_fact,f.ruc_proveedor,nombre_eproveedor,f.fecha_emision,f.total_facturaco, f.total_facturaco  from proveedores c,facturasco f where c.ruc_proveedor=f.ruc_proveedor  and f.ruc_proveedor='" + txtproveedor.getText() + "' and f.termino_pago!=1 and(f.fecha_emision>'" + año + "-" + mes + "-" + dia + "' and f.fecha_emision<'" + año1 + "-" + mes1 + "-" + dia1 + "') order by f.fecha_emision desc,f.total_facturaco desc";
            tabladatos.setModel(conec.consultaget(consulta, columnas));
            conec.desconectar();
        }

    }
    Date fecha = new Date();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    private void cargar() {
        fecha = cen.fechasmas(fecha, -30);
        dcinicio.setDate(fecha);
        fecha = cen.fechasmas(fecha, 60);
        dchasta.setDate(fecha);
    }
    private void btnmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmostrarActionPerformed
        clientesprov.verme = 100;
        buscarp nu = new buscarp();
        dialogo jd = new dialogo(nu, true);
        jd.setContentPane(nu.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        txtproveedor.setText(buscarp.ruc);
        txtnombre.setText(buscarp.empresa);
        arranque();
    }//GEN-LAST:event_btnmostrarActionPerformed

    private void dcinicioAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dcinicioAncestorAdded

    }//GEN-LAST:event_dcinicioAncestorAdded

    private void dcinicioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dcinicioFocusGained

    }//GEN-LAST:event_dcinicioFocusGained

    private void tabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladatosMouseClicked
        int index = tabladatos.getSelectedRow();
        codigo = tabladatos.getValueAt(index, 0).toString();
        nombre = tabladatos.getValueAt(index, 1).toString();
        txtproveedore.setText(tabladatos.getValueAt(index, 1).toString());
        conec.conectar();
        final String[] columnas = {"Fecha", "Nro. cuota", "Nro. Factura", "Monto"};
        String consulta = "select fecha_pagar,numero_cuota,numero_factura,monto_cuota from cuentas_pagar c,facturasco f where f.codigo_fact=c.numero_factura and f.codigo_fact=" + tabladatos.getValueAt(index, 0).toString() + "";
        tablaestado.setModel(conec.consultaget(consulta, columnas));
        conec.desconectar();
    }//GEN-LAST:event_tabladatosMouseClicked

    private void btnestadocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnestadocActionPerformed
        int index = tabladatos.getSelectedRow();
        codigo = tabladatos.getValueAt(index, 0).toString();
        pagosxpagar nu = new pagosxpagar();
        dialogo jd = new dialogo(nu, true);
        jd.setContentPane(nu.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btnestadocActionPerformed

    private void txtproveedorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtproveedorKeyPressed
        arranque();
    }//GEN-LAST:event_txtproveedorKeyPressed

    private void txtproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproveedorActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_txtproveedorActionPerformed

    private void dchastaAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_dchastaAncestorAdded

    }//GEN-LAST:event_dchastaAncestorAdded

    private void dchastaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dchastaFocusGained

    }//GEN-LAST:event_dchastaFocusGained

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
            java.util.logging.Logger.getLogger(cuentasxpagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cuentasxpagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cuentasxpagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cuentasxpagar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cuentasxpagar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnestadoc;
    private javax.swing.JButton btnmostrar;
    private javax.swing.ButtonGroup btradios;
    private com.toedter.calendar.JDateChooser dchasta;
    private com.toedter.calendar.JDateChooser dcinicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbldesde;
    private javax.swing.JLabel lblestado;
    private javax.swing.JLabel lblhasta;
    private javax.swing.JLabel lblproveedor;
    private javax.swing.JLabel lblproveedore;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTable tablaestado;
    private javax.swing.JTabbedPane tablaopciones;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtproveedor;
    private javax.swing.JTextField txtproveedore;
    // End of variables declaration//GEN-END:variables
}
