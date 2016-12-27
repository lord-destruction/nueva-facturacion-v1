/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roles;

import clases.controlformularios;
import clases.impresiones;
import clientes.buscarc;
import clientes.buscare;
import clientes.clientesprov;
import contabilidad.asientos;
import contabilidad.estado_perd_gan;
import contabilidad.librodiario;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import net.sf.jasperreports.engine.util.JRFontNotFoundException;
import plandecuentas.cuentas;
import plandecuentas.plandecuentas;
import plandecuentas.subcuentas;
import plandecuentas.subcuentas1;
import plandecuentas.subcuentas2;
import plandecuentas.subcuentas3;
import proyecto_integrador.conexion;
import proyecto_integrador.dialogo;
import proyecto_integrador.panel;

/**
 *
 * @author WINDOWS
 */
public class roldepagos extends javax.swing.JFrame {

    conexion db = new conexion();
    private conexion conec = new conexion();

    /**
     * Creates new form roldepagos
     */
    public roldepagos() {
        initComponents();
        cargar();
        this.setBounds(cen.xget(this.getWidth()), cen.yget(this.getHeight()), this.getWidth(), this.getHeight());
        db.conectar();
        cbniv1.setModel(db.consultacget("Select * from cuentas where estado_cuenta=1", "nombre_cuenta"));
        db.desconectar();
        mostrar();
    }

    public void abrir(JTree tree) {
        int row = 0;
        while (row < tree.getRowCount()) {
            tree.expandRow(row);
            row++;
        }
    }

    public void cerrar(JTree tree) {
        int row = tree.getRowCount() - 1;
        while (row >= 0) {
            tree.collapseRow(row);
            row--;
        }
    }

    private void mostrar() {
        db.conectar();
        DefaultMutableTreeNode niv1 = new DefaultMutableTreeNode("Plan de Cuentas");
        DefaultMutableTreeNode niv2;
        DefaultMutableTreeNode niv3;
        DefaultMutableTreeNode niv4;
        DefaultMutableTreeNode niv5;
        DefaultMutableTreeNode niv6;

        Object[][] data_niv1 = db.select("cuentas", " cod_cuenta, nombre_cuenta ", "estado_cuenta=1");
        if (data_niv1.length > 0) {
            for (int i = 0; i < data_niv1.length; i++) {

                niv2 = new DefaultMutableTreeNode(data_niv1[i][1]);
                niv1.add(niv2);

                Object[][] data_niv2 = db.select("subcuentas", "cod_subcuenta,nombre_subcuenta", " cod_cuenta='" + data_niv1[i][0].toString() + "' and estado_subcuenta=1");

                if (data_niv2.length > 0) {
                    for (int j = 0; j < data_niv2.length; j++) {
                        niv3 = new DefaultMutableTreeNode(data_niv2[j][1]);
                        niv2.add(niv3);

                        Object[][] data_niv3 = db.select("subcuenta1", "cod_subcuenta1,nombre_subcuenta1", " cod_subcuenta='" + data_niv2[j][0].toString() + "' and estado_subcuenta1=1");

                        if (data_niv3.length > 0) {
                            for (int k = 0; k < data_niv3.length; k++) {
                                niv4 = new DefaultMutableTreeNode(data_niv3[k][1]);
                                niv3.add(niv4);
                                Object[][] data_niv4 = db.select("subcuenta2", "cod_subcuenta2,nombre_subcuenta2", " cod_subcuenta1='" + data_niv3[k][0].toString() + "' and estado_subcuenta2=1");

                                if (data_niv4.length > 0) {
                                    for (int l = 0; l < data_niv4.length; l++) {
                                        niv5 = new DefaultMutableTreeNode(data_niv4[l][1]);
                                        niv4.add(niv5);
                                        Object[][] data_niv5 = db.select("subcuenta3", "cod_subcuenta3,nombre_subcuenta3", " cod_subcuenta2='" + data_niv4[l][0].toString() + "' and estado_subcuenta3=1");

                                        if (data_niv5.length > 0) {
                                            for (int m = 0; m < data_niv5.length; m++) {
                                                niv6 = new DefaultMutableTreeNode(data_niv5[m][1]);
                                                niv5.add(niv6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        DefaultTreeModel modelo = new DefaultTreeModel(niv1);
        this.arbol.setModel(modelo);
    }
    private impresiones imprimir = new impresiones();

    private void activar() {
        try {
            cbniv1.setEnabled(true);
            cbniv2.setEnabled(true);
            cbniv3.setEnabled(true);
            cbniv4.setEnabled(true);
            cbniv5.setEnabled(true);
            txtcuenta.setEnabled(true);
        } catch (java.lang.NullPointerException ex) {
        }
    }

    private void actualizado() {

        mostrar();
        abrir(arbol);
        try {
            db.conectar();
            cbniv1.setModel(db.consultacget("Select * from cuentas where estado_cuenta=1", "nombre_cuenta"));
            String codigo = db.consultac2get("select * from cuentas where nombre_cuenta='" + cbniv1.getSelectedItem().toString() + "'", "cod_cuenta");
            cbniv2.setModel(db.consultacget("Select * from subcuentas where estado_subcuenta=1 and cod_cuenta='" + codigo + "'", "nombre_subcuenta"));
            codigo = db.consultac2get("select * from subcuentas where nombre_subcuenta='" + cbniv2.getSelectedItem().toString() + "'", "cod_subcuenta");
            cbniv4.setModel(db.consultacget("Select * from subcuenta1 where estado_subcuenta1=1 and cod_subcuenta='" + codigo + "'", "nombre_subcuenta1"));
            codigo = db.consultac2get("select * from subcuenta1 where nombre_subcuenta1='" + cbniv4.getSelectedItem().toString() + "'", "cod_subcuenta1");
            cbniv3.setModel(db.consultacget("Select * from subcuenta2 where estado_subcuenta2=1 and cod_subcuenta1='" + codigo + "'", "nombre_subcuenta2"));
            codigo = db.consultac2get("select * from subcuenta2 where nombre_subcuenta2='" + cbniv3.getSelectedItem().toString() + "'", "cod_subcuenta2");
            cbniv5.setModel(db.consultacget("Select * from subcuenta3 where estado_subcuenta3=1 and cod_subcuenta2='" + codigo + "'", "nombre_subcuenta3"));
            db.desconectar();
        } catch (java.lang.NullPointerException ex) {
        }
    }

    private void limpiezas() {
        try {
            cbniv1.removeAllItems();
            cbniv2.removeAllItems();
            cbniv3.removeAllItems();
            cbniv4.removeAllItems();
            cbniv5.removeAllItems();
            txtcuenta.setText("");
        } catch (java.lang.NullPointerException ex) {
        }
    }

    private void desactivado() {
        activar();
        if (rdnuevo.isSelected()) {
            actualizado();
            if (cbniveles.getSelectedIndex() == 0) {
                try {
                    cbniv1.setEnabled(false);
                    cbniv2.setEnabled(false);
                    cbniv3.setEnabled(false);
                    cbniv4.setEnabled(false);
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 1) {
                try {
                    cbniv2.setEnabled(false);
                    cbniv3.setEnabled(false);
                    cbniv4.setEnabled(false);
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 2) {
                try {
                    cbniv4.setEnabled(false);
                    cbniv3.setEnabled(false);
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }

            } else if (cbniveles.getSelectedIndex() == 3) {
                try {
                    cbniv3.setEnabled(false);
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }
            }
        }
        if (rdeliminar.isSelected() || rdmodificar.isSelected()) {
            actualizado();
            if (cbniveles.getSelectedIndex() == 0) {
                try {
                    cbniv2.setEnabled(false);
                    cbniv3.setEnabled(false);
                    cbniv4.setEnabled(false);
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 1) {
                try {
                    cbniv3.setEnabled(false);
                    cbniv4.setEnabled(false);
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }

            } else if (cbniveles.getSelectedIndex() == 2) {
                try {
                    cbniv3.setEnabled(false);
                    cbniv5.setEnabled(false);

                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 3) {
                try {
                    cbniv5.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }
            }
            if (rdeliminar.isSelected()) {
                try {
                    txtcuenta.setEnabled(false);
                } catch (java.lang.NullPointerException ex) {
                }
            }

        }

    }

    private void accion() {
        if (cbniveles.getSelectedIndex() == 0) {
            if (rdnuevo.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    conec.consultaset("INSERT INTO `alexanderflower`.`cuentas` (`nombre_cuenta`, `estado_cuenta`) VALUES ('" + txtcuenta.getText() + "', '1');");
                    conec.desconectar();
                }
            } else if (rdmodificar.isSelected()) {
                conec.conectar();
                String codigo = conec.consultac2get("select * from cuentas where nombre_cuenta='" + cbniv1.getSelectedItem().toString() + "'", "cod_cuenta");
                conec.consultaset("UPDATE `alexanderflower`.`cuentas` SET `nombre_cuenta`='" + txtcuenta.getText() + "' WHERE `cod_cuenta`='" + codigo + "';");
                conec.desconectar();
            } else if (rdeliminar.isSelected()) {
                conec.conectar();
                String codigo = conec.consultac2get("select * from cuentas where nombre_cuenta='" + cbniv1.getSelectedItem().toString() + "'", "cod_cuenta");
                conec.consultaset("UPDATE `alexanderflower`.`cuentas` SET `estado_cuenta`='0' WHERE `cod_cuenta`='" + codigo + "';");
                conec.desconectar();
            }
        } else if (cbniveles.getSelectedIndex() == 1) {
            if (rdnuevo.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();

                    int indice = conec.consultac1get("select * from cuentas where nombre_cuenta='" + cbniv1.getSelectedItem().toString() + "'", "cod_cuenta");
                    String cuenta = conec.consultac2get("select cod_subcuenta from subcuentas where cod_cuenta=" + indice + " order by cod_subcuenta desc limit 1", "cod_subcuenta");
                    String aux = "";
                    for (int p = cuenta.length(); p > 0; p--) {
                        if (!".".equals(cuenta.substring(p - 1, p))) {
                            aux = aux + cuenta.substring(p - 1, p);
                        } else {
                            break;
                        }

                    }
                    if ("".equals(aux)) {
                        aux = "0";
                    }
                    int conver = Integer.parseInt(aux);
                    conver++;
                    String codigo1 = indice + "." + conver;
                    conec.consultaset("INSERT INTO `alexanderflower`.`subcuentas` (`cod_subcuenta`,`nombre_subcuenta`, `cod_cuenta`, `estado_subcuenta`) VALUES ('" + codigo1 + "','" + txtcuenta.getText() + "', " + indice + ", 1);");
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdmodificar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String codigo = conec.consultac2get("select * from subcuentas where nombre_subcuenta='" + cbniv2.getSelectedItem().toString() + "'", "cod_subcuenta");
                    String consulta = "UPDATE `alexanderflower`.`subcuentas` SET  `nombre_subcuenta`='" + txtcuenta.getText() + "' WHERE `cod_subcuenta`='" + codigo + "';";
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdeliminar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String codigo = conec.consultac2get("select * from subcuentas where nombre_subcuenta='" + cbniv2.getSelectedItem().toString() + "'", "cod_subcuenta");
                    String consulta = "UPDATE `alexanderflower`.`subcuentas` SET `estado_subcuenta`='0' WHERE `cod_subcuenta`='" + codigo + "';";
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                }
            }
        } else if (cbniveles.getSelectedIndex() == 2) {
            if (rdnuevo.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String indice = conec.consultac2get("select * from subcuentas where nombre_subcuenta='" + cbniv2.getSelectedItem().toString() + "'", "cod_subcuenta");
                    String cuenta = conec.consultac2get("select cod_subcuenta1 from subcuenta1 where cod_subcuenta=" + indice + " order by cod_subcuenta1 desc limit 1", "cod_subcuenta1");
                    String aux = "";
                    for (int p = cuenta.length(); p > 0; p--) {
                        if (!".".equals(cuenta.substring(p - 1, p))) {
                            aux = aux + cuenta.substring(p - 1, p);
                        } else {
                            break;
                        }

                    }
                    if ("".equals(aux)) {
                        aux = "0";
                    }
                    int conver = Integer.parseInt(aux);
                    conver++;
                    String codigo1 = indice + "." + conver;
                    conec.consultaset("INSERT INTO `alexanderflower`.`subcuenta1` (`cod_subcuenta1`,`nombre_subcuenta1`, `cod_subcuenta`, `estado_subcuenta1`) VALUES ('" + codigo1 + "','" + txtcuenta.getText() + "', " + indice + ", 1);");
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdmodificar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();

                    String cuenta = conec.consultac2get("select * from subcuenta1 where  nombre_subcuenta1='" + cbniv3.getSelectedItem().toString() + "'", "cod_subcuenta1");
                    String consulta = "UPDATE `alexanderflower`.`subcuenta1` SET  `nombre_subcuenta1`='" + txtcuenta.getText() + "' WHERE `cod_subcuenta1`='" + cuenta + "';";
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdeliminar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String cuenta = conec.consultac2get("select * from subcuenta1 where  nombre_subcuenta1='" + cbniv3.getSelectedItem().toString() + "'", "cod_subcuenta1");
                    String consulta = "UPDATE `alexanderflower`.`subcuenta1` SET `estado_subcuenta1`='0' WHERE `cod_subcuenta1`='" + cuenta + "';";
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            }
        } else if (cbniveles.getSelectedIndex() == 3) {
            if (rdnuevo.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String indice = conec.consultac2get("select * from subcuenta1 where nombre_subcuenta1='" + cbniv4.getSelectedItem().toString() + "'", "cod_subcuenta1");
                    String cuenta = conec.consultac2get("select cod_subcuenta2 from subcuenta2 where cod_subcuenta1='" + indice + "' order by cod_subcuenta2 desc limit 1", "cod_subcuenta2");
                    String aux = "";
                    for (int p = cuenta.length(); p > 0; p--) {
                        if (!".".equals(cuenta.substring(p - 1, p))) {
                            aux = aux + cuenta.substring(p - 1, p);
                        } else {
                            break;
                        }

                    }
                    if ("".equals(aux)) {
                        aux = "0";
                    }
                    int conver = Integer.parseInt(aux);
                    conver++;
                    String codigo1 = indice + "." + conver;
                    conec.consultaset("INSERT INTO `alexanderflower`.`subcuenta2` (`cod_subcuenta2`,`nombre_subcuenta2`, `cod_subcuenta1`, `estado_subcuenta2`) VALUES ('" + codigo1 + "','" + txtcuenta.getText() + "', '" + indice + "', 1);");
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdmodificar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String cuenta = conec.consultac2get("select * from subcuenta2 where  nombre_subcuenta2='" + cbniv4.getSelectedItem().toString() + "'", "cod_subcuenta2");
                    String consulta = "UPDATE `alexanderflower`.`subcuenta2` SET  `nombre_subcuenta2`='" + txtcuenta.getText() + "' WHERE `cod_subcuenta2`='" + cuenta + "';";
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdeliminar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String cuenta = conec.consultac2get("select * from subcuenta2 where  nombre_subcuenta2='" + cbniv3.getSelectedItem().toString() + "'", "cod_subcuenta2");
                    String consulta = "UPDATE `alexanderflower`.`subcuenta2` SET `estado_subcuenta2`='0' WHERE `cod_subcuenta2`='" + cuenta + "';";
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            }
        } else if (cbniveles.getSelectedIndex() == 4) {
            if (rdnuevo.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String indice = conec.consultac2get("select * from subcuenta2 where nombre_subcuenta2='" + cbniv3.getSelectedItem().toString() + "'", "cod_subcuenta2");
                    System.out.println("roor " + cbniv4.getSelectedItem().toString());
                    System.out.println("error " + indice);
                    String cuenta = conec.consultac2get("select cod_subcuenta3 from subcuenta3 where cod_subcuenta2='" + indice + "' order by cod_subcuenta3 desc limit 1", "cod_subcuenta3");
                    String aux = "";
                    for (int p = cuenta.length(); p > 0; p--) {
                        if (!".".equals(cuenta.substring(p - 1, p))) {
                            aux = aux + cuenta.substring(p - 1, p);
                        } else {
                            break;
                        }

                    }
                    if ("".equals(aux)) {
                        aux = "0";
                    }
                    int conver = Integer.parseInt(aux);
                    conver++;
                    String codigo1 = indice + "." + conver;
                    conec.consultaset("INSERT INTO `alexanderflower`.`subcuenta3` (`cod_subcuenta3`,`nombre_subcuenta3`, `cod_subcuenta2`, `estado_subcuenta3`) VALUES ('" + codigo1 + "','" + txtcuenta.getText() + "', '" + indice + "', 1);");
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdmodificar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String cuenta = conec.consultac2get("select * from subcuenta3 where  nombre_subcuenta3='" + cbniv5.getSelectedItem().toString() + "'", "cod_subcuenta3");
                    String consulta = "UPDATE `alexanderflower`.`subcuenta3` SET  `nombre_subcuenta3`='" + txtcuenta.getText() + "' WHERE `cod_subcuenta3`='" + cuenta + "';";
                    conec.consultaset("UPDATE `alexanderflower`.`bancos` SET `nombre_banco`='" + txtcuenta.getText() + "' WHERE `cod_banco`='" + conec.consultac2get("select * from bancos b  where b.nombre_banco='" + cbniv5.getSelectedItem().toString() + "'", "cod_banco") + "';");
                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            } else if (rdeliminar.isSelected()) {
                if (txtcuenta.getText().length() > 0) {
                    conec.conectar();
                    String cuenta = conec.consultac2get("select * from subcuenta3 where  nombre_subcuenta3='" + cbniv5.getSelectedItem().toString() + "'", "cod_subcuenta3");
                    String consulta = "UPDATE `alexanderflower`.`subcuenta3` SET `estado_subcuenta3`='0' WHERE `cod_subcuenta3`='" + cuenta + "';";
                    conec.consultaset("UPDATE `alexanderflower`.`bancos` SET `estado_banco`=0 WHERE `cod_banco`='" + conec.consultac2get("select * from bancos b  where b.nombre_banco='" + cbniv5.getSelectedItem().toString() + "'", "cod_banco") + "';");

                    conec.consultaset(consulta);
                    txtcuenta.setText("");
                    txtcuenta.requestFocus();
                    conec.desconectar();
                }
            }
        }
    }

    private void accion1() {
        if (rdmodificar.isSelected() || rdeliminar.isSelected()) {
            if (cbniveles.getSelectedIndex() == 0) {
                try {
                    txtcuenta.setText(cbniv1.getSelectedItem().toString());
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 1) {
                try {
                    txtcuenta.setText(cbniv2.getSelectedItem().toString());
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 2) {
                try {
                    txtcuenta.setText(cbniv4.getSelectedItem().toString());
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 3) {
                try {
                    txtcuenta.setText(cbniv3.getSelectedItem().toString());
                } catch (java.lang.NullPointerException ex) {
                }
            } else if (cbniveles.getSelectedIndex() == 4) {
                try {
                    txtcuenta.setText(cbniv5.getSelectedItem().toString());
                } catch (java.lang.NullPointerException ex) {
                }
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdradios = new javax.swing.ButtonGroup();
        tablaopciones = new javax.swing.JTabbedPane();
        panel5 = new org.edisoncor.gui.panel.Panel();
        btnrolgeneral = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabladatos = new javax.swing.JTable();
        txtempleado = new javax.swing.JTextField();
        btnver = new javax.swing.JButton();
        btnbuscar = new javax.swing.JButton();
        lblhasta = new javax.swing.JLabel();
        dchasta = new com.toedter.calendar.JDateChooser();
        txtcodigo = new javax.swing.JTextField();
        dcdesde = new com.toedter.calendar.JDateChooser();
        lblinicio = new javax.swing.JLabel();
        lblcodigo = new javax.swing.JLabel();
        lblgeneral = new javax.swing.JLabel();
        lblindividual = new javax.swing.JLabel();
        btnvista = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        lblempleado = new javax.swing.JLabel();
        panel6 = new org.edisoncor.gui.panel.Panel();
        panel7 = new org.edisoncor.gui.panel.Panel();
        panel8 = new org.edisoncor.gui.panel.Panel();
        btnreporte = new javax.swing.JButton();
        btnreporte1 = new javax.swing.JButton();
        panel9 = new org.edisoncor.gui.panel.Panel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        panel3 = new org.edisoncor.gui.panel.Panel();
        labelMetric7 = new org.edisoncor.gui.label.LabelMetric();
        lblniv1 = new javax.swing.JLabel();
        lblniv2 = new javax.swing.JLabel();
        lblniv3 = new javax.swing.JLabel();
        lblniv4 = new javax.swing.JLabel();
        lblniv5 = new javax.swing.JLabel();
        cbniv1 = new javax.swing.JComboBox();
        cbniv2 = new javax.swing.JComboBox();
        cbniv3 = new javax.swing.JComboBox();
        cbniv4 = new javax.swing.JComboBox();
        cbniv5 = new javax.swing.JComboBox();
        btnseleccionar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        lblsubtitulo = new javax.swing.JLabel();
        lblnivel = new javax.swing.JLabel();
        cbniveles = new javax.swing.JComboBox();
        lblcuenta = new javax.swing.JLabel();
        txtcuenta = new javax.swing.JTextField();
        btncambios = new javax.swing.JButton();
        lblhacer = new javax.swing.JLabel();
        rdnuevo = new javax.swing.JRadioButton();
        rdmodificar = new javax.swing.JRadioButton();
        rdeliminar = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        panel10 = new org.edisoncor.gui.panel.Panel();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaopciones.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        tablaopciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaopcionesMouseClicked(evt);
            }
        });

        panel5.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel5.setColorSecundario(new java.awt.Color(255, 153, 0));

        btnrolgeneral.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnrolgeneral.setText("Generar Rol General");
        btnrolgeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrolgeneralActionPerformed(evt);
            }
        });

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

        txtempleado.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtempleado.setEnabled(false);

        btnver.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnver.setText("Ver");
        btnver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnverActionPerformed(evt);
            }
        });

        btnbuscar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnbuscar.setText("Buscar");
        btnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarActionPerformed(evt);
            }
        });

        lblhasta.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblhasta.setText("Hasta");

        txtcodigo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        txtcodigo.setEnabled(false);

        lblinicio.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblinicio.setText("Filtar roles Desde");

        lblcodigo.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblcodigo.setText("Codigo De Rol");

        lblgeneral.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblgeneral.setText("ROL DE PAGOS GENERAL DE LA EMPRESA");

        lblindividual.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblindividual.setText("ROL DE PAGOS INDIVIDUAL");

        btnvista.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnvista.setText("Vista Preliminar");
        btnvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvistaActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblempleado.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblempleado.setText("Numero Empleado");

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel5Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(lblinicio)
                                    .addGap(27, 27, 27)
                                    .addComponent(dcdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12)
                                    .addComponent(lblhasta)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(dchasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnver))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel5Layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(btnrolgeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addComponent(lblgeneral)
                        .addGap(63, 63, 63)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcodigo)
                            .addComponent(lblempleado))
                        .addGap(18, 18, 18)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(txtempleado))
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscar)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnvista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblindividual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(101, 101, 101))))
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblgeneral)
                .addGap(31, 31, 31)
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcdesde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblinicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dchasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblhasta, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnrolgeneral)
                .addGap(30, 30, 30))
            .addGroup(panel5Layout.createSequentialGroup()
                .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel5Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(lblindividual)
                        .addGap(42, 42, 42)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcodigo)
                            .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnbuscar)
                            .addComponent(txtempleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblempleado))
                        .addGap(38, 38, 38)
                        .addComponent(btnvista)))
                .addContainerGap(148, Short.MAX_VALUE))
        );

        tablaopciones.addTab("ROL DE PAGOS", panel5);

        panel6.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel6.setColorSecundario(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        tablaopciones.addTab("LIBRO DIARIO", panel6);

        panel7.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel7.setColorSecundario(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout panel7Layout = new javax.swing.GroupLayout(panel7);
        panel7.setLayout(panel7Layout);
        panel7Layout.setHorizontalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
        );
        panel7Layout.setVerticalGroup(
            panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        tablaopciones.addTab("LIBRO MAYOR", panel7);

        panel8.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel8.setColorSecundario(new java.awt.Color(255, 153, 0));

        btnreporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_integrador/imagenes/nue_vo.png"))); // NOI18N
        btnreporte.setText("Cierres");
        btnreporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporteActionPerformed(evt);
            }
        });

        btnreporte1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_integrador/imagenes/nue_vo.png"))); // NOI18N
        btnreporte1.setText("Roles Emitidos");
        btnreporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreporte1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(btnreporte)
                .addGap(57, 57, 57)
                .addComponent(btnreporte1)
                .addContainerGap(724, Short.MAX_VALUE))
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreporte, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnreporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(492, Short.MAX_VALUE))
        );

        tablaopciones.addTab("REPORTES", panel8);

        panel9.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel9.setColorSecundario(new java.awt.Color(255, 153, 0));

        jSplitPane1.setDividerLocation(400);

        arbol.setBackground(new java.awt.Color(204, 204, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        arbol.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        arbol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                arbolMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(arbol);

        jSplitPane1.setLeftComponent(jScrollPane2);

        panel3.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel3.setColorSecundario(new java.awt.Color(255, 153, 0));

        labelMetric7.setForeground(new java.awt.Color(51, 51, 255));
        labelMetric7.setText("PLAN DE CUENTAS");
        labelMetric7.setColorDeSombra(new java.awt.Color(255, 255, 255));
        labelMetric7.setFont(new java.awt.Font("DS-Digital", 1, 48)); // NOI18N

        lblniv1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblniv1.setText("Cuentas Niv.1");

        lblniv2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblniv2.setText("Cuentas Niv.2");

        lblniv3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblniv3.setText("Cuentas Niv.3");

        lblniv4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblniv4.setText("Cuentas Niv.4");

        lblniv5.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        lblniv5.setText("Cuentas Niv.5");

        cbniv1.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbniv1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbniv1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbniv1ActionPerformed(evt);
            }
        });

        cbniv2.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbniv2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbniv2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbniv2ActionPerformed(evt);
            }
        });

        cbniv3.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbniv3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbniv3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbniv3ActionPerformed(evt);
            }
        });

        cbniv4.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbniv4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbniv4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbniv4ActionPerformed(evt);
            }
        });

        cbniv5.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        cbniv5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        cbniv5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbniv5ActionPerformed(evt);
            }
        });

        btnseleccionar.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnseleccionar.setText("Seleccionar");
        btnseleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionarActionPerformed(evt);
            }
        });

        btnimprimir.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnimprimir.setText("Imprimir Plan");
        btnimprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnimprimirMouseClicked(evt);
            }
        });
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        btnsalir.setFont(new java.awt.Font("Adobe Caslon Pro", 0, 14)); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        lblsubtitulo.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        lblsubtitulo.setText("NUEVO, ACTUALIZAR Y ELIMINAR CUENTAS");

        lblnivel.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        lblnivel.setText("SELECCIONE NIVEL DE CUENTA");

        cbniveles.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        cbniveles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nivel 1", "Nivel 2", "Nivel 3", "Nivel 4", "Nivel 5" }));
        cbniveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbnivelesActionPerformed(evt);
            }
        });

        lblcuenta.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        lblcuenta.setText("CUENTA ");

        txtcuenta.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N

        btncambios.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        btncambios.setText("Guardar Cambios");
        btncambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiosActionPerformed(evt);
            }
        });

        lblhacer.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        lblhacer.setText("SELECCIONA LO QUE DESEE REALIZAR");

        rdradios.add(rdnuevo);
        rdnuevo.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        rdnuevo.setText("NUEVO");

        rdradios.add(rdmodificar);
        rdmodificar.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        rdmodificar.setText("ACTUALIZAR");

        rdradios.add(rdeliminar);
        rdeliminar.setFont(new java.awt.Font("Perpetua Titling MT", 0, 12)); // NOI18N
        rdeliminar.setText("ELIMINAR");

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(19, 19, 19)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(lblniv3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbniv4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnimprimir, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnseleccionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addGap(173, 173, 173)
                                        .addComponent(lblniv5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbniv5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panel3Layout.createSequentialGroup()
                                        .addComponent(lblniv1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbniv1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblniv2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbniv2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(lblniv4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbniv3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addGap(23, 23, 23))
            .addGroup(panel3Layout.createSequentialGroup()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblnivel)
                                .addGap(18, 18, 18)
                                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                                        .addComponent(cbniveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(lblcuenta)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btncambios, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(panel3Layout.createSequentialGroup()
                                .addComponent(lblhacer)
                                .addGap(18, 18, 18)
                                .addComponent(rdnuevo)
                                .addGap(18, 18, 18)
                                .addComponent(rdmodificar)
                                .addGap(27, 27, 27)
                                .addComponent(rdeliminar))))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(lblsubtitulo)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelMetric7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(31, 31, 31)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblniv1)
                    .addComponent(cbniv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblniv2)
                            .addComponent(cbniv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblniv3)
                            .addComponent(cbniv4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnimprimir)
                        .addGap(28, 28, 28)
                        .addComponent(btnseleccionar)))
                .addGap(27, 27, 27)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblniv4)
                    .addComponent(cbniv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsalir))
                .addGap(27, 27, 27)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblniv5)
                    .addComponent(cbniv5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblsubtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblhacer)
                    .addComponent(rdnuevo)
                    .addComponent(rdmodificar)
                    .addComponent(rdeliminar))
                .addGap(18, 18, 18)
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcuenta, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbniveles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblnivel)))
                .addGap(24, 24, 24)
                .addComponent(btncambios)
                .addGap(26, 26, 26))
        );

        jSplitPane1.setRightComponent(panel3);

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel9Layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1088, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        tablaopciones.addTab("PLAN DE CUENTAS", panel9);

        panel10.setColorPrimario(new java.awt.Color(204, 255, 204));
        panel10.setColorSecundario(new java.awt.Color(255, 153, 0));
        panel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1088, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        tablaopciones.addTab("ESTADO DE LA EMPRESA", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaopciones)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tablaopciones, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Date fecha = new Date();
    controlformularios cen = new controlformularios();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
    private void cargar() {
        fecha = cen.fechasmas(fecha, -30);
        dcdesde.setDate(fecha);
        fecha = cen.fechasmas(fecha, 60);
        dchasta.setDate(fecha);

    }
    private void btnverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnverActionPerformed
        int año = dcdesde.getCalendar().get(Calendar.YEAR);
        int mes = dcdesde.getCalendar().get(Calendar.MONTH) + 1;
        int dia = dcdesde.getCalendar().get(Calendar.DAY_OF_MONTH);
        int año1 = dchasta.getCalendar().get(Calendar.YEAR);
        int mes1 = dchasta.getCalendar().get(Calendar.MONTH) + 1;
        int dia1 = dchasta.getCalendar().get(Calendar.DAY_OF_MONTH);
        conec.conectar();
        final String[] columnas = {"Codigo", "Fecha Emitida", "Periodo", "Cod Contador", "Cod Autorización"};
        String consulta = "select codigo_rol,fecha_rol,periodo_rol,contador_rol,autorizacion_rol from roles where estado_rol=1 and (fecha_rol>'" + año + "-" + mes + "-" + dia + "' and fecha_rol<'" + año1 + "-" + mes1 + "-" + dia1 + "')";
        tabladatos.setModel(conec.consultaget(consulta, columnas));
        conec.desconectar();
    }//GEN-LAST:event_btnverActionPerformed
    private int index;
    private void tabladatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabladatosMouseClicked
        index = tabladatos.getSelectedRow();
        txtcodigo.setText(tabladatos.getValueAt(index, 0).toString());
    }//GEN-LAST:event_tabladatosMouseClicked

    private void btnrolgeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrolgeneralActionPerformed

        rolemplado rol = new rolemplado();
        dialogo jd = new dialogo(rol, true);
        jd.setContentPane(rol.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
    }//GEN-LAST:event_btnrolgeneralActionPerformed
    public static String codigo, cedula;

    private void btnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarActionPerformed
        clientesprov.verme = 100;
        buscare nu = new buscare();
        dialogo jd = new dialogo(nu, true);
        jd.setContentPane(nu.getContentPane());
        jd.pack();
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);
        txtempleado.setText(buscare.cedula);

    }//GEN-LAST:event_btnbuscarActionPerformed

    private void btnvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvistaActionPerformed
        if (txtempleado.getText().length() > 0 && txtcodigo.getText().length() > 0) {
            codigo = txtcodigo.getText();
            cedula = txtempleado.getText();
            rolindividual roli = new rolindividual();
            dialogo jd = new dialogo(roli, true);
            jd.setContentPane(roli.getContentPane());
            jd.pack();
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
        }
    }//GEN-LAST:event_btnvistaActionPerformed

    private void arbolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_arbolMouseClicked
    }//GEN-LAST:event_arbolMouseClicked

    private void cbniv1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbniv1ActionPerformed
        try {
            cbniv2.removeAllItems();
            cbniv3.removeAllItems();
            cbniv4.removeAllItems();
            cbniv5.removeAllItems();
            db.conectar();
            String codigo = db.consultac2get("select * from cuentas where nombre_cuenta='" + cbniv1.getSelectedItem().toString() + "'", "cod_cuenta");
            cbniv2.setModel(db.consultacget("Select * from subcuentas where estado_subcuenta=1 and cod_cuenta='" + codigo + "'", "nombre_subcuenta"));
            codigo1 = codigo;
            cuenta = cbniv1.getSelectedItem().toString();
            accion1();
            db.desconectar();

        } catch (java.lang.NullPointerException ex) {
        }
    }//GEN-LAST:event_cbniv1ActionPerformed

    private void cbniv2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbniv2ActionPerformed
        try {
            cbniv3.removeAllItems();
            cbniv4.removeAllItems();
            cbniv5.removeAllItems();
            db.conectar();
            String codigo = db.consultac2get("select * from subcuentas where nombre_subcuenta='" + cbniv2.getSelectedItem().toString() + "'", "cod_subcuenta");
            cbniv4.setModel(db.consultacget("Select * from subcuenta1 where estado_subcuenta1=1 and cod_subcuenta='" + codigo + "'", "nombre_subcuenta1"));
            codigo1 = codigo;
            cuenta = cbniv2.getSelectedItem().toString();
            accion1();
            db.desconectar();
        } catch (java.lang.NullPointerException ex) {
        }
    }//GEN-LAST:event_cbniv2ActionPerformed

    private void cbniv3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbniv3ActionPerformed
        try {
            cbniv5.removeAllItems();
            db.conectar();
            String codigo = db.consultac2get("select * from subcuenta2 where nombre_subcuenta2='" + cbniv3.getSelectedItem().toString() + "'", "cod_subcuenta2");
            System.out.println("" + codigo);
            cbniv5.setModel(db.consultacget("Select * from subcuenta3 where estado_subcuenta3=1 and cod_subcuenta2='" + codigo + "'", "nombre_subcuenta3"));
            codigo1 = codigo;
            cuenta = cbniv3.getSelectedItem().toString();
            accion1();
            db.desconectar();
        } catch (java.lang.NullPointerException ex) {
        }
    }//GEN-LAST:event_cbniv3ActionPerformed

    private void cbniv4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbniv4ActionPerformed
        try {
            cbniv3.removeAllItems();
            cbniv5.removeAllItems();
            db.conectar();
            String codigo = db.consultac2get("select * from subcuenta1 where nombre_subcuenta1='" + cbniv4.getSelectedItem().toString() + "'", "cod_subcuenta1");
            System.out.println("" + codigo);
            cbniv3.setModel(db.consultacget("Select * from subcuenta2 where estado_subcuenta2=1 and cod_subcuenta1='" + codigo + "'", "nombre_subcuenta2"));
            codigo1 = codigo;
            cuenta = cbniv4.getSelectedItem().toString();
            accion1();
            db.desconectar();
        } catch (java.lang.NullPointerException ex) {
        }
    }//GEN-LAST:event_cbniv4ActionPerformed

    private void cbniv5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbniv5ActionPerformed
        try {
            db.conectar();
            String codigo = db.consultac2get("select * from subcuenta3 where nombre_subcuenta3='" + cbniv5.getSelectedItem().toString() + "'", "cod_subcuenta3");
            codigo1 = codigo;
            cuenta = cbniv5.getSelectedItem().toString();
            accion1();
            db.desconectar();
        } catch (java.lang.NullPointerException ex) {
        }
    }//GEN-LAST:event_cbniv5ActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
        imprimir.imspresionset("recuentas.jasper");
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnsalirActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cerrar(arbol);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        abrir(arbol);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbnivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbnivelesActionPerformed
        desactivado();
    }//GEN-LAST:event_cbnivelesActionPerformed

    private void btncambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiosActionPerformed
        accion();
        actualizado();

    }//GEN-LAST:event_btncambiosActionPerformed

    private void btnimprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnimprimirMouseClicked
    }//GEN-LAST:event_btnimprimirMouseClicked

    private void tablaopcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaopcionesMouseClicked
        if (tablaopciones.getSelectedIndex() == 1) {
            asientos as = new asientos();
            dialogo jd = new dialogo(as, true);
            jd.setContentPane(as.getContentPane());
            jd.pack();
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
        } else if (tablaopciones.getSelectedIndex() == 2) {
            librodiario ld = new librodiario();
            dialogo jd = new dialogo(ld, true);
            jd.setContentPane(ld.getContentPane());
            jd.pack();
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
        } else if (tablaopciones.getSelectedIndex() == 5) {
            estado_perd_gan ld = new estado_perd_gan();
            dialogo jd = new dialogo(ld, true);
            jd.setContentPane(ld.getContentPane());
            jd.pack();
            jd.setLocationRelativeTo(null);
            jd.setVisible(true);
        }
    }//GEN-LAST:event_tablaopcionesMouseClicked

    private void btnseleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnseleccionarActionPerformed

    private void panel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel10MouseClicked

    }//GEN-LAST:event_panel10MouseClicked

    private void btnreporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporteActionPerformed
        imp.imspresionset("rcierres.jasper");
    }//GEN-LAST:event_btnreporteActionPerformed

    private void btnreporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreporte1ActionPerformed
        imp.imspresionset("rroles.jasper");
    }//GEN-LAST:event_btnreporte1ActionPerformed
    public static String codigo1 = "", cuenta = "";
impresiones imp=new impresiones();
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
            java.util.logging.Logger.getLogger(roldepagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(roldepagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(roldepagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(roldepagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new roldepagos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncambios;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnreporte;
    private javax.swing.JButton btnreporte1;
    private javax.swing.JButton btnrolgeneral;
    private javax.swing.JButton btnsalir;
    private javax.swing.JButton btnseleccionar;
    private javax.swing.JButton btnver;
    private javax.swing.JButton btnvista;
    private javax.swing.JComboBox cbniv1;
    private javax.swing.JComboBox cbniv2;
    private javax.swing.JComboBox cbniv3;
    private javax.swing.JComboBox cbniv4;
    private javax.swing.JComboBox cbniv5;
    private javax.swing.JComboBox cbniveles;
    private com.toedter.calendar.JDateChooser dcdesde;
    private com.toedter.calendar.JDateChooser dchasta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSplitPane jSplitPane1;
    private org.edisoncor.gui.label.LabelMetric labelMetric7;
    private javax.swing.JLabel lblcodigo;
    private javax.swing.JLabel lblcuenta;
    private javax.swing.JLabel lblempleado;
    private javax.swing.JLabel lblgeneral;
    private javax.swing.JLabel lblhacer;
    private javax.swing.JLabel lblhasta;
    private javax.swing.JLabel lblindividual;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblniv1;
    private javax.swing.JLabel lblniv2;
    private javax.swing.JLabel lblniv3;
    private javax.swing.JLabel lblniv4;
    private javax.swing.JLabel lblniv5;
    private javax.swing.JLabel lblnivel;
    private javax.swing.JLabel lblsubtitulo;
    private org.edisoncor.gui.panel.Panel panel10;
    private org.edisoncor.gui.panel.Panel panel3;
    private org.edisoncor.gui.panel.Panel panel5;
    private org.edisoncor.gui.panel.Panel panel6;
    private org.edisoncor.gui.panel.Panel panel7;
    private org.edisoncor.gui.panel.Panel panel8;
    private org.edisoncor.gui.panel.Panel panel9;
    private javax.swing.JRadioButton rdeliminar;
    private javax.swing.JRadioButton rdmodificar;
    private javax.swing.JRadioButton rdnuevo;
    private javax.swing.ButtonGroup rdradios;
    private javax.swing.JTable tabladatos;
    public static javax.swing.JTabbedPane tablaopciones;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtcuenta;
    private javax.swing.JTextField txtempleado;
    // End of variables declaration//GEN-END:variables
}
