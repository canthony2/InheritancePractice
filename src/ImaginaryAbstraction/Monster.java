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
public class Monster extends Creature{
    
    private boolean Abilities;
    private boolean Classic;
    
    @Override
    public double getMeterHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isClassic() {
        return Classic;
    }

    public void setClassic(boolean isClassic) {
        this.Classic = isClassic;
    }

    public boolean isAbilities() {
        return Abilities;
    }

    public void setAbilities(boolean hasPowers) {
        this.Abilities = hasPowers;
    }
    
}
