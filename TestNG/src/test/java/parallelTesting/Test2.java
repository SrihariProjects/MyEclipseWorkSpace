package parallelTesting;

import org.testng.annotations.Test;

public class Test2 {

	@Test
	public void testMethod5() {
	System.out.println("TestClass2 >> testmethod5 >>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod6() {
	System.out.println("TestClass2 >> testmethod6 >>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod7() {
	System.out.println("TestClass2 >> testmethod7 >>"+Thread.currentThread().getId());	
	}
	
}
