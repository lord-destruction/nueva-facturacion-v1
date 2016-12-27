/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author usuario
 */
public class productosin {

    private String listado[][] = new String[1][5];
    private String listado1[][] = new String[1][5];
    private int aumento = 1;

    public void datosset(String aux, int y, int x) {
                    listado[y][x] = aux;
           }

    public boolean comprobacion(String aux) {
        boolean ver = true;
        for (int i = 0; i < aumento; i++) {
            for (int j = 0; j < 1; j++) {
                if (aux.equals(listado[i][j])) {
                    ver = false;
                }
            }
        }
        return ver;
    }

    public int aumentoget() {
        return this.aumento;
    }

    public void copiado1() {
        for (int i = 0; i < aumento; i++) {
            for (int j = 0; j < 5; j++) {
                listado1[i][j] = listado[i][j];
            }
        }
        aumento++;
        listado = new String[aumento][5];
    }

    public void copiado2() {
        for (int i = 0; i < aumento - 1; i++) {
            for (int j = 0; j < 5; j++) {
                listado[i][j] = listado1[i][j];
            }
        }
        listado1 = new String[aumento][5];
    }

    public void eliminado(int index) {

        int l;
        for (int i = 0; i < aumento; i++) {
            l = i;
            if (i == index) {
                l++;
            }
            for (int j = 0; j < 5; j++) {
                listado[i][j] = listado[l][j];
            }
        }
        if(aumento<=2)
        {aumento = aumento - 1;}else{aumento = aumento - 2;}
        
        listado1 = new String[aumento][5];
        copiado1();
        listado = new String[aumento][5];
        copiado2();
    }

    public String datosget(int y, int x) {
        return listado[y][x];
    }
}
