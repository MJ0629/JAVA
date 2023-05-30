package com.mycompany.study.ch03;

public class ExDenyLogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//논리 부정 연산자 (!)
		
		boolean play = false;
		
		play = !play;
		
		System.out.println("play : " + play);
		
		
		int i = 3;
		
		if (!(i == 3)) {
			System.out.println("뭔가를 해라");
			// 부정형이 들어가서 실행하지 않음
		}
	}

}
