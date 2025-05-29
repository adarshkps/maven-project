package amazonPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import amazon.setup.homepagesetup;

public class homePage extends homepagesetup{

	public homePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement searchbar;
	public void clicksearchbar()
	{
		searchbar.click();
	}
	@FindBy(xpath="//a[@id='nav-logo-sprites']")
	private WebElement logo;
	public boolean logoDisplayed()
	{
		return logo.isDisplayed();
	}
}
