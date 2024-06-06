package StepDefinitions;

import Hooks.InitialHook;
import Pages.CartPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class BuyProductSteps {

    InitialHook hooks = new InitialHook();
    HomePage home = new HomePage();
    CartPage cart = new CartPage();

    @Given("Sign up o the application {string} {string}")
    public void signUpOTheApplication(String user, String password) {
        home.signUpUser(user, password);
    }

    @And("Login on the application {string}")
    public void loginOnTheApplication(String password) {
        home.login(password);
    }

    @And("Select product {string}")
    public void selectProduct(String product) {
        home.selectProduct(product);
    }

    @When("Add to cart the product")
    public void addToCartTheProduct() {
        home.addProductToCart();
    }

    @Then("Validate the product was added {string}")
    public void validateTheProductWasAdded(String product) {
        home.goToCart();
        assertTrue(cart.theProductWasAdded(product));
    }

    @And("Pay the product {string} {string} {string} {string} {string} {string}")
    public void payTheProduct(String name, String country, String city, String creditCard, String month, String year) {
        cart.payproduct(name, city, country, creditCard, month, year);
    }

    @Then("Validate the product was paid")
    public void validateTheProductWasPaid() {
        assertTrue(cart.theProductWasPaid());
    }

    @And("Delete the product added")
    public void deleteTheProductAdded() {
        cart.deleteProduct();
    }

    @Then("Validate the product was deleted {string}")
    public void validateTheProductWasDeleted(String product) {
        assertFalse(cart.theProductWasDeleted(product));
    }

    @Given("Execute before scenario")
    public void executeBeforeScenario() {
        hooks.createWebDriver();
    }

    @Then("Execute after scenario")
    public void executeAfterScenario() {
        hooks.clearDriver();
    }
}
