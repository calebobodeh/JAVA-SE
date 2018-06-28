/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrelpot;

/**
 *
 * @author AMBASSADOR_CALY
 */
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;
import static javafx.application.Platform.exit;

public class ppotMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int count=0;
        while(true){
        //LocalDate defaultClock =LocalDate.now();
        Date date=new Date();
        mealsAndCombos mc=new mealsAndCombos();
        sidesAndSauces sa=new sidesAndSauces();
        Drinks d=new Drinks();
        header hr=new header();
       Scanner sc=new Scanner(System.in);
            System.out.println("APP DEVELOPER...............:OBODEH CALEB CHINEDU ");
            System.out.println("DATE........................:27/04/018 - 01/5/018");
            System.out.println("........................................................");
            //System.out.println("");
System.out.println("WELCOME TO PETREL'S POT");

               System.out.println("WILL LIKE TO PLACE AN ORDER "+"Y/N");
               String str=sc.next();
               System.out.println("...................................");
               if(str.equalsIgnoreCase("Y")){  
                   count++;                                                     
                   System.out.println("YOUR CUSTOMER ID IS............: "+ count);
                   System.out.println("DATE/TIME........:"+date.toLocaleString());
                   
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
                   System.out.println("...............................................");
                   System.out.println("................................................");
                   exit();
    
} 
}

    }
    
}
