package Pages;

import Helpers.Helper;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    Helper helper = new Helper();
    By linkSignUp = By.id("signin2");
    By txtUserName = By.id("sign-username");
    By txtPassword = By.id("sign-password");
    By btnSignUp = By.xpath("//button[@onclick='register()']");
    By linkLogin = By.id("login2");
    By txtLoginUserName = By.id("loginusername");
    By txtLoginPassword = By.id("loginpassword");
    By btnLogin = By.xpath("//button[@onclick='logIn()']");
    By btnAddToCart = By.xpath("//a[contains(@onclick,'addToCart')]");
    By linkCart = By.id("cartur");

    public void signUpUser(String user, String password) {
        _userName = user + helper.generateRandomNumber(10, 10000);
        click(linkSignUp);
        sendKeys(txtUserName, _userName);
        sendKeys(txtPassword, password);
        click(btnSignUp);
        helper.wait(1000);
        acceptAlert();
    }

    public void login(String password) {
        click(linkLogin);
        sendKeys(txtLoginUserName, _userName);
        sendKeys(txtLoginPassword, password);
        click(btnLogin);
    }

    public void selectProduct(String product) {
        helper.wait(1000);
        click(product);
    }

    public void addProductToCart() {
        click(btnAddToCart);
        helper.wait(1000);
        acceptAlert();
    }

    public void goToCart() {
        click(linkCart);
    }
}
