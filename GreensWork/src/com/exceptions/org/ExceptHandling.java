package com.exceptions.org;

public class ExceptHandling {

	public static void test() throws Exception {
		int j = 10, i = 2;
		if (j == 0) {
			throw new MyException();

		} else {
			System.out.println(j/i);
			System.out.println("task completed");
		}
		
		if (j!=0) {
			throw new MyException("value");
		}
	}
	public static void main(String[] args) throws Throwable {
		test();
		
	}
}
