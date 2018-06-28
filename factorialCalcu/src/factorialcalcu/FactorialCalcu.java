/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorialcalcu;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class FactorialCalcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A VALUE TO GET THE FACTORIAL RESULTS");
        int adn=sc.nextInt();
        double tt = 1;
        for (int i=1; i<=adn; i++){
            tt=i*tt;
            //double rt =+tt;
             //System.out.println("YOUR FACTORIAL RESULTS IS : "+adn+" = "+tt);
        }
        System.out.println("result is : "+tt);
    }  
}
