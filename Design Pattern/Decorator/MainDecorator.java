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
public class MainDecorator {
    public static void main(String[] args) {
        Eskrim eskrim = new MarshmallowDecorator(new CeresDecorator(new EskrimSimple()));
        System.out.println(eskrim.buatEskrim());
    }
}
