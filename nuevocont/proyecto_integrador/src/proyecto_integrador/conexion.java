/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integrador;

import com.mysql.jdbc.SQLError;
import static com.mysql.jdbc.SQLError.createSQLException;
import static com.mysql.jdbc.SQLError.createSQLException;
import static com.mysql.jdbc.SQLError.createSQLException;
import static com.mysql.jdbc.SQLError.createSQLException;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import plandecuentas.cuentas;
import plandecuentas.plan;

/**
 *
 * @author LAB4-08
 */
public class conexion {

    private static String bd = "";
    private static String login = "";
    private static String password = "";
    private final String url = "jdbc:mysql://localhost/" + bd;
    private Connection con = null;

    public Connection conset() {
        return con;
    }

    public void loginset(String user) {
        login = user;
    }

    public void passwordset(String ps) {
        password = ps;
    }

    public void bdset(String db) {
        bd = db;
    }

    public String loginget() {
        return login;
    }

    public String passwordget() {
        return password;
    }

    public String bdget() {
        return bd;
    }

    public void conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            con = DriverManager.getConnection(url, login, password);
            if (con != null) {
                System.out.println("exitoso");
            }
        } catch (SQLException ex) {
            System.out.println("error 1:");
        } catch (ClassNotFoundException ex) {
            System.out.println("error 2:");
        }
    }

    public void desconectar() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("" + ex);
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double redondear(double numero) {
        return Math.round(numero * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    public DefaultTableModel consultaget(String consulta, String[] columnas) {
        final Object[][] datos = {};
        final DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(consulta);
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            while (rs.next()) {
                Object[] fila = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
        return modelo;
    }

    public DefaultComboBoxModel consultacget(String consulta, String columna) {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(consulta);
            while (rs.next()) {
                modelo.addElement(rs.getObject("" + columna));
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
        return modelo;
    }

    public int consultac1get(String consulta, String columna) {
        int indice = 0;
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(consulta);
            while (rs.next()) {
                indice = Integer.parseInt("" + rs.getObject("" + columna));
            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("" + e);
        }
        return indice;
    }

    public String consultac2get(String consulta, String columna) {
        String indice = "";
        try {
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(consulta);
            while (rs.next()) {
                indice = "" + rs.getObject("" + columna);
            }

        } catch (SQLException ex) {
            System.out.println("" + ex);
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.lang.NumberFormatException e) {
            System.out.println("" + e);
        }
        return indice;
    }

    public void consultaset(String consulta) {
        try {
            Statement statement = (Statement) con.createStatement();
            statement.execute(consulta);
        } catch (java.sql.SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("" + ex);
        }
    }

    public ArrayList<plan> getcuentas(String consulta) {
        ArrayList<plan> plancuentas = new ArrayList<plan>();
        try {
            Statement st = this.con.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            plan cuenta = null;
            while (rs.next()) {
                cuenta = new plan(rs.getString(1));
                plancuentas.add(cuenta);

            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
        return plancuentas;
    }

    public Object[][] select(String table, String fields, String where) {
        int registros = 0;
        String colname[] = fields.split(",");

        //Consultas SQL
        String q = "SELECT " + fields + " FROM " + table;
        String q2 = "SELECT count(*) as total FROM " + table;
        if (where != null) {
            q += " WHERE " + where;
            q2 += " WHERE " + where;
        }
        //obtenemos la cantidad de registros existentes en la tabla
        try {
            PreparedStatement pstm = con.prepareStatement(q2);
            ResultSet res = pstm.executeQuery();
            res.next();
            registros = res.getInt("total");
            res.close();
        } catch (SQLException e) {
            System.out.println("" + e);
        }
        //se crea una matriz con tantas filas y columnas que necesite
        Object[][] data = new String[registros][fields.split(",").length];
        //realizamos la consulta sql y llenamos los datos en la matriz "Object"
        try {
            PreparedStatement pstm = con.prepareStatement(q);
            ResultSet res = pstm.executeQuery();
            int i = 0;
            while (res.next()) {
                for (int j = 0; j <= fields.split(",").length - 1; j++) {
                    data[i][j] = res.getString(colname[j].trim());
                }
                i++;
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return data;
    }
}
