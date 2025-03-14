package Ismail.PageObject;

import Ismail.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage extends AbstractComponent {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        super(driver);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href='/join-us']")
    WebElement joinUs;

    public JoinUsPage goToJoinUs(){
        joinUs.click();
        JoinUsPage joinUsPage = new JoinUsPage(driver);
        return joinUsPage;
    }

    public void goTo (){

        driver.get("https://kioslink.com/");
    }
}


//driver.findElement(By.cssSelector("a[href='/join-us']")).click();