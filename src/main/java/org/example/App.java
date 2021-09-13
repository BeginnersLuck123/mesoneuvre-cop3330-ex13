package org.example;
import java.util.Scanner;
/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dynie Mesoneuvre
 */
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the principal amount?");
        int principal = input.nextInt();//Input
        System.out.println("What is the rate?");
        double rate = input.nextDouble();//Input
        rate = rate/100;
        System.out.println("What is the number of years?");
        double years = input.nextDouble();//Input
        System.out.println("What is the number of times the interest is compounded per year?");
        double compounded = input.nextDouble();//Input
        //Calculating the compound interest using a formula
        double investment = principal*Math.pow(1 + rate/compounded, ((compounded*years)));
        System.out.println( principal + " invested at " + (rate*100) + "% for " + years + " years compounded " + compounded + " times per year is " + investment + ".");//Ouptut
    }
}