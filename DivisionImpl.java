package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Division;

public class DivisionImpl implements Division {

	@Override
	public void divisionOperation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double a = scanner.nextDouble();
		System.out.println("Enter the second number:");
		double b = scanner.nextDouble();
		double result = a/b;  // The division of a/b is stored into result
		System.out.println("THe Division of two number is:"+result); //Ans result will be stored a division
	}

}
