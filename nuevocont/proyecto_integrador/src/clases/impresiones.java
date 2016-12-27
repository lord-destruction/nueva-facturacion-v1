/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JRootPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import proyecto_integrador.conexion;

/**
 *
 * @author USUARIO
 */
public class impresiones {

    private conexion conec = new conexion();

    public void imspresionset(String documento) {
        conec.conectar();
        String s = "\\\\", pacht = "";
        File archivo = new File("");
        String pach = archivo.getAbsolutePath();
        for (int i = 0; i < pach.length(); i++) {
            if (s.substring(0, 1).equals(pach.substring(i, i + 1))) {
                pacht = pacht + "/";
            } else {
                pacht = pacht + pach.substring(i, i + 1);
            }
        }
        pacht = pacht + "/build/classes/reportes/" + documento + "";
        JasperReport jr = null;
        try {

            jr = (JasperReport) JRLoader.loadObjectFromFile(pacht);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, conec.conset());
            JasperViewer jv = new JasperViewer(jp,false);
            jv.setVisible(true);
            jv.setTitle("Impresion de Reportes");
        } catch (JRException ex) {
        }
        conec.desconectar();
    }
}
