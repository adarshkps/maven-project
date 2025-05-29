package demoapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import demoapp.base.setUp;

public class elementspage extends setUp{

	public elementspage (WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//div[@class='card-body']/h5[text()='Elements']")
	private WebElement elementpresent;
	public void elementclick()
	{
		elementpresent.click();
	}
	@FindBy(xpath="//span[text()='Text Box']")
	private WebElement textboxpre;
	public boolean textbox()
	{
		return textboxpre.isDisplayed();
	}
}
