package com.testngwork.org;

import org.testng.annotations.Test;

public class FlipkartSearch {
	@Test(groups="women")
	private void sunglassSearch() {
		System.out.println("Sunglass Search");
	}
	
	@Test(groups="women")
	private void handbagSearch() {
		System.out.println("Handbag Search");
	}
	
	@Test(groups="boy")
	private void bycycleSearch() {
		System.out.println("Bycycle Search");
	}
	
	@Test(groups="boy")
	private void videogameSearch() {
		System.out.println("Videogame Search");
	}

}
