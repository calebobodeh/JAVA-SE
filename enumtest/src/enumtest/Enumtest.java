/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumtest;

/**
 *
 * @author CALY
 */
public class Enumtest {
enum dof {monday, tuesday, wednessday, thursday, friday, saturday, sunday}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        dof d1,d2,d3,d4,d5,d6,d7;
        d1=dof.monday;
        d2=dof.tuesday;
        d3=dof.wednessday;
        d4=dof.thursday;
        d5=dof.friday;
        d6=dof.saturday;
        d7=dof.sunday;
        System.out.println("days of the week: " + d1 + "\n" + d2 + "\n" + d3 + "\n" + d4 + "\n" + d5 + "\n" + d6 + "\n" + d7);
        // TODO code application logic here
    }
    
}
