package com.mycompany.study.ch06.tr01;

public class ExCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car morning = new Car(1, "morning", "white", "KIA", "경차", 18000000);
		
		
		
		System.out.println("자동차 이름 : " + morning.name );
		System.out.println("자동차 엔진 : " + morning.engine);
		System.out.println("자동차 색상 : " + morning.color);
		System.out.println("자동차 브랜드 : " + morning.brand);
		System.out.println("자동차 크기 : " + morning.size);
		System.out.println("자동차 금액 : " + morning.price);
		
		
		System.out.println("===========================");
		
		Car K9 = new Car(4, "K9", "black", "KIA", "중형", 58000000);
		
		System.out.println("자동차 이름 : " + K9.name );
		System.out.println("자동차 엔진 : " + K9.engine);
		System.out.println("자동차 색상 : " + K9.color);
		System.out.println("자동차 브랜드 : " + K9.brand);
		System.out.println("자동차 크기 : " + K9.size);
		System.out.println("자동차 금액 : " + K9.price);
		
		System.out.println("===========================");
		Car spark = new Car (1, "spark", "beige", "Chevrolet", "경차", 15000000);
		
		System.out.println("자동차 이름 : " + spark.name );
		System.out.println("자동차 엔진 : " + spark.engine);
		System.out.println("자동차 색상 : " + spark.color);
		System.out.println("자동차 브랜드 : " + spark.brand);
		System.out.println("자동차 크기 : " + spark.size);
		System.out.println("자동차 금액 : " + spark.price);
		
		
		
	}

}
