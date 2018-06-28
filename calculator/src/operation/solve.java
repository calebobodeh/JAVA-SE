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
public class solve {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        option obj=new option();
        option obj1=new option();
        option obj2=new option();
        option obj3=new option();
        System.out.println("PRESS 1 TO ADD");
        System.out.println("PRESS 2 TO DIVIDE");
        System.out.println("PRESS 3 TO MULTIPLY");
        System.out.println("PRESS 4 TO SUBTRACT");
        int a=s.nextInt();
        switch (a){
            case 1:
                System.out.println("WELCOME TO ADDITION CALCULATOR");
               obj.add(); 
               break;
               case 2:
                    System.out.println("WELCOME TO DIVISION CALCULATOR");
                   obj1.div();
                   break;
               case 3:
                    System.out.println("WELCOME TO MULTIPLICATION CALCULATOR");
                   obj2.mul();
                   break;
               case 4:
                    System.out.println("WELCOME TO SUBTRACTION CALCULATOR");
                   obj3.sub();
                   break;
               default:
                   System.err.println("INVALID OPERATION");
                    break;
        }
        
        
       
    }
    
}
