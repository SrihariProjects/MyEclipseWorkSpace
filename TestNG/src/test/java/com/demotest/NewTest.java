package com.demotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewTest {
	@Ignore
//	@Test(enabled=false)
	public void test1() {
		System.out.println("test1");
	}

	@Test(priority = -4)
	public void test2() {
		System.out.println("test2");
	}

	@Test
	public void test3() {
		System.out.println("test3");
	}
}

class test {

//	@Test
//	public void eating() {
//		System.out.println("I am eating");
//	}
//	
//	@BeforeClass
//	public void testing() {
//		System.out.println("I am testing..");
//	}

}
