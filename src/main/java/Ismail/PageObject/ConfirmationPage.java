package Ismail.PageObject;

import Ismail.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConfirmationPage extends AbstractComponent {

    WebDriver driver;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @FindBy (css ="p.text-gray-600.mb-6")
    WebElement paragraph;

    public String confirmationTxt(){
        String confirmationText = paragraph.getText();
        return confirmationText;
    }

//    // Assert that the text content is correct
//    String expectedText = "Terima kasih telah mendaftar sebagai mitra KiosLink.


}
