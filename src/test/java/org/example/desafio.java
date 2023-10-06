package org.example;

import Page.detailHotelPage;
import Page.listHotelPage;
import Page.searchPage;
import org.testng.annotations.Test;
import java.net.MalformedURLException;


public class desafio extends baseTest {

    @Test
    public void shopTrip() throws MalformedURLException, InterruptedException {
        searchPage search = new searchPage(driver);
     //111111   driver.navigate().back();
       //driver.findElement(By.xpath("//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.LinearLayout//android.support.v7.widget.RecyclerView//android.widget.LinearLayout[1]//android.widget.LinearLayout//android.widget.TextView[1]")).click();
                    //                    /hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView[1]
       // driver.findElement(By.xpath("//android.widget.TextView[@text=\"moreagiletesting@gmail.com\"]")).click();
        //driver.findElement(By.xpath("@android.widget.FrameLayout[@resource-id='com.google.android.gms:id/account_particle_disc']")).click();
     //   driver.findElement(By.xpath("(//android.widget.LinearLayout)[4]")).click();

        //driver.findElement(By.xpath("[android.widget.LinearLayout@resource-id='com.google.android.gms:id/container]")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@resource-id='com.google.android.gms:id/account_display_name']")).click();
        //driver.findElement(AppiumBy.id("com.google.android.gms:id/account_display_name")).click();
        //driver.findElement(By.id("com.google.android.gms:id/account_display_name")).click();
        //example with 2 same lavel button with the same class
        //driver.findElements(By.className("")).get(1).click();
        //extract text from locator
        //String titulo= driver.findElement(By.id("")).getText();
        //Assert.assertEquals(titulo,"texto");
        //WebElement e = driver.findElement(By.id("com.booking:id/touch_outside"));
        //longPressAction(e);
       // driver.findElement(By.className("android.view.View"));
//        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\")"));
       // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollBackward"));
        // Java
        // Java
     //22222   Thread.sleep(9000);
       /////33333 scrollToEnd();
        //AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"yourtext\"));"));
        // Java
        //((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of("left", 100, "top", 100, "width", 200, "height", 200, "direction", "left", "percent", 0.75));

      //  driver.findElement(AppiumBy.accessibilityId("Enter your destination")).click();

        search.clickDestino();
        search.setDestino("Cusco");
        search.seleccionarDestinoIdeal();
        search.seleccionarFechasCalendario();
        search.confirmarFechas();
        listHotelPage listHotel = new listHotelPage(driver);
        listHotel.seleccionarNombreHotel();
        detailHotelPage detailHotel = new detailHotelPage(driver);
        detailHotel.seleccionarEstadia();
        detailHotel.seleccionarHabitaciones();
        detailHotel.confirmarEstadia();
        scrollToEnd();

    }

}
