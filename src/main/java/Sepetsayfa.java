import org.openqa.selenium.*;



public class Sepetsayfa extends AnasayfaTest{
By sepetekler = By.xpath("/html/body/section/section[3]/div[2]/div[1]/div/div[3]/div[2]/div[1]/button/i");

    public Sepetsayfa(WebDriver driver) {
        super(driver);
    }
    public void Sepetclk() throws InterruptedException {
        WebElement sepet = driver.findElement(sepetekler);

        sepet.click();
        Thread.sleep(4000);
        System.out.println("Sepete Ekleme Başarılı");

    }


}
