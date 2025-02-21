package adarshSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumPractice1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d1=new EdgeDriver();
		d1.get("https://www.flipkart.com");
		d1.manage().window().maximize();
		d1.navigate().refresh();
		d1.get("https://www.amazon.in");
		d1.navigate().back();
		Thread.sleep(5000);
		d1.navigate().forward();
		Thread.sleep(5000);
		d1.navigate().refresh();
		Thread.sleep(5000);
		d1.close();
		
		
		
	}

}
