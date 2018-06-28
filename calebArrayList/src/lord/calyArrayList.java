/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lord;

/**
 *
 * @author CALY
 */
import java.util.*;
public class calyArrayList {
    Scanner s=new Scanner(System.in);
    void f(){
        ArrayList<Integer> caly=new ArrayList<Integer>();
        System.out.println("ENTER THE VALUES OF YOUR CHOICE");
        System.out.println("PRESS a TO END");
        while (s.hasNextInt()){
           int b=s.nextInt();
            System.out.println("========================================================================================");
           caly.add(b);
           switch ("b"){
               case "a":
                   System.exit(0);
                   
                   break;
           }
           
        }
        for (int i=0; i<caly.size(); i++){
               System.out.println(caly.get(i));
           }
       
       if (caly.size()==0){
           System.out.println("NO SUM");
           
       }
       else{
           int total=0;
           for (int count:caly){
               total=total+count;
           }
           System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
           System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
           System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
           System.out.println("THE SUM IS " + total);
       }
    }
    
}
