import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void navigate(){
        goToUrl("https://www.a101.com.tr/");
    }
    public void closePopup(){
        clickElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
    }
    public  void proceedToProduct(){
        hoverElement(By.cssSelector("a[title='GİYİM & AKSESUAR']"));
        clickElement(By.cssSelector("a[title='Dizaltı Çorap']"));
    }
}
