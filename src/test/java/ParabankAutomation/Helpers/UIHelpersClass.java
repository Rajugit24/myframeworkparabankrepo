package ParabankAutomation.Helpers;

import org.testng.Assert;

public class UIHelpersClass {
public static void compareStrings(String Actualtitle,String expectedTitle) {
	Assert.assertEquals(Actualtitle, expectedTitle);
}
}
