package com.mycompany.study.ch13.second;

public class ExProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product<Object, Object> product = new Product<>();
		
		product.setKind("dfsdf");
		product.setModel(123456789);
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		Product<Tv, String> product2 = new Product<>();
		
		Tv tv = new Tv();
		
		System.out.println("--------------");
		product2.setKind(tv);
		product2.setModel("dsfksdfksdkf");
		System.out.println(product2.getModel());
		System.out.println(product2.getKind());
		
	}


}
