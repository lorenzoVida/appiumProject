package org.example;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class baseTest {

    public AndroidDriver driver;

    @BeforeClass
    public void ConfigureAppium() throws MalformedURLException {
        //AppiumServiceBuilder service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
        //        .withIPAddress("127.0.0.1").usingPort(4723);
        // service.start();
        UiAutomator2Options cap = new UiAutomator2Options();
        cap.setDeviceName("Android");
        cap.setPlatformName("Android");
        cap.setAutomationName("uiautomator2");
        cap.setAppPackage("com.booking");
        cap.setAppActivity("com.booking.startup.HomeActivity");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    }
}
