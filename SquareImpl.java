package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Square;

public class SquareImpl implements Square{

	@Override
	public void squareOperation() {
		// TODO Auto-generated method stub
		System.out.println("Square operation");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		double num = scanner.nextDouble();
		double result = num*num;// here num*num it is give num*num that is 
		//give same number multiplication means it gives squares
		System.out.println("Square of number is:"+ result);
	}

	
}
