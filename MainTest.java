package com.velocity.main;

import java.util.Scanner;

import com.velocity.functionality.implementation.AdditionImpl;
import com.velocity.functionality.implementation.AverageImpl;
import com.velocity.functionality.implementation.CubeImpl;
import com.velocity.functionality.implementation.DivisionImpl;
import com.velocity.functionality.implementation.EvenOrOddImpl;
import com.velocity.functionality.implementation.FactorImpl;
import com.velocity.functionality.implementation.ModulusImpl;
import com.velocity.functionality.implementation.MultiplicationImpl;
import com.velocity.functionality.implementation.SquareImpl;
import com.velocity.functionality.implementation.SubstractionImpl;

public class MainTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);// we create a scanner class to take a user inout
		// here we can create multiple implementation class object
		AdditionImpl AI = new AdditionImpl();
		AverageImpl averageimpl = new AverageImpl();
		CubeImpl CI = new CubeImpl();
		DivisionImpl DI = new DivisionImpl();
		EvenOrOddImpl EOO = new EvenOrOddImpl();
		FactorImpl FI = new FactorImpl();
		ModulusImpl MI = new ModulusImpl();
		MultiplicationImpl Mi= new MultiplicationImpl();
		SquareImpl SI = new SquareImpl();
		SubstractionImpl Si = new SubstractionImpl();
		
		while(true) {
			
			System.out.println("Select the operation that you have to perform");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Modulus");
			System.out.println("6.Square");
			System.out.println("7.Cube");
			System.out.println("8.Average");
			System.out.println("9.Factor");
			System.out.println("10.Even or odd");
			System.out.println("Enter the choice-");
			
			int choice = scanner.nextInt();
			// Calling of implementation class methods
			switch(choice) {
			case 1: AI.add();
			break;
			case 2: Si.substract();
			break;
			case 3: Mi.multiple();
			break;
			case 4: DI.divisionOperation();
			break;
			case 5: Mi.multiple();
			break;
			case 6: SI.squareOperation();
			break;
			case 7: CI.cubeOperation();
			break;
			case 8: averageimpl.averageOperation();
			break;
			case 9:FI.factorOperation();
			break;
			case 10: EOO.EvenOrOddOperation();
			break;
			default: System.out.println("Invalid input -Please try again");
			scanner.close();
			}
			
			System.out.println(" You want to perform another operation?(Yes/no):");
			String Choice=scanner.next().toLowerCase();
			
			 if (!Choice.equals("yes")) {
	                System.out.println("Exiting the calculator.");
	                break; //end the program
	            }
		}
	}
}
