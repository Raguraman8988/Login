package com.collectionwork.org;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapConcept {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		m.put(1, "Java");
		m.put(2, "C");
		m.put(3, "C++");
		m.put(4, "Java");
		m.put(5, null);
		m.put(null, null);
		m.put(null, "R");
		
		System.out.println(m);
		
		boolean containsKey = m.containsKey(null);
		System.out.println(containsKey);
		boolean containsValue = m.containsValue("C");
		System.out.println(containsValue);
		m.entrySet();
		System.out.println(m);
		String string = m.get(3);
		System.out.println(string);
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		int size = m.size();
		System.out.println(size);
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry<Integer, String>> entrySet1 = m.entrySet();
		for (Entry<Integer, String> entry : entrySet1) {
			System.out.println(entry);
			
		}
	}

}
