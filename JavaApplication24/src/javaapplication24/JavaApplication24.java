/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication24;

/**
 *
 * @author CALY
 */
import java.util.*;
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int cn=123456;
        int pw=1234;
        int balance=1000000;
        System.out.println("please enter your card number");
        int c=s.nextInt();
        if (c !=cn ){
            System.out.println("incorrect card number");
        }
        else
        {
             System.out.println("WELCOME TO ZENITH BANK ");
            System.out.println("please enter your pin");
            int p=s.nextInt();
        
             if (p !=pw){
                 System.out.println("invalid pin");
             }
             else{
                 System.out.println("please select your option");
                  System.out.println("PRESS 1 FOR ACCOUNT BALANCE");
                   System.out.println("PRES 2 FOR TRANSFER");
                    System.out.println("PRESS 3 FOR QUICKTELLER");
                     System.out.println("PRESS 4 CHANGE PIN");
                      System.out.println("PRESS 5 TO EXIT");
                      
                      int option=s.nextInt();
                      switch (option){
                          case 1:
                              System.out.println("YOU HAVE SELECTED ACCOUNT BALANCE");
                              System.out.println("PRESS 1 TO VEIW BALANCE");
                              int bl=s.nextInt();
                              System.out.println("YOUR ACOUNT BALANCE IS " + balance);
                              System.out.println("DO YOU WANT TO PERFORM ANOTHER TRANSACTION");
                              System.out.println("PRESS 1 TO CONTINUE");
                              int aa=s.nextInt();
                              System.out.println("PLEASE ENTER YOUR PIN");
                              int an=s.nextInt();
                              if (an==pw){
                                  System.out.println("WELCOME TO ZENITH BANK");
                              }
                              else{
                                  System.out.println("INVALID PIN");
                              }
                              System.out.println("PRESS 2 TO CANCEL");
                              int cl=s.nextInt();
                              System.out.println("TRANSACTION CANCELED");
                              break;
                          case 2:
                              System.out.println("YOU HAVE SELECTED TRANSFER");
                              System.out.println("PRESS 6 FOR TO TRANSFER TO ZENITH BANK");
                              int t=s.nextInt();
                              System.out.println("PLEASE ENTER THE ACCOUNT NUMBER YOU WISH TO TRANSFER TO");
                              int r=s.nextInt();
                              System.out.println("PLEASE ENTER AMOUNT");
                              int am=s.nextInt();
                                 
                              System.out.println("YOU ARE ABOUT TO TRANSFER " + am + " " + "TO" + " " + r);
                              System.out.println("PRESS 1 TO PROCEED");
                              int result=s.nextInt();
                              System.out.println("YOU HAVE SUCCESSFULLY TRANSFERED " + am + " " + "TO" + " " + r);
                        System.out.println("DO YOU WANT TO PERFORM ANOTHER TRANSACTION");
                              System.out.println("PRESS 1 TO CONTINUE");
                              int ab=s.nextInt();
                              System.out.println("PLEASE ENTER YOUR PIN");
                              int ak=s.nextInt();
                              if (ak==pw){
                                  System.out.println("WELCOME TO ZENITH BANK");
                              }
                              else{
                                  System.out.println("INVALID PIN");
                              }
                              System.out.println("PRESS 7 TO TRANSFER TO OTHER BANK");
                              int y=s.nextInt();
                              System.out.println("ENTER BANK DESTINATION");
                              break;
                              case 3:
                              System.out.println("YOU HAVE SELECTED QUICKTELLER");
                              System.out.println("PRESS 1 TO CONTINUE");
                              int aw=s.nextInt();
                              System.out.println("OUR SERVICES ARE CURRENTLY UNAVALIABLE");
                              System.out.println("DO YOU WANT TO PERFORM ANOTHER TRANSACTION");
                              System.out.println("PRESS 1 TO CONTINUE");
                              int at=s.nextInt();
                              System.out.println("PLEASE ENTER YOUR PIN");
                              int ap=s.nextInt();
                              if (ap==pw){
                                  System.out.println("WELCOME TO ZENITH BANK");
                              }
                              else{
                                  System.out.println("INVALID PIN");
                              }
                              
                              break;
                              case 4:
                              System.out.println("YOU ARE ABOUT TO CHANGE YOUR PIN");
                              System.out.println("ENTER YOUR PIN");
                             int yu=s.nextInt();
                             if (yu==pw){
                                 System.out.println("ENTER NEW PIN");
                                 int xx=s.nextInt();
                                 System.out.println("CONFIRM PIN");
                                 int xd=s.nextInt();
                                 System.out.println("YOUR PIN HAS SUCCESSFULLY BEEN CHANGE TO " + xd);
                             }
                             else{
                                 System.out.println("INCORRECT PIN");
                             }
                             System.out.println("PRESS 2 CANCEL");
                             int cnl=s.nextInt();
                             System.out.println("TRANSACTION DECLINED");
                              break;
                              case 5:
                              System.out.println("TRANSACTION DECLINED");
                              System.out.println("THANK YOU FOR BANKING WITH US");
                              break;
                      }
                      
                     
             }
        // TODO code application logic here
        
    }
    

}}