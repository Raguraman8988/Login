package com.workspace.org;

// String demo
public class StringDemo {
	public static void main(String[] args) {
		String str = "Welcome to Trichy";
		String samp = "   Hello ";

		int length = str.length();
		System.out.println("Length " + length);

		boolean eqal = str.equals("Tri");
		System.out.println("Is Equal " + eqal);

		boolean equalignore = str.equalsIgnoreCase("Trichy");
		System.out.println("Equal ignore case " + equalignore);

		boolean equalignore2 = str.equalsIgnoreCase("Welcome to Trichy");
		System.out.println("Equal ignore case 2 " + equalignore2);

		String uperCase = str.toUpperCase();
		System.out.println(uperCase);

		String lowerCase = str.toLowerCase();
		System.out.println(lowerCase);

		int indexOf = str.indexOf('e');
		System.out.println("Index of " + indexOf);

		int indexOf1 = str.indexOf("c");
		System.out.println("Index of 1 " + indexOf1);

		int lastIndex = str.lastIndexOf('c');
		System.out.println("Last Index " + lastIndex);

		char charAt = str.charAt(6);
		System.out.println("Character at " + charAt);

		boolean startWith = str.startsWith("Welcome");
		System.out.println("Start with " + startWith);

		boolean startWith2 = str.startsWith("elcome", 1);
		System.out.println("Start with2 " + startWith2);

		boolean endsWith = str.endsWith("chy");
		System.out.println("Ends with " + endsWith);

		boolean con = str.contains("o");
		System.out.println("Contains " + con);

		boolean con1 = str.contains("To");
		System.out.println("Contains1 " + con1);

		boolean con2 = str.contentEquals("Welcome to Trichy");
		System.out.println("Contains equals " + con2);

		String subString = str.substring(4);
		System.out.println("Sub String " + subString);

		String subString2 = str.substring(4, 10);
		System.out.println("Sub String2 " + subString2);

		String replace1 = str.replace('o', 'O');
		System.out.println("Replace1 " + replace1);

		String replace2 = str.replaceAll("Trichy", "Chennai");
		System.out.println("Replace2 " + replace2);

		System.out.println("Befor Trim " + samp);
		String trimTest = samp.trim();
		System.out.println("After Trim: " + trimTest);

		int l2 = str.length();
		System.out.println("Length2 " + l2);

		String t2 = str.trim();
		System.out.println("trim2 " + t2);

		String s1 = "Greens";
		String s2 = " ";
		String s3 = "";
	//	String s4 = null;
		
		boolean empty = s1.isEmpty();
		System.out.println("s1 "+empty);
		
		boolean empty2 = s2.isEmpty();
		System.out.println("s2 "+empty2);
		
		boolean empty3 = s3.isEmpty();
		System.out.println("s3 "+empty3);
		
		//Null Pointer Exception
		/*
		boolean empty4 = s4.isEmpty();
		System.out.println("s4 "+empty4);
		*/
		
		String a="D";
		int compareTo = a.compareTo("A");
		System.out.println("compareTo "+compareTo);
		
		int compareToIgnoreCase = a.compareToIgnoreCase("a");		
		System.out.println("compareToIgnoreCase "+compareToIgnoreCase);
		

	}
}
