/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;

/**
 *
 * @author CALY
 */

public class Bankaccount {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        account obj = new account();
        obj.withdrawal(100);
        
        obj.deposit(50.0);
        obj.withdrawal(100.0);
        
        obj.deposit(5000);
        obj.withdrawal(200);
        
        obj.deposit(51.0);
        obj.withdrawal(100.0);
        
        obj.setCustomerName("OBODEH CALEB");
        obj.setcustomerEmail("legendcaleb@yandex.com");
        obj.setNumber("1");
        obj.setcustomerPhoneNumber("08127767680");
    }
}
