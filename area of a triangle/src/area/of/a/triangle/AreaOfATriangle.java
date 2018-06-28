/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.a.triangle;

/**
 *
 * @author CALY
 */
import java.util.Scanner;
public class AreaOfATriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s= new Scanner (System.in);
       
        System.out.println("Enter the width of the Triangle:");
        double b= s.nextDouble();
        
        
        System.out.println("Enter the side of the Triangle:");
        double a= s.nextDouble();
       
        System.out.println("Enter the height of the Triangle:");
        double h= s.nextDouble();
        
//Area = (width*height)/2
        double area=(b*h)/2;
                 System.out.println("Area of Triangle is: " + area);
      //Perimeter = (width+(2*side))
        double perimeter=(b+2*a);
                 System.out.println("perimeter of Triangle is: " + perimeter);
                 
        // TODO code application logic here
        
    }
    
}
