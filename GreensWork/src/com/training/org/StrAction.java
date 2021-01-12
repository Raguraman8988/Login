package com.training.org;

public class StrAction {

	public static StringBuilder strReverse(String test) {

		StringBuilder testAction = new StringBuilder(test);

		return testAction.reverse();
	}

	public static String srtAct(String str) {

		char ch[] = str.toCharArray();
		
		String rev= "";

		for (int i = ch.length - 1; i >= 0; i--) {
			
			rev+=ch[i];
		}
		return rev;
	}
}
