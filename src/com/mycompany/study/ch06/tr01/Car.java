package com.mycompany.study.ch06.tr01;

public class Car {

	int engine;
	String name;
	String color;
	String brand;
	String size;
	int price;
	
	
	
	Car (
			int engine, 
			String name, 
			String color, 
			String brand, 
			String size, 
			int price
		) 
	{
		this.engine = engine;
		this.name = name;
		this.color = color;
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	
	void go () {
		System.out.println("자동차가 출발합니다.");
	}
	void stop () {
		System.out.println("자동차가 멈춥니다.");
	}
	
}
