package com.learn;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SecondTest extends BaseTest {

    @Test(priority = 1)
    public void myntraTest() {
        Reporter.log(String.format("Myntra Test Started %s", Thread.currentThread().getId()), true);
        getDriver().navigate().to("https://www.myntra.com/");
        Assert.assertEquals(getDriver().getTitle(), "Myntra");
        Reporter.log(String.format("Myntra Test Ended %s", Thread.currentThread().getId()), true);
    }

    @Test(priority = 2)
    public void thoughtWorksTest() {
        Reporter.log(String.format("ThoughtWorks Test Started %s", Thread.currentThread().getId()), true);
        getDriver().navigate().to("https://www.thoughtworks.com/");
        Assert.assertEquals(getDriver().getTitle(), "ThoughtWorks | Creative technology consultants | ThoughtWorks");
        Reporter.log(String.format("ThoughtWorks Test Ended %s", Thread.currentThread().getId()), true);
    }
}
