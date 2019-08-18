import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UiautomatorTest extends Android{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver = Capabilities();
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//driver.findElementsByAndroidUIAutomator("attribute("values")")
			
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			//driver.findElementByAndroidUIAutomator("text(\"Anination\")").click();
			
			// Validate clickable feature for all options
			// driver.findElementByAndroidUIAutomator("new UiSelection().clickable(true)");
			//System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelection().clickable(true)").size());
			
	}

}
