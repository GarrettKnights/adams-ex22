/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Garrett Adams
 */


package Exercise22;

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {

        //Declares the variables that we will be using
        double firstnum;
        double secondnum;
        double thirdnum;

        //Initializes the scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("Enter the first number: ");
        //Scans input to firstnum
        firstnum = ScanWord.nextInt();
        //Asks user for input
        System.out.println("Enter the second number: ");
        //Scans input to secondnum
        secondnum = ScanWord.nextInt();
        //Asks user for input
        System.out.println("Enter the third number: ");
        //Scans input to thirdnum
        thirdnum = ScanWord.nextInt();

        //Checks to see if numbers are different
        if (firstnum == secondnum || firstnum == thirdnum || secondnum == thirdnum){
            //Prints out numbers are not different
            System.out.println("All numbers are not different, exiting program");
        }

        //If first num is greatest
        else if (firstnum > secondnum && firstnum > thirdnum){
            //Prints out first num is greatest
            System.out.println("The largest number is " + firstnum);
        }
        //If second num is greatest
        else if(secondnum > firstnum && secondnum > thirdnum){
            //Prints out second num is greatest
            System.out.println("The largest number is " + secondnum);
        }
        //If third num is greatest
        else if(thirdnum > firstnum && thirdnum > secondnum){
            //Prints out third num is greatest
            System.out.println("The largest number is " + thirdnum);
        }
    }
}
