package com.ch11_16;

public class ExceptionTester {

	public static void main(String[] args) {
		
		try {
			getB();//try method
		}
		catch (ExceptionA e) {
			//if exception encountered in above method throw exception A
		}
		try {
			getC();//try method
		}
		catch (ExceptionA e) {
			//if exception encountered in above method throw exception A
		}
	}
	
	public static void getB() throws ExceptionB {
		//throws an Exception B message which is inherited from Exception A
		throw new ExceptionB("but thrown from ExceptionB.");
	}
	public static void getC() throws ExceptionC {
		//throws an Exception C message which is inherited from Exception B -> Exception A
		throw new ExceptionC("but thrown from ExceptionC.");
	}

}
