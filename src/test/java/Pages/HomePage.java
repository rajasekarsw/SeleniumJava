package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {



    @FindBy(xpath="//i/parent::span[@class='oxd-userdropdown-ta']")
    private WebElement profileDropdownIcon;

    @FindBy(xpath="//i/parent::span[@class='oxd-userdropdown-tab']/following-sibling::ul/child::li/a[text()='Logout']")
    private WebElement logout;

    public WebDriver driver;

    public HomePage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickProfileDropdownIcon()
    {
        profileDropdownIcon.click();
    }

    public void clickLogout()
    {
        logout.click();
    }



}
