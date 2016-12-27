/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author WINDOWS
 */
public class controlformularios {

    private Toolkit t = Toolkit.getDefaultToolkit();

    public int xget(int xi) {
        int tamx;
        int x = Toolkit.getDefaultToolkit().getScreenSize().width;
        tamx = (x - xi) / 2;
        return tamx;
    }

    public int yget(int yi) {
        int tamy;
        int y = Toolkit.getDefaultToolkit().getScreenSize().height;
        tamy = (y - yi) / 2;
        return tamy;
    }

    public int pxget(int x, int xi) {
        int tamx;
        tamx = (x - xi) / 2;
        return tamx;
    }

    public int pyget(int y, int yi) {
        int tamy;
        tamy = (y - yi) / 2;
        return tamy;
    }

    public Date fechasmas(Date fecha, int dias) {

        Calendar calendar = Calendar.getInstance();

        calendar.setTime(fecha);

        calendar.add(Calendar.DAY_OF_YEAR, dias);

        return calendar.getTime();

    }
}
