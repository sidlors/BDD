package mx.sidlors.test.pattern;

import org.openqa.selenium.WebDriver;

public interface SearchStrategy {
    void setDriver(WebDriver driver);
    void search(String searchFor);
}