/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

/**
 *
 * @author CALY
 */
import java.util.*;
public class option {
    Scanner s=new Scanner(System.in);
    double x,y;
    void add(){
        System.out.println("ENTER A NUMBER TO ADD");
         x=s.nextDouble();
        System.out.println("ENTER A SECOND NUMBER");
        y=s.nextDouble();
      double   sum=x+y;
        System.out.println("YOUR SUM IS :" + x + "+" + y + "=" + sum);
    }
    void sub(){
        System.out.println("ENTER YOUR FIRST NUMBER");
         x=s.nextDouble();
        System.out.println("ENTER A NUMBER YOU WISH TO SUBTRACT");
         y=s.nextDouble();
         double subt=x-y;
         System.out.println("YOUR ANSWER IS :" + x + "-" + y + "=" + subt);
    }
    void mul(){
        System.out.println("ENTER YOUR FIRST NUMBER");
         x=s.nextDouble();
        System.out.println("ENTER YOUR SECOND NUMBER");
         y=s.nextDouble();
         double mult=x*y;
         System.out.println("YOUR ANSWER IS :" + x + "*" + y + "=" + mult);
             }
    void div(){
        System.out.println("ENTER YOUR NUMERATOR");
         x=s.nextDouble();
        System.out.println("ENTER YOUR DENOMINATOR");
         y=s.nextDouble();
         double divs=x/y;
         System.out.println("YOUR ANSWER IS :" + x + "/" + y + "=" + divs);
    }
}
