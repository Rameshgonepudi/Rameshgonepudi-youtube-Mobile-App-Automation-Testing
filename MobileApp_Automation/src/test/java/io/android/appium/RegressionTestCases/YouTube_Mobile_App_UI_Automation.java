package io.android.appium.RegressionTestCases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import io.android.appium.Locators.Locators;
import io.android.appium.Utility.Utility;

public class YouTube_Mobile_App_UI_Automation extends Utility{
	
	@Test
	public void testCases() throws MalformedURLException, InterruptedException
	{
		openYoutubeOnAndroidDevice();
		
		Locators postiveFlow=new Locators(driver);
		postiveFlow.search();
		waitForElement(waitForTextTobesearched);
		postiveFlow.entertheDataToBeSearched("News");
		
		

		postiveFlow.clickOntheFirstDisplayedResult();

		postiveFlow.clickOntheFirstvideo();
		waitForElement(clickOntheComment);
		postiveFlow.clickOntheComment();
		postiveFlow.clickOntheComment();

		postiveFlow.putthecomment("Appium");

		postiveFlow.clickOnsendComment();

		postiveFlow.clickOnActionMenuToDeleteComment();

		postiveFlow.clickOnDeleteOption();

		postiveFlow.clickOnDeleteOptioAppearsOnPopupp();
		
		
		

	}
	
	

}
