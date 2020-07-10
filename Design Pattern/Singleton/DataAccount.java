/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

/**
 *
 * @author asus
 */
public class DataAccount {
    private static DataAccount dataAccount;
    private String accountNumber;   

    public static DataAccount getInstance(String accountNumber) {
        if (dataAccount == null) {
            dataAccount = new DataAccount(accountNumber);
        }
        return dataAccount;
    }
    
    private DataAccount(String accountNumber){
        this.accountNumber = accountNumber;
        System.out.println(accountNumber);
    }

    private DataAccount() { }
}
