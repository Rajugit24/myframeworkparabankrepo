package ParabankAutomation.TestCases;

import org.testng.annotations.Test;

import ParabankAutomation.Pages.LoginPagePom;

public class LoginTestClass extends BaseSetupClass {
	@Test
	public void TC_001LoginwithVALIDcrentials() {
		LoginPagePom loginpagepomobj=new LoginPagePom(driver);
		loginpagepomobj.loginwithVALIDcredentials("raju1234", "raju@123", "ParaBank | Accounts Overview");
		
	}

}
