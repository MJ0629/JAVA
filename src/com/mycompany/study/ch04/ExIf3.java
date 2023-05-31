package com.mycompany.study.ch04;

public class ExIf3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		double b = a%2;

		String num = (b == 0) ? "입력하신 값은 짝수입니다." : "입력하신 값은 홀수입니다.";
		System.out.println(a);
		
		if((double)a%2 == 0 ) {

			System.out.println("입력하신 값은 짝수입니다.");
		}	else {
			System.out.println("입력하신 값은 홀수입니다.");
		}
		
		
		if(a != 0) {
			if(a%2 == 0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			System.out.println("판단이 불가능합니다.");
		}
		
		
	}
}
