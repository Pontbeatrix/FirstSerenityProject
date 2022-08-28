package org.fasttrack.steps;

public class CheckoutSteps extends BaseSteps {

    public void checkoutButton() {
        cartPage.clickCheckoutButton();

    }

    public void setUseraddress(String address) {
        checkOutPage.setAddressField(address);
    }

    public void setUserCityaddress(String cityaddress) {
        checkOutPage.setCityAddressField(cityaddress);
    }

    public void setCountryField(String country) {
        checkOutPage.setCountryField(country);
    }

    public void setStateField(String state) {
        checkOutPage.setStateField(state);
    }

    public void setPostCodeField(String postCode) {
        checkOutPage.setPostCodeField(postCode);
    }

    public void setTelephonefield(String telephone) {
        checkOutPage.setTelephoneField(telephone);
    }

    public void clickContinue1Button() {
        checkOutPage.clickContinue1Button();
    }

    public void clickFreeshippingButton() {
        checkOutPage.clickFreeshippingButton();
    }

    public void clickContinue2Button() {
        checkOutPage.clickContinue2Button();
    }

    public void clickContinue3Button() {
        checkOutPage.clickContinue3Button();
    }
    public void clickPlaceOrderButton(){checkOutPage.clickPlaceOrderButton();}
}

