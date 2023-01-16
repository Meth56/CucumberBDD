package code.stepsDefinitions;

import code.utils.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setup(){
        Driver.getDriver().manage().window().maximize();
        System.out.println("Driver is Successfully started");
    }

    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()){
            byte[] data=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());

        }

    }
}
