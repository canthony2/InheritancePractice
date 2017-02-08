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
public abstract class StarTrek {
    
    private String species;
    private String faction;
    
    public abstract double getLength();

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFaction() {
        return faction;
    }

    public void setFaction(String faction) {
        this.faction = faction;
    }
    
}
