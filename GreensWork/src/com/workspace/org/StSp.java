package com.workspace.org;

public class StSp {

	public static void main(String[] args) {
		String s = "The cat on the wall";
		String[] x = s.split(" ");
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
			
		}
		
		for (String y : x) {
			System.out.println(y);
			
		}
	}
}
