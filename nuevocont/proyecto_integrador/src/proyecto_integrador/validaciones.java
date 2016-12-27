/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integrador;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author usuario
 */
public class validaciones {

    private String cedula, ruc;
    private static int[] coeficientes = {4, 3, 2, 7, 6, 5, 4, 3, 2};
    private static int constante = 11;
    private static final int num_provincias = 24;
    private static final String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public String cedulaget() {
        return cedula;
    }

    public String rucget() {
        return ruc;
    }

    public boolean validarce(String cedulain) {
        this.cedula = cedulain;
        int prov = Integer.parseInt(cedula.substring(0, 2));
        if (!((prov > 0) && (prov <= num_provincias))) {
            return false;
        }
        int[] d = new int[10];
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(cedula.charAt(i) + "");
        }

        int imp = 0;
        int par = 0;
        for (int i = 0; i < d.length; i += 2) {
            d[i] = ((d[i] * 2) > 9) ? ((d[i] * 2) - 9) : (d[i] * 2);
            imp += d[i];
        }
        for (int i = 1; i < (d.length - 1); i += 2) {
            par += d[i];
        }
        int suma = imp + par;
        int d10 = Integer.parseInt(String.valueOf(suma + 10).substring(0, 1) + "0") - suma;
        d10 = (d10 == 10) ? 0 : d10;
        if (d10 == d[9]) {
            return true;
        } else {
            return false;
        }
    }

    public Boolean validarucep(String ruc) {
        this.ruc = ruc;
        int prov = Integer.parseInt(ruc.substring(0, 2));
        boolean val = false;

        if (!((prov > 0) && (prov <= num_provincias))) {
            return val;
        }

        Integer v1, v2, v3, v4, v5, v6, v7, v8, v9;
        Integer sumatoria;
        Integer modulo;
        Integer digito;
        Integer sustraendo;
        int[] d = new int[ruc.length()];

        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(ruc.charAt(i) + "");
        }

        v1 = d[0] * 3;
        v2 = d[1] * 2;
        v3 = d[2] * 7;
        v4 = d[3] * 6;
        v5 = d[4] * 5;
        v6 = d[5] * 4;
        v7 = d[6] * 3;
        v8 = d[7] * 2;
        v9 = d[8];

        sumatoria = v1 + v2 + v3 + v4 + v5 + v6 + v7 + v8;
        modulo = sumatoria % 11;
        sustraendo = modulo * 11;
        digito = 11 - (sumatoria - sustraendo);
        if (digito == v9) {
            val = true;
        } else {
            val = false;
        }
        return val;
    }

    public boolean validaruc(String rucin) {
        this.ruc = rucin;
        int prov = Integer.parseInt(ruc.substring(0, 2));
        if (!((prov > 0) && (prov <= num_provincias))) {
            return false;
        }
        int[] d = new int[10];
        int suma = 0;
        for (int i = 0; i < d.length; i++) {
            d[i] = Integer.parseInt(ruc.charAt(i) + "");
        }

        for (int i = 0; i < d.length - 1; i++) {
            d[i] = d[i] * coeficientes[i];
            suma += d[i];
        }
        int aux, resp;

        aux = suma % constante;
        resp = constante - aux;

        resp = (resp == 10) ? 0 : resp;
        if (resp == d[9]) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param evt
     */
    public void sololetras(java.awt.event.KeyEvent evt) {

        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isLetter(tecla) && tecla != KeyEvent.VK_SPACE && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }

    public void solonumeros(java.awt.event.KeyEvent evt) {

        char tecla;
        tecla = evt.getKeyChar();
        if (!Character.isDigit(tecla) && tecla != KeyEvent.VK_BACK_SPACE) {
            evt.consume();
        }
    }

    public boolean validaemail(String email) {

        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
