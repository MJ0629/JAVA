package com.mycompany.study.ch04;

public class Tr230531 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학점 생성
		//등급별 할인율
		//짝수 홀수 판별
		
		int score = 20;
		
		if(score >= 90) {
			if(score >=97) {
				System.out.println("A+");
			}	else if(score >=93) {
				System.out.println("A");
			}	else {
				System.out.println("A-");
			}
		}	else if(score >= 80) {
			if(score >= 87) {
				System.out.println("B+");
			}	else if(score >= 83) {
				System.out.println("B");
			}	else {
				System.out.println("B-");
			}
		}	else if(score >= 70) {
			if(score >= 77) {
				System.out.println("C+");
			}	else if(score >= 73) {
				System.out.println("C");
			}	else {
				System.out.println("C-");
			}
		}	else if(score >= 60) {
			if(score >= 67) {
				System.out.println("D+");
			}	else if(score >= 63) {
				System.out.println("D");
			}	else {
				System.out.println("D-");
			}
		}	else {
				System.out.println("F");
		}
		
		//등급별 할인
		
		double normal = 0.95;
		double bronze = 0.9;
		double silver = 0.85;
		double gold = 0.8;
		double platinum = 0.75;
		
		String grade;
		//등급
		int cost = 30000;
		

		int point=10;
		
		int salescost = 0;
		
		if(point >= 30000000) {
			//플래티넘
			grade="플래티넘 등급";
			System.out.println(grade);
		}	else if (point >= 10000000) {
			grade ="골드 등급";
			System.out.println(grade);
		}	else if (point >= 6000000) {
			grade = "실버 등급";
			System.out.println(grade);
		}	else if (point >= 3000000) {
			grade = "브론즈 등급";
			System.out.println(grade);
		}	else if (point >= 0) {
			grade = "노말 등급";
			System.out.println(grade);
		}
		
		
		
	}

}
