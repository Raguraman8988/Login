package com.training.org;

public class StringCheck {
	
	public static void main(String[] args) {
		String ja="Welcome to Java";
		String tr="Hello to Trichy";
		
		String[] jaSplit=ja.split(" ");
		String[] trSplit=tr.split(" ");
		
		for (int i = 0; i < jaSplit.length; i++) {
			String string1 = jaSplit[i];
			
		//	System.out.println(string1);
			
			for (int j = 0; j < trSplit.length; j++) {
				String string2 = trSplit[j];
				
				if (string1 == string2) {
					
					System.out.println(string1);
					
				} else {
					System.out.println("Null");
						
				}
		//		System.out.println(string2);
				
				
			}
		}
	}

}
