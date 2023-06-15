package com.mycompany.study.ch15.second;

import java.util.ArrayList;
import java.util.Vector;

import com.mycompany.study.ch15.first.Language;

public class ExLanguageAs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<Language> arrayList = new Vector<Language>();
		
		for(Language language : arrayList) {
			System.out.println("language.name : " + language.name);
			System.out.println("language.version : " + language.version);
		}
		
		Language language = new Language("JAVA" , 11);
		
		arrayList.add(language);
		arrayList.add(new Language("Python",8));
		arrayList.add(new Language("C#",6));
		
		for(Language a : arrayList ) {
			System.out.println(a.name);
		}
		
	}

}
