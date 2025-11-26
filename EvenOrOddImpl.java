package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.EvenOrOdd;

public class EvenOrOddImpl implements EvenOrOdd{

	@Override
	public void EvenOrOddOperation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enetr the number for checking the number is even or odd");
		int number = scanner.nextInt();
		if(number % 2== 0) { // 2%2==0 true -Even  and 5%2==0 false -odd
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is odd");
		}
	}

}
