package Ismail.Tests;

import Ismail.PageObject.JoinUsPage;
import Ismail.TestComponents.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FullTest extends BaseTest {

    @Test
    public void FullTestPositiveFunction() {

        //into join us page
        JoinUsPage joinUsPage = landingPage.goToJoinUs();

        //join us page and fillup form
        joinUsPage.inputData("THIS IS AUTOMATE TESTING WITH VALID DATA", "ismail.xdev@gmail.com", "123333231");

        //User Submitting and directing to confirmation email page
//        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Find the element by CSS selector
        WebElement paragraph = driver.findElement(By.cssSelector("p.text-gray-600.mb-6"));

        // Assert that the text content is correct
        String expectedText = "Terima kasih telah mendaftar sebagai mitra KiosLink. Kami telah mengirimkan email konfirmasi ke alamat email Anda.";
        Assert.assertEquals(expectedText, paragraph.getText());
    }
}
