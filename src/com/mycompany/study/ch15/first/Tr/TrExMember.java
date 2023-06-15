package com.mycompany.study.ch15.first.Tr;

import java.util.ArrayList;

public class TrExMember {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<TrMember> members = new ArrayList<TrMember>();
		
		TrMember memberTony = new TrMember("장원영", "Tony", "1111", "01011111111", "1@example.com"); 
		TrMember memberPretty = new TrMember("전지현", "Pretty", "2222", "01022222222", "2@example.com"); 
		TrMember memberGreat = new TrMember("장동건", "Great", "3333", "01033333333", "3@example.com"); 
		TrMember memberbeautiful = new TrMember("고소영", "beautiful", "4444", "01044444444", "4@example.com");
		
		members.add(memberTony);
		members.add(memberPretty);
		members.add(memberGreat);
		members.add(memberbeautiful);
		
		for(TrMember member: members) {
			System.out.print(member.name + " | ");
			System.out.print(member.id + " | ");
			System.out.print(member.pwd + " | ");
			System.out.print(member.phone + " | ");
			System.out.print(member.email);
			System.out.println();
		}
		
		
		for(int i=0; i < members.size(); i++) {
			System.out.print(members.get(i).name + " | ");
			System.out.print(members.get(i).id + " | ");
			System.out.print(members.get(i).pwd + " | ");
			System.out.print(members.get(i).phone + " | ");
			System.out.print(members.get(i).email + " | ");
			System.out.println();
		}
	}

}
