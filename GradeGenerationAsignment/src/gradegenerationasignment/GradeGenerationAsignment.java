/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradegenerationasignment;

/**
 *
 * @author CALY
 */
import java.util.*;
public class GradeGenerationAsignment {
    
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int A=80;
    int B=70;
    int C=60;
    int D=50;
    int E=40;
    int F=0;
    final int v=101;
       Scanner s=new Scanner(System.in);
       System.out.println("ENTER YOUR SCORE");
       int a=s.nextInt();
       
       if (a==A || a>A && a<v){
           System.out.println("YOUR SCORE IS: " + a + "," + "GRADE IS: A");
       }
      
       
       else if (a==B || a>B && a<A){
            System.out.println("YOUR SCORE IS: " + a + "," + "GRADE IS: B");
       }
       else if (a==C || a>C && a<B){
            System.out.println("YOUR SCORE IS: " + a + "," + "GRADE IS: c");
       }
       else if (a==D || a>D && a<C){
            System.out.println("YOUR SCORE IS: " + a + "," + "GRADE IS: D");
       }
       else if (a==E || a>E && a<D){
            System.out.println("YOUR SCORE IS: " + a + "," + "GRADE IS: E");
       }
       else if (a<E ){
            System.out.println("YOUR SCORE IS: " + a + "," + "GRADE IS: F");
            }
        else{
           System.err.println("INVALID OPERATION, ENTER A VALID SCORE");
           
}
}}