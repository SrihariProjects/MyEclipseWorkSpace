package stepDefinations;

import org.junit.After;
import org.junit.Before;

public class Hooks {
	LoginSteps steps;
	
	@Before
	public void setUp() {
		System.out.println("Starting test Scenario...");
	}
	
	@After
	public void tearDown() {
		
		System.out.println("Ending Test Scenario...");
	}
}
