/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas_cobrar;

import clases.controlformularios;
import clientes.buscarc;
import cuentascorrientes.elegircuenta;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.imagenes;
import proyecto_integrador.panel;

/**
 *
 * @author USUARIO
 */
public class reciboxcobrar extends javax.swing.JFrame {

    private conexion conec = new conexion();
    private DecimalFormat dec = new DecimalFormat("0.00");
    /**
     * Creates new form reciboxcobrar
     */
    private Date fecha = new Date();

    public reciboxcobrar() {
        initComponents();
        cargar();
        controlformularios cen = new controlformularios();
        this.setBounds(cen.xget(this.getWidth()), cen.yget(this.getHeight()), this.getWidth(), this.getHeight());
        conec.conectar();
        int estado = conec.consultac1get("select count(*) from recibos where estado_recibo=1", "count(*)");
        if (estado == 0) {
            lblnumeror.setText(lblnumeror.getText().substring(0, 9) + "1");
        } else {
            lblnumeror.setText(lblnumeror.getText().substring(0, 9) + "" + estado++);
        }
        conec.desconectar();
        dcemitido.setDate(fecha);
        txtinteres.setText(pagosxcobrar.interes);
        txttotal.setText(pagosxcobrar.balance);
        Double suma = Double.parseDouble(txtinteres.getText()) + Double.parseDouble(txttotal.getText());
        txtbalance.setText("" + conec.redondear(suma));
        tablarecibo.setValueAt("Cuentas por cobrar", 0, 0);
        tablarecibo.setValueAt("" + conec.redondear(suma), 0, 1);
        lbldocumento.setText(lbldocumento.getText() + "  " + cuentasxcobrar.codigo);
        lblcliente.setText(lblcliente.getText() + "  " + buscarc.nombres);
        lbldireccion.setText(lbldireccion.getText() + "  " + buscarc.direccion);
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
        lblcliente = new javax.swing.JLabel();
        lblinteres = new javax.swing.JLabel();
        txtinteres = new javax.swing.JTextField();
        lbldocumento = new javax.swing.JLabel();
        lblbalance = new javax.swing.JLabel();
        txtbalance = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblingreso = new javax.swing.JLabel();
        lblemitido = new javax.swing.JLabel();
        dcemitido = new com.toedter.calendar.JDateChooser();
        lblnumero = new javax.swing.JLabel();
        lblnumeror = new javax.swing.JLabel();
        lblfact = new javax.swing.JLabel();
        txtfact = new javax.swing.JTextField();
        lblobservaciones = new javax.swing.JLabel();
        txtobservaciones = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablarecibo = new javax.swing.JTable();
        lblpago = new javax.swing.JLabel();
        txtpago = new javax.swing.JComboBox();
        lblcheque = new javax.swing.JLabel();
        txtcheque = new javax.swing.JTextField();
        lblreferencia = new javax.swing.JLabel();
        txtreferencia = new javax.swing.JTextField();
        btnayudas1 = new javax.swing.JButton();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("ALEXANDERFLOWER S.A");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clientes/portada.jpg"))); // NOI18N

        lblcliente.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblcliente.setText("Cliente del Credito");

        lblinteres.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblinteres.setText("Interes");

        txtinteres.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtinteres.setToolTipText("Ingrese un interés %");

        lbldocumento.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lbldocumento.setText("Número de documento: ");

        lblbalance.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblbalance.setText("Balance");

        txtbalance.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

        btnaceptar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnaceptar.setText("Aceptar");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        lbltotal.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lbltotal.setText("Total");

        txttotal.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txttotal.setToolTipText("Ingrese la cantidad");

        lbldireccion.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lbldireccion.setText("Dirección del proveedor");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        lblingreso.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblingreso.setText("RECIBO DE INGRESO");

        lblemitido.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblemitido.setText("Emitido");

        lblnumero.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        lblnumero.setText("Nro");

        lblnumeror.setFont(new java.awt.Font("Perpetua Titling MT", 0, 14)); // NOI18N
        lblnumeror.setForeground(new java.awt.Color(255, 0, 51));
        lblnumeror.setText("0000000000");

        lblfact.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblfact.setText("Doc Cliente");

        txtfact.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N

        lblobservaciones.setText("Observaciones:");

        txtobservaciones.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtobservaciones.setText("Ninguna");

        tablarecibo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tablarecibo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "DESCRIPCIÓN", "MONTO $"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablarecibo);

        lblpago.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblpago.setText("Pago es con");

        txtpago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Efectivo", "Cheque" }));
        txtpago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagoActionPerformed(evt);
            }
        });

        lblcheque.setText("Nro Cheque");

        txtcheque.setText("000");

        lblreferencia.setText("Referencia");

        txtreferencia.setToolTipText("Detalle el pago");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(275, 275, 275)
                .addComponent(lblingreso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemitido)
                            .addComponent(lblfact))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcemitido, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(txtfact))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblnumero)
                                .addGap(27, 27, 27)
                                .addComponent(lblnumeror, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblobservaciones)
                                .addGap(18, 18, 18)
                                .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblpago)
                                .addGap(21, 21, 21)
                                .addComponent(txtpago, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblcheque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblreferencia)
                                .addGap(18, 18, 18)
                                .addComponent(txtreferencia))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dcemitido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblingreso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblemitido)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblnumero)
                                .addComponent(lblnumeror)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfact)
                    .addComponent(txtfact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblobservaciones)
                    .addComponent(txtobservaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpago)
                    .addComponent(txtpago, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(lblcheque)
                    .addComponent(txtcheque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblreferencia)
                    .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        btnayudas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_integrador/imagenes/ayudas.jpg"))); // NOI18N

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblbalance)
                            .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbltotal)
                                .addComponent(lblinteres)))
                        .addGap(27, 27, 27)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtbalance, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtinteres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttotal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbldireccion)
                            .addComponent(lbldocumento)
                            .addComponent(lblcliente)))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(btnaceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnayudas1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(btnayudas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltotal)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblinteres)
                            .addComponent(txtinteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblbalance)
                            .addComponent(txtbalance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addComponent(lbldocumento)
                        .addGap(32, 32, 32)
                        .addComponent(lblcliente)
                        .addGap(28, 28, 28)
                        .addComponent(lbldireccion)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
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
            .addComponent(panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    private void cargar() {
        imagenes p = new imagenes("/proyecto_integrador/imagenes/flor-ornada_4710_1024x768.jpg");
        this.add(p);
        this.repaint();
    }
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown


    }//GEN-LAST:event_formComponentShown
    conexion conec1 = new conexion();
    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed

        if (txtfact.getText().length() > 0) {

            int año = dcemitido.getCalendar().get(Calendar.YEAR);
            int mes = dcemitido.getCalendar().get(Calendar.MONTH) + 1;
            int dia = dcemitido.getCalendar().get(Calendar.DAY_OF_MONTH);
            conec.conectar();
            conec.consultaset("INSERT INTO `alexanderflower`.`recibos` (`cod_recibo`, `fecha_emitido`, `doc_cliente`, `observaciones`, `descripcion`, `monto`, `pagoen`, `estado_recibo`, `tipo_recibo`) VALUES (" + lblnumeror.getText() + ", '" + año + "-" + mes + "-" + dia + "', '" + txtfact.getText() + "', '" + txtobservaciones.getText() + "', '" + tablarecibo.getValueAt(0, 0).toString() + "', '" + tablarecibo.getValueAt(0, 1).toString() + "', '" + txtpago.getSelectedItem().toString() + "', 1, 1)");
            conec.consultaset("UPDATE `alexanderflower`.`cuentas_cobrar` SET `estado_cuota`=0 WHERE `codigo_cobrar`='" + pagosxcobrar.numeroc + "';");
            String codigoa = conec.consultac2get("select t.reciboco from transacciones t where reciboco is not null order by reciboco desc limit 1", "reciboco");
            if ("".equals(codigoa)) {
                codigoa = "0";
            }
            int codigom = Integer.parseInt(codigoa);
            codigom++;
            conec.consultaset("INSERT INTO `alexanderflower`.`transacciones` (`fecha_trans`, `cod_cuenta`, `des_cuenta`, `haber`, `reciboco`) VALUES ('" + año + "-" + mes + "-" + dia + "', '" + conec.consultac2get("select * from subcuenta2 where nombre_subcuenta2='CUENTAS X COBRAR'", "cod_subcuenta2") + "', 'CUENTAS X COBRAR', '" + tablarecibo.getValueAt(0, 1).toString() + "', '" + codigom + "');");
            if ("Efectivo".equals(txtpago.getSelectedItem().toString())) {
                conec.consultaset("INSERT INTO `alexanderflower`.`transacciones` (`fecha_trans`, `cod_cuenta`, `des_cuenta`, `debe`, `reciboco`) VALUES ('" + año + "-" + mes + "-" + dia + "', '" + conec.consultac2get("select * from subcuenta2 where nombre_subcuenta2='CAJA'", "cod_subcuenta2") + "', 'CAJA', " + tablarecibo.getValueAt(0, 1).toString() + ", '" + codigom + "');");

            } else if ("Cheque".equals(txtpago.getSelectedItem().toString())) {
                conec.consultaset("INSERT INTO `alexanderflower`.`transacciones` (`fecha_trans`, `cod_cuenta`, `des_cuenta`, `debe`, `reciboco`) VALUES ('" + año + "-" + mes + "-" + dia + "', '" + conec.consultac2get("select * from subcuenta3 where nombre_subcuenta3='CUENTA CORRIENTE'", "cod_subcuenta3") + "', 'CUENTA CORRIENTE', " + tablarecibo.getValueAt(0, 1).toString() + ", '" + codigom + "');");
                conec.consultaset("INSERT INTO `alexanderflower`.`cheques` (`num_cuenta`, `num_cheque`, `monto_cheque`, `fecha_cheque`, `paguese_cheque`, `tipo_cheque`, `referencia_cheque`, `estado_cheque`) VALUES ('" + elegircuenta.ncuenta + "', '" + txtcheque.getText() + "', '" + tablarecibo.getValueAt(0, 1) + "', '" + año + "-" + mes + "-" + dia + "', '" + buscarc.cedula + "', '1', '" + txtreferencia.getText() + "', '1');");

            } else if (!"efectivo".equals(txtpago.getSelectedItem().toString()) && !"Cheque".equals(txtpago.getSelectedItem().toString())) {
                conec.consultaset("INSERT INTO `alexanderflower`.`transacciones` (`fecha_trans`, `cod_cuenta`, `des_cuenta`, `debe`, `reciboco`) VALUES ('" + año + "-" + mes + "-" + dia + "', '" + conec.consultac2get("select * from subcuenta2 where nombre_subcuenta2='CUENTAS X PAGAR'", "cod_subcuenta2") + "', 'CUENTAS X PAGAR', " + tablarecibo.getValueAt(0, 1).toString() + ", '" + codigom + "');");

            }
            conec.desconectar();
            this.setVisible(false);

        } else {
            JOptionPane.showMessageDialog(this, "Ingrese datos necesarios");
        }

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void txtpagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagoActionPerformed
        if (txtpago.getSelectedIndex() == 0) {
            lblcheque.setVisible(false);
            lblreferencia.setVisible(false);
            txtcheque.setVisible(false);
            txtreferencia.setVisible(false);
        } else if (txtpago.getSelectedIndex() == 1) {
            elegircuenta nu = new elegircuenta();
            dialogo jd = new dialogo(nu, true);
            jd.setContentPane(nu.getContentPane());
            jd.pack();
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
            lblcheque.setVisible(true);
            lblreferencia.setVisible(true);
            txtcheque.setVisible(true);
            txtreferencia.setVisible(true);
        }
    }//GEN-LAST:event_txtpagoActionPerformed

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
            java.util.logging.Logger.getLogger(reciboxcobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reciboxcobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reciboxcobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reciboxcobrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new reciboxcobrar().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaceptar;
    private javax.swing.JButton btnayudas1;
    private javax.swing.JButton btnsalir;
    private com.toedter.calendar.JDateChooser dcemitido;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblbalance;
    private javax.swing.JLabel lblcheque;
    private javax.swing.JLabel lblcliente;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldocumento;
    private javax.swing.JLabel lblemitido;
    private javax.swing.JLabel lblfact;
    private javax.swing.JLabel lblingreso;
    private javax.swing.JLabel lblinteres;
    private javax.swing.JLabel lblnumero;
    private javax.swing.JLabel lblnumeror;
    private javax.swing.JLabel lblobservaciones;
    private javax.swing.JLabel lblpago;
    private javax.swing.JLabel lblreferencia;
    private javax.swing.JLabel lbltotal;
    private org.edisoncor.gui.panel.Panel panel3;
    private javax.swing.JTable tablarecibo;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcheque;
    private javax.swing.JTextField txtfact;
    private javax.swing.JTextField txtinteres;
    private javax.swing.JTextField txtobservaciones;
    private javax.swing.JComboBox txtpago;
    private javax.swing.JTextField txtreferencia;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables
}
