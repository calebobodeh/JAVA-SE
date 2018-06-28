/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphaairlines;

/**
 *
 * @author CALY
 */

import java.util.*;
public class Booking {

    
           
        
           
           Booking newBooking= new Booking();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        class booking {
         int bookingId;
           int numberOfTicket;
           int price;
           String cabinType;
           int totalPrice;
           String Destination,departuredate ;
        }
           
               Scanner s=new Scanner(System.in);
               
               System.out.println("WELCOME TO OBODEH CALEB CHINEDU AIRLINE");
               System.out.println("PLEASE FILL YOUR FLIGHT DETAILS PROPERLY");
        System.out.println("ENTER BOOKING ID");
        int  bookingId = s.nextInt();
               System.out.println("ENTER NUMBER OF TICKET");
                int numberOfTicket=s.nextInt();
                System.out.println("ENTER PRICE");
                int price=s.nextInt();
                System.out.println("ENTER CABIN TYPE");
                String cabinType=s.next();
                System.out.println("ENTER YOUR DESTINATION");
                String Destination=s.next("");
                System.out.println("ENTER DEPARTURE DATE");
                String departuredate=s.next();
                      
               
            int tPrice=(numberOfTicket*price);
           
           System.out.println("PLEASE CONFIRM YOUR DETAILS");
           System.out.println("YOUR BOOKING ID IS:" +  bookingId);
           System.out.println("YOUR NUMBER OF TICKET IS: " + numberOfTicket);
           System.out.println("YOUR TICKET PRICE IS: " + price);
           System.out.println("YOUR CARBIN TYPE IS: " + cabinType);
           System.out.println("YOUR DESTINATION IS: " + Destination);
           System.out.println("YOUR DEPARTURE DATE IS: " + departuredate);
           System.out.println("TOTAL PRICE OF TICKET: " + tPrice);
              
             
    }}
    

