/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author CALY
 */
import java.util.*;
public class ArrayAssign {

    
    void assign(){
        
        Scanner sc=new Scanner (System.in);
        System.out.println("max width of the array");
        int x = Integer.parseInt(sc.next());
        int []a = new int [x];
        
        
        for(int i=0; i<x; i++)
        {
            System.out.println("supply values");
            a[i]=sc.nextInt();
        }
        System.out.println("printed results");
        for (int i=0; i<x; i++){
            System.out.println("value"+ (i+1) +"="+ a[i]);
    }
    for (int i=0; i<x; i++){
        int q = 0;
        int sum = q + a[i];
        System.out.println("The sum is "+ sum);
    }
    }
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayAssign obj =new  ArrayAssign();
        obj.assign();
        



// TODO code application logic here
        
        
        
        
      //  /int c=0;
        //hile(c<a.length) 
        //{
        //System.out.println(a[c]);
        //c++;
    //}
    }
    
}
