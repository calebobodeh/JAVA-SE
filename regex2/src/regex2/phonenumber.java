/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author APTECH
 */
public class phonenumber {
    public static void main(String ags[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number in this formatt 999-999-9999");
    String number = input.next();
    String patt = "^[2-9]\\d{2}-\\d{3}-\\d{4}$";
    Pattern pattern = Pattern.compile(patt);
    Matcher match = pattern.matcher(number);
    if (match.find()){
    System.out.println("Phone number correctly inputted");
    }
    else{
    System.out.println("You Entered incorrect phone number format");
    }
    }
    
}
