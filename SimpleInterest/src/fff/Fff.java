/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fff;

/**
 *
 * @author CALY
 */
import java.util.Scanner;
public class Fff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner s=new Scanner (System.in);

        System.out.println("ENTER PRINCIPAL VALUE ");
        float p=s.nextFloat();
        
        System.out.println("ENTER NUMBER OF DAYS");
        float d=s.nextFloat();
        
        final float r=7;
        
        float days=(d);
        System.out.print("YOUR INTEREST IN " + days + " " + "DAYS IS:");
        
        float in=(p*d)/365*100;
        System.out.print(+ in);
        // TODO code application log1ic here
    }
    
}
