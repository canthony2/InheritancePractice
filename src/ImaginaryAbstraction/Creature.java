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
public abstract class Creature {
    //information about the creature
    private String kind;
    private String name;
    private double feetHeight;
    
    public abstract double getMeterHeight();

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFeetHeight() {
        return feetHeight;
    }

    public void setFeetHeight(double feetHeight) {
        this.feetHeight = feetHeight;
    }
    
}