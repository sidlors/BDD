package mx.sidlors.test.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage {

    private WebDriver driver;
    private SearchStrategy strategy;
    private By result = By.className("rc");

    public GooglePage(WebDriver driver, SearchStrategy stragey) {

        this.driver = driver;
        this.strategy = stragey;
        this.strategy.setDriver(driver);

        //navigate to google page
        driver.get("https://www.google.com");
    }

    public void search(String txt) {
        this.strategy.search(txt);
    }

    public int getResultsCount() {
        return this.driver.findElements(result).size();
    }
}