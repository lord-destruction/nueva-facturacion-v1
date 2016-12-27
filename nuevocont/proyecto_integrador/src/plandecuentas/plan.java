/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package plandecuentas;

/**
 *
 * @author USUARIO
 */
public class plan {
private String cargo;
    public plan(String string) {
        this.cargo=string;
    }
    public plan()
    {
        
    }
    public String getcargo()
    {
        return cargo;
    }
    public void setcargo(String cargo)
    {
        this.cargo=cargo;
    }

    @Override
    public String toString() {
        return cargo;
    }

}
