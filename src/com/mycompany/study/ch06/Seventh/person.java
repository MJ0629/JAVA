package com.mycompany.study.ch06.Seventh;

public class person {
	
	
	public String nation = "KOREA";
	final String ssn = "";
	public String name;
	
	public person(String nation, String ssn, String name) {
		this.nation = nation;
//		이미 초기화 되어 있으므로 객체 생성시 초기값 대입 불가능
//		this.ssn = ssn ; //		이미 초기화 되어 있으므로 객체 생성시 초기값 대입 가능
		this.name = name;
	}
}
