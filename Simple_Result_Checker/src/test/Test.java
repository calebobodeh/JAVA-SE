/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Test {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int result=50;
        Scanner s = new Scanner(System.in);
        System.out.println("please enter your score");
        int r=s.nextInt();
        if (r > 50)
        {
            System.out.println("you passed");
        }
        else {
            System.out.println("you failed");
        }
        // TODO code application logic here
    }
    
}
