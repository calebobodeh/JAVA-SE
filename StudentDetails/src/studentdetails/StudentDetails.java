/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdetails;

/**
 *
 * @author Ahmad
 */
import java.util.regex.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("      Welcome to Projrct Zeus Student Files - Faculty Portal");
        System.out.println("");
        System.out.println("");
        System.out.println("    Please Enter Your ZeusID ");
        String ZeusID = input.next();
        String patt = "^\\d{8,10}$";
        Pattern pattern = Pattern.compile(patt);
        Matcher match = pattern.matcher(ZeusID);
        if (match.find()){
        System.out.println("   Access Granted");
            System.out.println("");
        System.out.println("  Greeting Professor!");
            System.out.println("");
            StudentDetails obj = new StudentDetails();
            obj.menu();
            System.out.println("");
            System.out.println("Continue - Add another Student data or Display data");
            System.out.println("");
            System.out.println("Exit - Terminate App");
            String menu = input.next();
            switch (menu)
            {
                case "Continue":
                    obj.menu();
                    break;
                case "Exit":
                    
                    break;
                    
                
            }
        }
        else{
        System.err.println("   Invalid ID - ID ranges between 8,10 Digits ");
        System.err.println("   Please Try Again ");
        }
    }
    public void menu(){
        Scanner input01 = new Scanner(System.in);
        
        System.err.println("Caution! Type Command As Displayed");
        System.out.println("");
        System.out.println("  Add - Add a new student data to the framwork in a new or existing Alias");
        System.out.println("");
        System.out.println("  View - Display all data on framework ");
        System.err.println("Please create your student Alias before viewing or Display existing Alias`1");
        System.out.println("");
        System.out.println("Awaiting Command...");
        String command=input01.next();
        switch (command)
                {
            case "Add":
                System.out.println("Create Alias name with a .txt extension or Enter previous Alias name");
                System.out.println("");
                System.out.println("Waiting for Alias name...");
                String filename = input01.next();
                System.out.println("");
                System.out.println("Enter Student Detail below...");
                System.out.println("");
                System.out.println("");
                System.out.println("Student's Number: ");
                int num = input01.nextInt();
                System.out.println("Student's Name: ");
                String name = input01.next();
                System.out.println("Student's Age: ");
                int age = input01.nextInt();
                System.out.println("Student's Nationality: ");
                String nat = input01.next();
                System.out.println("Studens's Specialization - IT specialization");
                String spec = input01.next();
                try {
                    FileWriter filewriter = new FileWriter(filename);
                    BufferedWriter bufferedWriter = new BufferedWriter(filewriter);
                    bufferedWriter.write("Student's Number: "+num);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Student's Name: "+name);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Student's Age: "+age);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Student's Nationality: "+nat);
                    bufferedWriter.newLine();
                    bufferedWriter.write("Student's Speciality: "+spec);
                    bufferedWriter.newLine();
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                    
                }
                catch(IOException ex){
                    System.err.println("Error Writing to file "+filename);
                    
                }
                break;
            case "View":
                System.out.println("Enter Alias Name to View");
                String fileName =input01.next();
                System.out.println("");
                System.out.println("Searching Project Zeus Systems...");
                String line = null;
                try {
                    FileReader fileReader = new FileReader(fileName);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while((line = bufferedReader.readLine()) != null){
                    System.out.println(line);
                }
            }  
                    
                }
                catch(FileNotFoundException ex){
                    System.err.println(" Unable to Open File "+fileName);
                }
                catch(IOException ex){
                    System.out.println(" Error reading File "+fileName );
                }
               
                
                    
        }      
    }
    
}
