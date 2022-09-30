import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {


    WebDriver driver;
    WebDriverWait wait;
    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(this.driver, 5, 500);
    }
    public WebElement findElement(By by) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public List<WebElement> findElements(By by) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public void clickElement(By by){
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();
    }

    public void sendKeys(By by, String text){
        wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(text);
    }
    public void goToUrl(String text){
        driver.get(text);
    }
    public void hoverElement(By by){
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(by)).build().perform();
    }
    public String getText(By by){
        return  findElement(by).getText();

    }

    public void select(By by, String text) {
        Select select = new Select(findElement(by));
        select.selectByVisibleText(text);
    }

}

