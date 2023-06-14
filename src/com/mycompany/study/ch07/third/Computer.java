package com.mycompany.study.ch07.third;

public class Computer extends Calculator {

		public static double param (double param) {
			// TODO Auto-generated method stub
			Constants constants = new Constants();
			double PAI_2 = constants.PAI_2;
			
			return param * PAI_2;
		}
	

		
		
		
		
//		Calculator를 상속 받습니다.
//		필드는 없으며
//		함수는 param 으로 원의 반지름을 받으며
//		리턴은 PAI_2 를 이용하여 원의 면적을 계산하여 리턴 합니다. 
//		(단 Calculator에서 생성한 함수를 override 하여 구현)

	

}
