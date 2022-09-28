import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Anasayfa extends AnasayfaTest{

    By cookieLocator = By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll");

    public Anasayfa(WebDriver driver) {
        super(driver);
    }
    public void cookietkla(){
        WebElement cookietikla = driver.findElement(cookieLocator);
        cookietikla.click();
        System.out.println("Çerez Tıklama Başarılı");
    }
}

