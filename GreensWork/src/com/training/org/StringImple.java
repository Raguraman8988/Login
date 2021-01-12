package com.training.org;

import java.util.Scanner;

public class StringImple extends StrAction{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String inStr = sc.nextLine();
		
		/*
		StrAction st = new StrAction();
		
		StringBuilder strImple = strReverse(inStr);
		
		StringBuilder strImple = StrAction.strReverse(inStr);
		
		System.out.println(strImple);
		*/
		
		String str = srtAct(inStr);
		
		System.out.println(str);
	}

}
