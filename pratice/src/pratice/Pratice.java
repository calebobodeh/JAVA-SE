/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int PN=1234;
       Scanner s=new Scanner(System.in);
       
        System.out.println("enter your name");
        int pn=s.nextInt();
        
        if (pn==PN) {
            System.out.println("welcome");
            
            else {
                     for (int i=0; i<=1; i++){
                    System.out.println("enter your pin");
                    int pn=s.nextInt();
                    
                    }
                    System.out.println("you failed");
                    }
        }
    }

