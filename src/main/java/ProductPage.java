import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void chooseColor(){
        clickElement(By.cssSelector("label[for='attributes_integration_colourSİYAH']"));
    }
    public void chooseProduct(){
        findElements(By.cssSelector("li[class='col-md-4 col-sm-6 col-xs-6 set-product-item']")).get(0).click();
    }
    public void verifyColor(){
        String color =  getText(By.cssSelector("div[class='selected-variant-text']"));
        Assert.assertEquals("Renk Doğru Değil",color,"Seçılen Renk: SİYAH");
    }
    public void addToBasket(){
        clickElement(By.cssSelector("button[class='add-to-basket button green block with-icon js-add-basket']"));
    }
    public void goToBasket(){
        clickElement(By.cssSelector("a[class='go-to-shop']"));
    }
}
