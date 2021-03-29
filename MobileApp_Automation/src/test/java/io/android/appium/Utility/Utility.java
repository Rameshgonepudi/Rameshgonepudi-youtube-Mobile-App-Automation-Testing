package io.android.appium.Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.connection.ConnectionState;
import io.appium.java_client.android.connection.ConnectionStateBuilder;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Utility {
public AndroidDriver<WebElement>  driver;
	public String waitForTextTobesearched="//*[@text='Search YouTube']";
	
	public String clickOntheFirstDisplayedResult="//*[@text='news' and @index='1']";
	
	public String clickOntheFirstvideo="(//android.widget.ImageView[@content-desc=' '])[1]";
	
	public String clickOntheComment="//android.view.ViewGroup[@content-desc='Add a comment…']";
	
	public String clickOnsendComment="//*[@content-desc='Send comment']";
	
	public String clickOnActionMenuToDeleteComment="(//android.view.ViewGroup[@content-desc='Action menu'])[1]/android.widget.ImageView";
	
	public void openYoutubeOnAndroidDevice() throws MalformedURLException, InterruptedException
	{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		 //capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		 capabilities.setCapability("deviceName", "Redmi Note 7 Pro");
		 capabilities.setCapability("udid", "919e902c");
		 capabilities.setCapability("platformName", "Android");
		 capabilities.setCapability("platformVersion", "9.1");
		 capabilities.setCapability("appPackage", "com.google.android.youtube");
		 capabilities.setCapability("appActivity", "com.google.android.apps.youtube.app.WatchWhileActivity");
		 URL url = new URL("http://127.0.0.1:4723/wd/hub");
		 
		 driver = new AndroidDriver<WebElement>(url,capabilities);
 
	}

	public void waitForElement(String locator)
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		 
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));


	}

	 public void wifiOn() {
		    ConnectionState state = driver.setConnection(new ConnectionStateBuilder().withWiFiEnabled().build());
		    Assert.assertTrue(state.isWiFiEnabled(), "Wifi is not switched on");
		  
		}
		public void wifiOff() {
		    ConnectionState state = driver.setConnection(new ConnectionStateBuilder().withWiFiDisabled().build());
		    Assert.assertFalse(state.isWiFiEnabled(), "Wifi is not switched off");
		  
		}


}
