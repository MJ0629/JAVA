package com.mycompany.study.ch04;

public class ExForOneToTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1부터 10까지 더하는 프로그램 작성
		//1:1
		
		
		
		for (int i=1; i<=10; i++) {
			System.out.println("1 + "+ i + " = " + (1 + i));
		}
		int sum = 0;
		for (int i=1; i<=10; i++) {
			sum = sum+i;
			System.out.println("i:" + i + "| sum : " + sum);
		}
		
		
//		11부터 50까지 짝수의 합을 구하시오
		int sum2=0;
		for (int i=11; i<=50; i++) {
			if(i%2==0) {
				sum2 = sum2+i;
				System.out.println("i : " +i + ", sum : "+ sum2);
			}
		}
	}

}
