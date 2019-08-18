import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Android {
	
	public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException{
	//public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException{
	 
		AndroidDriver<AndroidElement>driver;
		
		File f = new File("src");
		File fs = new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("appium-version", "1.13.0");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "QA");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
				
		return driver;
		
		// Appium Code

	}

}

