package testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel 
{
	public WebDriver driver;
	@Parameters({"browser"})
	@Test
	public void excel(String browser)
	{
		System.setProperty("webdriver.gecko.driver","./Software/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","./Software/chromedriver.exe");
		if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
		
		}
		else
		{
			driver=new ChromeDriver();
		}
		
	}

}
