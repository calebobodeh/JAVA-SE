/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifelinehospital;

import java.util.HashMap;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author HP
 */
public class ExistingDoctor {
    Scanner sc=new Scanner(System.in);
    void DocType(){
        HashMap<Integer,String> map=new HashMap<>();
       
        map.put(1, "Allergist");         System.out.println("");
        map.put(2, "Anaesthesiologist / Anasthesiologist / Anesthesiologist");
         System.out.println("");
        map.put(3, "Andrologist");
         System.out.println("");
        map.put(4, "Cardiologist");
        map.put(5, "Cardiac Electrophysiologist");
        map.put(6, "Dermatologist");
        map.put(7, "Emergency Medicine / Emergency (ER) Doctors");
        map.put(8, "Endocrinologist");
        map.put(9, "Epidemiologist");
        map.put(10, "Family Medicine Physician");
      System.out.println("WHICH OF THE SPECIALIST DO YOU WANT TO SEE");
        System.out.println(map);
      
    }
    void Allg(){
         HashMap<String,String> map1=new HashMap<>();
        
         System.out.println( map1.put("FIRST NAME:", "Dr OBODEH"));
         map1.put("LAST NAME:", "CALEB");
          System.out.println("");
         map1.put("DESIGNATION:", "Allergist".toUpperCase());
          System.out.println("");
         map1.put("ID NO.:", "0A1B354J7");
          System.out.println("");
         map1.put("JOINED:", "11-FEB-2018"); System.out.println("");
         
         System.out.println("LIFELINE HOSPITAL ALLERGIST");
         System.out.println(map1);
    }
    void Ang(){
         HashMap<String,String> map2=new HashMap<>();
         map2.put("FIRST NAME:", "Dr AHMED");
         
         map2.put("LAST NAME:", "GAME");
         map2.put("DESIGNATION:", "Anaesthesiologist / Anasthesiologist / Anesthesiologist".toUpperCase());
         map2.put("ID NO.:", "0A1B354J7");
         map2.put("JOINED:", "19-APR-2017");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Anaesthesiologist / Anasthesiologist / Anesthesiologist".toUpperCase());
         System.out.println(map2);
    }
     void Alt(){
         HashMap<String,String> map3=new HashMap<>();
         map3.put("FIRST NAME:", "Dr IFEANYI");
         map3.put("LAST NAME:", "JOHNPAUL");
         map3.put("DESIGNATION:", "Andrologist".toUpperCase());
         map3.put("ID NO.:", "0A1B354J7");
         map3.put("JOINED:", "22-JUL-2016");
        
         System.out.println("LIFELINE HOSPITAL"+" "+"Andrologist".toUpperCase());
         System.out.println(map3);
    }
     void Cdg(){
         HashMap<String,String> map4=new HashMap<>();
         map4.put("FIRST NAME:", "Dr CHRISTABEL");
         map4.put("LAST NAME:", "CHOIMA");
         map4.put("DESIGNATION:", "Cardiac Electrophysiologist".toUpperCase());
         map4.put("ID NO.:", "0A1B354J7");
         map4.put("JOINED:", "01-SEPT-2015");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Cardiac Electrophysiologist".toUpperCase());
         System.out.println(map4);
    }
      void CEG(){
         HashMap<String,String> map5=new HashMap<>();
         map5.put("FIRST NAME:", "Dr PETRL");
         map5.put("LAST NAME:", "KEZIA");
         map5.put("DESIGNATION:", "Cardiac Electrophysiologist".toUpperCase());
         map5.put("ID NO.:", "0A1B354J7");
         map5.put("JOINED:", "10-OCTOBER-2014");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Cardiac Electrophysiologist".toUpperCase());
         System.out.println(map5);
    }
      void Dlt(){
         HashMap<String,String> map6=new HashMap<>();
         map6.put("FIRST NAME:", "Dr BIGDEH");
         map6.put("LAST NAME:", "GID");
         map6.put("DESIGNATION:", "Dermatologist".toUpperCase());
         map6.put("ID NO.:", "0A1B354J7");
         map6.put("JOINED:", "14-MAR-2014");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Dermatologist".toUpperCase());
         System.out.println(map6);
    }
      void Eed(){
         HashMap<String,String> map7=new HashMap<>();
         map7.put("FIRST NAME:", "Dr FRANK");
         map7.put("LAST NAME:", "KINGBEL");
         map7.put("DESIGNATION:", "Emergency Medicine / Emergency (ER) Doctors".toUpperCase());
         map7.put("ID NO.:", "0A1B354J7");
         map7.put("JOINED:", "10-AUG-2013");
        
         System.out.println("LIFELINE HOSPITAL"+" "+"Emergency Medicine / Emergency (ER) Doctors".toUpperCase());
         System.out.println(map7);
    }
      void Ecg(){
         HashMap<String,String> map8=new HashMap<>();
         map8.put("FIRST NAME:", "Dr BUGATTI");
         map8.put("LAST NAME:", "BENZ");
         map8.put("DESIGNATION:", "Endocrinologist".toUpperCase());
         map8.put("ID NO.:", "0A1B354J7");
         map8.put("JOINED:", "08-JAN-2011");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Endocrinologist".toUpperCase());
         System.out.println(map8);
    }
       void epd(){
         HashMap<String,String> map9=new HashMap<>();
         map9.put("FIRST NAME:", "Dr J");
         map9.put("LAST NAME:", "COLE");
         map9.put("DESIGNATION:", "Epidemiologist".toUpperCase());
         map9.put("ID NO.:", "0A1B354J7");
         map9.put("JOINED:", "25-DEC-2009");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Epidemiologist".toUpperCase());
         System.out.println(map9);
    }
        void fmp(){
         HashMap<String,String> map10=new HashMap<>();
         map10.put("FIRST NAME:", "Dr KHALIFA"); 
         map10.put("LAST NAME:", "WIZZY");
         map10.put("DESIGNATION:", "Family Medicine Physician".toUpperCase());
         map10.put("ID NO.:", "0A1B354J7");
         map10.put("JOINED:", "11-NOV-2010");
         
         System.out.println("LIFELINE HOSPITAL"+" "+"Family Medicine Physician".toUpperCase());
         System.out.println(map10);
    }
      void rdoc(){ // to register new doctor
          System.out.println("WELCOME TO DOCTORS REGSTRATION PORTER");
          System.out.println("KINDLY PROVIDE YOUR REQUIRED DETAILS");
          System.out.println("FIRST NAME:");
          String fn=sc.nextLine();
          System.out.println("LAST NAME:");
          String ln=sc.nextLine();
          System.out.println("DESIGNATION:");
          String dst=sc.nextLine();
          System.out.println("ID NO:");
          String in=sc.nextLine();
          System.out.println("JOINED:");
          String jnd=sc.nextLine();
          System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          System.out.println("PLEASE VERIFY YOUR DETAILS");
          System.out.println("NAME : "+fn);
          System.out.println("LAST NAME : "+ln);
          System.out.println("DESIGNATION : "+dst);
          System.out.println("ID NO : "+in);
          System.out.println("JOINED : "+jnd);
          System.out.println("TO PROCEED, PRESS Y/N");
          String yn=sc.nextLine();
          if ("Y".equalsIgnoreCase(yn)){
              System.out.println("CONGRATULATION, YOUR REGISTRATION WAS SUCCESSFL");
          }
          else{
              System.err.println("DECLINED");
              exit();
          }
      }
     void list(){ // list of the doctors
         System.out.println("Below are the list of doctors");
         System.out.println("1. DR OBODEH CALEB "+"Allergist".toUpperCase());
         System.out.println("2. Dr AHMED GAME"+"Anaesthesiologist / Anasthesiologist / Anesthesiologist".toUpperCase());
         System.out.println("3. Dr IFEANYI JOHNPAUL "+"Andrologist".toUpperCase());
         System.out.println("4. Dr CHRISTABEL CHOIMA"+"Cardiac Electrophysiologist".toUpperCase());
         System.out.println("5. Dr PETREL KEZIA"+"Cardiac Electrophysiologist".toUpperCase());
         System.out.println("6. Dr BIGDEH GID "+"Dermatologist".toUpperCase());
         System.out.println("7. Dr FRANK KINGBELL "+"Emergency Medicine / Emergency (ER) Doctors".toUpperCase());
         System.out.println("8. Dr BUGATTI BENZ "+"Endocrinologist".toUpperCase());
         System.out.println("9. Dr J COLE"+"Epidemiologist".toUpperCase());
         System.out.println("10.Dr KHALIFA WIZZY "+"Family Medicine Physician".toUpperCase());
            
     } 
}
