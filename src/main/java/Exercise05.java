/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Carolina Duarte
 */

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String a = input.nextLine(); //Reads the first # input.
        System.out.print("What is the second number? ");
        String b = input.nextLine(); //Reads the second # input.

        int i = Integer.parseInt(a); //Converting string into int.
        int j = Integer.parseInt(b);

        System.out.println(i + " + " + j + " = " + (i+j) + "\r\n" + i + " - " + j + " = " + (i-j) + "\r\n" + i + " * " + j + " = " + (i*j) + "\r\n" + i + " / " + j + " = " + (i/j)); //Performing and printing operations.

    }




}
