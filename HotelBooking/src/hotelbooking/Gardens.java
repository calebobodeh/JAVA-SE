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
public class Gardens {
    Scanner sc=new Scanner(System.in);
    double cs;
    String str;
    String quite;
    void gds(){
        while(!"Y".equals(quite)){
        CustomersDetails obj=new CustomersDetails();
        System.out.println("Eko Gardens\n" +
"\n" +
"At Eko Gardens, the rooms are well appointed and designed to provide comfort and convenience. Besides the usual amenities such as central air conditioning, satellite TV, fast internet connection, "
              + "\n" + "a fridge and bathroom amenities of the highest quality, the guests can also have fast internet access in all the public areas through our WiFI (Wireless) network.\n" +
"\n" +
"Overview : 118 Rooms\n" +
"\n" +
"    46 Garden Classic Rooms\n" +
"    72 Garden Standard Rooms\n" +
"");
        System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println("TO VIEW ACCOMMODATION DETAILS, KINDLY ENTER AN OPTION BELOW");
        System.out.println("PRESS A *** FOR STANDARD ROOM");
        System.out.println("PRESS B *** FOR CLASSIC SUITE");
        String es=sc.next();
       System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
     if (es.equalsIgnoreCase("A")){
       cs=200000.00;
         System.out.println("    Description\n" +
"\n" +
"The garden standard rooms occupy the Left wing of Eko Gardens, has spacious rooms with large windows, fully Air-Conditioned, phone, Cable TV, fridge and a view of the city of Lagos.\n" +
"\n" +
"    Room: 25.32m2\n" +
"    Bathroom: 3.69m2\n" +
"");
         System.out.println("PRICE ***N110,000.00");
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
       cs=250000.00;
         System.out.println("    Description\n" +
"\n" +
"Taking up the entire right wing of the Gardens, the Eko garden classic room are totally refurbished spacious rooms with a mini lounge for visitors, large windows, fully air-conditioned,"
               +"\n"  + "direct dial telephone cable, TV, fridge, city view with walk-in showers.\n" +
"\n" +
"    Room: 26.50m2\n" +
"    Bathroom: 7.09m2\n" +
"");
         System.out.println("PRICE ***N110,000.00");
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
