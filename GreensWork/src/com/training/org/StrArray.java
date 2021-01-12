package com.training.org;

public class StrArray {
	public static void main(String[] args) {
		
		String str = "Hello welcome to Trichy";
		
		// Split String
		String[] split = str.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			String string = split[i];
			System.out.println(string);
		}
		
		System.out.println();
		
		// String Array using array index[]
		String[] sub = new String[5];
		
		sub[0]="Tamil";
		sub[1]="English";
		sub[2]="Maths";
		sub[3]="Science";
		sub[4]="Social";
		
		// For loop
		for (int i = 0; i < sub.length; i++) {
			String string = sub[i];
			System.out.println(string);
		}
		
		System.out.println();
		// Foreach
		for (String string : sub) {
			System.out.println(string);
		}
		
		System.out.println();

		//String Array using {}
		String[] color = {"Black", "White", "Blue", "Red", "Green"};
		
		System.out.println("color[0] is "+color[0]);
		System.out.println("color[4] is "+color[4]);
		
		System.out.println();

		for (int i = 0; i < color.length; i++) {
			String string = color[i];
			System.out.println("Colors "+string+" Index Value is "+i);
		}
		
		
		
	}
		
	
}
