package com.testngtraining.org;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcept {

	@Test(dataProvider = "testData")
	public void creditial(String userName, int userId) {
		System.out.println("Username & Password: " + userName + ", " + userId);
	}

	@DataProvider
	public Object[][] testData() {
		return new Object[][] { { "aa", 1234 }, { "bb", 4567 }, { "cc", 7896 } };
	}

}
