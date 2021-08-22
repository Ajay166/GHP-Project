package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import initializer.PageInitializer;

public class HomePageObjects extends PageInitializer {
	
	@FindBy(xpath="//a[@class='userProfileLink username ']")
	private WebElement userProfileLinkfield;
	
	@FindBy(xpath="//div[@id='container_tasks']")
	private WebElement taskButton;

	public void verifyUserLoggedIn(String name) {
		new WebDriverWait(getDriver(), 10).until(ExpectedConditions.visibilityOf(userProfileLinkfield));
		String actualname = userProfileLinkfield.getText();
		Assert.assertEquals(actualname, name);
	}
	
	public void clickOnTaskButton()
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(taskButton));
		taskButton.click();
 }

}

