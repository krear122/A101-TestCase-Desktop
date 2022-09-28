import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Urunsayfa extends AnasayfaTest {

    By urunlocator = By.xpath("/html/body/section/section[4]/div[3]/div[2]/div/div[2]/div[2]/div/ul/li[1]/article/div/a/figure/img");
    By siyahlocator = By.xpath("//*[@id=\"attributes_integration_colourSİYAH\"]");

    public Urunsayfa(WebDriver driver) {
        super(driver);
    }

    public void Urunclick() throws InterruptedException {
        Thread.sleep(2000);
        WebElement siyahtklat = driver.findElement(siyahlocator);
        siyahtklat.click();
        System.out.println("Siyah Filtreleme Başarılı");
        Thread.sleep(2000);
        WebElement uruntklat = driver.findElement(urunlocator);
        uruntklat.click();
        System.out.println("Ürüne Tıklama Başarılı");


        }

    }

