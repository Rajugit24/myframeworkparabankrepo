package ParabankAutomation.Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UIActionsClass {
WebDriver driver;
public UIActionsClass(WebDriver driver) {
	this.driver=driver;
	}

public void type(WebElement element,String value) {
element.sendKeys(value);
}

public void clickonlogin(WebElement element) {
	element.click();
}

public String gettitle() {
	String actualtitle=driver.getTitle();
	return actualtitle;
}
}
