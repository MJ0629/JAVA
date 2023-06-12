package com.mycompany.study.ch06.trgugu;

import java.util.Scanner;

public class TrExGugu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("1~10까지의 정수를 입력해 주세요.");

	int a = scanner.nextInt();

	if (a > 0 && a < 10) {
		System.out.println("입력하신 정수는 : " + a);
		for (int i=1; i < 10; i ++) {
			int result = TrGugu.multi(a, i);
			System.out.println(a + "*" + i + "=" + result);
		}
	}	else {
		System.err.println("정수를 올바르게 입력해 주세요.");
	}
	
	}

}
