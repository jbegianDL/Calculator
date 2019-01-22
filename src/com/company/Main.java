//Create a calculator application. Your program should ask the user which operation they would like to perform: addition, subtraction, multiplication, division, or square root. Depending on the user’s response, your program should request that the user input either (1) or (2) numbers to perform the desired operation.
//
//Your program should perform the appropriate calculation, display the result to the user, and ask if the user would like to perform another calculation. If so, the program should restart.

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double calulation = 0;
	double firstNum = 0;
	double secondNum = 0;
	boolean	repeat = false;
	String lineBreak = "\n";
	String prompt = "What calculation would you like to preform?: " + lineBreak + "1 - Addition" + lineBreak + "2 - Subtraction" + lineBreak + "3 - Multiplication" + lineBreak + "4 - Division" + lineBreak + "5 - Square Root" + lineBreak + "Please select a number";
	String usrInput1 = "Please proved a number";
	String usrInput2 = "Please provide another number";
	String repeatPrompt = "Would you like to preform another calculation?";

	do {
		System.out.println(prompt);
		calulation = input.nextDouble();

		if (calulation == 1){
			System.out.println("Addition Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

			double addition = firstNum + secondNum;

			System.out.println(firstNum + " + " + secondNum + " = " + addition);
		}else if (calulation == 2){
			System.out.println("Subraction Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

		}else if (calulation == 3){
			System.out.println("Multiplication Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

		}else if (calulation == 4){
			System.out.println("Division Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

		}else if (calulation == 5){
			System.out.println("Square Root Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();
			

		}else {
			System.out.println("Error - Incorrect input");
		}

	}while(repeat);
    }
}
