package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        //Print a message to ask the user for input
        System.out.println("Please Enter a new message ");

        //Read the input into a variable
        String userMessage = input.nextLine();

        // Do Something sensible with the value that has been read in
        System.out.println("Your nessage was " + userMessage);

        
    }
}
