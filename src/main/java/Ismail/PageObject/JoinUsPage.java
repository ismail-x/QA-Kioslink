package Ismail.PageObject;

import Ismail.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinUsPage extends AbstractComponent {

    WebDriver driver;

    public JoinUsPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "namaBadanUsaha")
    WebElement userNamaBadan;

    @FindBy(id = "bentukBadanUsaha")
    WebElement userBentukBadan;

    @FindBy(id = "produkFaktur")
    WebElement userProduk;

    @FindBy(id="noNPWP")
    WebElement userNpwpw;

    @FindBy(id="alamatBadanUsaha")
    WebElement userAlamat;

    @FindBy(id="namaBrand")
    WebElement userBrand;

    @FindBy(id="alamatEmail")
    WebElement userEmail;

    @FindBy(id="noHandphone")
    WebElement userNoHp;

    @FindBy(id="pic")
    WebElement userPic;

    @FindBy(id="jabatanPIC")
    WebElement userJabatanPIC;

    public void inputData(String AutomateTesting, String email, String handphone){
       userNamaBadan.sendKeys(AutomateTesting);
       userBentukBadan.sendKeys(AutomateTesting);
       userProduk.sendKeys(AutomateTesting);
       userNpwpw.sendKeys(AutomateTesting);
       userAlamat.sendKeys(AutomateTesting);
       userBrand.sendKeys(AutomateTesting);
       userEmail.sendKeys(email);
       userNoHp.sendKeys(handphone);
       userPic.sendKeys(AutomateTesting);
       userJabatanPIC.sendKeys(AutomateTesting);
    }
}
