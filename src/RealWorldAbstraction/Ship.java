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
public abstract class Ship {
    
    private String kind; //Military or Civilian
    private int nauticalSpeed;
    private double feetLength;
    
    public abstract double getMeterLength();

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public double getFeetLength() {
        return feetLength;
    }

    public void setFeetLength(double feetLength) {
        this.feetLength = feetLength;
    }

    public int getNauticalSpeed() {
        return nauticalSpeed;
    }

    public void setNauticalSpeed(int nauticalSpeed) {
        this.nauticalSpeed = nauticalSpeed;
    }
    
}
