package com.mycompany.study.ch05;

public class ExArrayCreateByValueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] scoreEnglish;
		int scoreMath[][];
//		이차원 배열이라고 해서 배열이 중복적으로 들어갈 수 있음 물론 여러개가 들어가는 것이 가능
//		요즘 사용하는 배열 형태 []꺽쇠괄호가 변수명 앞쪽에 위치함
		
//		실수형의 총 합과 실수형의 평균을 구하는 배열을 만들기
		String [] name;
		String name2 [];
		
		double[] total;
		double avg [];
		
		char[] grade ;
		char grade2[];
		
		boolean [] score;
		boolean score2 [];
		
		int [] scoreChemistry = {100, 99, 98, 97, 96, 95, 94};
		String[] scoreStudent = {"윤미진","천주아","홍현욱","채다솜","장원영"};
		char [] scoref = {'A','B','C','D','F'};
		scoreChemistry[0] =0;
		System.out.println(scoreChemistry[0]);
 		
		
//		[] scorePhysics;
//		scorePhysics = {100,99,98,};
//		선언과 동시에 초기화 하지 않으면 안됨
		
		int a = scoreChemistry.length;
		System.out.println(a);
		
		for (int i=0; i<=6; i++) {
			System.out.println(scoreChemistry[i]);
			
			
		}
		int sum2=0;
		int j = 0; 
		while( j<7 ) {
			sum2 = sum2+scoreChemistry[j];
			 System.out.println(scoreChemistry[j]);
		    j++;

		    System.out.println("sum2 : " + sum2);
	}
		for (int bb: scoreChemistry) {
			System.out.println(bb);
//			최근에 가장 많이 사용하는 방식 향상된 방식
//			데이터를 무더기로 뿌릴 수 있으나 한개씩 ? for문 + i처럼 각각의 데이터를 지정하는건 어려움


		}
		System.out.println("-----------------------------");
		int sum = 0;
		for (int i=0; i<a; i++) {
			
			sum = sum + scoreChemistry[i];				
		}
		System.out.println(sum);
		
		
}

}
