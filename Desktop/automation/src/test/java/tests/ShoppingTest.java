package tests;

import base.BaseTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShoppingPage;

public class ShoppingTest extends BaseTest {

    @Test
    public static void testAddToCart() {
        ShoppingPage shoppingPage = new ShoppingPage(BaseTest.driver);
        shoppingPage.searchProduct("Laptop");
        shoppingPage.addToCart();
        Assert.assertTrue(BaseTest.driver.findElement(By.id("cart-count")).getText().contains("1"));
    }
}
