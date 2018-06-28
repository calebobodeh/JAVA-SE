/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package looping_construct;

/**
 *
 * @author AMBASSADOR_CALY
 */
import java.util.*;
public class Looping_construct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter number of attempts");
    int sub=sc.nextInt();
    if (sub==1){
        System.out.println("CHOOSE THE REQUIRED SUBJECT ACCORDINGLY");
         System.out.println("1. Aptitude ");
        System.out.println("2. English");
        System.out.println("3. Math");
        System.out.println("4. Gk");
         System.out.println("5. Exit");
        int s=sc.nextInt();
        switch (s)
                {
            
                
            case 1:
                System.out.println("Where is Nigeria located");
                System.out.println("A. Africa");
                System.out.println("B. Asia");
                System.out.println("C. Europe");
             String   m=sc.next();
             int score1;
             if ("A".equals(m)){
                  score1=10;
             }
             else{
                score1=0;
            }
              //  System.out.println("press 1 to continue with English");
            // int v=sc.nextInt();
             switch ("m"){
                 case "1":
                     System.out.println("What part of speach is MARKET");
                System.out.println("A. verb");
                System.out.println("B. noun");
                System.out.println("C. Adverb");
                String n=sc.next();
                 int score2;
             if ("B".equals(n)){
                  score2=10;
             }
             else{
                score2=0;
            }
                     System.out.println("press 1 to continue with Maths");
                     int x=sc.nextInt();
                switch (x) {
                    case 1:
                        System.out.println("2*10= ?");
                System.out.println("A. 18");
                System.out.println("B. 74");
                System.out.println("C. 20");
                String d=sc.next();
                 int score3;
             if ("C".equals(d)){
                  score3=10;
             }
             else{
                score3=0;
            }
                        System.out.println("press 1 to continue with GK");
                        int z=sc.nextInt();
                switch (z){
                    case 1:
                        System.out.println("example of a wild animal");
                System.out.println("A. lion");
                System.out.println("B. goat");
                System.out.println("C. lizard");
                String k=sc.next();
                 int score4;
             if ("A".equals(k)){
                  score4=10;
             }
             else{
                score4=0;
            }
                        System.out.println("press 1 to Exit");
                        int e=sc.nextInt();
                        switch (e){
                            case 1:
                   double   result=score1+score2+score3+score4;    
                                System.out.println(result);
                        }
                }
                }
             }
            
                
            
             
            
          
    
    }
}
    else {
        System.err.println("INVALID ATTEMPT");   
    }
    }}