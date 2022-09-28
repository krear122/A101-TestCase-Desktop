import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Anasayfahover extends AnasayfaTest{

    public Anasayfahover(WebDriver driver) {
        super(driver);
    }
    public void Giyimhover() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement giyimhover = driver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/a"));
        actions.moveToElement(giyimhover).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/section/section[1]/div/div/div/div[1]/div/div/ul/li[4]/div/div[2]/div/div/div[1]/ul[2]/li[8]/a")).click();
        System.out.println("Dizaltı Çorap Tıklama Başarılı");
    }
}
