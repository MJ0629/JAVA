package com.mycompany.study.ch07.first;

public class Exphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		
		CellPhone cellphone = new CellPhone();
		
		MobileCellPhone mobile = new MobileCellPhone();
		
		dmbcellphone.powerOn();
		dmbcellphone.model= "";
		
		System.out.println("===============================");
		
		mobile.powerOn();
		
		
		
	}

}
