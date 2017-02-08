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
public class Armor extends Vehicle{
    
    private double armorThickness;
    private String type; //tank, artillery, Infantry Fighting Vehicle, Armored Personel Carrier, etc...
    
    @Override
    public double getMeterLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getArmorThickness() {
        return armorThickness;
    }

    public void setArmorThickness(double armorThickness) {
        this.armorThickness = armorThickness;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
