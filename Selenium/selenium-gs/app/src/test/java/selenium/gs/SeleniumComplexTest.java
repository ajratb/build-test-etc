package selenium.gs;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class SeleniumComplexTest {

    @Test
    void testSmiSmkRegister(){

        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);

        ChromeDriver driver = new ChromeDriver(handlingSSL);
//        ChromeDriver driver = new ChromeDriver();

        driver.get("https://10.177.111.184/ureg/#");

        String title = driver.getTitle();
        System.out.println("Driver title: " + title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        driver.findElement(By.xpath("//a[@href='#']")).click();

        WebElement loginBox = driver.findElement(By.name("login"));
        WebElement passwordBox = driver.findElement(By.name("password"));
        WebElement inputButton = driver.findElement(By.xpath("//input[@type='submit']"));

        loginBox.sendKeys("kubryakova.e");
        passwordBox.sendKeys("fjr9fdlDXxf394");
        inputButton.click();

        WebElement managerLink = driver.findElement(By.xpath("//*[contains(text(), 'Менеджер ссылок')]"));
        managerLink.click();
        driver.quit();
    }
}
