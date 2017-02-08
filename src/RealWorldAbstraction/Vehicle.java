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
public abstract class Vehicle {
    
    private String kind; //tracked, wheeled, or half-track
    private boolean military;
    private double feetLength;
    
    public abstract double getMeterLength();

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public boolean isMilitary() {
        return military;
    }

    public void setMilitary(boolean military) {
        this.military = military;
    }

    public double getFeetLength() {
        return feetLength;
    }

    public void setFeetLength(double feetLength) {
        this.feetLength = feetLength;
    }
    
}
