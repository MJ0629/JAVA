package com.mycompany.study.ch04;

public class ExIf5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int 타입의 변수를 3개 선언하고
//		세 정수중에서 최댓값, 최소값을 구하는 프로그램을 작성하시오.
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		if(a>b && a>c) {
			if(b<c) {
				System.out.println("최대값은 A");
				System.out.println("최소값은 B");
			}	else {
				System.out.println("최대값은 A");
				System.out.println("최소값은 C");
			}
		}	else if (b>a && b>c) {
			if(a<c) {
				System.out.println("최대값은 B");
				System.out.println("최소값은 A");
			}	else {
				System.out.println("최대값은 B");
				System.out.println("최소값은 C");
			}
		}	else if (c>a && c>b){
			if(b>a) {
				System.out.println("최대값은 C");
				System.out.println("최소값은 A");
			}	else {
				System.out.println("최대값은 C");
				System.out.println("최소값은 B");
			}
		}	else if (a==b && a==c) {
			System.out.println("값이 모두 같습니다.");
		}	else {
			System.out.println("값이 2개가 동일합니다.");
		}
	}	

}
