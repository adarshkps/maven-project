package amazon.setup;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class homepagesetup {
	
	public static File file;;
	public static FileInputStream fis;
	public static Properties pr;
	public static String browser;
	public static String URL;
	public static WebDriver driver;
	
	public homepagesetup()
	{
		file=new File("./configurations2/configF.properties");
		try {
			fis=new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pr= new Properties();
		try {
			pr.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		browser=pr.getProperty(browser);
		URL=pr.getProperty(URL);	
		
	}
	public void intialization()
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		if(browser.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		if(browser.equals("FireFox"))
		{
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("browser not found");
			return;
		}
		driver.get(URL);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
	}
}
