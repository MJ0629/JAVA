package com.mycompany.study.ch15.first.Tr;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ExMember {
	
	public static void main(String[] args) {
	
		
		ArrayList<Member> arrayList= new ArrayList<Member>();
//		array list 불러오기
		
		Member member = new Member("윤미진", "YMJ","1234","010-0101-0101","gmail");
		Member member2 = new Member("천주아", "CJA","5678","010-1234-5678","naver");
		Member member3 = new Member("홍현욱", "HYUN","9876","010-9876-5432","nate");
		Member member4 = new Member("채다솜", "CDS","8888","010-5555-7777","daum");
//		멤버 정보 넣기
		
		
		arrayList.add(member);
		arrayList.add(member2);
		arrayList.add(member3);
		arrayList.add(member4);
		
//		멤버Class array list 만들기
		for(Member a : arrayList) {
			System.out.println("이름 : " + a.name);
			System.out.println("ID : " + a.ID);
			System.out.println("PW : " + a.PW);
			System.out.println("전화번호 : " + a.tel);
			System.out.println("이메일 : " + a.Email);
			System.out.println("=========================================");
		}
	
	
	}
	
}
