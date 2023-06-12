package com.mycompany.study.ch06.eighth;

public class ExEarth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Earth.TOP_BUILDING = 456; static final 은 중간에 값 변경 불가능
		
		System.out.println(Earth.TOP_BUILDING);
		System.out.println(Earth.TOP_MOUNTAIN);
		
//		가져오는 것과 출력을 이렇게 하면 안됨  직접적으로 접근하면 안된다.
//		get과 set을 사용해야함
//		동일 클래스에서는 = 을 사용해도 상관은 없지만 그래도 get set 을 사용해주는 것이 좋음
	}

}
