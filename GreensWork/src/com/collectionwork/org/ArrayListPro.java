package com.collectionwork.org;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPro {

	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		boolean contains = li.contains(20);
		System.out.println(contains);
		Integer integer = li.get(2);
		System.out.println(integer);
		li.remove(2);
		System.out.println(li);
		System.out.println(li);
		li.add(1, 100);
		System.out.println(li);
		li.add(0, 200);
		System.out.println(li);
		li.set(1, 500);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		int indexOf = li.indexOf(40);
		System.out.println(indexOf);
		Class<? extends List> class1 = li.getClass();
		System.out.println("class1 : "+class1);
		int hashCode = li.hashCode();
		System.out.println(hashCode);
		li.clear();
		System.out.println(li);
		System.out.println("************************");
		System.out.println();
		
		List<Integer> li1=new ArrayList<Integer>();
		li1.add(1000);
		li1.add(2000);
		li1.add(3000);
		li1.add(4000);
		System.out.println(li1);
		li.add(10);
		li.add(20);
		li.add(3000);
		li.addAll(li1);
		System.out.println("li "+li);
	//	System.out.println(li1);
		li.removeAll(li1);
		System.out.println(li);
		li.add(3000);
		li.add(50);
		System.out.println(li);
		li.retainAll(li1);
		System.out.println(li);
		
		
	}

}
