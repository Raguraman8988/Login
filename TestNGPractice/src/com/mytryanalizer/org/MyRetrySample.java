package com.mytryanalizer.org;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyRetrySample {
	
	@Test(retryAnalyzer = MyRetry.class)
	public void test1() {
		Assert.assertEquals("a", "sffss");
	}
	
	@Test(retryAnalyzer = MyRetry.class)
	public void test2() {
		Assert.assertEquals("b", "aabbaa");
	}
}
