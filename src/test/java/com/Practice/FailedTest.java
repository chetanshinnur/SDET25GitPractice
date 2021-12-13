package com.Practice;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTest {
	
	@Test
	
	public void failTest() {
		System.out.println("Failed");
		Assert.fail("Failed test case");
	}

}
