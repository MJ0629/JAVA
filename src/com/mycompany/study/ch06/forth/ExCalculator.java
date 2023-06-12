package com.mycompany.study.ch06.forth;

public class ExCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator calculator = new Calculator();
		
		double result = calculator.areaSquare(5);
		double result2 = calculator.areaSquare(5,6);
		
		System.out.println(result);
		System.out.println(result2);
		
//		이런 방식을 오버로드라고 함
	}

}
