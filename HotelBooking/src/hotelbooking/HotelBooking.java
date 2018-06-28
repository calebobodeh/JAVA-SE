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
public class HotelBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        while(true){
          Scanner sc=new Scanner(System.in);
        // TODO code application logic here
        Signature eh=new Signature();
        Suites ehs=new Suites();
        hotel eth=new hotel();
        Gardens egb=new Gardens();
        HeaderAndFooter hf=new HeaderAndFooter();
        
      System.out.println("WELCOME TO"
               +"\n" + "EKO HOTEL & SUITES "
               +"\n" + "BOOK NOW");
        System.out.println("********************************************************************************************************************************************************************************************************************************************************************************************************************************************************************");
        System.out.println("ROOMS & RATES\n" +
"\n" +
"Eko Hotel rooms & Suites are all tastefully decorated and provided with every modern amenity for your comfort and relaxation.");
        System.out.println("STATNDARD ROOM ** CLASSIC SUPERIOR ROOM ** DELUXE ** CLUB SUITE ** EXECUTIVE SUITE ** DIPLOMATIC SUITE");   
        System.out.println("PRESS *** A *** FOR EKO SIGNATURE ");
        System.out.println("PRESS *** B *** FOR EKO SUITE");
        System.out.println("PRESS *** C *** FOR EKO HOTEL");
        System.out.println("PRESS *** D *** FOR EKO GARDENS");
        String wlc=sc.next(); 
         
        switch (wlc){
           //if(wlc.equalsIgnoreCase("A")){  
           case "A":
             
               eh.eko_signature();
        
               break;
        
       
           case "B":
               ehs.es();
               break;
                
           case "C":
               eth.eh();
               break;
           case "D":
               egb.gds();
               break;
           default:
               System.err.println("INALID OPERTION");
               break;
       }
        }
        
    }
    }
    

