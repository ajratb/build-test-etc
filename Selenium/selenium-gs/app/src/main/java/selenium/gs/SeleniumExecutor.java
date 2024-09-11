package selenium.gs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v128.network.Network;
import org.openqa.selenium.devtools.v128.network.model.RequestId;

import java.time.Duration;
import java.util.Optional;
import java.util.logging.Level;

public class SeleniumExecutor implements Runnable{

    public Runnable waiter;

    @SuppressWarnings("CommentedOutCode")
    @Override
    public void run() {
        System.setProperty("webdriver.chrome.silentOutput", "true");
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);
//        handlingSSL.setPageLoadStrategy(PageLoadStrategy.NORMAL);
//        handlingSSL.enableBiDi();

        ChromeDriver driver = new ChromeDriver(handlingSSL);
        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(
                Optional.of(500000000),
                Optional.of(500000000),
                Optional.of(500000000)));

//        devTools.addListener(Network.responseReceived(), responseReceived -> {
//            String responseUrl = responseReceived.getResponse().getUrl();
//
//            if ("https://10.177.111.184/ureg/query?".equals(responseUrl)) {
////                System.out.println("Url: " + responseUrl);
//                System.out.println("Response headers: " + responseReceived.getResponse().getHeaders().toString());
//                RequestId requestId = responseReceived.getRequestId();
//
//                String body = devTools.send(Network.getResponseBody(requestId)).getBody();
//                System.out.println("Response body: " + body);
//            }
//        });

        devTools.addListener(Network.requestWillBeSent(), request -> {
            String url = request.getRequest().getUrl();
            if ("https://10.177.111.184/ureg/query?".equals(url)) {
//                System.out.println("Request URL : " + url);
//                System.out.println("Request Method : " + request.getRequest().getMethod());
                System.out.println(Thread.currentThread().getName());
                System.out.println("Request headers: " + request.getRequest().getHeaders().toString());
                RequestId requestId = request.getRequestId();
                System.out.println("Request body: " + devTools.send(Network.getRequestPostData(requestId)));
            }
        });

        driver.get("https://10.177.111.184/ureg/#");

        String title = driver.getTitle();
        System.out.println("Driver title: " + title);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));

        driver.findElement(By.xpath("//a[@href='#']")).click();

        WebElement loginBox = driver.findElement(By.name("login"));
        WebElement passwordBox = driver.findElement(By.name("password"));
        WebElement inputButton = driver.findElement(By.xpath("//input[@type='submit']"));

        loginBox.sendKeys("kubryakova.e");
        passwordBox.sendKeys("fjr9fdlDXxf394");
        inputButton.click();

        String currHandle = driver.getWindowHandle();
        System.out.println("Window is: " + currHandle);
        driver.switchTo().window(currHandle);

        WebElement managerLink = driver.findElement(By.xpath("//*[contains(text(), 'Менеджер ссылок')]"));

        managerLink.click();

        String currHandle2 = driver.getWindowHandle();
        System.out.println("Window is: " + currHandle2);

//        Object[] windowHandles = driver.getWindowHandles().toArray();
//        System.out.println("Windows count: " + windowHandles.length);
        //driver.switchTo().window((String) windowHandles[1]);
        driver.switchTo().window(currHandle2);
        WebElement exitLink = driver.findElement(By.xpath("//*[contains(text(), 'Электронные СМИ и СМК')]"));
        exitLink.click();


        //driver.close();
//        devTools.close();
        waiter.run();
        driver.quit();

        System.out.println("THE END");
    }
}
