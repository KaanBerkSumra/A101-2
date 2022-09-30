import org.junit.Test;

public class A101Test extends BaseTest{

    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    BasketPage basketPage = new BasketPage(driver);

    @Test
    public void a101Test() throws InterruptedException {

        homePage.navigate();
        homePage.closePopup();
        homePage.proceedToProduct();
        productPage.chooseColor();
        productPage.chooseProduct();
        productPage.verifyColor();
        productPage.addToBasket();
        productPage.goToBasket();
        basketPage.checkOut();
        basketPage.proceedNoMembership();
        basketPage.enterMail();
        basketPage.submitMail();
        basketPage.addNewAddress();
        basketPage.typeAddressInfo();
        basketPage.saveAdress();
        basketPage.chooseShippingFirm();
        basketPage.saveAndProceed();

    }

}
