package mx.sidlors.test.cucumber.step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class LoginSteaps {
	
	private WebDriver driver;
	 
    @Before
    public void before() {
        driver = new FirefoxDriver();
        driver.navigate().to("http://en.wikipedia.org");
    }
 
	
	@Given("^I navigate to ExecuteAutomation Web Site login page$")
	public void i_navigate_to_ExecuteAutomation_Web_Site_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^I enter username as \"(.*?)\" and password as \"(.*?)\"$")
	public void i_enter_username_as_and_password_as(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^I click login button$")
	public void i_click_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("^I should see the userform page$")
	public void i_should_see_the_userform_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	}
}
