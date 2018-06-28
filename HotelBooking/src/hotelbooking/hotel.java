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
public class hotel {
    Scanner sc=new Scanner(System.in);
    double cs;
    String str;
     String quite;
    void eh(){
         while(!"Y".equals(quite)){
        CustomersDetails obj=new CustomersDetails();
        System.out.println("EKO HOTEL");
        System.out.println("Eko Hotel\n" +
"\n" +
"Eko Hotel rooms and its suites are decorated designed for your comfort and relaxation. All the rooms have large balconies and beautiful views of either the city or the Atlantic Ocean; "
              +"\n"  + "our friendly and professional staff are always a phone call away to assist you with anything you may need. Eko Hotel is the main building on our property and it"
               +"\n" + " houses most of the attractive features which Eko Hotels & Suites has become known for. These include 447 rooms, a spectacular swimming pool, the Sky Restaurant"
               +"\n" + " & Lounge, Crossroads Tex-Mex Restaurant, Red Chinese Restaurant & Lounge, the Kuramo sports cafe, the Calabash Bar, Lagoon Breeze Restaurant and a thai "
              +"\n"  + "restaurant coming soon; a world-class gym; steam rooms; a massage parlour; a medical clinic, the Art21 Gallery, a bookstore; several lounges; a business centre"
              +"\n"  + " and state-of-the-art conferencing and banqueting facilities.\n" +
"\n" +
"Overview: 447 Rooms\n" +
"\n" +
"    201 Classic Superior Rooms\n" +
"    221 Atlantic Superior Rooms\n" +
"    20 Classic Suites\n" +
"    4 Diplomatic Suites\n" +
"    1 Presidential Suite\n" +
"");
        System.out.println("TO VIEW ACCOMMODATION DETAILS, KINDLY ENTER AN OPTION BELOW");
        System.out.println("PRESS A *** FOR CLASSIC SUPERIOR ROOM");
        System.out.println("PRESS B *** FOR PREMIUM SUITE");
        System.out.println("PRESS C *** FOR SIGNATURE SUITE");
        System.out.println("PRESS D *** FOR PRESIDENTIAL SUITE");
        String es=sc.next();
       System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
  if (es.equalsIgnoreCase("A")){
       cs=11000.00;
       System.out.println("WELCOME TO CLASSIC SUPERIOR ROOM");
       System.out.println("    Description\n" +
"\n" +
"Standard Rooms with marble floors and a great view of the City with smoking or non – smoking rooms available.\n" +
"\n" +
"    Room – 19.47 2\n" +
"    Bedroom – 4.73 2\n" +
"    Balcony – 4.31 2\n" +
"    Spacious room equipped with working desk\n" +
"    Panoramic view of Victoria Island\n" +
"    High speed internet connection\n" +
"    King size bed – space and comfort and plenty of space if joined by spouse\n" +
"    42” LCD Flat Screen TVs\n" +
"    Safe deposit box\n" +
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
       cs=120000.00;
       System.out.println("WELCOME TO ATLANTIC SUPERIOR ROOM");
       System.out.println("    Description\n" +
"\n" +
"Standard rooms with marble floors and a great view of the Atlantic with smoking or non – smoking rooms available.\n" +
"\n" +
"    Room – 19.47 m2\n" +
"    Bathroom – 4.73 m2\n" +
"    Balcony – 4.62 m2\n" +
"    Room equipped with working desk\n" +
"    Breath-taking view of the Atlantic Ocean.\n" +
"    High speed internet connection\n" +
"    King size bed – space and comfort and plenty of space\n" +
"    Take the sun sit outdoors without leaving the room on the balcony\n" +
"    42” LCD TVs\n" +
"");
        System.out.println("PRICE ***N120,000.00");
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
       cs=135000.00;
        System.out.println("WELCOME TO ATLANTIC CLASSIC SUITE");
        System.out.println("    Description\n" +
"\n" +
"Our Classic Suites are standard rooms with extra space for your comfort. They have separate living rooms that are ideal for meetings.\n" +
"\n" +
"    Lounge – 19.10 m2\n" +
"    Bedroom – 20.19 m2\n" +
"    Bathroom 4.73 m2\n" +
"    Balcony – 4.31 m2\n" +
"    TV’s can watch from lounge during day without having to sit on bed\n" +
"    Watch /TV in bedroom at night when relaxing\n" +
"    Privacy for meetings\n" +
"    Extra space when staying for long term\n" +
"    High speed internet\n" +
"    42” LCD Flat Screen TVs\n" +
"");
        System.out.println("PRICE ***N120,000.00");
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
       cs=145000.00;
        System.out.println("WELCOME TO DIPLOMATIC SUITES");
        System.out.println("    Description\n" +
"\n" +
"The Diplomatic Suites are stately with ostentatious designs and breath-taking views of the Atlantic. The suite has a DVD Player, Hi Definition LED TVs, and a separate lounge, bar and dining area for guests. It has an adjoining standard room that makes it perfect for a large family.\n" +
"\n" +
"    Lounge/Lobby/Bar – 73.67m2\n" +
"    Bedroom 29.50m2\n" +
"    Bathroom 7.78m2\n" +
"    Guest Toilet – 4.24m2\n" +
"    Balcony – 23.20m2\n" +
"    Kitchenette- for convenience when staying long term or for entertaining guest/clients\n" +
"    Equipped with refrigerator/micro wave and utensils\n" +
"    High speed internet\n" +
"    Bar in lounge area for serving your guests\n" +
"    Separate for personal space\n" +
"    Comfortable sofas & chairs for formal or informal meetings\n" +
"    DVD player for your light entertainment\n" +
"    Multi channels satellite TV various languages\n" +
"    42” LCD Flat Screen TVs\n" +
"");
         System.out.println("PRICE ***N145,000.00");
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
  else if (es.equalsIgnoreCase("E")){
       cs=15000.00;
        System.out.println("WELCOME TO PRESIDENTIAL SUITES");
        System.out.println("    Description\n" +
"\n" +
"The most extraordinary suite in Lagos especially because of its magnificent views of the beautiful city of Lagos and the Atlantic Ocean. It has an exceptionally regal layout and is most suitable for hosting very important personalities. It is more than four times the size of a superior bedroom and has a Lounge and bar area, Working / dining area, large screen TVs, hi-fi stereo system and luxurious bathroom with a Jacuzzi and shower. It can accommodate an extra bed. The suite comes with full complimentary bar and VIP gifts.\n" +
"\n" +
"    Main Lobby (Entrance) – 13.44m2\n" +
"    Lounge/Dining/Bar/Office – 127.32m2\n" +
"    Kitchen – 8.30m2\n" +
"    Bedroom – 45.11m2\n" +
"    Bathroom – 25.00m2\n" +
"    Guest Toilet – 3.86m2\n" +
"    Balcony (Dinning) – 13.47m2\n" +
"    Balcony (Living) 15.22m2\n" +
"    Balcony (Bedroom) – 11.95m2\n" +
"    Other Balconies – 2.61m2\n" +
"");
         System.out.println("PRICE ***N150,000.00");
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
