package org.example;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import java.net.MalformedURLException;


public class desafio extends baseTest {
    @Test
    public void shopTrip() throws MalformedURLException, InterruptedException {
        driver.findElement(By.xpath("//android.widget.Button[@text=\"Continue with Google\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.LinearLayout//android.support.v7.widget.RecyclerView//android.widget.LinearLayout[1]//android.widget.LinearLayout//android.widget.TextView[2]")).click();
        Thread.sleep(500);
        driver.findElement(AppiumBy.accessibilityId("Enter your destination")).click();
        driver.findElement(AppiumBy.accessibilityId("Enter your destination")).sendKeys("CUSCO");

    }

}
