package parallelTesting;

import org.testng.annotations.Test;

public class Test3 {

	@Test
	public void testMethod8() {
	System.out.println("TestClass3 >> testmethod8 >>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod9() {
	System.out.println("TestClass3 >> testmethod9 >>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod10() {
	System.out.println("TestClass3 >> testmethod10 >>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void testMethod11() {
	System.out.println("TestClass3 >> testmethod11 >>"+Thread.currentThread().getId());	
	}
	
	
}
