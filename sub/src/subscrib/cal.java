/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subscrib;

/**
 *
 * @author CALY
 */
import java.util.*;
public class cal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cd="*141#";
        //double BAL=500.00;
        Scanner s=new Scanner(System.in);
        option mycal = new option();
        System.out.println("DAIL *141# TO VIEW OUR OFFERS");
        String c=s.next();
        
        if (c == null ? cd == null : c.equals(cd)) {
            
        
        //mycal.choose();
        mycal.choose();
        int a=s.nextInt();
       
        switch (a) {
            case 1:
           Bdp myca1 = new Bdp();
           myca1.plan();
           break;
            case 2:
                socialPlan myca2=new socialPlan();
                myca2.sPlan();
                break;
            case 3:
                ytube myca3=new ytube();
                myca3.youtube();
                break;
            case 4:
                megaplans myca4=new megaplans();
                myca4.MegaPlans();
                break;
            case 5:
                datagift myca5=new datagift();
                myca5.dgift();
                break;
            case 6:
                checkb myca6=new checkb();
                myca6.cbalance();
                break;
            default:
                System.err.println("INVALID OPERATION");
        }
       
        
        }
       else {
           System.err.println("INVALID OPERATION");
       }
        }
        
        
        
        
       
    }

    
   

