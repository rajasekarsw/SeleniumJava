package Testcases;

import Base.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Logout extends BaseClass {

    public WebDriver driver;
    public HomePage homePage=null;

    @BeforeClass
    public void initHome()
    {
        driver= getDriver();
        homePage=new HomePage(driver);
    }
    @Test(priority = 3)
    public void logout()
    {
     homePage.clickProfileDropdownIcon();
     homePage.clickLogout();
    }
}
