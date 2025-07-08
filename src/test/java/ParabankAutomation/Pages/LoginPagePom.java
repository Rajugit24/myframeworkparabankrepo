package ParabankAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ParabankAutomation.Commands.UIActionsClass;
import ParabankAutomation.Helpers.UIHelpersClass;

public class LoginPagePom {
WebDriver driver;
UIActionsClass uiactionsobj;

public LoginPagePom(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	uiactionsobj=new UIActionsClass(driver);
}

@FindBy( name="username")
private WebElement usernamelocator;
 @FindBy(xpath = "//input[@type='password']")
 private WebElement passwordlocator;
 @FindBy(xpath = "//input[@value='Log In']")
 private WebElement loginbuttonlocator;
 
 public void loginwithVALIDcredentials(String username,String password,String expectedtitle ) {
	 uiactionsobj.type(usernamelocator, username);
	 uiactionsobj.type(passwordlocator, password);
	 uiactionsobj.clickonlogin(loginbuttonlocator);
	 String actualtitle=uiactionsobj.gettitle();
	 UIHelpersClass.compareStrings(actualtitle, expectedtitle);
 }


}
