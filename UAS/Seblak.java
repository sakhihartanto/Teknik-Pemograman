/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas;

/**
 *
 * @author User
 */
public abstract class Seblak {
    String description = "Unknown Seblak";
    
    public String getDescription(){
        return description;
    }
    public abstract float getCost();
}
