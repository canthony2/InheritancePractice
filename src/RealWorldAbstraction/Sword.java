/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealWorldAbstraction;

/**
 *
 * @author knyghtspup
 */
public class Sword extends Blade{
    
    private String name;
    private boolean doubleEdged;
    
    @Override
    public double getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoubleEdged() {
        return doubleEdged;
    }

    public void setDoubleEdged(boolean doubleEdged) {
        this.doubleEdged = doubleEdged;
    }
    
}
