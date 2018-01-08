package mx.sidlors.test.cucumber.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public abstract class StepsBase {
	
	
	private WebDriver driver;
	 
    @Before
    public void before() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://en.wikipedia.org");
    }
 

}
