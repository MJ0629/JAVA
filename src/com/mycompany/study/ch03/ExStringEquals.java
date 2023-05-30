package com.mycompany.study.ch03;

public class ExStringEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2); 
		System.out.println("result1=" + result1);	// true
		
		boolean result2 = (str1 == str3); 
		System.out.println("result2=" + result2);	// false	
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		//문자열 비교 할 땐 이걸 주로 사용 (str3이 string이지만 실제 객체 안에 내용이 같기 때문에)
	}

}
