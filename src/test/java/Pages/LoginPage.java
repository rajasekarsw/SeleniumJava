package Pages;

import Base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    @FindBy(name="username")
    private WebElement username;

    @FindBy(name="password")
    private WebElement password;

    @FindBy(xpath="//button[normalize-space(text()='Login')]")
    private WebElement loginButton;

    public WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void enterUsername(String usernameVal)
    {
        username.sendKeys(usernameVal);

    }

    public void enterPassword(String passwordVal)
    {
        password.sendKeys(passwordVal);
    }

    public void clickLogin()
    {
     loginButton.click();
    }

}
