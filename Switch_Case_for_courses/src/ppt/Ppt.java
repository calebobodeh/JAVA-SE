/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppt;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Ppt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int PIN=1234;
       Scanner s=new Scanner(System.in);
        System.out.println("ENTER PIN");
        int pin=s.nextInt();
        
        if (pin==PIN) {
            System.out.println("WELCOME TO APTECH COURSES");
            System.out.println("PRESS 1 FOR JAVA");
            System.out.println("PRESS 2 FOR .NET");
            int courses=s.nextInt();
            switch (courses) {
                case 1:
                    System.out.println("PRESS 1 TO VEIW JAVA COURSES");
                    System.out.println("PRESS 2 TO EXIT");
                    int jv=s.nextInt();
                    switch (courses) {
                        case 1:
                  System.out.println("JAVA 1");
                            System.out.println("JAVA 2");
                        case 2:
                            System.exit(0);
                                    }
                case 2:
                    System.out.println("PRESS 1 TO VEIW .NET");
                    System.out.println("PRESS 2 TO EXIT");
                    int net=s.nextInt();
                    switch (courses) {
                        case 1:
                            System.out.println("ASP.NET");
                            System.out.println("C#");
                            System.out.println("VB.NET");
                        case 2:
                            System.exit(0);
                        
                    }
               
            }
            
        }
        else {
            System.err.println("INVALID PIN");
        }
         
             }
    
}
