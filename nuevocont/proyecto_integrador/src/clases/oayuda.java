/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author lab4-01
 */
public class oayuda {

    public void opena(String documento) throws IOException {
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
        pacht = pacht + "/build/classes/ayudas/" + documento + "";
        File path = new File(pacht);
        Desktop.getDesktop().open(path);
    }
}
