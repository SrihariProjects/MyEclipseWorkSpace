package grouping;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups = {"all"})
public class NewTest {
	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("test1");
	}
	
	@Test(groups = {"smoke","functional","sanity"})
	public void test2() {
		System.out.println("test2");
	}
	@Test(groups = {"functional","regression"})
	public void test3() {
		System.out.println("test3");
	}
}


@Test(groups="{few}")
class testing{
	@Test(groups="smokes")
	public static int test() {
		return 123;
	}
	
	@Test(groups="{test}")
	public void king() {
		System.out.println("I am the king");
	}
}
