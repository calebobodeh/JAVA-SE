/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regex2;

import java.util.regex.*;
/**
 *
 * @author APTECH
 */
public class Regex2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String name ="Mike McMillian McMillen";
    String patt="McM.*? ";
    Pattern pattern = Pattern.compile(patt);
    Matcher match= pattern.matcher(name);
    System.out.println(name);
    name = match.replaceAll("McMillan ");
    System.out.println(name);
    }
    }
    
 