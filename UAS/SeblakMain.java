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
public class SeblakMain {
    public static void main(String[] args) {
       // Orderan ke 1
        Seblak seblak1 = new KerupukMerah();
        // Orderan ke 2
        Seblak seblak2 = new KerupukMerah();
        seblak2 = new Ceker(seblak2);
        seblak2 = new Ceker(seblak2);
        //Orderan ke 3
        Seblak seblak3 = new Makaroni();
        seblak3 = new Ceker(seblak3);
        seblak3 = new Ceker(seblak3);
        seblak3 = new Ceker(seblak3);
        seblak3 = new Tulang(seblak3);
        
        
        System.out.println("Order 1 : " + seblak1.getDescription()+ " \n" + "Total Harga : " + seblak1.getCost());
        System.out.println("Order 2 : " + seblak2.getDescription()+ " \n" + "Total Harga : " + seblak2.getCost());
        System.out.println("Order 3 : " + seblak3.getDescription()+ " \n" + "Total Harga : " + seblak3.getCost());
    }
}
