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
public class YamatoClass extends Battleship{
    
    private boolean famous;
    private boolean largest;
            
    @Override
    public double getMeterLength() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean isFamous() {
        return famous;
    }

    public void setFamous(boolean famous) {
        this.famous = famous;
    }

    public boolean isLargest() {
        return largest;
    }

    public void setLargest(boolean largest) {
        this.largest = largest;
    }
    
}
