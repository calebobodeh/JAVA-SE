/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphaAirlines;

import java.util.*;

/**
 *
 * @author CALY
 */
public class booking {
           int bookingId;
           int numberOfTicket;
           double price;
           String cabinType;
           double totalPrice;
           String Destination;
           String departuredate;
    
           booking () {
               bookingId=100;
               numberOfTicket=3;
               price=5000;
              
               Destination="china";
                cabinType="Gold";
                departuredate="03/2018/01";
                
           }
           void totalPrice() {
               
                totalPrice=price*numberOfTicket;
                System.out.println("your total ticket is :" + totalPrice);
           }
           void ticketConfirmation(){
               
               System.out.println("HERE ARE YOUR FLIGHT DETAILS FOR YOUR CONFIRMATION");
               booking obj=new booking();
               System.out.println("YOUR BOOKINGID IS:" + obj.bookingId);
               System.out.println("YOUR NUMBER OF TICKET IS :" + obj.numberOfTicket);
               System.out.println("tickect price is:" + obj.price);
               System.out.println("your destination is:" + obj.Destination);
               System.out.println("your carbin type is:" + obj.cabinType);
               System.out.println("your departure date is :" + obj.departuredate);
                        
           }
}
