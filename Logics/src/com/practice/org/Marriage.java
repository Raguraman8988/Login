package com.practice.org;

public class Marriage extends Boy{
@Override
public String girlName(String girl) {
//	super.girlName(String girl);
	girl="Pooja";
	System.out.println(girl);
	return girl;
}
public static void main(String[] args) {
	Marriage m = new Marriage();
	m.girlName("Pooja");
	
}
}
