package Pages;

import Helpers.Helper;
import org.openqa.selenium.By;

public class CartPage extends BasePage {

    Helper helper = new Helper();
    By btnPlaceOrder = By.xpath("//button[@class='btn btn-success']");
    By txtPayName = By.id("name");
    By txtPayCountry = By.id("country");
    By txtPayCity = By.id("city");
    By txtPayCard = By.id("card");
    By txtPayMonth = By.id("month");
    By txtPayYear = By.id("year");
    By btnPurchase = By.xpath("//button[@onclick='purchaseOrder()']");

    public boolean theProductWasAdded(String product) {
        helper.wait(1000);
        return hasElement(product);
    }

    public void payproduct(String name, String country, String city, String creditCard, String month, String year) {
        clickPlaceOrder();
        insertData(name, country, city, creditCard, month, year);
        clickPurchase();
    }

    public void clickPlaceOrder() {
        click(btnPlaceOrder);
    }

    public void insertData(String name, String country, String city, String creditCard, String month, String year) {
        sendKeys(txtPayName, name);
        sendKeys(txtPayCountry, country);
        sendKeys(txtPayCity, city);
        sendKeys(txtPayCard, creditCard);
        sendKeys(txtPayMonth, month);
        sendKeys(txtPayYear, year);
    }

    public void clickPurchase() {
        click(btnPurchase);
    }

    public boolean theProductWasPaid() {
        return hasElement("Thank you for your purchase!");
    }

    public void deleteProduct(){
        helper.wait(1000);
        click("Delete");
    }

    public boolean theProductWasDeleted(String product){
        helper.wait(1000);
        return hasElement(product);
    }
}
