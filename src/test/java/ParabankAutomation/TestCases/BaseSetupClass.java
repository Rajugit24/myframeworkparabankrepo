package ParabankAutomation.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import ParabankAutomation.Utilities.ReadConfigDataClass;

public class BaseSetupClass {
public WebDriver driver;
@BeforeMethod
public  void Setup() throws InterruptedException, IOException {
	//driver=new ChromeDriver();
	ReadConfigDataClass configdata=new ReadConfigDataClass();
	String url=configdata.geturl();
	String browser=configdata.getbrowsername();
	//driver.get("https://parabank.parasoft.com/parabank/overview.html");
switch (browser.toUpperCase() ){
case "CHROME":driver=new ChromeDriver();
break;

case"EDGE":driver=new EdgeDriver();
break;
default: throw new IllegalArgumentException("please provide valid browser name");

}
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
@AfterMethod
public void TearDown() {
	driver.quit();
}
}
