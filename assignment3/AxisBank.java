package org.assignment3;

public class AxisBank extends Bankinfo {
	
	public static void main(String[] args) {
		
		AxisBank A = new AxisBank();
		
		A.deposit();
	}

	public void deposit() {
		System.out.println("This is overridedeposit");
		
	}

}
