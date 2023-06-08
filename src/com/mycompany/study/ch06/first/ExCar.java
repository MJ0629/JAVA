package com.mycompany.study.ch06.first;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1;
		System.out.println(a);
		
		Car car = new Car();	//생성 - >메모리에 넣은것
		
		
		
		
		
//		마지막 단계 : 객체 사용
		System.out.println("자동차 이름 : " + car.name);
		System.out.println("자동차 색상 : " + car.color);
		System.out.println("자동차 엔진 : " + car.engine);
		System.out.println("자동차 회사 : " + car.company);
		
		
		car.go();
		car.back();
		
		
		
		System.out.println("-----------------------------------");
		
		MP3 mp3 = new MP3();
		
		System.out.println("모델명 : " + mp3.name);
		System.out.println("색상 : " + mp3.color);
		System.out.println("제조사 : " + mp3.company);
		System.out.println("용량 : " + mp3.size);
		
		
		mp3.play();
		mp3.stop();
		
	}

}
