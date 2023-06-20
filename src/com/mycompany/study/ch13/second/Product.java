package com.mycompany.study.ch13.second;

public class Product<A,B> {

	
	
	private A kind;
	public A getKind() {
		return kind;
	}
	public void setKind(A kind) {
		this.kind = kind;
	}
	public B getModel() {
		return model;
	}
	public void setModel(B model) {
		this.model = model;
	}
	private B model;
	
//	마우스 우클릭 후 -> 소스 -> getter setter 선택해서 전부 선택하기
}


//public class product <T,M> {
//	
//	
//	
//	private T kind;
//	private M model;
//}
