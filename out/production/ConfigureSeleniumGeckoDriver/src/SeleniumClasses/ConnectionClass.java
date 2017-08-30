package SeleniumClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by aliaga.musayev on 30.08.2017.
 */
public class ConnectionClass {

    public static void main(String[] args)
    {
        ConnectionClass cls = new ConnectionClass();
        //System.setProperty("webdriver.gecko.driver","D:\\SeleniumWithJava\\Drivers\\geckodriver.exe");
        //WebDriver Firefoxdriver = new FirefoxDriver();
        //Firefoxdriver.get("https://www.linkedin.com");

        cls.setLocationChrome();
        WebDriver Chromedriver = new ChromeDriver();
        Chromedriver.get("https://www.linkedin.com");
    }

    public void setLocationChrome()
    {
        System.setProperty("webdriver.chrome.driver","D:\\SeleniumWithJava\\Drivers\\chromedriver.exe");
    }
}
