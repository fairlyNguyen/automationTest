package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.GeneralTest;
import pages.HomeTab;
import scenarios.AppiumBaseClass;
import scenarios.AppiumController;

/**
 * Created by Thomas on 2016-06-15.
 */
public class BaseTestClass extends AppiumBaseClass {
    GeneralTest generalTest;
    HomeTab homeTab;

    @BeforeTest
    public void setUp() throws Exception {
        AppiumController.instance.start();
        generalTest = new GeneralTest(driver());
        homeTab = new HomeTab(driver());


    }

    @AfterTest
    public void tearDown() {
        AppiumController.instance.stop();
    }

}
