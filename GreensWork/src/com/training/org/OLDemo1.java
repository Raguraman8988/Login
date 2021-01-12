package com.training.org;
// Single Parameter Overloading
public class OLDemo1 {
	public void olSamp(int id) {
		System.out.println("Im int "+id);
	}
	public void olSamp(String name) {
		System.out.println("Im String "+name);
	}
	public static void main(String[] args) {
		OLDemo1 ol = new OLDemo1();
		ol.olSamp(100);
		ol.olSamp("Raj");
	}
}



