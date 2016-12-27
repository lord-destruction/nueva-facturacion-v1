/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_integrador;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author LAB4-08
 */
public class dimension {
    private Toolkit t = Toolkit.getDefaultToolkit();
    Dimension dimension()
    { 
    Dimension tamaño = Toolkit.getDefaultToolkit().getScreenSize();
    return tamaño;
    }
}
