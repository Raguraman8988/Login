package com.mytryanalizer.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyRetryTransformSample {
	
	@Test 
	public void test1() {
		Assert.assertEquals("a", "sffss");
	}
	
	@Test
	public void test2() {
		Assert.assertEquals("b", "aabbaa");
	}
}




