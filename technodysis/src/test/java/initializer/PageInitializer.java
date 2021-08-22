package initializer;

import org.openqa.selenium.support.PageFactory;

import mainclass.Mainclass;
import pageobjects.HomePageObjects;
import pageobjects.LandingPageObjects;
import pageobjects.TaskPageObjects;

public class PageInitializer extends Mainclass {
	
	public LandingPageObjects landingPage() {
		LandingPageObjects ob = PageFactory.initElements(getDriver(), LandingPageObjects.class);
		return ob;
	}

	public HomePageObjects homePage() {
		HomePageObjects ob = PageFactory.initElements(getDriver(), HomePageObjects.class);
		return ob;
	}
	
	public TaskPageObjects taskPage() {
		TaskPageObjects ob = PageFactory.initElements(getDriver(), TaskPageObjects.class);
		return ob;
	}
}

