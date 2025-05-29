package demoapp.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import demoapp.base.setUp;
import demoapp.pages.elementspage;

public class demoappElementTests extends setUp {

	elementspage elepage;
	demoappElementTests()
	{
		super();
		initialization();
		elepage=new elementspage(driver);
		elepage.elementclick();
		
	}
	@Test
	public void textBoxpre()
	{
		boolean b=elepage.textbox();
		Assert.assertTrue(b);
	}
	
}
