package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Average;

public class AverageImpl implements Average{

	@Override
	public void averageOperation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the numbers we want to average");
		int numbers = scanner.nextInt();
		double sum=0; // we have initialize sum variable
		for(int i=1;i<=numbers;i++) { // 1 2 3 4 5 6 7 8 9 10
			
			System.out.println(i);
			sum=scanner.nextDouble();
		}
		double average = sum/numbers;  //55/10=5.5
		System.out.println("The average of numbers is:"+average);// 5.5 will be stored into average
	}

}
