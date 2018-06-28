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
public class calfunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        function m=new function();
        function m1=new function();
        function m2=new function();
        function m3=new function();
        opt:
        {  
        System.out.println("press 1 to add");
        System.out.println("press 2 to subtract");
        System.out.println("press 3 to multiply");
        System.out.println("press 4 to divide");
        int b=s.nextInt();
        switch (b) {
            case 1:
                System.out.println("you have chosen addition");
                m.add();
                break;
            case 2:
                System.out.println("you have chosen subtraction");
                m.subt();
                break;
            case 3:
                System.out.println("you have chosen multiplication");
                m.mult();
                break;
            case 4:
                System.out.println("you have chosen division");
                m.div();
                break;
            default:
                System.err.println("INVALID OPERATION");
                break opt;
    }
    
}
}}