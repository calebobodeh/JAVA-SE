/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qqq;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Qqq {

    /**
     * @param args the command line arguments
     */
     class motocycle {
            String make;
            String color;
            boolean enginestate;
        }
    public static void main(String[] args) {
         boolean enginestate = true;
       if (enginestate==true) 
            System.out.println("the engine is already on");
       else {
           enginestate=false;
           System.out.println("the engine is already off");
       }
    }
    
}

