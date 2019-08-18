import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOS {
	
	public static IOSDriver<IOSElement> Capabilities() throws MalformedURLException{
	
		IOSDriver<IOSElement>driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.4");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		//cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,AutomationName.IOS_XCUI_TEST);
		cap.setCapability(MobileCapabilityType.APP, "//Users/hsouza/UICatalog.app");
		//cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "20000");
		
		driver = new IOSDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		// Appium Code

	}

}
