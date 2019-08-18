import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSTest extends IOS{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		IOSDriver<IOSElement>driver = capabilities();
		
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@values='Text Entry'").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("Hello");
		driver.findElementByName("OK").click();
		//driver.findElementByName("Cancel").click();
	}

}
