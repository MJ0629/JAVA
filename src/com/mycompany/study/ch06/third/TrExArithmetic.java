package com.mycompany.study.ch06.third;

public class TrExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TrArithmetic arithmetic = new TrArithmetic();
		
		
		int a = 1;
		int b = 10;
		
		int plusResult = arithmetic.plus(a,b);
		int minusResult = arithmetic.minus(a,b);
		int multiResult = arithmetic.multi(a,b);
		
		System.out.println(plusResult);
		System.out.println(minusResult);
		System.out.println(multiResult);
		
		
		arithmetic.name("윤미진");
		
		arithmetic.takeMoney(100000);
	}

}
