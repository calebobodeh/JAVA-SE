/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package label;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Label {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int PIN=1234;
    int   BAL=100000;
       Scanner s=new Scanner(System.in);
        System.out.println("enter pin");
        int p=s.nextInt();
        login:
        if (p==PIN){
            System.out.println("welcome");
                           System.out.println("PLEASE SELECT YOUR OPTION");
              System.out.println("PRESS 1 FOR ACCOUNT BALANCE");
                   System.out.println("PRES 2 FOR TRANSFER");
                    System.out.println("PRESS 3 FOR QUICKTELLER");
                     System.out.println("PRESS 4 CHANGE PIN");
                      System.out.println("PRESS 5 TO EXIT");
                   int   option=s.nextInt();
          
           opt:
                      switch (option) {
                          case 1:
                              System.out.println("balance is" + BAL);
                              System.out.println("do you want to perform another transaction");
                              System.out.println("press 1 to continue");
                              System.out.println("press 2 to exit");
                              System.out.println("press 3 to go back to main menu");
            {
                int optio=s.nextInt();
                op:
                switch (optio) {
                    case 1:
                        System.out.println("your balance is " + BAL);
                    case 2:
                        System.out.println("thanks");
                    case 3:
                        do {
                                        System.out.println("PLEASE SELECT YOUR OPTION");
              System.out.println("PRESS 1 FOR ACCOUNT BALANCE");
                   System.out.println("PRESS 2 FOR TRANSFER");
                    System.out.println("PRESS 3 FOR QUICKTELLER");
                     System.out.println("PRESS 4 CHANGE PIN");
                      System.out.println("PRESS 5 TO EXIT");
                      
                      
                        }
                        while (p<=2);
                        break;
                        
                }
            }
                      }
                      
                  
}
        else {
            System.out.println("invalid operation");
            break login;
        } 
    }}
