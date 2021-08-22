package modules;

import org.testng.annotations.Test;

import initializer.PageInitializer;
import pageobjects.LandingPageObjects;

public class Login extends PageInitializer {
	
	LandingPageObjects ob = new LandingPageObjects();
	/*
	 * @Test public void mylogin() {
	 * 
	 * test = extent.createTest("mylogin");
	 * 
	 * ob.enterTextTouserNameTextField("admin")
	 * .enterTextTopasswordTextField("manager") .clickOnLoginButton();
	 * 
	 * }
	 */
	
	@Test
	public void mylogin2() {
		
		test = extent.createTest("mylogin");
		
		landingPage().
		enterTextTouserNameTextField("admin")
		.enterTextTopasswordTextField("manager")
		.clickOnLoginButton();
		
		homePage().clickOnTaskButton();
		taskPage().clickOnAddNewButton();
		taskPage().clickOnAddNewTaskButton();
		taskPage().enterTaksName("TCS");
		taskPage().createTaskButton();
		taskPage().startTypeName("TCS");
		taskPage().selectedName("Big Bang Company");
		
	}

	

}
