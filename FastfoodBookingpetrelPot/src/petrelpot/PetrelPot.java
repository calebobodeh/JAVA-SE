/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the t1emplate in the editor.
 */
package petrelpot;

/**
 *
 * @author AMBASSADOR_CALY
 * */
 import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import static javafx.application.Platform.exit;


public class PetrelPot {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args, ZoneId clock) {
        int count=0;
        while(true){
        LocalDate defaultClock =LocalDate.now(clock);
        mealsAndCombos mc=new mealsAndCombos();
        sidesAndSauces sa=new sidesAndSauces();
        Drinks d=new Drinks();
        header hr=new header();
       Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO PETREL'S POT");

               System.out.println("WILL LIKE TO PLACE AN ORDER "+"Y/N");
               String str=sc.next();
               System.out.println("...................................");
               if(str.equalsIgnoreCase("Y")){  
                   count++;                                                     
                   System.out.println("YOUR CUSTOMER ID IS: "+ count+""+":"+defaultClock);
                   
               System.out.println("......................................................");
         System.out.println("Kindly Select Your Order! "+ "WE ARE 100% AT YOUR SERVICE");       
       hr.hd();
       int menu1=sc.nextInt();
        System.out.println("..............................................");
       switch(menu1){
           case 1:
              mc.mac();
            
               break;
           case 2:             
               sa.ss();
               break;
           case 3:               
               d.dnk();
               break;
           default:
               System.err.println("INVALID COMMAND");
       }
                
         
    }
   else if(str.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
    
} 
}

    }

}
