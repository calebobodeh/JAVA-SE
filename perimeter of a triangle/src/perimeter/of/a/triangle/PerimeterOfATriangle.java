/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perimeter.of.a.triangle;

/**
 *
 * @author CALY
 */
import java.util.Scanner;
public class PerimeterOfATriangle {

/**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s= new Scanner (System.in);
        
        System.out.println("enter height value");
       double a=s.nextDouble();
       
         System.out.println("enter width value");
       double b=s.nextDouble();
       
        System.out.println("enter side value");
       double c=s.nextDouble();
       
       double area=(a*b/2);
       System.out.println("area = " + area);
       
       double perimeter=(b+2*c);
       System.out.println("perimeter = " + perimeter);
    }
    
}
