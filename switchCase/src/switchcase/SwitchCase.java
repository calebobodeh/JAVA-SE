/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchcase;

/**
 *
 * @author AMBASSADOR_CALY
 */
public class SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("10,000, at 2% interest = "+calculateInterest(10000.0,2.0));
        for (int i=2; i<9; i++){
             System.out.println("10,000, at"+ i+ " interest = "+calculateInterest(10000.0,i));
        }
        System.out.println("*******************************************************************");
        for (int i=8; i>=2; i--){
            System.out.println("10,000, at"+ i+ " interest = "+calculateInterest(10000.0,i));
        }
    }
    public static double calculateInterest (double amount, double interestRate){
        return(amount*(interestRate/100));
        
    }
    public static boolean isPrime(int n){
        if (n==1){
        return false;
        }
        for (int i=2; i<=n/2; i++){
       if (n % 1== 0) {
           return false;
       }
    }
        return true;
    }
}
