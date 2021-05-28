package login;

import pages.LoginPage;
import pages.SecureAreaPage;
import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        assertEquals(secureAreaPage.getAlertText(),"You logged into a secure area!","Alert text incorrect");
        assertTrue(secureAreaPage.getAlertText().contains(
                "You logged into a secure area!"),
                "Alert is incorrect");
    }
}
