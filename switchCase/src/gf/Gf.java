/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gf;

/**
 *
 * @author CALY
 */
import java.util.*;
public class Gf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("welcome to aptech courses");
        System.out.println("press java to veiw courses");
        System.out.println("press net to exit");
        
        String courses =s.next();
        
        switch (courses) {
            case "java":
                System.out.println("press 1 to veiw java");
                System.out.println("press 2 to cancel");
                int  subcourses=s.nextInt();
                switch (subcourses) {
                    case 1:
                        System.out.println("JAVA 1");
                        System.out.println("java 2");
                        break;
                    case 2:
                        System.out.println("thanks");
                        break;
                }
                break;
            case "net":
                System.out.println("press 1 to veiw .net");
                System.out.println("press 2 to cancel");
                int ccourses=s.nextInt();
                switch (ccourses) {
                    case 1:
                        System.out.println("vb.net");
                        System.out.println("asp.net");
                        break;
                    case 2:
                        System.out.println("goodbye");
                        break;
                }
                break;
            default:
                System.out.println("invalid operation");
        }
    }
    
}
