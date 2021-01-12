package com.testngtraining.org;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertConcept {
	@Test
	public void homePageValidation() {
		String expected="Ragu";
		String actual="ragu";
		
		Assert.assertEquals(actual, expected);
	//	Assert.assertNotEquals(actual, expected);
	//	Assert.assertNull(actual);
	//	Assert.assertNotNull(actual);
	//	Assert.assertTrue(1==2);
	//	Assert.assertSame(actual, expected);
	}
	
	@Test
	public void homePageSoftAssert() {
		String expected="Ragu";
		String actual="ragu";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
	}
}
