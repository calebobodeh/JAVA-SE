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

public class sidesAndSauces {
   Scanner sc=new Scanner(System.in);
   String sas;
   String sdm;
    void ss(){
        int sds;
       System.out.println("HERE ARE OUR SIDES AND SAUCES, KINDLY MAKE YOUR CHOICES");
            System.out.println("YOUR SATISFACTION IS OUR INTEREST");
        System.out.println("ENTER 1 ...CHICKEN PIE----------------------------N350");
        System.out.println("ENTER 2 ...MEAT PIE-------------------------------N350");
        System.out.println("ENTER 3 ...AMMA-JAMMA SPAGETI---------------------N450");
        System.out.println("ENTER 4 ...MOIN-MOIN------------------------------N300");
        System.out.println("ENTER 5 ...COLESLAW-------------------------------N300");
        System.out.println("ENTER 6 ...PASTA SALAD----------------------------N300");
        System.out.println("ENTER 7 ...RICE AND BEANS-------------------------N600");
        System.out.println("ENTER 8 ...SPICY RICE-----------------------------N450");
        System.out.println("ENTER 9 ...FRIED RICE-----------------------------N450");
        System.out.println("ENTER 10...CHIPS----------------------------------N700");
        System.out.println("ENTER 11...EXTRA SAUCE----------------------------N100");
        System.out.println("ENTER 12...AMMA-JAMMA RODO SAUCE------------------N950");
        System.out.println("ENTER 13...AMMA-JAMMA SHITOR SAUCE----------------N950");
        int s=sc.nextInt();
        switch (s){
            case 1:
                sdm="CHICKEN PIE";
                sds=350;
                System.out.println("YOU MADE A NICE CHOICE "+sdm);
                 System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                  break;
            case 2:
                 sdm="MEAT PIE";
                 sds=350;
                System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;
            case 3:
                sdm="AMMA-JAMMA SPAGETI";
                 sds=450;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;
            case 4:
                sdm="MOIN-MOIN";
                 sds=300;
                System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break;
            case 5:
                sdm="COLESLAW";
                sds=300;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
               System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 6:
                sdm="PASTA SALAD";
                sds=300;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
               System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 7:
                sdm="RICE AND BEANS";
                sds=300;
                System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 8:
                sdm="SPICY RICE";
                 sds=450;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 9:
                sdm="FRIED RICE";
                 sds=450;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 10:
                sdm="CHIPS";
                sds=700;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 11:
                sdm="EXTRA SAUCE";
                sds=100;
                System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 12:
                sdm="AMMA-JAMMA RODO SAUCE";
                sds=950;
                System.out.println("YOU MADE A NICE CHOICE "+sdm);
              System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
            case 13:
                sdm="AMMA-JAMMA SHITOR SAUCE";
                sds=950;
                 System.out.println("YOU MADE A NICE CHOICE "+sdm);
                System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        sas=sc.next();
               if(sas.equalsIgnoreCase("Y")){
                   System.out.println("SUCCESSFUL");
                   System.out.println("YOUR ORDER IS: "+sdm);
                   System.out.println("YOUR BILL IS: "+sds);
               }
               else if (sas.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
                    }
                break; 
        }
}
}
