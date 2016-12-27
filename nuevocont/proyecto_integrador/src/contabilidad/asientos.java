/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabilidad;

import clases.controlformularios;
import clases.oayuda;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import plandecuentas.plandecuentas;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.panel;

/**
 *
 * @author USUARIO
 */
public class asientos extends javax.swing.JFrame {

    /**
     * Creates new form asientos
     */
    public asientos() {
        initComponents();
        cargar();
        this.setBounds(cen.xget(this.getWidth()), cen.yget(this.getHeight()), this.getWidth(), this.getHeight());

    }
    controlformularios cen = new controlformularios();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdradios = new javax.swing.ButtonGroup();
        panel6 = new org.edisoncor.gui.panel.Panel();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        lblfecha = new javax.swing.JLabel();
        dcfecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        lblbuscar = new javax.swing.JLabel();
        lblcuenta = new javax.swing.JLabel();
        txtcuenta = new javax.swing.JTextField();
        lbldcuenta = new javax.swing.JLabel();
        txthaber = new javax.swing.JTextField();
        txtdescripcionc = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        txtdebe = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblempresa = new org.edisoncor.gui.label.LabelMetric();
        btnnuevo = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnconeciona = new javax.swing.JButton();
        btnlibrom = new javax.swing.JButton();
        btnbalance = new javax.swing.JButton();
        btncieere = new javax.swing.JButton();
        btnayuda = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel6.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel6.setColorSecundario(new java.awt.Color(255, 153, 0));

        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setText("CANCELAR");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        lblfecha.setText("FECHA DEL ASIENTO");

        tabladatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descripción", "Debe", "Haber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabladatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabladatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabladatos);

        lblbuscar.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        lblbuscar.setText("BUSCAR CUENTA ");

        lblcuenta.setText("CODIGO DE CUENTA");

        txtcuenta.setToolTipText("Ingrese la cuenta contable ");
        txtcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcuentaActionPerformed(evt);
            }
        });
        txtcuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcuentaKeyPressed(evt);
            }
        });

        lbldcuenta.setText("DESCRIPCIÓN");

        txthaber.setEditable(false);

        txtdescripcionc.setEditable(false);
        txtdescripcionc.setToolTipText("Detalle la cuenta que utiliza  ");

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        lbltotal.setText("TOTALES");

        txtdebe.setEditable(false);
        txtdebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdebeActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        lblempresa.setForeground(new java.awt.Color(51, 51, 255));
        lblempresa.setText("CREACIÓN DE UN ASIENTO");
        lblempresa.setColorDeSombra(new java.awt.Color(255, 255, 255));
        lblempresa.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        btnnuevo.setText("NUEVA");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btneliminar.setText("ELIMINAR");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnconeciona.setText("CONEXIÓN DE ASIENTOS ");
        btnconeciona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconecionaActionPerformed(evt);
            }
        });

        btnlibrom.setText("LIBRO MAYOR ");
        btnlibrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlibromActionPerformed(evt);
            }
        });

        btnbalance.setText("BALANCE CONTABLE ");
        btnbalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbalanceActionPerformed(evt);
            }
        });

        btncieere.setText("CIERRE DE PERIODOS");
        btncieere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncieereActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panel6Layout.createSequentialGroup()
                                .addComponent(lbldcuenta)
                                .addGap(116, 116, 116)
                                .addComponent(txtdescripcionc))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panel6Layout.createSequentialGroup()
                                .addComponent(lblbuscar)
                                .addGap(29, 29, 29)
                                .addComponent(lblcuenta)
                                .addGap(18, 18, 18)
                                .addComponent(txtcuenta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btneliminar)
                            .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnagregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                        .addComponent(lblfecha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dcfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnconeciona)
                        .addGap(2, 2, 2)
                        .addComponent(btnlibrom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbalance)
                        .addGap(2, 2, 2)
                        .addComponent(btncieere)
                        .addGap(123, 123, 123))))
            .addGroup(panel6Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(lbltotal)
                .addGap(28, 28, 28)
                .addComponent(txtdebe, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addComponent(btnguardar)
                        .addGap(18, 18, 18)
                        .addComponent(btncancelar))
                    .addComponent(txthaber, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblempresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel6Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel2)
                        .addGap(103, 103, 103)
                        .addComponent(btnayuda, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createSequentialGroup()
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(btnayuda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblempresa, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dcfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblfecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnconeciona)
                        .addComponent(btnlibrom)
                        .addComponent(btnbalance)
                        .addComponent(btncieere)))
                .addGap(27, 27, 27)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbuscar)
                    .addComponent(lblcuenta)
                    .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldcuenta)
                    .addComponent(txtdescripcionc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnagregar))
                .addGap(3, 3, 3)
                .addComponent(btneliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbltotal)
                    .addComponent(txtdebe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txthaber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncancelar)
                    .addComponent(btnguardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel6, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private Date fecha = new Date();
    private conexion conec = new conexion();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    private void cargar() {
        dcfecha.setDate(fecha);

    }
    private void txtcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcuentaActionPerformed

    }//GEN-LAST:event_txtcuentaActionPerformed

    private void txtcuentaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcuentaKeyPressed
        conec.conectar();
        int puntos = recursivo(txtcuenta.getText());
        System.out.println("" + puntos);
        if (puntos == 0) {
            txtdescripcionc.setText(conec.consultac2get("select * from cuentas where cod_cuenta='" + txtcuenta.getText() + "'", "nombre_cuenta"));
        } else if (puntos == 1) {
            txtdescripcionc.setText(conec.consultac2get("select * from subcuentas where cod_subcuenta='" + txtcuenta.getText() + "'", "nombre_subcuenta"));

        } else if (puntos == 2) {
            txtdescripcionc.setText(conec.consultac2get("select * from subcuenta1 where cod_subcuenta1='" + txtcuenta.getText() + "'", "nombre_subcuenta1"));

        } else if (puntos == 3) {
            txtdescripcionc.setText(conec.consultac2get("select * from subcuenta2 where cod_subcuenta2='" + txtcuenta.getText() + "'", "nombre_subcuenta2"));

        } else if (puntos == 4) {
            txtdescripcionc.setText(conec.consultac2get("select * from subcuenta3 where cod_subcuenta3='" + txtcuenta.getText() + "'", "nombre_subcuenta3"));

        }
        conec.desconectar();
    }//GEN-LAST:event_txtcuentaKeyPressed
    int i = 0;
    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        int ingreso = 0;
        for (int a = 0; a < tabladatos.getRowCount(); a++) {
            if (txtcuenta.getText().equals(tabladatos.getValueAt(a, 0).toString())) {
                ingreso++;
            }
        }
        if (!"".equals(txtdescripcionc.getText()) && ingreso == 0) {
            DefaultTableModel temp = (DefaultTableModel) tabladatos.getModel();
            Object nuevo[] = {temp.getRowCount() + 1, "", "", "", ""};
            temp.addRow(nuevo);
            tabladatos.setValueAt(txtcuenta.getText(), i, 0);
            tabladatos.setValueAt(txtdescripcionc.getText(), i, 1);
            i++;
        }
    }//GEN-LAST:event_btnagregarActionPerformed

    private void tabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladatosMouseClicked
        if (!"".equals(tabladatos.getValueAt(0, 0).toString())) {
            calcular();
        }
    }//GEN-LAST:event_tabladatosMouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        plandecuentas nu = new plandecuentas();
        dialogo jd = new dialogo(nu, true);
        jd.setContentPane(nu.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed

        if (tabladatos.getRowCount() > 0) {
            int seleccion = JOptionPane.showOptionDialog(this, "¿Confimar el Guardado del asiento", "Guardar Asiento", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Si", "No"}, "Si");
            if (seleccion == 0) {
                conec.conectar();
                String codigoa = conec.consultac2get("select t.transmanu from transacciones t where transmanu is not null order by transmanu desc limit 1", "transmanu");
                if ("".equals(codigoa)) {
                    codigoa = "0";
                }
                int codigom = Integer.parseInt(codigoa);
                codigom++;
                int año = dcfecha.getCalendar().get(Calendar.YEAR);
                int mes = dcfecha.getCalendar().get(Calendar.MONTH) + 1;
                int dia = dcfecha.getCalendar().get(Calendar.DAY_OF_MONTH);
                for (int t = 0; t < tabladatos.getRowCount(); t++) {
                    conec.consultaset("INSERT INTO `alexanderflower`.`transacciones` (`fecha_trans`, `cod_cuenta`, `des_cuenta`, `debe`, `haber`, `transmanu`) VALUES ('" + año + "-" + mes + "-" + dia + "', '" + tabladatos.getValueAt(t, 0).toString() + "', '" + tabladatos.getValueAt(t, 1).toString() + "', '" + tabladatos.getValueAt(t, 2).toString() + "', '" + tabladatos.getValueAt(t, 3).toString() + "', '" + codigom + "');");
                }
                conec.desconectar();
                i = 0;
                asientos nuevo = new asientos();
                nuevo.setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btncancelarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) tabladatos.getModel();
            dtm.removeRow(tabladatos.getSelectedRow());
            i--;
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No existe nada para eliminare");
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnconecionaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconecionaActionPerformed
        configuraciones n = new configuraciones();
        dialogo jd = new dialogo(n, true);
        jd.setContentPane(n.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btnconecionaActionPerformed

    private void btnlibromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlibromActionPerformed
        libromayor b = new libromayor();
        dialogo jd = new dialogo(b, true);
        jd.setContentPane(b.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btnlibromActionPerformed

    private void btnbalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbalanceActionPerformed
        balancec b = new balancec();
        dialogo jd = new dialogo(b, true);
        jd.setContentPane(b.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btnbalanceActionPerformed

    private void txtdebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdebeActionPerformed

// TODO add your handling code here:
    }//GEN-LAST:event_txtdebeActionPerformed

    private void btncieereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncieereActionPerformed
        cierreperiodos b = new cierreperiodos();
        dialogo jd = new dialogo(b, true);
        jd.setContentPane(b.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btncieereActionPerformed

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
    private int recursivo(String cuentai) {
        String codigo = cuentai;
        int puntos = 0;
        for (int i = 0; i < codigo.length(); i++) {
            if (".".equals(codigo.substring(i, i + 1))) {
                puntos++;
            }
        }
        return puntos;
    }

    private void calcular() {
        try {
            double debe = 0, haber = 0;
            for (i = 0; i < tabladatos.getRowCount(); i++) {
                if (!"".equals(tabladatos.getValueAt(i, 2).toString())) {
                    debe = debe + Double.parseDouble(tabladatos.getValueAt(i, 2).toString());
                } else {
                    tabladatos.setValueAt("0", i, 2);
                }
                if (!"".equals(tabladatos.getValueAt(i, 3).toString())) {
                    haber = haber + Double.parseDouble(tabladatos.getValueAt(i, 3).toString());
                } else {
                    tabladatos.setValueAt("0", i, 3);
                }
                txtdebe.setText("" + debe);
                txthaber.setText("" + haber);
            }
        } catch (java.lang.NullPointerException jl) {
        }
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
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(asientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new asientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnayuda;
    private javax.swing.JButton btnbalance;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btncieere;
    private javax.swing.JButton btnconeciona;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlibrom;
    private javax.swing.JButton btnnuevo;
    private com.toedter.calendar.JDateChooser dcfecha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JLabel lblcuenta;
    private javax.swing.JLabel lbldcuenta;
    private org.edisoncor.gui.label.LabelMetric lblempresa;
    private javax.swing.JLabel lblfecha;
    private javax.swing.JLabel lbltotal;
    private org.edisoncor.gui.panel.Panel panel6;
    private javax.swing.ButtonGroup rdradios;
    private javax.swing.JTable tabladatos;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtdebe;
    private javax.swing.JTextField txtdescripcionc;
    private javax.swing.JTextField txthaber;
    // End of variables declaration//GEN-END:variables
}