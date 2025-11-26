package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Factors;

public class FactorImpl implements Factors{

	@Override
	public void factorOperation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for finding factor");
		int num = scanner.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {  //remainder will be ==0  5%1==0 =>1,5%2==0 false
			System.out.println(i); //1 ,5
			}
		}
		
	}

}
