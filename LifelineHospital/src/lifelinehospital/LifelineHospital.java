/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lifelinehospital;

import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author HP
 */
public class LifelineHospital {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        ExistingDoctor med=new ExistingDoctor();
        System.out.println("WELCOME TO LIFELIINE HOSPITAL");
        System.out.println("PRESS 1 -------------TO REGISTER A DOCTOR");
        System.out.println("PRESS 2 -------------FOR AVAILABLE DOCTORS");
        System.out.println("PRESS 3 -------------T0 VIEW THE ENTIRE LIST OF DOCTORS");
        System.out.println("PRESS 4 -------------TO EXIT");
        int opt=sc.nextInt();
       switch(opt){
           case 1:
               med.rdoc();//method for doc reg
               break;
           case 2:
               System.out.println("SEARCH FOR AVAILABLE DOCTORS");
               med.DocType(); //method for doc reg
               System.out.println("PLEASE SELECT THE DOCTOR YOU WANT TO SEE");
               int see=sc.nextInt();
               if (see==1){
                   med.Allg();
               }
               else if (see==2){
                   med.Ang();
               }
                else if (see==3){
                   med.Alt();
               }
                else if (see==4){
                  med.Cdg();
               }
                else if (see==5){
                  med.CEG();
               }
                else if (see==6){
                  med.Dlt();
               }
                else if (see==7){
                  med.Eed();
               }
                else if (see==8){
                  med.Ecg();
               }
                else if (see==9){
                  med.epd();
               }
                else if (see==10){
                  med.fmp();
                }
                else {
                    System.err.println("INVALID COMMAND");
                    exit();
                }
               break;
           case 3:
               med.list();
               break;
           case 4:
               exit();
               break;
    }
    }
    
}
