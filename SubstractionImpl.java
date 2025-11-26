package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Substraction;

public class SubstractionImpl implements Substraction {

	@Override
	public void substract() {
		// TODO Auto-generated method stub
		System.out.println("Substraction operation");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		double a = scanner.nextDouble();
		System.out.println("Enter the second number:");
		double b = scanner.nextDouble();
		double result = a-b;  // Substraction of a-b is stord into result 
		System.out.println("THe substraction of two number is:"+result);
	}

}
