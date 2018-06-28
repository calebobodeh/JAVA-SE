/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parameterpassingandreturningvalue;

/**
 *
 * @author CALY
 */
public class ParameterPassingAndReturningValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        caleb("caly");
        caleb("caleb");
        caleb("nedu");
        caly(120,456);
        caly(1280,4596);
        
       // int sum=cal(123,321,100);
        //System.out.println(sum);
       
    }
    public static void caleb(String name){
        System.out.println("hello" + " " + name);
    }
    public static void caly(int a,int b){
        System.out.println(a+b);
    }
   // public static void int cal(int a,int b,int c){
   //     return (a+b+c);
   // }
     
    
}
