package com.mycompany.study.ch04;

public class ExIf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을 때 사분면 어디에 해당하는지 출력하는 프로그램을 작성하시오
//		(a,b)는 1사분면에 위치합니다.
		
		int x = 0;
		int y = 0;
		
		if( x > 0 && y > 0 ) {
			System.out.println("1사분면에 해당합니다.");
		}	else if ( x < 0 && y > 0) {
			System.out.println("2사분면에 해당합니다.");
		}	else if ( x < 0 && y < 0) {
			System.out.println("3사분면에 해당합니다.");
		}	else if ( x > 0 && y < 0){
			System.out.println("4사분면에 해당합니다.");
		}	else if ( x == 0 && y != 0 ) {
			System.out.println("x축 위에 있습니다.");
		}	else if ( x != 0 && y == 0 ) {
			System.out.println("y축 위에 있습니다.");
		}	else {
			System.out.println("원점에 있습니다.");
		}
		
	}

}
