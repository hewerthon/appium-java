import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeDemo extends Android{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver = Capabilities();
		
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
			
			driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();
			
			driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
			
			driver.findElementByXPath("//*[@content-desc='9']").click();

	}

}
