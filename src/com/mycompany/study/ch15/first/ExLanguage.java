package com.mycompany.study.ch15.first;

import java.util.ArrayList;

public class ExLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<String> list = new ArrayList<String>();
//		
//		list.add("JAVA");
//		list.add("Python");
//		list.add("Node");
//		list.add(1,"C#");	// 리스트의 1번째에 끼워 넣으라는 명령어
//		
//		
//		for(int i=0; i<list.size(); i++) {
//			System.out.println("list.get(" + i + ") : " + list.get(i));
//		}
//		
//		
//		
//		list.remove("Python");
//		System.out.println("=======================================");
//		
//		for(String a : list) {
//			System.out.println("요즘 많이 사용하는 향상된 for문 a: " + a);
//		}	// collection 에서는 for문을 이렇게 사용함 위에처럼은 잘 사용하지 않음
//				
//		
//		for(int i=0; i<list.size(); i++) {
//			String a = list.get(i);
//			System.out.println("이건 일반 for 문 a : " + a);
//		}
//		
//		
//		ArrayList<String> arrayList = new ArrayList<String>();
//		arrayList.add("윤미진");
//		arrayList.add(null);
//		arrayList.add("가나다라");
//		arrayList.add("1234");
//		arrayList.add("ABCD");
//		arrayList.add("あいうえお");
//		
//		
//		arrayList.remove(0);
//		
//		for(String lang : arrayList) {
//			System.out.println("lang  : " + lang);
//		}
		
//		====================================================================================================
		
		
		ArrayList<Language> arrayList = new ArrayList<Language>();
//		type을 string이나  int 로 지정하지 않고 연결하는 클래스를 타입으로 지정
		for(Language language : arrayList) {
			System.out.println(language);
//			객체가 없어서 출력이 안됨
		}
		
//		arrayList.add("JAVA"); // Language 객체를 넣어 주어야 되서 오류
		
		Language language = new Language("JAVA", 11);
		
		arrayList.add(language);	//이걸 꼭 넣어야함 이 부분을 잘 이해해야함
		
		
		
		
		for(Language a : arrayList) {
			System.out.println("language.name : " + a.name);
			System.out.println("language.version : " + a.version);
			System.out.println("===========================");
		}
		
//		string 이나 int 를 넣을 수 없고 객체만 넣을 수 있음 (language)를 넣어놨기 때문에 lng만 넣을 수 잇음
		
		
		
		
		
		
	}

}
