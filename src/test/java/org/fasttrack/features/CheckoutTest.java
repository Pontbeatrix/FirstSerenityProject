package org.fasttrack.features;

import org.junit.Test;

public class CheckoutTest extends BaseTest{

    @Test
    public void validCheckoutTest() {
        loginSteps.doLogin("pontebeatrix@gmail.com","123456789");
        searchSteps.navigateToProductName("SILVER DESERT NECKLACE");
        cartSteps.addProductToCart();
        checkoutSteps.checkoutButton();
        checkoutSteps.setUseraddress("Str. Iza Nr. 27 Ap. 19");
        checkoutSteps.setUserCityaddress("Oradea");
        checkoutSteps.setCountryField("România");
        checkoutSteps.setStateField("Bihor");
        checkoutSteps.setPostCodeField("410568");
        checkoutSteps.setTelephonefield("0765988723");
        checkoutSteps.clickContinue1Button();
        checkoutSteps.clickFreeshippingButton();
        checkoutSteps.waitFor(3);
        checkoutSteps.clickContinue2Button();
        checkoutSteps.waitFor(3);
        checkoutSteps.clickContinue3Button();
        checkoutSteps.clickPlaceOrderButton();




    }
}
