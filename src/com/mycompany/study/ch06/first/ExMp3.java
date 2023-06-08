package com.mycompany.study.ch06.first;

public class ExMp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MP3 mp3 = new MP3(); //객체 생성 //new는 연산자 (객체를 만들라는 명령어)
		//디폴트 생성자
		
		System.out.println("모델명 : " + mp3.name);
		System.out.println("색상 : " + mp3.color);
		System.out.println("제조사 : " + mp3.company);
		System.out.println("용량 : " + mp3.size);
		
		
		mp3.play();
		mp3.stop();
	}

}
