package Ismail.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class BasicTest {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        //landing page
        driver.get("https://kioslink.com/");
        //into join us page
        driver.findElement(By.cssSelector("a[href='/join-us']")).click();

        //join us page and fillup form
        driver.findElement(By.id("namaBadanUsaha")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("bentukBadanUsaha")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("produkFaktur")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("noNPWP")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("alamatBadanUsaha")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("namaBrand")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("alamatEmail")).sendKeys("ismail.xdev@gmail.com");
        driver.findElement(By.id("noHandphone")).sendKeys("123333231");
        driver.findElement(By.id("pic")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");
        driver.findElement(By.id("jabatanPIC")).sendKeys("THIS IS AUTOMATE TESTING WITH VALID DATA");

        //User Submitting and directing to confirmation email page
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        // Find the element by CSS selector
        WebElement paragraph = driver.findElement(By.cssSelector("p.text-gray-600.mb-6"));

        // Assert that the text content is correct
        String expectedText = "Terima kasih telah mendaftar sebagai mitra KiosLink. Kami telah mengirimkan email konfirmasi ke alamat email Anda.";
        Assert.assertEquals(expectedText, paragraph.getText());

    }
}
