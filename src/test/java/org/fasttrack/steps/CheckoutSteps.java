package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class CheckoutSteps extends BaseSteps {
  @Step
    public void checkoutButton() {
        cartPage.clickCheckoutButton();

    }
  @Step
    public void setUseraddress(String address) {
        checkOutPage.setAddressField(address);
    }
 @Step
    public void setUserCityaddress(String cityaddress) {
        checkOutPage.setCityAddressField(cityaddress);
    }
@Step
    public void setCountryField(String country) {
        checkOutPage.setCountryField(country);
    }
@Step
    public void setStateField(String state) {
        checkOutPage.setStateField(state);
    }
@Step
    public void setPostCodeField(String postCode) {
        checkOutPage.setPostCodeField(postCode);
    }
@Step
    public void setTelephonefield(String telephone) {
        checkOutPage.setTelephoneField(telephone);
    }



    @Step
    public void clickAddressRadioButton() {
      checkOutPage.clickAddressRadioButton();
    }
    @Step

    public void clickContinue1Button() {
        checkOutPage.clickContinue1Button();
    }
   @Step

   public void clickFreeShippingButton() {checkOutPage.clickFreeShippingButton();
   }
@Step
    public void clickContinue2Button() {
        checkOutPage.clickContinue2Button();
    }
@Step
    public void clickContinue3Button() {
        checkOutPage.clickContinue3Button();
    }
    @Step
    public void clickPlaceOrderButton(){checkOutPage.clickPlaceOrderButton();}


}

