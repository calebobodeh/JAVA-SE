/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chicalc;

/**
 *
 * @author CALY
 */
import java.util.*;
public class function {
   Scanner s=new Scanner(System.in);
   double x,y;
    void add(){
        System.out.println("enter a number you wish to add");
        x=s.nextDouble();
        System.out.println("enter your second number");
        y=s.nextDouble();
     double   sum=x+y;
        System.out.println( sum);
    }
    void subt(){
        System.out.println("enter a number you wish to subtract");
        x=s.nextDouble();
        System.out.println("enter your second number");
        y=s.nextDouble();
     double   sub=x-y;
        System.out.println( sub);
    }
    void mult(){
        System.out.println("enter a number you wish to multiply");
        x=s.nextDouble();
        System.out.println("enter your second number");
        y=s.nextDouble();
     double   mult=x*y;
        System.out.println(mult);
    }
    void div(){
        System.out.println("enter the numerator");
        x=s.nextDouble();
        System.out.println("enter the denorminator");
        y=s.nextDouble();
     double   div=x/y;
        System.out.println(div);
    }
}
