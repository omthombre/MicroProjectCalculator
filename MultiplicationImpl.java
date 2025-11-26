package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Multiplication;

public class MultiplicationImpl implements Multiplication {

	@Override
	public void multiple() {
		// TODO Auto-generated method stub
		System.out.println("Multiplication operation");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double a = scanner.nextDouble();
		System.out.println("Enter the second number:");
		double b = scanner.nextDouble();
		double result = a*b; // Multiplication of a*b are stored into result
		System.out.println("THe Multiplication of two number is:"+result); //result will be print a multiplication of two number
	}

}
