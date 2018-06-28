/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods_access_assignment;

/**
 *
 * @author AMBASSADOR_CALY
 */
import java.util.*;
public class Methods_Access_Assignment {

    /**
     * @param args the command line arguments
     */
    

    public static void main(String[] args) {
        // TODO code application logic here
        
    int PW=1234;
    String US="africa";
    Scanner sc=new Scanner(System.in);
        System.out.println("PLEASE ENTER YOUR USERNAME");
        String a=sc.next();
        if ( a==US){
            System.out.println("PLEASE ENTER YOUR PASSWORD");
            int d=sc.nextInt();
            if (d==PW){
                System.out.println("YOU ARE WELCOME");
            }
            else {
                System.err.println("INCORRECT PASSWORD");
            }
        }
        else {
            System.err.println("INCORRECT USERNAME");
        }
    }
}
    

