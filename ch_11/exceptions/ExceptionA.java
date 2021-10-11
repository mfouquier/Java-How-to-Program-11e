package com.ch11_16;

public class ExceptionA extends Exception {
	public ExceptionA(String message) {
			System.err.printf("%nHandled in A %s%n", message);
	}
}
