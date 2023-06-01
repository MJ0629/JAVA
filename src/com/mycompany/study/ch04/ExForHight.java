package com.mycompany.study.ch04;

public class ExForHight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		10*5의 별을 출력
//		박스만들기
		
		

//		for (int i=1; i<=5; i++) {		
//			for(int j=0; j<=4; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
		
		
		for (int i=1; i<=5; i++) {
			for(int j=1; j<=10; j++) {
				if (i>=2 && i<=4 && j>=2 && j<=9) {
						System.out.print(" ");
				}	else {
					System.out.print("*");
				}
			}

			
			System.out.println(" ");
		}
		
	}

}
