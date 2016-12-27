/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import contabilidad.librodiario;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import proyecto_integrador.panel;

/**
 *
 * @author USUARIO
 */
public class Reloj {

    public static int counter=0, minutos, horas;
    public static java.util.Timer timer = new java.util.Timer("MyTimer");//create a new Timer

    public  void tiempo() {
        try {
            TimerTask timerTask;
            timerTask = new TimerTask() {
                @Override
                public void run() {
                   panel.grabar();
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0, 1000);
            
        } catch (java.lang.IllegalStateException a) {
        } catch (java.lang.NullPointerException b) {
        }
       
    }
}
