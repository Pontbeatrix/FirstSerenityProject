package org.fasttrack.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class CartPage extends PageObject {
    @FindBy (css =".add-to-cart-buttons")
    private WebElementFacade addCartButton;
    @FindBy (css=".checkout-types.top")
    private WebElementFacade checkoutButton;

    public void clickAddCartButton() {
        clickOn(addCartButton);
    }

    public void clickCheckoutButton() {
        clickOn(checkoutButton);
    }
}
