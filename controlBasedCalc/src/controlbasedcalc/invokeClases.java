/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbasedcalc;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author HP
 */
public class invokeClases {
    Scanner sc =new Scanner(System.in);
    void methods(){
        System.out.println("PRESS 1 FOR  Adding, subtracting, Multiplication, Division. ");
        System.out.println("PRESS 2 TO EXIT THE CALCULATOR");
        int mm=sc.nextInt();
        switch (mm){
            case 1:
                class1 obj=new class1();
                System.out.println("PRESS 1 FOR ADDITION");
                System.out.println("PRESS 2 FOR SUBTRACTION");
                System.out.println("PRESS 3 FOR MULTIPLICATION");
                System.out.println("PRESS 4 FOR DIVISION");
                System.out.println("PRESS 5 TO RETURN TO MAIN MENU");
                int mm1=sc.nextInt();
                switch(mm1){
                    case 1:
                        obj.Adition();
                        break;
                         case 2:
                             obj.Subtraction();
                        break;
                         case 3:
                            
                        break;
                         case 4:
                             obj.Division();
                        break;
                         case 5:
                             exit();
                        break;
                         default:
                             System.out.println("INVALID OPERATION");
                             
                }
                break;
            case 2:
                break;
                 default:
                             System.out.println("INVALID OPERATION");
        }
    }
}
