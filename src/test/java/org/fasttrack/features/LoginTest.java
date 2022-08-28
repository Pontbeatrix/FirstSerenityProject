package org.fasttrack.features;

import org.junit.Test;

public class LoginTest extends BaseTest{


    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("pontebeatrix@gmail.com");
        loginSteps.setPassword("123456789");
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("Maria Viktoria Branzas");
    }

    @Test
    public void loginWithInvalidPasswordTest(){
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail("pontebeatrix@gmail.com");
        loginSteps.setPassword("12345678");
        loginSteps.clickLogin();
        loginSteps.verifyUserNotLoggedIn();
    }


}
