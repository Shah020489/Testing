import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class StartingPoint {

    public static void main(String args[]){

        System.setProperty("webdriver.gecko.driver","C:\\Users\\shahmed\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com");
        driver.close();

        System.out.print("Hello World");
    }
}
