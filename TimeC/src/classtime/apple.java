/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classtime;

/**
 *
 * @author CALY
 */
public class apple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        tuna obj = new tuna();
        System.out.println(obj.toMilitary());
        obj.setTime(14, 20, 15);
        System.out.println(obj.toMilitary());
        System.out.println(obj.stdTime());
    }
    
}
