package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

public class CheckOutPage extends PageObject {

    @FindBy(id = "billing:street1")
    private WebElementFacade addressField;

    @FindBy(id ="billing:city")
    private WebElementFacade cityAddressField;

    @FindBy(id="billing:country_id")
    private WebElementFacade countryField;

    @FindBy(id="billing:region_id")
    private WebElementFacade stateField;

    @FindBy(id ="billing:postcode")
    private WebElementFacade postCodeField;

    @FindBy(id ="billing:telephone")
    private WebElementFacade telephoneField;

    @FindBy(css ="[title='Continue'] span > span")
    private WebElementFacade continue1Button;

    @FindBy(id="s_method_freeshipping_freeshipping")
    private WebElementFacade freeShippingButton;

    @FindBy(css ="[onclick^='billing'] span > span ")
    private WebElementFacade continue2Button;

    @FindBy(css="[onclick^='payment'] span > span")
    private WebElementFacade continue3Button;

   @FindBy(css="[onclick^='re'] span > span")
   private WebElementFacade placeOrderButton;

   public void setAddressField(String value) {
       typeInto(addressField, value);
   }
    public void setCityAddressField(String value) {typeInto(cityAddressField,value);
    }
    public void setCountryField(String country) {
        countryField.selectByVisibleText("România");
    }
    public void setStateField(String state){
        stateField.selectByVisibleText("Bihor");
    }
    public void setPostCodeField(String value) {typeInto(postCodeField,value);
    }
    public void setTelephoneField(String value) {typeInto(telephoneField,value);}

    public void clickContinue1Button() {
        clickOn(continue1Button);
    }

    public void clickFreeshippingButton(){
        clickOn(freeShippingButton);
    }
    public void clickContinue2Button() {
        clickOn(continue2Button);
    }

    public void clickContinue3Button() {
        clickOn(continue3Button);
    }

    public void clickPlaceOrderButton(){clickOn(placeOrderButton);}
}

