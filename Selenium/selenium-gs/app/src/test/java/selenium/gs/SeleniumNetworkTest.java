package selenium.gs;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v128.network.Network;

import java.util.Optional;

public class SeleniumNetworkTest {

    @Test
    void testSeleniumNetwork(){

        ChromeOptions handlingSSL = new ChromeOptions();
        handlingSSL.setAcceptInsecureCerts(true);

        ChromeDriver driver = new ChromeDriver(handlingSSL);

        DevTools devTools = driver.getDevTools();
        devTools.createSession();

        devTools.send(Network.enable(
                Optional.of(1000000),
                Optional.empty(),
                Optional.empty()));

        devTools.addListener(Network.responseReceived(), responseReceived -> {
            String responseUrl = responseReceived.getResponse().getUrl();
            //if (responseUrl.contains("makemytrip")) {
            System.out.println("Url: " + responseUrl);
            System.out.println("Response headers: " + responseReceived.getResponse().getHeaders().toString());
            //}
        });

        devTools.addListener(Network.requestWillBeSent(), request -> {
            System.out.println("Request Method : " + request.getRequest().getMethod());
            System.out.println("Request URL : " + request.getRequest().getUrl());
            System.out.println("Request headers: " + request.getRequest().getHeaders().toString());
            System.out.println("Request body: " + request.getRequest().getPostData().toString());
        });

        driver.get("https://10.177.111.184/ureg/#");
        //driver.get("https://httpbin.org/");
        driver.quit();
    }
}
