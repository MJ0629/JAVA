package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	TrGugu trgugu = new TrGugu();
	
	while (trgugu.z) {
		
		System.out.println("정수를 입력해주세요");
		int scannerInt = scanner.nextInt();
		
		if ( scannerInt !=0 ) {
			trgugu.gugu(scannerInt);
		}	else {
			System.out.println("프로그램 종료");
			trgugu.z = false;
		}
	}
	
	
	
	
	
//	System.out.println("1~10까지의 정수를 입력해 주세요.");
//
//	int a = scanner.nextInt();
//
//	if (a > 0 && a < 10) {
//		System.out.println("입력하신 정수는 : " + a);
//		for (int i=1; i < 10; i ++) {
//			int result = TrGugu.multi(a, i);
//			System.out.println(a + "*" + i + "=" + result);
//		}
//	}	else {
//		System.err.println("정수를 올바르게 입력해 주세요.");
//	}
	
	}

}
