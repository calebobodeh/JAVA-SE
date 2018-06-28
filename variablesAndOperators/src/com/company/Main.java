package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Atlantis Scientific System");
        System.out.println("what is the minimum Temperature of the locality");
        int mt=sc.nextInt();
        System.out.println("what is the maximum Temperature of the locality");
        int max=sc.nextInt();
        System.out.println("What is the Average  Temperature of the locality");
        int av=sc.nextInt();
        System.out.println("Whats the population of the town");
        int popTown=sc.nextInt();
        System.out.println("Whats the population of the State");
        int popState=sc.nextInt();
        System.out.println("Whether the city is a metroplis or not (true/false data");
        String tf=sc.next();
        System.out.println("Average literacy percentage of the city");
        int avlit=sc.nextInt();
        System.out.println("Average qualifications of the population (Graguate/Postgraduate and so on");
        String qual=sc.nextLine();

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("please enter your prinncipal");
        double p=sc.nextDouble();

        System.out.println("please the period in days");
        double t=sc.nextDouble();

        final double rate=20;




        double in=((60*60*24*t)*p*rate)/100;
        System.out.println("your interest is:" + in + "%");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("enter first number");
       boolean num1=sc.hasNextByte();
        System.out.println("enter second number");
        boolean num2=sc.hasNextByte();
        boolean var1=num1 & num2;
        boolean var2=num1 | num2;
        boolean var3=~num1;
        boolean var4=num2;
        boolean var5=(~num1)& (~num2);
        boolean var6=(~num1)| (~num2);
        boolean var7=num1>>num2;
        boolean var8=num1<<num2;
        boolean var9=num2>>num1;
        boolean var10=num2<<num1;
        System.out.println(var2);
    }
}

