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
public abstract class Weapon {
    
    private String type;
    private boolean usesAmmunition;
    private double feetLength;
    
    public abstract double getMeterLength();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isUsesAmmunition() {
        return usesAmmunition;
    }

    public void setUsesAmmunition(boolean usesAmmunition) {
        this.usesAmmunition = usesAmmunition;
    }

    public double getFeetLength() {
        return feetLength;
    }

    public void setFeetLength(double feetLength) {
        this.feetLength = feetLength;
    }
    
}
