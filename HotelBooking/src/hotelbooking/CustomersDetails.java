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
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.regex.*;
import java.util.*;
import static javafx.application.Platform.exit;
import static javax.management.Query.match;
import static jdk.nashorn.internal.objects.NativeString.match;
import static sun.security.util.HostnameChecker.match;
public class CustomersDetails {
    Scanner sc=new Scanner(System.in);
    String pyi;
     String quite;
     String dtf;
     String str;
    void pi(){
     // while("N".equals(quite)){
        System.out.println("PLEASE PROVIDE THE BELOW DETAILS");
        System.out.println("PERSONAL INFORMATION");
        System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
        System.out.println("First Name");
        String fn=sc.nextLine();
        System.out.println("Middle Initial");
         String mi=sc.nextLine();
        System.out.println("Last Name");
         String ln=sc.nextLine();
        System.out.println("E-mail Address");
         String em=sc.nextLine();
        System.out.println("Retype Your E-mail Address");
       String   rem=sc.nextLine();
   
        System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
     System.out.println("ADDRESS");
      String ads=sc.nextLine();
        System.out.println("Company Name");
         String cn=sc.nextLine();
        System.out.println("Country");
         String c=sc.nextLine();
     //   System.out.println("Address");
        
        System.out.println("City");
         String ct=sc.nextLine();
        System.out.println("State/Province");
         String sp=sc.nextLine();
      
        System.out.println("Mobile Phone in this formatt 999-999-9999\");");
        String mp=sc.next();
         System.out.println("BOOKING IN DATE( mm/dd/yyyy )");
         String bd=sc.next();
        System.out.println("BOOKING OUT DATE ( mm/dd/yyyy )");
        String exd=sc.next();

         System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************"); 
        System.out.println("PRESS Y TO PROCCEED / N TO PREVIOUS MENU");
          str=sc.next();
 
           if(str.equalsIgnoreCase("Y")){  
         System.out.println("PLEASE VERIFY YOUR INFORMATION");
         System.out.println("NAME: ******************** "+ln+" "+mi+" "+fn);
         System.out.println("EMAIL ADDRESS: *********** "+em);
         System.out.println("ADDRESS: ***************** "+ads);
         System.out.println("COMPANY NAME: ************ "+cn);
         System.out.println("COUNTRY: ***************** "+c);
         System.out.println("CITY: ******************** "+ ct);
         System.out.println("STATE/PROVINCE: ********** "+sp);
         System.out.println("MOBILE PHONE: ************ "+mp);
         System.out.println("BOOKING DATE: ************ "+bd +" "+" TO"+" "+exd);       
                System.out.println("PRESS Y TO PROCCEED / N TO PREVIOUS MENU");
                 str=sc.next(); 
             if(str.equalsIgnoreCase("Y")){
                 System.out.println("PAYMENT DETAILS");
             } 
             else {
                 exit();
             }
           }
                
                  else {
                      exit();
                  }
}
}
//}