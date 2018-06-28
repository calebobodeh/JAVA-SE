/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infinitloop;

/**
 *
 * @author CALY
 */
public class Infinitloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // note this code is a virus
       // for (; ; ){
        //    System.out.println("infinite loop");
       // }
       
 
       //nested loop
       int row, col;
            for (row=1; row<=5; row++)
            {
            for (col=1; col<=row; col++) 
            {
               System.out.print("*");
               
             }
           System.out.println();
       }
        
    }
    
}
