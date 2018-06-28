/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverloading;

/**
 *
 * @author AMBASSADOR_CALY
 */
public class MethodOverLoading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int newScore= calculateScore("caleb", 500);
        System.out.println("YOUR NEW SCORE IS: "+newScore);
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String stdName, int score){
        System.out.println("Student: "+stdName+" score: "+score+" point: ");
        return score * 1000;
        
    }
    public static int calculateScore(int score){
        System.out.println("UNNAMED STUDENT scored: "+score+" point: ");
        return score * 1000;
        
    }
    public static int calculateScore(){
        System.out.println("no student name,NO student SCORE ");
        return 0;
        
    }
}
