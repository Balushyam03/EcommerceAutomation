package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage {
    WebDriver driver;

    @FindBy(id = "product-search")
    WebElement searchBox;

    @FindBy(xpath = "//button[text()='Add to Cart']")
    WebElement addToCartButton;

    public ShoppingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchProduct(String productName) {
        this.searchBox.sendKeys(productName);
        this.searchBox.submit();
    }

    public void addToCart() {
        this.addToCartButton.click();
    }
}
