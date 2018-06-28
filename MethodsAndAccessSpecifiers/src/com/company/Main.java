package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int password=1234;
	String username="admin";
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to TechDynamic ltd");
        System.out.println("user name= admin and password = 1234");

        System.out.println("please enter your Username");
        String us=sc.next();
        if (us.equals(username)){
            System.out.println("please enter your password");
            int pw=sc.nextInt();
            if (pw==password){
                System.out.println("Login Successful");
            }
        }
        else {
            System.err.println("Invalid UserName or Password");
        }

    }
}
