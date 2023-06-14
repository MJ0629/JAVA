package com.mycompany.study.ch07.third;

import java.util.Scanner;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scanner = new Scanner(System.in);
		double input = scanner.nextDouble();
		double result =	Calculator.param(input*input);
		double result2 = Computer.param(input*input);
		if (input == 7 ) {
			System.out.println("원의 반지름 : " + (int)input);
			System.out.println("");
			System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
			System.out.println("원면적 :" +  result);
			System.out.println("");
			System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
			System.out.println("원면적 :" +  result2);
			
		}

//		if () {
//
//		}
	}

}
