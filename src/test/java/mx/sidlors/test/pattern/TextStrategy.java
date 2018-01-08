package mx.sidlors.test.pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextStrategy implements SearchStrategy {

    private WebDriver driver;
    private By searchBox = By.name("q");
    private By searchButton = By.name("btnG");

    public void search(String searchFor) {
        System.out.println("Searching using Text Straegy:" + searchFor);

        driver.findElement(searchBox).sendKeys(searchFor);
        driver.findElement(searchButton).click();
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}