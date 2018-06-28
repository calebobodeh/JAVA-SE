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

/**
 *
 * @author CALY
 */
public class Bdp  {
    int BAL=200;
    int tmb=50, smb=100, thmb=200,tfmb=300, sfmb=500;
    int opf=1000, tpf=1500,trpf=2000,fpf=2500,spf=3000;
    
    Scanner s=new Scanner(System.in);
    
    public void plan ()  {
        
    Back:{
   
       // String v=s.next();
       // Bdp myca=new Bdp();
        System.out.println("1 Daily/Weekly Plans");
        System.out.println("2 Monthky Plans");
        System.out.println("3 Mega Plans");
        System.out.println("4 Postpaid Data Plans");
        System.out.println("5 Social Plans");
        System.out.println("# To Go Back");
        System.out.println("0 Main Menu");
    
    
      
       String opt=s.next();
        switch (opt){
            case "1":
                System.out.println("1 20MB/N50/Daily");
                System.out.println("2 75MB/N100/Daily");
                System.out.println("3 200MB/N200/3dys");
                System.out.println("4 350MB/N300/7dys");
                System.out.println("5 750MB/N500/14dys");
                System.out.println("# To Go Back");
                System.out.println("0 Main Menu");
                int i=s.nextInt();
                
                    
                   switch (i) {
                    case 1:
                        if (BAL>=tmb ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 20mb");
                        double AV=BAL-tmb;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                    case 2:
                        if (BAL>=smb ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 75mb");
                        double AV=BAL-smb;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break; 
                    case 3:
                     if (BAL>=thmb ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 200mb");
                        double AV=BAL-thmb;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break; 
                    case 4:
                        if (BAL>=tfmb ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 350mb");
                        double AV=BAL-tfmb;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                    case 5:
                        if (BAL>=sfmb ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 750mb");
                        double AV=BAL-sfmb;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                      
                
                    
                }
                   break;
                
                
            case "2":
                System.out.println("1 1.5GB/N1000/30dys");
                System.out.println("2 2.5GB+1GB Bonus (1AM-7AM)/N1500");
                System.out.println("3 3.5GB/N2000/30dys");
                System.out.println("4 5.5GB/N2500/30dys");
                System.out.println("5 6.5GB/N3000/30dys");
                System.out.println("* Next");
                System.out.println("# To Go Back");
                System.out.println("0 Main Menu");
                int p=s.nextInt();
                switch (p) {
                    case 1:
                        if (BAL>=opf ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 1.5GB");
                        double AV=BAL-opf;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                    case 2:
                        if (BAL>=tpf ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 2.5GB");
                        double AV=BAL-tpf;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                    case 3:
                        if (BAL>=trpf ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 3.5GB");
                        double AV=BAL-trpf;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break; 
                    case 4:
                        if (BAL>=fpf ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 6.5GB");
                        double AV=BAL-fpf;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                    case 5:
                        if (BAL>=spf ) {
                              
                               System.out.println("YOUR ACCOUNT HAS BEEN CREDITED WITH 6.5GB");
                        double AV=BAL-spf;
                        System.out.println("AVAILABLE BALANCE IS:" + "N" + AV);
                        
                }
                        else {
                 System.err.println("INSUFFICIENT FUNDS, PLEASE RECHARGE AND TRY AGAIN");
                }
                     break;  
                }
                break;
            case "3":
                System.out.println("1 25GB/N10000/30days");
                System.out.println("2 40GB/N15000/30days");
                System.out.println("3 60GB/N20000/30days");
                System.out.println("# To Go Back");
                System.out.println("0 Main Menu");
                int j=s.nextInt();
                break;
            case "4":
                System.out.println("1 monthly Plans");
                System.out.println("2 Mega Plans");
                System.out.println("3 Data Bundle Top Up");
                 System.out.println("# To Go Back");
                System.out.println("0 Main Menu");
                int h=s.nextInt();
                 break;
            case "5":
                System.out.println("1 All Social plans");
                System.out.println("2 WhatsApp Daily Plan");
                System.out.println("WhatsApp plus Plans");
                System.out.println("Free Basics");
                System.out.println("# To Go Back");
                System.out.println("0 Main Menu");
                int k=s.nextInt();
                 break;
            case "#":
                break Back;
            default:
                System.err.println("INVALID OPERATION");
        }
        
    }

    //void plan() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
}
}
