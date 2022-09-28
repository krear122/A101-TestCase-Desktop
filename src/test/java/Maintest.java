import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Random;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Maintest extends Mainstart{

    Anasayfa anaSayfa;
    Anasayfahover anasayfaHover;
    Urunsayfa urunSayfa;
    Sepetsayfa sepetSayfa;
   Random rand = new Random();
   int sayi = rand.nextInt(1000);


   @Test
    @Order(1)

    public void AnasayfaCerez(){
        anaSayfa = new Anasayfa(driver);
        anaSayfa.cookietkla();

    }
    @Test
    @Order(2)
    public void Anasayfahoverla() throws InterruptedException {
        anasayfaHover = new Anasayfahover(driver);
        Thread.sleep(2000);
        anasayfaHover.Giyimhover();


    }
@Test
@Order(3)
    public void UrunTikla() throws InterruptedException {
   urunSayfa = new Urunsayfa(driver);
   urunSayfa.Urunclick();
   Thread.sleep(2000);
   Sepetekle();
   driver.findElement(By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]")).click();
   System.out.println("Sepeti Görüntüle Başarılı");
   driver.findElement(By.xpath("/html/body/section/div[1]/div[2]/div/div[2]/div/a")).click();
   Thread.sleep(2000);
   System.out.println("Sepeti Onayla Başarılı");
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[1]/div[1]/div[2]/a")).click();
   Thread.sleep(2000);
   System.out.println("Üye Olmadan Devam Et Başarılı");
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input")).click();
   Thread.sleep(2000);
   System.out.println("Email Tıklama Başarılı");
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/div[1]/input")).sendKeys("denemehesap561@hotmail.com");
   Thread.sleep(2000);
   System.out.println("Email Yazma Başarılı");
   driver.findElement(By.xpath("/html/body/section/div[1]/div/div[2]/div/div/form/button")).click();
   Thread.sleep(2000);
   System.out.println("Devam Et Tıklama Başarılı");
   driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[1]/div[2]/ul[2]/li/a")).click();
   Thread.sleep(2000);
   System.out.println("Yeni Adres Oluştur Başarılı");
   WebElement Adresbaslk = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[2]/div/div/label/input"));
   Adresbaslk.click();
   Adresbaslk.sendKeys("Ev");
   Adresbaslk.sendKeys(Keys.TAB);
   Adresbaslk.sendKeys(Keys.ENTER);
   System.out.println("Adres Başlığı Başarılı");
   WebElement Adresad = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[1]/div/label/input"));
   Adresad.click();
   Adresad.sendKeys("Adım");
   Adresad.sendKeys(Keys.TAB);
   Adresad.sendKeys(Keys.ENTER);
   System.out.println("Ad Başarılı");
   WebElement Adressoy = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[3]/div[2]/div/label/input"));
   Adressoy.click();
   Adressoy.sendKeys("Soyadım");
   Adressoy.sendKeys(Keys.TAB);
   Adressoy.sendKeys(Keys.ENTER);
   Thread.sleep(2000);
   System.out.println("Soyad Başarılı");
   WebElement Adrestel = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[4]/div/div/label/input"));
   Adrestel.click();
   Adrestel.clear();
   Adrestel.sendKeys("5483822452");
   Adrestel.sendKeys(Keys.TAB);
   Adrestel.sendKeys(Keys.ENTER);
   System.out.println("Telefon Başarılı");
   WebElement Sehrsec = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select"));
   Sehrsec.click();
   Thread.sleep(1000);
   System.out.println("İl Başarılı");
   driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[1]/div/label/div/select/option[2]")).click();
   WebElement Sehril = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select"));
   Sehril.click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[5]/div[2]/div/label/div/select/option[29]")).click();
   Thread.sleep(1000);
   System.out.println("İlce Başarılı");
   WebElement Mahalle = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select"));
   Mahalle.click();
   Thread.sleep(2000);
   driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[6]/label/div/select/option[32]")).click();
   System.out.println("Mahalle Başarılı");
   WebElement Adres = driver.findElement(By.xpath("//*[@id=\"js-orders-modal-container\"]/div/div[2]/form/div[7]/label/textarea"));
   Adres.click();
   Adres.sendKeys("istanbull erahmet eokfakeeefefeegeeggf" + sayi);
   Adres.sendKeys(Keys.TAB);
   System.out.println("Adres Başarılı");
   WebElement Kaydet = driver.findElement(By.xpath("//button[contains(text(),'KAYDET')]"));
   JavascriptExecutor executor = (JavascriptExecutor) driver;
   executor.executeScript("arguments[0].click();", Kaydet);
   Thread.sleep(2000);
   System.out.println("Kaydet Başarılı");
   driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div[1]/div/div[2]/form/div[2]/button")).click();
   Thread.sleep(4000);
   System.out.println("Kaydet ve Devam ET Başarılı");
   WebElement Kartadsoy = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[1]/label/input"));
   Kartadsoy.click();
   Kartadsoy.sendKeys("Adım soyadım");
   System.out.println("Kart Ad Soyad Başarılı");
   WebElement Kartno = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[2]/label/input[1]"));
   Kartno.click();
   Kartno.clear();
   Kartno.sendKeys("1234567891234567");
   System.out.println("Kart No Başarılı");
   WebElement Aysec = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select"));
   Aysec.click();
   driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[2]/select/option[2]")).click();
   System.out.println("Ay Sec Başarılı");
   WebElement Yılsec = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select"));
   Yılsec.click();
   driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[3]/div[3]/select/option[2]")).click();
   System.out.println("Yıl Sec Başarılı");
   WebElement Cvcsec = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[1]/div[2]/div[6]/div[4]/label/input"));
   Cvcsec.click();
   Cvcsec.clear();
   Cvcsec.sendKeys("456");
   WebElement element = driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[3]/div/label"));
   System.out.println("Cvc No Başarılı");
   executor.executeScript("arguments[0].click();", element);
   Thread.sleep(4000);
   System.out.println("Şart Koşullar Başarılı");
   driver.findElement(By.xpath("/html/body/section/section/div/div[3]/div[2]/div[1]/div[2]/form[1]/div[2]/div[2]/div[6]/button/span[2]")).click();
   System.out.println("Siparisi Başarılı");
}
   //* Adres kaydet kısmı her başarılı kayıt sonrasında bilgi değişikliliği yapılması gerekiyor tekrar çalışır hale gelmesi için *\\
    public void Sepetekle() throws InterruptedException {
    sepetSayfa = new Sepetsayfa(driver);
    sepetSayfa.Sepetclk();




    }


}
