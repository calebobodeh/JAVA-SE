/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package txtf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TxtF {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)  {
        // TODO code application logic here
        while(true){
         Scanner in= new Scanner(System.in);
         TxtF tt=new TxtF();
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|....,,,,|........|.......|......|......|");
        System.out.println("|____|_____|_____|_____|______|_____|______|_______|________|________|_______|______|______|");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|........|........|.......|......|......|");
        System.out.println("");
        System.out.println("WELCOME TO MI AMOR COLLEGE");
        System.out.println("");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|....,,,,|........|.......|......|......|");
        System.out.println("|____|_____|_____|_____|______|_____|______|_______|________|________|_______|______|______|");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|........|........|.......|......|......|");
        System.out.println("");
        System.out.println("PRESS 1 TO REGISTER TEACHER / VIEW TEACHERS VOUCHER");
        System.out.println("PRESS 2 TO EXIT");
        String ttc = in.nextLine();
        switch(ttc){
            case "1":
                tt.tchs();
                break;
            
            
        }
        }
    }
      public void tchs(){
         
        Scanner input01 = new Scanner(System.in);
         String us="miamor";
         String ps="1234";
         System.out.println("|....|.....|.....|.....|......|.....|......|.......|....,,,,|........|.......|......|......|");
        System.out.println("|____|_____|_____|_____|______|_____|______|_______|________|________|_______|______|______|");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|........|........|.......|......|......|");
        System.out.println("");
          System.out.println("Admin username");
          String usn=input01.next();
          if (usn.equals(us)){
              System.out.println("Admin Password");
              String pss=input01.next();
              if (pss.equals(ps)){
                  System.out.println("|....|.....|.....|.....|......|.....|......|.......|....,,,,|........|.......|......|......|");
        System.out.println("|____|_____|_____|_____|______|_____|______|_______|________|________|_______|______|______|");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|........|........|.......|......|......|");
        System.out.println("");
          System.out.println("PRESS 1 TO ADD TEACHERS DETAILS");
                  System.out.println("PRESS 2 TO ");
          System.out.println("PRESS 2 TO VIEW");
           int command=input01.nextInt();
           switch(command){
               case 1:
                   System.out.println("|....|.....|.....|.....|......|.....|......|.......|....,,,,|........|.......|......|......|");
        System.out.println("|____|_____|_____|_____|______|_____|______|_______|________|________|_______|______|______|");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|........|........|.......|......|......|");
        System.out.println("");
                   System.out.println("ENTER FILE NAME IN .TXT");
                    String filename = input01.next();
                    System.out.println("");
                System.out.println("ENTER TEACHER'S DETAILS...");
                System.out.println("");
                 System.out.println("TEACHERS NAME ");
               String num = input01.next();
                 System.out.println("ID NUMBER");
                String id = input01.next();
                 System.out.println("PHONE NUMBER");
                String pn = input01.next();
                 System.out.println("COURSE");
               String cr = input01.next();
               
               try {
                    FileWriter filewriter = new FileWriter(filename);
                    BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
                    bufferedWriter.write("TEACHERS NAME  .............."+num);
                    bufferedWriter.newLine();
                    bufferedWriter.write("ID NUMBER  .............."+id);
                    bufferedWriter.newLine();
                    bufferedWriter.write("PHONE NUMBER  .............."+pn);
                    bufferedWriter.newLine();
                    bufferedWriter.write("COURSE .............."+cr);
                    bufferedWriter.newLine();
                    
                    bufferedWriter.close();
                }
                catch(IOException ex){
                    System.err.println("Error Writing to file "+filename);
                    
                }
                break;
               case 2:
                   System.out.println("|....|.....|.....|.....|......|.....|......|.......|....,,,,|........|.......|......|......|");
        System.out.println("|____|_____|_____|_____|______|_____|______|_______|________|________|_______|______|______|");
        System.out.println("|....|.....|.....|.....|......|.....|......|.......|........|........|.......|......|......|");
        System.out.println("");
                   System.out.println("ENTER FILE DETAILS");
                    String fileName =input01.next();
                System.out.println("");
                 String line = null;
                try {
                    FileReader fileReader = new FileReader(fileName);
                      try(BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                          while((line = bufferedReader.readLine()) != null){
                              System.out.println(line);
                          }
                       bufferedReader.close(); 
                      }  
                    
                }
                catch(FileNotFoundException ex){
                    System.err.println(" Unable to Open File "+fileName);
                }
           
                catch(IOException ex){
                    System.out.println(" Error reading File "+fileName );
                }
                break;
           }
}
             else{
              System.err.println("WRONG USERNAME");
              eixt();
          } 
          }
          
          else{
              System.err.println("WRONG USERNAME");
              eixt();
          }
      }

    private void eixt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}