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
public abstract class Mech {
    private String type;
    private String name;
    
    public abstract double getHeight();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
