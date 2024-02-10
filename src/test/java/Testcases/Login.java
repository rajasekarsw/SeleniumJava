package Testcases;

import Base.BaseClass;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
import utils.Utilities;

public class Login extends BaseClass {


    public WebDriver driver;

    public LoginPage loginPage=null;

    @BeforeClass
    public void initLogin()
    {
        driver= getDriver();
        driver.get(properties.getProperty("baseurl"));
        loginPage=new LoginPage(driver);
    }



    @Test(priority = 1)
    public void login()
    {
     loginPage.enterUsername(properties.getProperty("username"));
     loginPage.enterPassword(properties.getProperty("password"));
     loginPage.clickLogin();
    }

    @Test(priority = 2)
    public void verifyHomePage()
    {

        Assert.assertEquals(Utilities.getCurrentUrl(),properties.getProperty("homeurl"));

    }



}
