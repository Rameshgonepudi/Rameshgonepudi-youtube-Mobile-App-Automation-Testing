package io.android.appium.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Locators {
	
	
	public Locators(AndroidDriver<WebElement> driver) throws InterruptedException {
		 
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


//Click on Search
@AndroidFindBy(xpath="//*[@content-desc='Search']")
private AndroidElement search;

public void search() {
	search.click();
}

//Enter the data to be searched

@AndroidFindBy(xpath="//*[@text='Search YouTube']")
private AndroidElement entertheDataToBeSearched;

public void entertheDataToBeSearched(String string) {
	entertheDataToBeSearched.sendKeys(string);
}


//Click on the first displayed result

@AndroidFindBy(xpath="//*[@text='news' and @index='1']")
private AndroidElement clickOntheFirstDisplayedResult;

public void clickOntheFirstDisplayedResult() {
	clickOntheFirstDisplayedResult.click();
}

//Click on the first video

@AndroidFindBy(xpath="(//android.widget.ImageView[@content-desc=' '])[2]")
private AndroidElement clickOntheFirstvideo;

public void clickOntheFirstvideo() {
	clickOntheFirstvideo.click();
}

//Click on comment
@AndroidFindBy(xpath="//android.view.ViewGroup[@content-desc='Add a comment…']")
private AndroidElement clickOntheComment;

public void clickOntheComment() {
	clickOntheComment.click();
}

//Enter the comment
@AndroidFindBy(xpath="//*[@text='Add a public comment...']")
private AndroidElement putthecomment;

public void putthecomment(String comment) {
	putthecomment.sendKeys(comment);
}
//Click on send comment

@AndroidFindBy(xpath="//*[@content-desc='Send comment']")
private AndroidElement clickOnsendComment;

public void clickOnsendComment() {
	clickOnsendComment.click();
}

//Click on the action menu to delete the comment

@AndroidFindBy(xpath="(//android.view.ViewGroup[@content-desc='Action menu'])[1]/android.widget.ImageView")
private AndroidElement clickOnActionMenuToDeleteComment;

public void clickOnActionMenuToDeleteComment() {
	clickOnActionMenuToDeleteComment.click();
}

//Click on delete comment

@AndroidFindBy(xpath="//*[@text='Delete']")
private AndroidElement clickOnDeleteOption;

public void clickOnDeleteOption() {
	clickOnDeleteOption.click();
}

//Pop will appear for clicking on the delete option, click on that

@AndroidFindBy(xpath="//*[@text='DELETE']")
private AndroidElement clickOnDeleteOptioAppearsOnPopupp;

public void clickOnDeleteOptioAppearsOnPopupp() {
	clickOnDeleteOptioAppearsOnPopupp.click();
}









}
