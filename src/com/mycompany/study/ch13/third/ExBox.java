package com.mycompany.study.ch13.third;

public class ExBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		Box<Integer> box2 = Utill.boxing(100);
		
		box.setT("dfsdfds");
		System.out.println(box.getT());
		System.out.println(box2);
	}

}
