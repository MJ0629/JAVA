package com.mycompany.study.ch02;

public class ExConstants {
	
	public static final String MY_NAME = "MJ";
	public static final Double PAI = 3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static final -상수 선언법 /상수는 무조건 대문자로 작성
		//public static final String MY_NAME = "MJ"; 상수는 void 안에 쓸 수 없음 클래스에만 사용 가능 (관행적인 이유도 있음)
		
		System.out.println("MY_NAME : " + MY_NAME);
		
		//	MY_NAME = "Asher" 상수라서 다시 선언하면 값이 안들어감;
	}

}
