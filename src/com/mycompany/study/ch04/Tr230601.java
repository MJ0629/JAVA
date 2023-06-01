package com.mycompany.study.ch04;

public class Tr230601 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을 때 사분면 어디에 해당하는지 출력하는 프로그램을 작성하시오
//		(a,b)는 1사분면에 위치합니다.
//		int 타입의 변수를 3개 선언하고
//		세 정수중에서 최댓값, 최소값을 구하는 프로그램을 작성하시오.
		
		// 사장, 부장, 과장, 대리 주임, 사원, 나
		// 사장의 연봉은 얼마입니다. 스위치
		
		//1부터 10까지 더하는 프로그램 작성 for문
//		11부터 50까지 짝수의 합을 구하시오
		//2단 부터 출력되는 구구단 프로그램 작성
//		10*5의 별을 출력
//		박스만들기
		for (int i=0; i<=5; i++) {
			for (int j=0; j<=10; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("---------------------");
		for (int i=0; i<=5; i++) {
			for (int j=0; j<=10; j++) {
				if(i>=2 && i<=5 || j>=2 && j<=9) {
					System.out.print("*");
				}
			}
			System.out.println("");
		}
		int x=1;
		int y=-1;
		
		if(x>0 && y>0) {
			System.out.println("현재 위치는 1사분면입니다.");
		}	else if (x == 0 && y !=0 ) {
			System.out.println("현재 위치는 x축입니다.");
		}	else if (x<0 && y>0) {
			System.out.println("현재 위치는 2사분면입니다.");
		}	else if (x<0 && y<0) {
			System.out.println("현재 위치는 3사분면입니다.");
		}	else if (x!=0 && y==0) {
			System.out.println("현재 위치는 y축입니다.");
		}	else if (x==0 && y==0) {
			System.out.println("현재 위치는 중심점입니다.");
		} else {
			System.out.println("현재 위치는 4사분면입니다.");
		}
		
		
		int a = 1;
		int b = 0;
		int c = 0;
		
		if (a>b && a>c) {
			if(b<c) {
				System.out.println("최대값 :" + a);
				System.out.println("최소값 :" + b);
			}	else {
				System.out.println("최대값 :" + a);
				System.out.println("최소값 :" + c);
			}
		}	else if(b>a && b>c) {
			if(a>c) {
				System.out.println("최대값 :" + b);
				System.out.println("최소값 :" + a);
			}	else {
				System.out.println("최대값 :" + b);
				System.out.println("최소값 :" + c);
			}
		}	else if (c>a && c>b) {
			if (a>b) {
				System.out.println("최대값 :" + c);
				System.out.println("최소값 :" + a);
			}	else {
				System.out.println("최대값 :" + c);
				System.out.println("최소값 :" + b);
			}
		}	else if (a==b && b==c && a==c) {
			System.out.println("모든 값이 같습니다.");
		}	else {
			System.out.println("복수의 값이 같습니다.");
		}

	}

}
