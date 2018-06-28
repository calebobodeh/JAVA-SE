/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package year.of.birth;

/**
 *
 * @author CALY
 */
import java.util.Scanner;
public class YearOfBirth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("what year were you born");
        double x=s.nextDouble();
        
        double old=(2018-x);
        System.out.println("your age is: " + old);
        // TODO code application logic here
    }
    
}
