/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

/**
 *
 * @author CALY
 */
public class Enum {
    enum daysOfTheWeek {
        monday, tuesday, wednessday, thursday, friday, saturday, sunday
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        daysOfTheWeek days,days1,days2,days3,days4,days5,days6;
        days = daysOfTheWeek.monday;
        days1 = daysOfTheWeek.tuesday;
        days2 = daysOfTheWeek.wednessday;
        days3 = daysOfTheWeek.thursday;
        days4 = daysOfTheWeek.friday;
        days5 = daysOfTheWeek.saturday;
        days6 = daysOfTheWeek.sunday;
        System.out.println("days: " + "\n" + days + "\n" + days1 + "\n" + days2 + "\n" + days3 + "\n" + days4 + "\n" +days5
        + "\n" + days6);
      
        
        // TODO code application logic here
    }
    
}
