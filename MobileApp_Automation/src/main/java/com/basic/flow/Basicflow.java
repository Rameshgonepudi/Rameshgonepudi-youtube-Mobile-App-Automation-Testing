package com.basic.flow;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Basicflow {
	static AppiumDriver driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException  { 
		
		Basicflow df = new Basicflow();
		
		df.openApp();
	}
	
	
	
public  void openApp() throws InterruptedException, MalformedURLException
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
	 
	 driver = new AppiumDriver<MobileElement>(url,capabilities);
	 
	 waitForElement("//*[@content-desc='Search']");
	 driver.findElement(By.xpath("//*[@content-desc='Search']")).click();
	 waitForElement("//*[@text='Search YouTube']");
	 
	
	 driver.findElement(By.xpath("//*[@text='Search YouTube']")).sendKeys("News");
	 
	 waitForElement("//*[@text='news' and @index='1']");
	 driver.findElement(By.xpath("//*[@text='news' and @index='1']")).click();
	 
	 System.out.println("Hellow");
	 
	 waitForElement("(//android.widget.ImageView[@content-desc=' '])[1]");
	 
	 driver.findElement(By.xpath("(//android.widget.ImageView[@content-desc=' '])[1]")).click();
	 
	 System.out.println("bollo");
	 
	 waitForElement("//android.view.ViewGroup[@content-desc='Add a comment…']");
	 
	 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Add a comment…']")).click();
	 
	 driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Add a comment…']")).click();
	 
	 //waitForElement("//*[@text='Add a public comment...']");
	 driver.findElement(By.xpath("//*[@text='Add a public comment...']")).sendKeys("Appium");
	 
     waitForElement("//*[@content-desc='Send comment']");
	 
	 driver.findElement(By.xpath("//*[@content-desc='Send comment']")).click();
	 
	 
waitForElement("(//android.view.ViewGroup[@content-desc='Action menu'])[1]/android.widget.ImageView");
	 
	 driver.findElement(By.xpath("(//android.view.ViewGroup[@content-desc='Action menu'])[1]/android.widget.ImageView")).click();
	
     waitForElement("//*[@text='Delete']");
	 
	 driver.findElement(By.xpath("//*[@text='Delete']")).click();
	 
	    waitForElement("//*[@text='DELETE']");
		 
		 driver.findElement(By.xpath("//*[@text='DELETE']")).click();
	 
	 
}
public void waitForElement(String locator)
{
	WebDriverWait wait = new WebDriverWait(driver,50);
	 
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));


}

}
