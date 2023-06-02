package com.mycompany.study.ch05;

public class ExArrayCreateByNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr1 = new int [3];
		arr1[0] = -1;
		arr1[1] = 2;
		arr1[2] = 10;
		
		int[] arr2;
		arr2 =new int [5];
		// 잘 안쓰는 방법이지만 이렇게도 가능함
		arr2[0] = 10;
		arr2[1] = 20;
		arr2[2] = 23;
		arr2[3] = 14;
		arr2[4] = 11;
		
		
		int sum = 0;
		for (int i=0; i<arr1.length; i++) {
			sum = sum+arr1[i];

		}
		System.out.println("sum : " + sum);
		
		int sum2 = 0;
		int j = 0;
		while (j<arr1.length) {
			sum2 = sum2 + arr1[j];
			j++;
		}
		System.out.println("sum2 : " + sum2);
		int sum3 = 0;
		for (int i : arr1) {
			sum3 = sum3 + i;
		}
		System.out.println("sum3 : " + sum3);
		
		
		
		
	}

}
