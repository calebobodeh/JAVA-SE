/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbasedcalc;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class class1 {
    double x,y,add,total,mul,ml,div;
    String end;
    Scanner sc=new Scanner(System.in);
    
    void Adition(){
        System.out.println("ENTER VALUES TO BE ADDED"
                + "\n"+"0 TO TERMINATE");
        double ad=0;
        boolean adt=true;
        while (adt){
        double adtn=sc.nextDouble();
        if (adtn==0) adt=false;
        total +=adtn;
        }
        System.out.println("TOTAL : "+total);
        
    }
    void Subtraction() {
        boolean loop = true;
    System.out.println("Enter how many numbers to Subtract?");
  double  n=sc.nextInt();
    double sum=0;
      for(double i=1;i<=n;)
    {
        try
        {
            System.out.println("Enter number "+i+" : ");
         double   a=sc.nextInt();
            sum=a-sum;
            i++;
        }
        catch(Exception e)
        {
            System.out.println("Invalid Entry. Try again!!");
        }
    }
}
         void Division (){
           
    for (int i=0; i<=10; i++){
        System.out.println("ENTER A NUMBER");
         div=sc.nextInt();
        total +=div;
            System.out.println("SCORE :"+total);
            System.out.println("DO YOU WISH TO ADD ANOTHER NO: Y/N");
             end=sc.next();
            if ("N".equalsIgnoreCase(end)){
                System.out.println("CALCULATION TERMINATED");
                System.out.println("YOUR TO ADDITION IS :"+total);
                //exit();
                System.exit(0);
            }
            else if ("Y".equalsIgnoreCase(end)){
                //System.out.println("ENTER A VALUE");
            }
            else{
                System.out.println("INVALID OPERATION");
            }
    }
}
}

