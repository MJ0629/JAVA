package com.mycompany.study.ch06.tr01;

public class ExDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		
		Dog maltese = new Dog(5, "말티즈", "소형", "장모종", "white", 3);
		
		System.out.println("견종 : " + maltese.breed);
		System.out.println("나이 : " + maltese.age);
		System.out.println("크기 : " + maltese.size);
		System.out.println("털길이 : " + maltese.hair);
		System.out.println("몸무게 : " + maltese.weight);
		System.out.println("색상 : " + maltese.color);
		
		
		dog.hand();
		dog.turn();
		
		
	}

}
