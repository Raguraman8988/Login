package com.collectionwork.org;

import java.util.LinkedHashMap;
import java.util.Map;

public class LHMapPro {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new LinkedHashMap<Integer, String>();
		
		m.put(1, "Java");
		m.put(2, "C");
		m.put(3, "C++");
		m.put(4, "Java");
		m.put(5, null);
		m.put(null, null);
		m.put(null, "R");
		System.out.println(m);
		boolean containsKey = m.containsKey(2);
		System.out.println(containsKey);
		String s = m.get(2);
		System.out.println(s);
	}

}
