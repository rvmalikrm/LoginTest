package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(id="username")
    private WebElement userNameInput;

    @FindBy(id="password")
    private WebElement userPasswordInput;

    @FindBy(id="submit")
    private WebElement loginButton;

    public  LoginPage(WebDriver driver){
        this.driver= driver;
        PageFactory.initElements(driver,this);

    }
    public  void enterUserName(String usernameInput){
        userNameInput.clear();
        userNameInput.sendKeys(usernameInput);
    }
    public  void enterPasswordInput(String userpasswordInput){
        userPasswordInput.clear();
        userPasswordInput.sendKeys(userpasswordInput);
    }
    public void clickSubmit(){
        loginButton.click();
    }
    public void loginAs(String username, String password){
        enterUserName(username);
        enterPasswordInput(password);
        clickSubmit();
    }
}
