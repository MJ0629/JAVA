package com.mycompany.study.ch05;

public class ExArrayInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//kor, eng, math 각 과목별 합과 평균
		// 각 사람의 총합과 평균을 구하시오
		String []sub = {"kor","eng","math"};
		String [] name = {"윤미진","천주아","채다솜"};
		int [][] score = {{99,88,55},{55,44,33},{22,11,55}};
		
		for (int i=0; i<score.length; i++) {
//			System.out.println(score[i]);
			for (int j=0; j<score[i].length; j++) {
				
				System.out.println("score["+i+"]["+j+"] : " + score[i][j]);
			}
			System.out.println("----------------------------------------");
	}
		int[] arr = new int [sub.length];
		int[] sum = new int[score.length];
		double [] avg;
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
				sum[i] = sum[i] + score[i][j];
			}

		avg = new double [i];
		System.out.println(avg.length);
		System.out.println(sum[i]);
		int k = avg.length;
		System.out.println("k" + k);
		if (avg.length == k) {
			
		}	else {
			System.out.println("a" +2);
		}
		}
		System.out.println("------");
		System.out.println(sum.length);
		
		
	
	}
}
