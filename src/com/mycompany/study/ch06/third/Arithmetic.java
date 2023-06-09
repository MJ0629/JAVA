package com.mycompany.study.ch06.third;

public class Arithmetic {
	
	//	더하기 함수 (피연산자는 2개로 선언) -한정은 아닌듯..
	// y = a + b
	
	public int add(int a, int b) {
		int y = a + b;
		return y;
	}
	
	public int minus(int a, int b) {
		int y = a - b;
		return y;
	}
	
	public int multi(int a, int b) {
		int y = a * b;
		return y;
	}
	
	
	public String name (String name) {
		String result;
		if( name.equals("장원영") ) {
			result = "Tony";
		}	else {
			result = " ^____^ ";
		}
		return result;
	}
	
	public void ive (String ive) {
//		(String ive)는 매개변수 파라미터라고 함
		switch (ive) {
		case "아이브" :
			System.out.println("장원영은 너무 예뻐");
			break;
			default :
				System.out.println("^__^");
		}
	}
	
//	ctrl + o 를 누르면 함수가 뭐뭐 있는지 볼 수 있음 (검색도 가능)
	
	
	
	public int money (int cash) {
		if (cash == 10000) {
			System.out.println("10,000원을 주웠습니다.");
		} else {
			System.out.println("가짜 돈을 주웠습니다.");
		}
		return cash;
	}
	
	public int taken () {
		return 10000;
	}
}
