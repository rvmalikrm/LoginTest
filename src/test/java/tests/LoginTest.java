package tests;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.Objects;

public class LoginTest extends BaseTest {

    @Test
    public void validLoginTest(){
        LoginPage logpage =new LoginPage(driver);
        logpage.loginAs("admin","admin123");
        Assert.assertFalse(Objects.requireNonNull(driver.getTitle()).contains("Logged In Successfully"));
    }

}
