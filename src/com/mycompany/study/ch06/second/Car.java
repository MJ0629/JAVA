package com.mycompany.study.ch06.second;

public class Car {

	
//	field
	
	int engine;
	String name;
	String color;
	String company;
	
	
	//기본생성자
	//Car () {}

	Car () {
		
	}
	
//	내가 생성했을 때 기본 생성자 추가로 생성해줘야 사용가능 굳이 필요없을 땐 안만들어도 됨
	Car (int engine, String name, String color, String company) {
		
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.company = company;
	}
//	method
	
	
	void go() {
		System.out.println("앞으로 갑니다.");
	}
	
	
	void back() {
		System.out.println("뒤로 갑니다.");
	}
	
	
	
	
	
}
