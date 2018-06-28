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
import java.time.*;
import java.util.*;
import static javafx.application.Platform.exit;


public class mealsAndCombos extends PetrelPot {
    double dk=300;
    double fdo=900;
     double wsm=1500;
     String fn;
     String dn;
     String st;
     Clock defaultClock = Clock.systemUTC();
         Scanner sc=new Scanner(System.in);
    FoodStock dnk=new FoodStock();
   // mealsAndCombos mc=new mealsAndCombos();
     header hr=new header();
    void mac(){
                    System.out.println("HERE ARE OUR MEALS AND COMBOS, KINDLY MAKE YOUR CHOICES");
            System.out.println("YOUR SATISFACTION IS OUR INTEREST");
      
       // System.out.println("..........................................................");
        System.out.println("ENTER 1 ...CITIZENS MEAL  ---------------------------N1350");
        System.out.println("ENTER 2 ...1/4 ROTISSERIE MEAL ----------------------N1400");
        System.out.println("ENTER 3 ...EXPRESS MEAL -----------------------------N1000");
        System.out.println("ENTER 4 ...CHIEF BURGER MEAL ------------------------N1,750");
        System.out.println("ENTER 5 ...WRAP STAR MEAL ---------------------------N1,500");
        System.out.println("ENTER 6 ...ZIPPY BURGER MEAL ------------------------N1000");
        System.out.println("ENTER 7 ...CRUNCHY WINGS MEAL (4 PIECES)) -----------N1,100");
        System.out.println("ENTER 8 ...CRUNCHY WINGS MEAL (6 PIECES -------------N1,400");
        System.out.println("ENTER 9...CITIZEN CRUNCHY MEAL ---------------------N1,350");        
        int m=sc.nextInt();
   // IST SWITCH CASE FOR THE ABOVE MEALS
        switch(m){
            
 case 1:
        
        dnk.drink();
        int mm=sc.nextInt();
        
        //switch case for the drinks methods
               switch (mm){
           case 1:
               System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
       }
       dnk.NaijaMeal();
       int nm=sc.nextInt();
       
       //  SWITCH CASE FOR NaijaMeal();
       switch (nm){
           
          case 1:
              System.out.println("THANKS FOR CHOOSING Chips + Chicken Pie");
              fn="Chicken Pie";
               break;
           case 2:
               
                System.out.println("THANKS FOR CHOOSING Spicy Rice + Chicken Pie");
                fn="Spicy Rice + Chicken Pie";
                break;
           case 3:
                System.out.println("THANKS FOR CHOOSING Fried Rice + Chicken Pie");
                fn="Fried Rice + Chicken Pie";
                break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Rice & Beans ");
               fn="Rice & Beans";
               break;
           case 5:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti + Chicken Pie");
               fn="Amma-Jamma Spaghetti + Chicken Pie";
               break;
           default:
               System.err.println("INVALID MEAL");
               break;
       }
       double aa=1200-dk;
       double njm=aa+dk;
       
       System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+njm);
       System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){ 
                   System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+njm);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
        break;
  // SWTCH CASE FOR THE 2ND MEAL IN THIS CLASS
 //case 1:
              //  System.out.println("THANK YOU FOR CHOOSING CITIZENS MEAL");
               // dnk.CitizenMeal();
               // int cm=sc.nextInt();
                //SWITCH CASE FOR THE CITIZENMEAL BEFORE ASKING FOR DRINK 
              // switch (cm){
              //  case 1:
              //    System.out.println("THANKS FOR CHOOSING Chips");
              //    break;
                  
          // case 2:
               
              //  System.out.println("THANKS FOR CHOOSING Spicy Rice");
              //  break;
          // case 3:
          //      System.out.println("THANKS FOR CHOOSING Fried Rice");
          //      break;
         //  case 4:
          //     System.out.println("THANKS FOR CHOOSING Rice & Beans");
          //     break;
         //  case 5:
         //      System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
         //      break;
         //  default:
         //      System.err.println("INVALID MEAL");
          //     //System.out.println("YOU TOTAL BILL IS: "+dk+fdo);
       // break;
       //        }
      //  dnk.drink();
         //    int  mc=sc.nextInt();
         //      switch(mc){
             //       case 1:
             //  System.out.println("THANKS FOR CHOOSING EVA WATER");
              // break;
              //  case 2:
              // System.out.println("THANKS FOR CHOOSING COCA-COLA");
             //  break;
             //   case 3:
              // System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
             //  break;
             //   case 4:
            //   System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
              // break;
               //case 5:
               //System.out.println("THANKS FOR CHOOSING SPRITE");
               //break;
              // default:
               //    System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                //   break;
              // }
             //  double bb=1350-dk;
             //  double ctm=bb+dk;
             //  System.out.println("YOUR TOTAL BILL IS: "+ctm);
             //  break;
    // 3RD SWITCH CASE FOR THIS CLASS            
 case 2:
                System.out.println("THANK YOU FOR CHOOSING 1/4 ROTISSERIE MEAL");
                dnk.CitizenMeal();
                int rm=sc.nextInt();
                 double rtm=1400-dk;
                //SWITCH CASE FOR THE 1/4 ROTISSERIE MEAL BEFORE ASKING FOR DRINK 
               switch (rm){
           case 1:
                System.out.println("THANKS FOR CHOOSING Spicy Rice");
                fn="Spicy Rice";
                break;
           case 2:
                System.out.println("THANKS FOR CHOOSING Fried Rice");
                fn="Fried Rice";
                break;
           case 3:
               System.out.println("THANKS FOR CHOOSING Rice & Beans");
               fn="Rice & Beans";
               break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
               fn="Amma-Jamma Spaghetti";
               break;
           default:
               System.err.println("INVALID MEAL");
        break;
               }
        dnk.drink();
               rm=sc.nextInt();
               switch(rm){
                    case 1:
               System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
                double ch=1400-dk;
                double ca=ch+dk;
       System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+ca);
      System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){ 
        System.out.println("SUCCESSFUL");           
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+ca);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
               break;
 //4TH SWITCH CASE FOR THIS CLASS
 case 3:
            dnk.CitizenMeal();
            int em=sc.nextInt();
                switch(em){
                 case 1:
                  System.out.println("THANKS FOR CHOOSING Chips");
                  fn="Chips";
                  break;
           case 2:
               
                System.out.println("THANKS FOR CHOOSING Spicy Rice");
                fn="Spicy Rice";
                break;
           case 3:
                System.out.println("THANKS FOR CHOOSING Fried Rice");
                fn="Fried Rice";
                break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Rice & Beans");
               fn="Rice & Beans";
               break;
           case 5:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
               fn="Amma-Jamma Spaghetti";
               break;
           default:
               System.err.println("INVALID MEAL");
               //System.out.println("YOU TOTAL BILL IS: "+dk+fdo);
        break;
               }
        dnk.drink();
               em=sc.nextInt();
               switch(em){
                    case 1:
               System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
               double kk=1350-dk;
               double etm=kk+dk;
               System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+etm);
       System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+etm);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
                break;
    // 5TH SWITH CASE FOR THIS CLASS           
 case 4:
                double cbm=1750-dk;
                System.out.println("THANK YOU FOR CHOOSING CHIEF BURGER MEAL");
                System.out.println("ENTER 1 ...FOR CHIEF BURGER MEAL");
                int bm=sc.nextInt();
                switch (bm){
                    case 1:
                       System.out.println("THANK YOU FOR CHOOSING CHIps");
                       fn="CHIps";
                       break;
                    default:
                        System.out.println("INVLID OPERATION");
                        break;
                }
                dnk.drink();
                bm=sc.nextInt();
                switch (bm){
                    case 1:
              System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
              double lo=1750-dk;
              double as=lo+dk;
                System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+as);
      System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){ 
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+as);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
               break;
  // 6TH SWITCH CASE FOR THIS CLASS              
 case 5:
     System.out.println("THANKS FOR CHOOSING WRAP STAR MEAL");
     System.out.println("ENTER 1 ...FOR CHIPS");
        System.out.println("ENTER 2 ...FRIED RICE");
        System.out.println("ENTER 3 ...Amma-Jamma Spaghetti");
        int sm=sc.nextInt();
        switch (sm){
           
            case 1:
            System.out.println("THANKS FOR CHOOSING FOR CHIPS");
            fn="CHIPS";
            break;
            case 2:
        System.out.println("THANKS FOR CHOOSING FRIED RICE");
        fn="FRIED RICE";
        break;
            case 3:
        System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
        fn="Amma-Jamma Spaghetti";
        break;
            default:
                System.out.println("PLEASE CHOOSE A MEAL");
                break;
        }
        dnk.drink();
        sm=sc.nextInt();
        switch (sm){
             case 1:
               System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
        }
              double lr=1500-dk;
              double rrt=lr+dk;
                System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+rrt);
       System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+rrt);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
                break;
// 7TH SWITCH CASE FOR THIS CLASS
 case 6:
     System.out.println("THANK YOU FOR CHOOSING ZIPPY BURGER MEAL");
                dnk.CitizenMeal();
                int zm=sc.nextInt();
                double zbm=1000;
                //SWITCH CASE FOR THE CITIZENMEAL BEFORE ASKING FOR DRINK 
               switch (zm){
                case 1:
                  System.out.println("THANKS FOR CHOOSING Chips");
                  fn="Chips";
                  break;
           case 2:
               
                System.out.println("THANKS FOR CHOOSING Spicy Rice");
                fn="Spicy Rice";
                break;
           case 3:
                System.out.println("THANKS FOR CHOOSING Fried Rice");
                fn="Fried Rice";
                break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Rice & Beans");
               fn="Rice & Beans";
               break;
           case 5:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
               fn="Amma-Jamma Spaghetti";
               break;
           default:
               System.err.println("INVALID MEAL");
               //System.out.println("YOU TOTAL BILL IS: "+dk+fdo);
        break;
               }
        dnk.drink();
               zm=sc.nextInt();
               switch(zm){
                    case 1:
              System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
              double llp=100-dk;
              double opp=llp+dk;
                System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+opp);
       System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+opp);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
                break;
    //8TH SWITCH CASE FOR THIS CLASS           
 case 7:
                System.out.println("THANK YOU FOR CHOOSING CRUNCHY WINGS MEAL (4 PIECES)");
                dnk.CitizenMeal();
                int cw=sc.nextInt();
                double cwm=1000;
                //SWITCH CASE FOR THE CITIZENMEAL BEFORE ASKING FOR DRINK 
               switch (cw){
                case 1:
                  System.out.println("THANKS FOR CHOOSING Chips");
                  fn="Chips";
                  break;
           case 2:
               
                System.out.println("THANKS FOR CHOOSING Spicy Rice");
                fn="Spicy Rice";
                break;
           case 3:
                System.out.println("THANKS FOR CHOOSING Fried Rice");
                fn="Fried Rice";
                break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Rice & Beans");
               fn="Rice & Beans";
               break;
           case 5:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
               fn="Amma-Jamma Spaghetti";
               break;
           default:
               System.err.println("INVALID MEAL");
               
        break;
               }
        dnk.drink();
               zm=sc.nextInt();
               switch(zm){
                    case 1:
              System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
               double ssa=1100-dk;
               double aas=ssa+dk;
                System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+aas);
       System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){ 
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+aas);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
               break;
 // 9TH SWITCH CASE FOR THIS CLASS
 case 8:
               System.out.println("THANK YOU FOR CHOOSING CRUNCHY WINGS MEAL (6 PIECES)");
                dnk.CitizenMeal();
                int hw=sc.nextInt();
                double hcm=1400;
                //SWITCH CASE FOR THE CITIZENMEAL BEFORE ASKING FOR DRINK 
               switch (hw){
                case 1:
                  System.out.println("THANKS FOR CHOOSING Chips");
                  fn="Chips";
                  break;
           case 2:
               
                System.out.println("THANKS FOR CHOOSING Spicy Rice");
                fn="Spicy Rice";
                break;
           case 3:
                System.out.println("THANKS FOR CHOOSING Fried Rice");
                fn="Fried Rice";
                break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Rice & Beans");
               fn="Rice & Beans";
               break;
           case 5:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
               fn="Amma-Jamma Spaghetti";
               break;
           default:
               System.err.println("INVALID MEAL");
               
        break;
               }
        dnk.drink();
               hw=sc.nextInt();
               switch(hw){
                    case 1:
               System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
              double qw=1400-dk;
              double qqw=qw+dk;
               System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+qqw);
      System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+qqw);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
               break;
     // 10TH SWITCH CASE FOR THIS CLASS
 case 9:
               System.out.println("THANK YOU FOR CHOOSING CITIZEN CRUNCHY MEAL");
                dnk.CitizenMeal();
                int cc=sc.nextInt();
                double ccm=1400;
                //SWITCH CASE FOR THE CITIZENMEAL BEFORE ASKING FOR DRINK 
               switch (cc){
                case 1:
                  System.out.println("THANKS FOR CHOOSING Chips");
                  fn="Chips";
                  break;
           case 2:
              System.out.println("THANKS FOR CHOOSING Spicy Rice");
                fn="Spicy Rice";
                break;
           case 3:
                System.out.println("THANKS FOR CHOOSING Fried Rice");
                fn="Fried Rice";
                break;
           case 4:
               System.out.println("THANKS FOR CHOOSING Rice & Beans");
               fn="Rice & Beans";
               break;
           case 5:
               System.out.println("THANKS FOR CHOOSING Amma-Jamma Spaghetti");
               fn="Amma-Jamma Spaghetti";
               break;
           default:
               System.err.println("INVALID MEAL");
               
        break;
               }
        dnk.drink();
               cc=sc.nextInt();
               switch(cc){
                    case 1:
               System.out.println("THANKS FOR CHOOSING EVA WATER");
               dn="EVA WATER";
               break;
                case 2:
               System.out.println("THANKS FOR CHOOSING COCA-COLA");
                dn="COCA-COLA";
               break;
                case 3:
               System.out.println("THANKS FOR CHOOSING COCA-COLA ZERO");
                dn="COCA-COLA ZERO";
               break;
                case 4:
               System.out.println("THANKS FOR CHOOSING FANTA ORANGE");
                dn="FANTA ORANGE";
               break;
               case 5:
               System.out.println("THANKS FOR CHOOSING SPRITE");
                dn="SPRITE";
               break;
               default:
                   System.err.println("A DRINK IS REQUIRED FOR THIS MEAL");
                   break;
               }
               double ty=1350-dk;
               double tty=ty+dk;
                System.out.println("THANKS FOR YOUR PETRONAGE, PLEASE VERIFY YOUR ORDER");
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+dn);
       System.out.println("YOUR ORDER IS:>>>>>>>>>>>>>> "+fn);       
       System.out.println("YOU TOTAL BILL IS:>>>>>>>>>> "+tty);
       System.out.println("ENTER Y/N TO VERIFY YOUR ORDER");
        st=sc.next();
               if(st.equalsIgnoreCase("Y")){
        System.out.println("SUCCESSFUL");
        System.out.println("DRINK : "+dn);
        System.out.println("MEAL : "+fn);
        System.out.println("TOTAL : "+tty);
                   //System.out.println(count);
               }
               else if (st.equalsIgnoreCase("N")){
                   System.out.println("You have choosen to discontinue");
                   exit();
               }
                break;
          
                default:
                    System.err.println("INVALID OPERATION");
                 
                     
        }
    }
    }
    

    

    


