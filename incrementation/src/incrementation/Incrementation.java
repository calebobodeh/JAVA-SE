/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incrementation;

/**
 *
 * @author CALY
 */
public class Incrementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=10;
        // ++x;   // pre incrementation
        // System.out.println(x);
        // x++;       // post incrementation
        // System.out.println(x);
        x*=5; // x= x*5 (we can use it for mathematical operation)
        System.out.println(x);
         x+=5;
        System.out.println(x);
    }
    
}
