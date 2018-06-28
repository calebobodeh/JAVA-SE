/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtbl;

/**
 *
 * @author CALY
 */
import java.util.*;
public class MultiplicationTbl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("ENTER A NUMBER TO BTW 1 TO 20");
        
        int nm=s.nextInt();
        System.out.println("ENTER THE LENGTH FOR THE TABLE");
        int j=s.nextInt();
        
        for (int i=1; i<=j; i++)
        {
            System.out.printf("%d x %d =%d", nm, i, nm*i);
        System.out.println();
            
        }
    }
    
}
