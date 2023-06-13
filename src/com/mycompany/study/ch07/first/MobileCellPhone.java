package com.mycompany.study.ch07.first;

public class MobileCellPhone extends DmbCellPhone{
	
	String aaa;
	
	void mobile() {
		powerOn();
		System.out.println("dfndkfdkflsfdlsfdskfjsdlkfj");
		turnOffDmb();
	}
	
	@Override
	void changeChannelDmb(int channel) {
//	오버라이드:	부모로부터 상속받은 함수를 재정의 하는 것을 의미
//		파라미터가 같아야함. (X값같은거)
	}
	

	
	
	
	
	
//	void mobile(x 값) {
//		powerOn();
//		System.out.println("dfndkfdkflsfdlsfdskfjsdlkfj");
//		turnOffDmb();
	
//		return y값
//	}
	
//	함수 구성 
//	1 . x값(들어오는 값) , y(나가는 값) 둘 다 있는 함수
//	2 . x값(들어오는 값)만 있는 함수
//	3 . y(나가는 값)만 있는 함수
//	4 . 둘 다 없는 함수
}
