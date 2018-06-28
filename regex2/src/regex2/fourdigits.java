/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex2;

/**
 *
 * @author APTECH
 */
import java.util.regex.*;
import java.util.*; 
public class fourdigits {
    public static void main(String ags[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a four digits password");
    String password = input.next();
    String patt = "^\\d{4}$";
    Pattern pattern = Pattern.compile(patt);
    Matcher match = pattern.matcher(password);
    if (match.find()){
    System.out.println("You Entered four digit password correctly");
    }
    else{
    System.out.println("Password not match please enter a four digit Password ");
    }
    }
    
}
