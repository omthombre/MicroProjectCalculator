package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Modulus;

public class ModulusImpl implements Modulus{

	@Override
	public void modulusOperation() {
		// TODO Auto-generated method stub
		System.out.println("Modulation Operation");
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter first number:");
		int num1 = scanner.nextInt();
		System.out.println("Enter second number:");
		int num2 = scanner.nextInt();
		
		if(num2!=0) {
			int result = num1%num2;// This will returns the remainder of dividing 
			//num1 by num2 and then it stored into result
			System.out.println("The modulus is:"+result);
		}else {
			System.out.println("Modulation is not performed.");
		}
	}

	
}
