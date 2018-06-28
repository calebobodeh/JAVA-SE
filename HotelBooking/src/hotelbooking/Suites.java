/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelbooking;

/**
 *
 * @author AMBASSADOR_CALY
 */
import java.util.*;
import static javafx.application.Platform.exit;
public class Suites {
    
    Scanner sc=new Scanner(System.in);
    double cs;
   String str;
   String quite;
    void es(){
        while(!"Y".equals(quite)){
         CustomersDetails obj=new CustomersDetails();
        System.out.println("Eko Suites\n" +
"\n" +
"Eko Suites is tucked in the most discreet part of the property with 88 large suites. The property offers a peaceful, quiet and relaxing ambience. All the suites have King size beds,"
               +"\n" + "a safety deposit box, a hairdryer, a mini bar with a working desk and most suites have a kitchenette. It is perfect for families especially because it has "
               +"\n" + "connecting rooms and even more so as the perfect lovers’ getaway.\n" +
"\n" +
"Overview : 88 Rooms\n" +
"\n" +
"    32 Deluxe Rooms\n" +
"    48 Studio Suites\n" +
"    8 Executive Suites\n" +
"");
        
          System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println("TO VIEW ACCOMMODATION DETAILS, KINDLY ENTER AN OPTION BELOW");
        System.out.println("PRESS A *** FOR DULUXE ROOM");
        System.out.println("PRESS B *** FOR STUDIO SUITE");
        System.out.println("PRESS C *** FOR EXECUTIVE SUITE");
        String es=sc.next();
       System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
     if (es.equalsIgnoreCase("A")){
       cs=80000.00;
         System.out.println("WELCOME TO DULUXE ROOM");
         System.out.println("All deluxe rooms feature a personal safe, minibar and a working desk.\n" +
"\n" +
"    Room: 29.68m2\n" +
"    Bathroom: 6.82m2\n" +
"");
         System.out.println("PRICE ***N80,000.00");
         System.out.println("Y TO PROCEED OR N TO DECLINE "+"Y/N");
                str=sc.next();
               quite = str.toUpperCase();
               if(str.equalsIgnoreCase("Y")){ 
                   //PAYMENT DETAILS
                   obj.pi();
               }
               else if(str.equalsIgnoreCase("N")){
                   System.out.println("PRESS *Y* FOR MAIN MENU "
                           + " *N* TO GO BACK TO PREVIOUS OPTION");
                str=sc.next();
           quite = str.toUpperCase();
           exit();
                 
               }
               else{
                   exit();
               }
  }
      else if (es.equalsIgnoreCase("B")){
       cs=90000.00;
         System.out.println("WELCOME TO STUDIO SUITE");
         System.out.println("The studio suite features more space with a lounge for receiving visitors,"
                +"\n" + "a personal safe, minibar, working desk and a kitchenette.\n" +
"\n" +
"    Room: 42.6m2\n" +
"    Bathroom: 5.76m2\n" +
"");
        System.out.println("PRICE ***N90,000.00");
         System.out.println("Y TO PROCEED OR N TO DECLINE "+"Y/N");
                str=sc.next();
               
               if(str.equalsIgnoreCase("Y")){ 
                   //PAYMENT DETAILS
                   obj.pi();
               }
               else if(str.equalsIgnoreCase("N")){
                   System.out.println("PRESS *Y* FOR MAIN MENU "
                           + " *N* TO GO BACK TO PREVIOUS OPTION");
                  str=sc.next();
           quite = str.toUpperCase();
           exit();
                 
               }
               else{
                   exit();
               }
  }
      else if (es.equalsIgnoreCase("c")){
       cs=102000.00;
         System.out.println("EXECUTIVE SUITE");
         System.out.println("It is a luxurious and spacious suite, suitable for the traveller seeking ultimate "
                +"\n" + "comfort whilst away from home. Large Bathroom with Separate Walk-in Shower. Tastefully decorated with a King Size Bed and a separate lounge. The room features a kitchenette, Tea-Coffee Making Facilities, Iron & Board, Safe and a Mini-Bar.\n" +
"\n" +
"    Bedroom: 39.41m2\n" +
"    Lounge: 25.74m2\n" +
"    Bathroom: 7.64m2\n" +
"");
          System.out.println("PRICE ***N90,000.00");
         System.out.println("Y TO PROCEED OR N TO DECLINE "+"Y/N");
                str=sc.next();
               
               if(str.equalsIgnoreCase("Y")){ 
                   //PAYMENT DETAILS
                   obj.pi();
               }
               else if(str.equalsIgnoreCase("N")){
                   System.out.println("PRESS *Y* FOR MAIN MENU "
                           + " *N* TO GO BACK TO PREVIOUS OPTION");
                  str=sc.next();
           quite = str.toUpperCase();
           exit();
                 
               }
               else{
                   exit();
               }
  }
      else{
     
      System.out.println("invalid command");
      //there will be a command tell you if you want to go back to the main menu or previous menu.
      System.out.println("PRESS *Y* FOR MAIN MENU "
                           + " *N* TO GO BACK TO PREVIOUS OPTION");
                   str=sc.next();
                   quite = str.toUpperCase();
                   if (str.equalsIgnoreCase("Y")){
                       //it will loop the main menu 
                       exit();
                   }
                   else if(str.equalsIgnoreCase("N")){
                       //it will take me back to the previous option
                   }
                   else{
                       exit();
                   }
 }
    }
    }
    
}
