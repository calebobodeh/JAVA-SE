/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandler;

/**
 *
 * @author HP
 */
import static com.oracle.jrockit.jfr.DataType.STRING;

import java.io.BufferedReader;
import java.io.BufferedWriter;     
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.DocFlavor;
public class Details {
    String hj;
    
    Scanner sc=new Scanner(System.in);
    String fileName = "temp.txt";
    FileWriter fileWriter;
     FileWriter stdFiles;
      String line=null;
      FileReader fileReader;
      BufferedReader bufferedReader;
       BufferedWriter bufferedWriter;
    void teachers() throws IOException{
         fileWriter = new FileWriter(fileName);
         // bufferedWriter =new BufferedWriter(fileWriter);
         // InputStreamReader is = new InputStreamReader(System.in);
       // BufferedReader br=new BufferedReader(is);
       
        
        System.out.println("YOUR NAME IN FULL");       
       //fileName =sc.nextLine();    //(br.readLine());
     //fileName =sc.nextLine();
        bufferedWriter.write(sc.nextLine());
        System.out.println("YOUR PHONE NUMBER");       
       fileName = sc.nextLine();    //(br.readLine());
        System.out.println("YOUR EMAIL ADDRESS");       
       fileName =sc.nextLine();    //(br.readLine());
        
}
    void readT() {
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
        }
        bufferedReader = new BufferedReader(fileReader);
        try {
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   
        } catch (IOException ex) {
            Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
void Student() throws IOException{
     stdFiles = new FileWriter(fileName);
          //BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(is);
        System.out.println("YOUR NAME IN FULL");       
       fileName =(br.readLine());
        System.out.println("YOUR PHONE NUMBER");       
       fileName =(br.readLine());
        System.out.println("YOUR EMAIL ADDRESS");       
       fileName =(br.readLine());
       bufferedWriter.close();
}
    void readS(){
        System.out.println(stdFiles);
    }
    
}
    
