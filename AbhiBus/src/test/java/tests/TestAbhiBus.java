package tests;

import abhibus.BaseTest;
import abhibus.AbhiBusHomePage;
import abhibus.TestUtil;

public class TestAbhiBus extends BaseTest {

    public static void main(String[] args) throws InterruptedException {

        BaseTest bt = new BaseTest();
        bt.initializeBrowser();

        AbhiBusHomePage homePage = new AbhiBusHomePage(driver);

        homePage.enterFrom("Hyderabad");
        homePage.enterTo("Bangalore");
        homePage.selectDate();
        homePage.clickSearch();

        TestUtil.waitFor(5000);

        bt.tearDown();
    }
}
