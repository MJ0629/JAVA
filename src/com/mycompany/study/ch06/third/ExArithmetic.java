package com.mycompany.study.ch06.third;

public class ExArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic arithmetic = new Arithmetic();
		
		int a = 1;
		int b = 2;
		
		String  x = "장원영";
		String  y = "윤미진";
		
		
		int addResult = arithmetic.add(a, b);
		int minusResult = arithmetic.minus(a, b);
		int multiResult = arithmetic.multi(a, b);
		
		System.out.println(addResult); 
		System.out.println(minusResult); 
		System.out.println(multiResult); 
		
		
		
		String nameResult = arithmetic.name(y);
		
		System.out.println(nameResult);
		
		arithmetic.ive("아이브");//전달인자 사용문은 무슨 먼트?ㅋㅋㅋ
	
		arithmetic.money(10000);
		
		int takenResult = arithmetic.taken();
		
		System.out.println(takenResult);
	}

}
