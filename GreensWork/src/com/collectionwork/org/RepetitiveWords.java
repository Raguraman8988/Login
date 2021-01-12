package com.collectionwork.org;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepetitiveWords {

	public static void main(String[] args) {
		
		String s="Welcome to java to java to to java";
		String[] allWords=s.split(" ");
		Map<String, Integer> m=new LinkedHashMap<String, Integer>();
		
		for (String words : allWords) {
			if (m.containsKey(words)) {
				Integer in=m.get(words);
				m.put(words, in+1);
			} else {
				m.put(words, 1);
			}
		}
		System.out.println(m);
		Set<Entry<String, Integer>> entrySet=m.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println(entry);
			} 
		}
	}
	
}
