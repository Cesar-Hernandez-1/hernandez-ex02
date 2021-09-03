/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Cesar Hernandez
 */

/*  Pseudocode:
 *  set up "input" as a scanner object
 *  Ask user to input a string
 *  Receive user input and store it in "in_string" string variable
 *  Output the original string and the numbers of characters in the inputted string using
 *      the legnth() finction all within a printf() function.
 */
import java.util.Scanner;
public class Solution02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String in_string = input.nextLine();

        System.out.printf("%s has %d characters", in_string, in_string.length());
    }
}