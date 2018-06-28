/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoke;

/**
 *
 * @author CALY
 */
import java.util.*;
public class reader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner s=new Scanner(System.in);
        invk objrd = new invk();
        invk objrd1 = new invk();
        invk objrd2 = new invk();
        System.out.println("WELCOME TO QUICK CODE BOOKING, PLEASE PROVIDE DETAILS ");
       
        
    
     
           
                objrd.confirm();
                System.out.println("PRESS 1 TO VEIW DETAILS");
                        System.out.println("PRESS 2 TO EXIT");
                        int nn=s.nextInt();
                switch (nn){
                    case 1:
                        System.out.println("PLEASE CONFIRM YOUR BOOKING DETAILS");
                     objrd.summary();
                     objrd.totalPrice();
                     break;
                    case 2:
                   System.exit(0);
                     break;
                    default:
                        System.err.println("INVALID OPERATION");
                }
                
                
             
                 
        }
           
                
        
        
    }
    

