package Regression_Test_Suite; //testfiles

import org.testng.Assert;
import org.testng.annotations.Test;
import AppCode.SomeClasstoTest;
public class TestNG_Asserts {
  @Test
  public void testMethod1() {
		SomeClasstoTest obj = new SomeClasstoTest();
		int result = obj.someNumbers(1, 2);
		Assert.assertEquals(result, 3);
		System.out.println("running test -> testMethod1 and its result =" + result);
  }
  
  @Test //testthis
  public void testMethod2() {
		SomeClasstoTest obj = new SomeClasstoTest();
		String expectedString = "Hello World";
		String result = obj.addStrings("Hello", "World");
		Assert.assertEquals(result, expectedString);
		System.out.println("running test -> testMethod2 and its result =" + expectedString);
  }
  
  @Test
  public void testMethod3() {
		SomeClasstoTest obj = new SomeClasstoTest();
		int[]arrayExample = {1,2,3}; // For Failure to Pass make it {1,2,3}
		int[] result = obj.getArray();
		System.out.println("running test -> testMethod3 and its result =" + arrayExample);
		Assert.assertEquals(result,arrayExample);
  }
}
