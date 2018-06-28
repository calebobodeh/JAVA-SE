/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop2;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Loop2 {
    
    public static void main(String[] args) {
       int PN=1234;
       Scanner s=new Scanner (System.in);
            // int counter=0;
       System.out.println("ENTER YOUR PIN");
       int  pn=s.nextInt();
            
                 if (pn==PN)
               System.out.println("WELCOME");
          
               else{
              for (int i=0; i<=1; i++){
                     
                  System.err.println("incorrect password");
                  System.out.println("ENTER YOUR PIN");
                    pn=s.nextInt();
                    //counter++;
                    //if(counter ==2)
                 
              }
               System.out.println("You Failed");
                    System.exit(0);
          }
    }
}
                  
                 
            
         
       
           
    
    
       

