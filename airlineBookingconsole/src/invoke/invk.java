/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package invoke;

/**
 *
 * @author CALY
 */
import java.util.*;
public class invk {
    int bookingId;
           int numberOfTicket;
           Float price;
           String cabinType;
           double totalPrice;
           String Destination;
           String departuredate;
           
           
               void confirm(){
                   Scanner s=new Scanner(System.in);
                   
               System.out.println("ENTER BOOKING ID");
                        bookingId=s.nextInt();
                       System.out.println("ENTER YOUR NUMBER OF TICKET");
                       numberOfTicket=s.nextInt();
                       System.out.println("TICKET PRICE");
                       price=s.nextFloat();
                       System.out.println("ENTER CARBIN TYPE");
                       cabinType=s.next();
                       System.out.println("ENTER YOUR DESTINATION");
                       Destination=s.next();
                       System.out.println("ENTER DEPARTURE DATE");
                       departuredate=s.next();
                                                                  
                          }
               void summary(){
                   System.out.println("YOUR BOOKING ID IS: " +  bookingId);
                   System.out.println("YOUR NUMBER OF TICKET IS: " + numberOfTicket);
                   System.out.println("TICKET PRICE IS: " + price);
                   System.out.println("YOUR CARBIN TYPE IS: " + cabinType);
                   System.out.println("YOUR DESTINATION IS: " + Destination);
                   System.out.println("YOUR DEPARTURE DATE IS: " + departuredate);
                                     
               }
               void totalPrice(){
                   double totalPrice=price*numberOfTicket;
                   System.out.println("TOTAL BOOKING PRICE IS: " + totalPrice);
               }
}
