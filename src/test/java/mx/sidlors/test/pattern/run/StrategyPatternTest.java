package mx.sidlors.test.pattern.run;

import java.net.MalformedURLException;
import java.net.URL;
import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import mx.sidlors.test.pattern.GooglePage;
import mx.sidlors.test.pattern.SearchStrategy;
import mx.sidlors.test.pattern.TextStrategy;
import mx.sidlors.test.pattern.VoiceStrategy;

public class StrategyPatternTest {

	DriverManager driverManager;
	WebDriver driver;
	
	private void execute(final DesiredCapabilities capability) throws MalformedURLException {
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		driver.get("http://www.javacodegeeks.com/");
		WebElement element = driver.findElement(By.name("s"));
		element.sendKeys("selenuim");
		element.submit();
		driver.quit();
	}

	@BeforeTest
	public void beforeTest() {
		//driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
		//System.out.println(driverManager.getWebDriver().getTitle());
	}

	@BeforeMethod
	public void beforeMethod() {
		//driver = driverManager.getWebDriver();
	}

	@AfterMethod
	public void afterMethod() {
		//driverManager.quitDriver();
	}

	@Test(dataProvider = "dp")
	public void googleSearchStrategy(SearchStrategy strategy, String searchString, int resultCount) {

		GooglePage google = new GooglePage(driver, strategy);
		google.search(searchString);
		Assert.assertEquals(resultCount, google.getResultsCount());

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] { new Object[] { new TextStrategy(), "Test Automation Guru", 7 },
				new Object[] { new VoiceStrategy(), "weather today", 9 },
				new Object[] { new TextStrategy(), "Selenium WebDriver", 14 }, };
	}

}
