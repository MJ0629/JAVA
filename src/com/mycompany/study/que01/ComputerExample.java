package com.mycompany.study.que01;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		int r = 7;
		calculator.circleArea(r);
		computer.circleArea(r);
		
		System.out.println("원의 반지름 : " + r );
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		System.out.println("Calculator 원면적 : " + calculator.circleArea(r));
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		System.out.println("Computer 원면적 : " + computer.circleArea(r));
	}

}
