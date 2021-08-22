package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import initializer.PageInitializer;

public class TaskPageObjects extends PageInitializer {
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewButton;

	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement addNewTaskButton;
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private WebElement enterTaskName;
	
	@FindBy(xpath="	//div[text()='Create Tasks']")
	private WebElement createTask;
	
	@FindBy(xpath="//input[@placeholder='Start typing name ...']/following::input[1]")
	private WebElement enterTypeName;
	
	@FindBy(xpath="	//div[@class='itemRow cpItemRow selected']")
	private WebElement selectName;
	
	public void clickOnAddNewButton()
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(addNewButton));
		addNewButton.click();
		
	}
	
	public void clickOnAddNewTaskButton()
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(addNewTaskButton));
		addNewTaskButton.click();
		
	}
	
	public TaskPageObjects enterTaksName(String taskName) {
		
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOf(enterTaskName));
		enterTaskName.sendKeys(taskName);
		return this;
		
	}
	
	public void createTaskButton()
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(createTask));
		createTask.click();
		
	}
	
	public TaskPageObjects startTypeName(String typeName)
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(enterTypeName));
		enterTypeName.sendKeys(typeName);
		return this;
		
	}
	public TaskPageObjects selectedName(String selName)
	{
		new WebDriverWait(getDriver(),10).until(ExpectedConditions.elementToBeClickable(selectName));
		selectName.click();
		return this;
		
	}
}
