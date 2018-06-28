/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petrelpot;

/**
 *
 * @author AMBASSADOR_CALY
 */
 import java.util.*;
import static javafx.application.Platform.exit;
public class Drinks {
     int drink;
     String dkn;
     String dks;
   Scanner dd=new Scanner(System.in);
    void dnk(){
        int i;
        System.out.println("HERE ARE OUR DRINKS, KINDLY MAKE YOUR CHOICES");
        System.out.println("YOUR SATISFACTION IS OUR INTEREST");
        System.out.println("ENTER 1 ...EVA WATER 75CL--------------------------------------------------N250");
        System.out.println("ENTER 2 ...COCA-COLA 50CL--------------------------------------------------N300");
        System.out.println("ENTER 3 ...COCA-COLA ZERO 50CL---------------------------------------------N300");
        System.out.println("ENTER 4 ...FANTA ORANGE 50CL-----------------------------------------------N300");
        System.out.println("ENTER 5 ...SPRITE 50CL-----------------------------------------------------N300");
        System.out.println("ENTER 6 ...FIVE ALIVE PULPY ORANGE JUICE 40CL------------------------------N400");
        System.out.println("ENTER 7 ...FIVE ALIVE------------------------------------------------------N600");
        int d=dd.nextInt();
        //if (d==1 || d<8){
        switch (d){           
            case 1:
                dkn="EVA WATER 75CL";
          drink=250;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
                 System.out.println("YOU MADE A RIGHT ORDER "+dkn);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;
            case 2:
                 dkn="COCA-COLA 50CL";
                 drink=300;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;
            case 3:
                 dkn="COCA-COLA ZERO 50CL";
               drink=300;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 4:
                 dkn="FANTA ORANGE 50CL";
                drink=300;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 5:
                 dkn="SPRITE 50CL";
                drink=300;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
                 System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 6:
                 dkn="FIVE ALIVE PULPY ORANGE JUICE 40CL";
              drink=400;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
                 System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;  
            case 7:
                 dkn="FIVE ALIVE";
              drink=600;
                System.out.println("THANK YOU FOR CHOOSING "+dkn);
               System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        dks=dd.next();
               if(dks.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+dkn);
                   System.out.println("YOUR BILL IS: "+drink);
               }
               else if (dks.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;  
            default:
                System.err.println("NO DRINK WAS SELECTED");
               System.out.println("PLEASE SELECT A DRINK");
              
        }
       // }
       // else{
       //     System.out.println("INVALID CHOICE");
       // }
    }
}
