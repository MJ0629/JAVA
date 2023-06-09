package com.mycompany.study.ch06.third;

public class TrArithmetic {
	
	
	
	public int plus (int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int minus (int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int multi (int a, int b) {
		int y = a * b;
		return y;
	}
	
	public String name (String name) {
		if (name.equals("윤미진")) {
			System.out.println("9번 학생입니다.");
		}	else {
			System.out.println("잘 몰라요");
		}
		return name;
	}
	
	public void takeMoney (int cash) {
		if (cash <= 10000) {
			System.out.println("ㅎㅎㅎ");
		}	else {
			System.out.println("횡재했네요");
		}
	}
}
