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
public class Kaiju extends Monster{
    
    private boolean beamAttack;
    private boolean prehistoricLook;
    
    @Override
    public double getHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isBeamAttack() {
        return beamAttack;
    }

    public void setBeamAttack(boolean beamAttack) {
        this.beamAttack = beamAttack;
    }

    public boolean isPrehistoricLook() {
        return prehistoricLook;
    }

    public void setPrehistoricLook(boolean prehistoricLook) {
        this.prehistoricLook = prehistoricLook;
    }
    
}
