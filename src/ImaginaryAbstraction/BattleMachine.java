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
public class BattleMachine extends Mech{
    
    private String armorType;
    private boolean Shields;
    
    @Override
    public double getMeterHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getArmorType() {
        return armorType;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public boolean isShields() {
        return Shields;
    }

    public void setShields(boolean Shields) {
        this.Shields = Shields;
    }
    
}
