package mx.sidlors.test.pattern.run;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTesting {

	@Test
	//@Ignore
	public void executeFirefoxDriver() throws MalformedURLException {
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setCapability("marionette", true);
		capabilities.setPlatform(Platform.LINUX);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);
		driver.get("http://www.javacodegeeks.com/");
		WebElement element = driver.findElement(By.name("s"));
		element.sendKeys("selenuim");
		element.submit();
		driver.quit();
	}

	@Test
	//@Ignore
	public void executeChrome() throws MalformedURLException {
		this.execute(DesiredCapabilities.chrome());
	}

	private void execute(final DesiredCapabilities capability) throws MalformedURLException {
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		driver.get("http://www.javacodegeeks.com/");
		WebElement element = driver.findElement(By.name("s"));
		element.sendKeys("selenuim");
		element.submit();
		driver.quit();
	}
}
