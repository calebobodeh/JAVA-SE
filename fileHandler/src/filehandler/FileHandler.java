/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandler;

import java.io.IOException;
import java.util.Scanner;
import static javafx.application.Platform.exit;

/**
 *
 * @author HP
 */
public class FileHandler {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        // int count=0;
        while(true){
         Scanner sc=new Scanner(System.in);
        Details obj=new Details();
        System.out.println("PRESS 1 TO REGISTER TEACHERS");
        System.out.println("PRESS 2 TO REGISTER STUDENT");
        System.out.println("PRESS 3 TO VIEW TEACHERS FILE");
        System.out.println("PRESS 4 TO VIEW STUDENT FILE");
        System.out.println("PRESS 5 TO EXIT THE APPLICATION");
       int opt=sc.nextInt();
       switch(opt){
           case 1:
               obj.teachers();              
               break;
           case 2:
               obj.Student();
               break;
                case 3:
                    obj.readT();
               break;
                case 4:
                    obj.readS();
               break;
               case 5:
                   exit();
               break;
                default:
                    System.err.println("INVALID COMMAND");
                    exit();
       }
        
      
    }
    
}
}