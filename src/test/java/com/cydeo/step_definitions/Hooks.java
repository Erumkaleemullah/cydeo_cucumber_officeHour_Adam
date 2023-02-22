package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    //we will create pre and post condition for all the scenarios and even steps.
    @Before // import from io cucumber.java
    public void setUpMethod() {
        System.out.println("---> @Before : Running before each scenario");
    }

    @After
    public void tearDownMethod(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "img/png", scenario.getName());
            System.out.println("@After: running after each scenario");
            Driver.closeDriver();
        }
  /* @BeforeStep
    public void setUpSteps(){
        System.out.println("@BeforeStep: running before each step ");
        Driver.closeDriver();
    }
   // @AfterStep
    public void tearDownSteps(){
        System.out.println("@AfterStep: running after each step ");
    }

   */
    }
}
