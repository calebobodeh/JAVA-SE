/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqroot;

/**
 *
 * @author CALY
 */
public class Sqroot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // double a=3.0, b=4.0;
      // double c=Math.sqrt(a*a + b*b);
      //  System.out.println("hypotenuse is :" + c);
      
      for (int i=0; i<10; i++){
          System.out.print(i + " ");
          if (i%2 == 0) continue;
          System.out.println(" ");
      }
    }
    
}
