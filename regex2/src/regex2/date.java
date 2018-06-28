/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex2;
import java.util.regex.*;
import java.util.*;
/**
 *
 * @author APTECH
 */
public class date {
    
    public static void main(String ags[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a date in this formatt mm/dd/yyyy");
    String number = input.next();
    String patt = "^(0[1-9]|1[012])/(0[1-9]|[1-2][0-9]|3[01])/(19|20)\\d\\d$";
    Pattern pattern = Pattern.compile(patt);
    Matcher match = pattern.matcher(number);
    if (match.find()){
    System.out.println("Date entry correctly inputted");
    }
    else{
    System.out.println("You Entered incorrect date format");
    }
    }
    
    
}
