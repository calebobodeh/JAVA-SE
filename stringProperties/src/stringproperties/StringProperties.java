/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringproperties;

/**
 *
 * @author CALY
 */
public class StringProperties {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "Hello  World";
        System.out.println(a);
        // to know the lenght of your nString variable
        int ss=a.length();
        System.out.println(ss);
        // converting your string variable to lower or upper case
        String lc=a.toLowerCase();
        System.out.println(lc);
        // to replace older String variables with new ones
         String b = "Hello  Hommies";
         System.out.println(b.replace('H', 'a'));
         // to know the properties of string, type your string variable in the in the sout  or 
         // any proper place and add "." exam a. properties will pop up
    }
    
}
