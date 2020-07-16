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
public class Ceker extends ToppingDecorator {

    Seblak seblak;

    public Ceker(Seblak seblak) {
        this.seblak = seblak;
    }

    @Override
    public String getDescription() {
        return seblak.getDescription() + " ,Ceker";
    }
    
    @Override
    public float getCost(){
        return 500 + seblak.getCost();
    }
}
