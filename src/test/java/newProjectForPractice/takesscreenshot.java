package newProjectForPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takesscreenshot {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
			TakesScreenshot tk=(TakesScreenshot)driver;
			File ss=tk.getScreenshotAs(OutputType.FILE);
			try {
				FileInputStream fis= new FileInputStream(ss);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		
	}
	}

