package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	double calculation = 0;
	double firstNum = 0;
	double secondNum = 0;
	boolean	repeat = false;
	String lineBreak = "\n";
	String prompt = "What calculation would you like to preform?: " + lineBreak + "1 - Addition" + lineBreak + "2 - Subtraction" + lineBreak + "3 - Multiplication" + lineBreak + "4 - Division" + lineBreak + "5 - Square Root" + lineBreak + "Please select a number";
	String usrInput1 = "Please proved a number";
	String usrInput2 = "Please provide another number";
	String repeatPrompt = "Would you like to preform another calculation?" + lineBreak + "1 - Yes" + lineBreak + "2 - No";

	//loops while repeat boolean is true
	do {
		System.out.println(prompt);
		calculation = input.nextDouble();

		if (calculation == 1){
			System.out.println("Addition Selected");
			System.out.println(usrInput1);//prompts user for number
			firstNum = input.nextDouble();//scans number

			System.out.println(usrInput2);//prompts user for number
			secondNum = input.nextDouble();//scans number

			double addition = firstNum + secondNum;//preforms calculation

			System.out.println(firstNum + " + " + secondNum + " = " + addition);//prints result

		}else if (calculation == 2){
			System.out.println("Subtraction Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

			double subtraction = firstNum - secondNum;

			System.out.println(firstNum + " + " + secondNum + " = " + subtraction);

		}else if (calculation == 3){
			System.out.println("Multiplication Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

			double multiplication = firstNum * secondNum;

			System.out.println(firstNum + " * " + secondNum + " = " + multiplication);

		}else if (calculation == 4){
			System.out.println("Division Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

			double division = firstNum / secondNum;
			double remainder = firstNum % secondNum;

			System.out.println(firstNum + " / " + secondNum + " = " + division + " with remainder: " + remainder);

		}else if (calculation == 5){
			System.out.println("Square Root Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			double squareRoot = Math.sqrt(firstNum);

			System.out.println("The square root of: " + firstNum + " is " + squareRoot);


		}else {
			System.out.println("Error - Incorrect input"); //any number > 5
		}

		System.out.println(repeatPrompt);//prompts for another calculation
		int repeatAnswer = input.nextInt();//scans user input

		if (repeatAnswer == 1){
			repeat = true; //sets repeat to true and loop continues
		} else if (repeatAnswer == 2) {
			repeat = false; //sets repeat to false and loop ends
		} else {
			System.out.println("Error - Incorrect input");
			repeat = false; //sets repeat to false and loop ends
		}

	}while(repeat);
    }
}
