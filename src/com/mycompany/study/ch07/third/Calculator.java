package com.mycompany.study.ch07.third;

public class Calculator {

	

	public static double param (double param) {
		Constants constants = new Constants();
		double PAI_1 = constants.PAI_1;
		
		return param * PAI_1;
	}

	
//	필드는 없으며
//	함수는 param 으로 원의 반지름을 받으며
//	리턴은 PAI_1 을 이용하여 원의 면적을 계산하여 리터 합니다.

}
