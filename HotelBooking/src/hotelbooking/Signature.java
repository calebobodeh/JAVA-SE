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
public class Signature {
    Scanner sc=new Scanner(System.in);
    String quite;
    void eko_signature(){
        while(!"Y".equals(quite)){
        CustomersDetails obj=new CustomersDetails();
       
        String str; //scanner for "Y/N"
        double cs; //scanner for the signature class
            
        
        System.out.println("Eko Signature\n" +
"\n" +
"Caring comes easily to those of us who are privileged to cater to you at Eko Signature. The vibrant colours of the furnishing indulges you. Our suites embody elegance "    +
"\n" + "that expresses the art of simple luxury; one whose soft warm embrace can’t wait to relax you. With a bold contemporary style, the rooms are tastefully designed with the"
 + "\nprofessional executive in mind.\n" +
"\n" +
"Overview\n" +
"\n" +
"    171 Suites\n" +
"    146 Club Suites\n" +
"    9 Premium Suites\n" +
"    15 Signature Suites\n" +
"    1 Presidential Suite\n" +
"");
        System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println("TO VIEW ACCOMMODATION DETAILS, KINDLY ENTER AN OPTION BELOW");
        System.out.println("PRESS A *** FOR CLUB SUITE");
        System.out.println("PRESS B *** FOR PREMIUM SUITE");
        System.out.println("PRESS C *** FOR SIGNATURE SUITE");
        System.out.println("PRESS D *** FOR PRESIDENTIAL SUITE");
       //ystem.out.println("PRESS Z *** TO RETURN TO MAIN MENU");
        String es=sc.next();
       System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
  if (es.equalsIgnoreCase("A")){
      
       cs=48000.00;
      System.out.println("The smallest of the suites at Eko Signature but by no means the least. The suite has views of both the Atlantic and the city of Lagos, minibar, a lounge for visitors, king sized beds, "
              + "\n"+"nespresso machines, Internet protocol TVs, bath tub and separate walk-in shower, complimentary internet and breakfast. Each Club suite is designed with luxury in mind, amenities by "
              + "\n"+"Pascal Morabito and furnishings by Philippe Hurel. Daily turndown is available in all suites.\n" +
"\n" +
"    Room: 40.44m2\n" +
"    Bathroom: 10.11m2\n" +
"");
      System.out.println("PRICE ***N48,000.00"); 
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
  else if (es.equalsIgnoreCase("B")){
       cs=55000.00;
      System.out.println("PREMIUM SUITE");
      System.out.println("This suite offers all the trims of the club suite but with a separate lounge and visitor’s toilet. Rooms have 2 Internet Protocol Tvs, minibar, a toilet for visitors, nespresso machines,"
               +"\n"+" bath tub with separate walk-in power showers, amenities by Pascal Morabito and automatic climate controlled air conditioning.\n" +
"\n" +
"    Room + Lounge: 59.76m2\n" +
"    Bathroom: 8.51m2\n" +
"    Guest Toilet: 2.19m2\n" +
"");
      System.out.println("PRICE ***N55,000.00");
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
  
 else if (es.equalsIgnoreCase("C")){
      cs=60000.00;
      System.out.println("SIGNATURE SUITE");
      System.out.println("Signature Suites feature a lounge for visitors, 2 Internet Protocol TVs, a nesperesso machine, automated minibar, a toilet for visitors, walk-in power shower with separate bath tub"
              + "\n"+"and a butler service on request.\n" +
"\n" +
"    Room + Lounge: 80.48m2\n" +
"    Bathroom: 9.44m2\n" +
"    Guest Toilet: 2.19m2\n" +
"");
      System.out.println("PRICE ***N60,000.00");
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
 else if (es.equalsIgnoreCase("D")){
      cs=65000.00;
      System.out.println("PRESIDENTIAL SUITE");
      System.out.println("For luxury redefined, the Signature Presidential Suite offers that and much more. With a foyer, 2 separate lounges, a dining area, library, kitchenette, 2 guest toilets, a Jacuzzi,"
              + "\n"+" walk-in shower, 2 LED TVs, one Hi-DEF 96” LED Screen.\n" +
"\n" +
"    Foyer (Security): 16.242\n" +
"    Lobby: 2.052\n" +
"    Toilet (Security): 2.712\n" +
"    Kitchenette: 5.532\n" +
"    Lounge: 91.232\n" +
"    Guest Toilet: 2.732\n" +
"    Bedroom + Bathroom: 70.632\n" +
"    Storage (Bedroom): 3.502\n" +
"");
      System.out.println("PRICE ***N65,000.00");
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
                   //else if (quite!="Y" || quite!="N"){
                     //  exit();
                  // }
                   
                   else{
                       exit();
                   }
 }
  
    }
        
    }
    
}
