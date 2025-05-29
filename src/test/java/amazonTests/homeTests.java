package amazonTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import amazon.setup.homepagesetup;
import amazonPages.homePage;

public class homeTests extends homepagesetup{

	homePage hp;
	homeTests()
	{
		super();
		intialization();
		hp=new homePage(driver);
		hp.clicksearchbar();
	}
	@Test
	public void validatelogo()
	{
		boolean b=hp.logoDisplayed();
		Assert.assertTrue(b);
	}
	
}
