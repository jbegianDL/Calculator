//Create a calculator application. Your program should ask the user which operation they would like to perform: addition, subtraction, multiplication, division, or square root. Depending on the user’s response, your program should request that the user input either (1) or (2) numbers to perform the desired operation.
//
//Your program should perform the appropriate calculation, display the result to the user, and ask if the user would like to perform another calculation. If so, the program should restart.

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double result = 0;
	double calulation = 0;
	double firstNum = 0;
	double secondNum = 0;
	String lineBreak = "\n";
	String prompt = "What calculation would you like to preform?: " + lineBreak + "1 - Addition" + lineBreak + "2 - Subtraction" + "3 - Multiplication" + lineBreak + "4 - Division" + lineBreak + "5 - Square Root" + lineBreak + "Please select a number";

	System.out.println(prompt);

	calulation = input.nextDouble();

	System.out.println(calulation);
    }
}
