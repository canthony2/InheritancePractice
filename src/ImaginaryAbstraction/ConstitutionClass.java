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
public class ConstitutionClass extends StarShip{
    
    private boolean gotRefit;
    private boolean madeFamousByEnterprise;
    
    @Override
    public double getLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isGotRefit() {
        return gotRefit;
    }

    public void setGotRefit(boolean gotRefit) {
        this.gotRefit = gotRefit;
    }

    public boolean isMadeFamousByEnterprise() {
        return madeFamousByEnterprise;
    }

    public void setMadeFamousByEnterprise(boolean madeFamousByEnterprise) {
        this.madeFamousByEnterprise = madeFamousByEnterprise;
    }
    
}
