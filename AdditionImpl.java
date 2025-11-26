package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Addition;

public class AdditionImpl implements Addition {

	@Override
	public  void add() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");// User can enter first number
		double a = scanner.nextDouble();
		System.out.println("Enter the second number:");// User can enter Second number
		double b = scanner.nextDouble();
		double result = a+b;  // here addition of a+b is stored into result
		System.out.println("THe addition of two number is:"+result);// addition will be print
	}

	

	

	

	

}
