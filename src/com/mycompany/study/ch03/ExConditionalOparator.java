package com.mycompany.study.ch03;

public class ExConditionalOparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 삼항 연산자(조건식) ? A : B
		
		int math = 85;
		
		char grade = (math>90) ? 'A' : 'B';
		System.out.println("grade :" + grade);
		
		// () ? A : B  ? 앞의 값이 true면 A를 false면 B를 출력하라
		
		//삼항연산자 (A=true) 와 (B=false)에 또 삼항 연산자를 대입할 수 있다.
		
		//true/ false로 값이 나오는 경우엔 이분법적으로 불가능 할 때는 if문 , value값으로 나올 땐 switch case문으로 사용하지만 또 if는 switch case문을 대체가 가능하다. 
	}

}
