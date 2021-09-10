/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Gabrielle Jackson
 */

//this program that prompts for your weight, gender, total alcohol consumed (in ounces), and the amount of time since your last drink
import java.util.Scanner;
public class ex17{
public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //declaring varibles
    double BAC,r;

    System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        int choice = input.nextInt();
    if(choice==1){
        r=0.73;
    }else{
        r=0.66;
    }

    System.out.print("How many ounces of alcohol did you have? ");
        int A = input.nextInt();
    System.out.print("What is your weight, in pounds? ");
        int W = input.nextInt();
    System.out.print("How many hours has it been since your last drink? ");
        int H = input.nextInt();
      
       //calculates the BAC 
       BAC = A*5.14/W*r-0.015*H;
      
       System.out.println("Your BAC is "+BAC);
      
       //ability to drive calculation
       if(BAC<=0.08){
       System.out.println("It is legal for you to drive");
       }else{
       System.out.println("It is not legal for you to drive");
       }

   }//end of main
}//end of class