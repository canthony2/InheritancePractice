/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ImaginaryAbstraction;

/**
 *
 * @author knyghtspup
 */
public class StarShip extends StarTrek{
    
    private String shipClass;
    private boolean dedicatedWarship;

    @Override
    public double getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getShipClass() {
        return shipClass;
    }

    public void setShipClass(String shipClass) {
        this.shipClass = shipClass;
    }

    public boolean isDedicatedWarship() {
        return dedicatedWarship;
    }

    public void setDedicatedWarship(boolean dedicatedWarship) {
        this.dedicatedWarship = dedicatedWarship;
    }
    
}
