/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

/**
 *
 * @author CALY
 */
public class Forloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, product;
        for (num=1; num<=5; num++){
            product = num * 10;
            System.out.printf("\n %d * 10 = %d", num, product);
        }
      
    }
    
}
