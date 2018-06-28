/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;

/**
 *
 * @author CALY
 */
import java.util.*;
public class NestedIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("enter a number");
        int num = input.nextInt();
        
        if (num % 3 == 0){
            System.out.println("inside outer if block");
            
            if (num % 5 == 0) {
                System.out.println("number is divisible by 3 and 5");
            }
            else {
                System.out.println("number is divisible by 3, but not by 5");
            
            }}
            else 
                 {
                    System.out.println("number is not divisible by 3");
                    }
        }
        }
        // TODO code application logic here
    



