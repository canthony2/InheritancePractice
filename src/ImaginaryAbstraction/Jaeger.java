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
public class Jaeger extends BattleMachine{
    
    private String generationMark;
    private String powerSource;
    
    @Override
    public double getMeterHeight() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getGenerationMark() {
        return generationMark;
    }

    public void setGenerationMark(String generationMark) {
        this.generationMark = generationMark;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }
    
}
