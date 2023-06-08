package com.mycompany.study.ch06.tr01;

public class Dog {

	
	int age;
	String breed;
	String size;
	String hair;
	String color;
	int weight;
	
	Dog () {
		
	}
	
	Dog (
			int age, 
			String breed, 
			String size, 
			String hair, 
			String color, 
			int weight
			) 
	{
		this.age = age;
		this.breed = breed;
		this.size = size;
		this.hair = hair;
		this.color = color;
		this.weight = weight;
	}
	
	
	
	
//	method
	
	
	void hand () {
		System.out.println("강아지가 손을 줍니다.");
	}
	
	void turn () {
		System.out.println("강아지가 한바퀴 돕니다.");
	}
	void sit () {
		System.out.println("강아지가 앉습니다.");
	}
	
	void Wait () {
		System.out.println("강아지가 기다립니다.");
	}
	
}
