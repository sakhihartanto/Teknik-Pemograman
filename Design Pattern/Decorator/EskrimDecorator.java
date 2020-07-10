/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class EskrimDecorator implements  Eskrim{
    protected Eskrim eskrimSpesial;
    
    public EskrimDecorator(Eskrim eskrimSpesial){
        this.eskrimSpesial = eskrimSpesial;
    }
    @Override
    public String buatEskrim(){
        return eskrimSpesial.buatEskrim();
    }
}
