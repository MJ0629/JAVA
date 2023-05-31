package com.mycompany.study.ch04;

public class ExIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grade = 2;
		int cost = 12000;
		double saleCost = 0.0;
		
		if( grade == 1 ) {
			//일반등급 5%			
			double nomal = cost*0.95;
			int result = (int)nomal;
			System.out.println("정가가 " + cost + "원 노말 등급의 할인가는: "+result+"원 입니다.");
		}	else if(grade == 2 ) {
			//브론즈 등급 10%
			double bronze = cost*0.9;
			int result = (int)bronze;
			System.out.println("정가가 " + cost + "원 브론즈 등급의 할인가는: "+(cost-(cost/20))+"원 입니다.");
		}	else if(grade == 3 ) {
			//실버등급 15%
			double silver = cost*0.85;
			int result = (int)silver;
			saleCost = cost * (1-0.15);
			System.out.println("정가가 " + cost + "원 실버 등급의 할인가는: "+ (int)saleCost +"원 입니다.");
		}	else if(grade == 4 ) {
			//골드 20%
			double gold = cost*0.8;
			int result = (int)gold;
			System.out.println("정가가 " + cost + "원 골드 등급의 할인가는: "+result+"원 입니다.");
		}	else if(grade == 5 ) {
			//플레티넘 2.7%
			double nomal = cost*0.973;
			int result = (int)nomal;
			System.out.println("정가가 " + cost + "원 플래티넘 등급의 할인가는: "+result+"원 입니다.");
		}	else {
			
		}
		
		
	}

}
