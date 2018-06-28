/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcuserdefined;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class factorialCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A VALUE TO GET THE FACTORIAL RESULTS");
        int adn=sc.nextInt();
        for (int i=0; i<adn; i++){
            double tt=i*adn;
            System.out.println("YOUR FACTORIAL RESULTS IS : "+i);
        }
    }
    
}
