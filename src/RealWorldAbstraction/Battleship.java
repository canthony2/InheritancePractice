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
public class Battleship extends Ship{
    
    private String shipClass;
    private String armamentType;
    private double armorThickness;
    
    @Override
    public double getMeterLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public String getArmamentType() {
        return armamentType;
    }

    public void setArmamentType(String armamentType) {
        this.armamentType = armamentType;
    }

    public double getArmorThickness() {
        return armorThickness;
    }

    public void setArmorThickness(double armorThickness) {
        this.armorThickness = armorThickness;
    }
    
}
