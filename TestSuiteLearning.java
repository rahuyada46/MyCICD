
package Regression_Test_Suite;

import org.testng.annotations.Test;

import Base.BaseTestSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestSuiteLearning extends BaseTestSuite {
	@BeforeClass

	public void Setup() {

		System.out.println(" class TestSuiteLearning- This Runs before class");

	}

	@AfterClass

	public void Cleanup() {

		System.out.println(" class TestSuiteLearning - This Runs after class");

	}

	@Test
	public void testMethod1() {

		System.out.println(" running test -> class TestSuiteLearning - testMethod1");

	}

	@Test
	public void testMethod2() {

		System.out.println("running test -> class TestSuiteLearning testMethod2");

	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("class TestSuiteLearning - This will run before every method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("class TestSuiteLearning - This will run after every method");
	}

}
