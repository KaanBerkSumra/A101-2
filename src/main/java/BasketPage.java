import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePage {

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public void checkOut() {
        clickElement(By.cssSelector("a[class='button green checkout-button block js-checkout-button']"));
    }

    public void proceedNoMembership() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(By.xpath("//*[contains(text(),'ÜYE OLMADAN DEVAM ET')]"));
    }

    public void enterMail() {
        sendKeys(By.cssSelector("input[name='user_email']"), "kaanbsumra@outlook.com");
    }

    public void submitMail() {
        clickElement(By.cssSelector("button[class='button block green']"));
    }

    public void addNewAddress() {
        clickElement(By.cssSelector("a[title='Yeni adres oluştur']"));
    }

    public void typeAddressInfo() throws InterruptedException {
        sendKeys(By.cssSelector("input[name='title']"), "Ev");
        sendKeys(By.cssSelector("input[name='first_name']"), "Kaan");
        sendKeys(By.cssSelector("input[name='last_name']"), "Sumra");
        sendKeys(By.cssSelector("input[name='phone_number']"), "5555555555");
        select(By.cssSelector("select[name='city']"),"ANTALYA");
        Thread.sleep(2000);
        select(By.cssSelector("select[name='township']"),"MURATPAŞA");
        Thread.sleep(2000);
        select(By.cssSelector("select[name='district']"),"ÇAĞLAYAN MAH");
        Thread.sleep(2000);
        sendKeys(By.cssSelector("textarea[name='line']"), "Test Adresi");
    }

    public void saveAdress() throws InterruptedException {
        Thread.sleep(2000);
        clickElement(By.xpath("//*[contains(text(),'KAYDET')]"));
    }
    public void chooseShippingFirm(){
        findElements(By.cssSelector("label[class='js-checkout-cargo-item']")).get(0).click();
    }
    public void saveAndProceed(){
        clickElement(By.cssSelector("button[class='button block green js-proceed-button']"));
    }
}
