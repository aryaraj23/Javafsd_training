package com.ust.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitExam {
	
	@BeforeClass
	public void beforeAllTest() {
		System.out.println("before all test starts..");
	}
	
	@Before
	public void beforeTest() {
		System.out.println("before test");
	}
	
	@AfterClass
	public void afterAllTest() {
		System.out.println("After all  test");
	}
	
	@After
	public void afterTest() {
		System.out.println("After test");
	}
	@Test(timeout=500) //timer is in millisec
	public void test() {
		String str="JAVA TRAINING";
		assertEquals("JAVA TRAINING", str);
		//fail("Not yet implemented");
	}
	
	@Test				//@test specifies the test method
	public void test1() {
		int i=4;
		assertNotEquals(4,3*2);
	}

}
