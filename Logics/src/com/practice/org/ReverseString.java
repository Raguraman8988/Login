package com.practice.org;

public class ReverseString {
	public static void reverseWord() {
		String s = "Welcome";
		String reverse = " ";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println("Reverse word is: " + reverse);
	}
	
	public static void reverseEachWord() {
		String s = "Welcome to Java";
		String[] split=s.split(" ");
		String reverseString=" ";
		for (String x : split) {
			String reverseWord="";
			for (int i = x.length()-1; i >=0; i--) {
				reverseWord=reverseWord+x.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		System.out.println("Original String: "+s);
		System.out.println("Reverse String: "+reverseString);
	}
	
	
	public static void main(String[] args) {
		reverseWord();
		reverseEachWord();
	}
}
