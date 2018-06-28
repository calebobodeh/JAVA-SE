/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.interest;

/**
 *
 * @author CALY
 */
import java.util.Scanner;
public class SimpleInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
        
        System.out.println("please enter your prinncipal");
        double p=s.nextDouble();
        
         System.out.println("please the period in days");
        double t=s.nextDouble();
        
        final double rate=20;
        
        
        
        
        double in=((60*60*24*t)*p*rate)/100;
        System.out.println("your interest is:" + in + "%");
        // TODO code application logic here
    }
    
}
