/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbbbb;

/**
 *
 * @author CALY
 */
public class Enumm {
enum MonthsOfTheYear{
    jan,feb,mar,april,may,june,jul,aug,sept,oct,nov,dec

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MonthsOfTheYear m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11,m12;
m1 = MonthsOfTheYear.jan;
m2=MonthsOfTheYear.feb;
m3=MonthsOfTheYear.mar;
m4=MonthsOfTheYear.april;
m5=MonthsOfTheYear.may;
m6=MonthsOfTheYear.june;
m7=MonthsOfTheYear.jul;
m8=MonthsOfTheYear.aug;
m9=MonthsOfTheYear.sept;
m10=MonthsOfTheYear.oct;
m11=MonthsOfTheYear.nov;
m12=MonthsOfTheYear.dec;

System.out.println( "months: "+ m1+" "+ m2+" "+m3+" "+m4+" "+m5+" "+m6+" "+m7+" "+m8+" "+m9+" "+m10+" "+m11+" "+m12 );
        // TODO code application logic here
    
}
}
