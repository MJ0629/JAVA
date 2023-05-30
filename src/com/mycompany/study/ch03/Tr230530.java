package com.mycompany.study.ch03;

public class Tr230530 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 부호 연산자
		//문자열 연산자 (+)
		//string equals
		//논리 연산자
		// && = & and : 논리곱 : 연산 참 참 참, 나머지 폴스
		// || = | : or : 논리합 : 연산 참 폴스 참, 촐스 참 참, 참 참 참, 폴스 폴스 폴스  | = 파이프라고 함
		// ^ : 베타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참
		//증감 연산자 (++, --)
		//논리 부정 연산자 (!)
		// 삼항 연산자(조건식) ? A : B
		//비교 연산자 (==, !=, <. <=, >, >=)
		// 대입 연산자(+=, -=, *= ..)
		
		String stringVal = "안녕하세요";
		String stringVal2 = "안녕하세요";
		String stringVal3 = new String("안녕하세요");
		
		System.out.println(stringVal != stringVal3);
		System.out.println(stringVal == stringVal3);
		System.out.println(stringVal.equals(stringVal3));
		System.out.println(stringVal.equals(stringVal2));
		
		int val = 1;
		int val2 = 2;
		int val3 = 3;
		
		int result = val++;
		int result2 = ++val;
		
		System.out.println(result2);
	}

}
