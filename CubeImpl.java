package com.velocity.functionality.implementation;

import java.util.Scanner;

import com.velocity.functionality.Cube;

public class CubeImpl implements Cube{

	@Override
	public void cubeOperation() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number for finding cube");
		int num = scanner.nextInt();
		int res = num*num*num;// in that we can multiply same number on 3 times 
		//thats why it gives result is cube of that number
		System.out.println("The result of cube is:"+res);
		
	}

	
}
