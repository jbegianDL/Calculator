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

	do {
		System.out.println(prompt);
		calculation = input.nextDouble();

		if (calculation == 1){
			System.out.println("Addition Selected");
			System.out.println(usrInput1);
			firstNum = input.nextDouble();

			System.out.println(usrInput2);
			secondNum = input.nextDouble();

			double addition = firstNum + secondNum;

			System.out.println(firstNum + " + " + secondNum + " = " + addition);
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
			System.out.println("Error - Incorrect input");
		}

		System.out.println(repeatPrompt);
		int repeatAnswer = input.nextInt();

		if (repeatAnswer == 1){
			repeat = true;
		} else if (repeatAnswer == 2) {
			repeat = false;
		} else {
			System.out.println("Error - Incorrect input");
			repeat = false;
		}

	}while(repeat);
    }
}
