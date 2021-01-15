package seleniumPractise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
        //System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", System.getProperty(
                "user.dir") +"/src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseURL = "https://google.com";

        String expectedTitle = "Google";
        String actualTitle = " ";

        driver.get(baseURL);

        actualTitle=driver.getTitle();
        System.out.println(actualTitle);

        if(actualTitle.contentEquals(expectedTitle))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }
        driver.close();
    }
}



