
       /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmtest;

/**
 *
 * @author CALY
 */
import java.util.*;
public class resultGradeChecker {
int A=80;
int B=70;
int C=60;
int D=50;
int E=40;
int F=30;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR SCORE");
        int sc=s.nextInt();
        if (sc >79){
            System.out.println("YOUR GRADE IS A: " + sc);
        }
        else if (sc>69 && sc<80){
            System.out.println("YOUR GRADE IS B: " + sc);
        }
        else if (sc>59 && sc<70){
            System.out.println("YOUR GRADE IS C: " + sc);
        }
        else if (sc>49 && sc<60){
            System.out.println("YOUR GRADE IS D: " + sc);
        }
        else if (sc>39 && sc<50){
            System.out.println("YOUR GRADE IS E: " + sc);
        }
        else if (sc<40){
            System.out.println("YOU FAILED " + sc); 
        }
        // TODO code application logic here
    }}

