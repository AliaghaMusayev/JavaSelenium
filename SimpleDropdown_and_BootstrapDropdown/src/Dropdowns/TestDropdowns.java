package Dropdowns;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.naming.CannotProceedException;

/**
 * Created by aliaga.musayev on 30.08.2017.
 */

public class TestDropdowns {

    @Test
    public void startTest() throws CannotProceedException
    {
        System.setProperty("webdriver.gecko.driver","D:\\SeleniumWithJava\\JavaSelenium.git\\trunk\\Drivers\\geckodriver.exe");
        WebDriver Firefoxdriver = new FirefoxDriver();
        Firefoxdriver.get("https://e.mail.ru/signup?from=main_noc");
        Firefoxdriver.manage().window().maximize();
        String newPage = Firefoxdriver.getWindowHandle();
        Firefoxdriver.switchTo().window(newPage);
        WebDriverWait wait = new WebDriverWait(Firefoxdriver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='registrationForm']/div[14]/span[2]/button")));
        WebElement element = Firefoxdriver.findElement(By.xpath(".//*[@id='registrationForm']/div[4]/span[1]/select[1]"));
        Select select = new Select(element);
        select.selectByValue("10");
    }
}
