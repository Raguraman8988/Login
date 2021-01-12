package com.testngwork.org;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	@Parameters({"empName", "empId"})
	private void credential(String empName, int empId) {
		System.out.println("Employee name and id : "+empName+", "+empId);
	}
	
	@Test
	@Parameters({"empName1","empId1"})
	private void credential1(@Optional("Appu") String empName, int empId ) {
		System.out.println("Employee name and id : "+empName+", "+empId);
	}
	

}
