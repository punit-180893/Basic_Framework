package testbase;

import java.time.Duration;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageObjects.EnterVehicleDataPageObjects;
import PageObjects.HomePageObjects;
import io.github.bonigarcia.wdm.WebDriverManager;
import reuseableComponents.LogUtil;
import reuseableComponents.PropertiesOperations;

public class TestBase extends ObjectsRepo{

	
	
	@BeforeMethod
	public void LaunchBrowserAndNavigate() throws Exception {
		
		String browser=PropertiesOperations.getPropertyValueByKey("browser");
		String url=PropertiesOperations.getPropertyValueByKey("url");
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else {
			System.out.println("Invalid browser choice");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		LogUtil.info("Browser is Launched successfully");
		driver.get(url);
		driver.manage().deleteAllCookies();
		homepage=new HomePageObjects();
		vehdata=new EnterVehicleDataPageObjects();
	}
	
	@AfterMethod
	public void cleanUp() {
		driver.quit();
	}
}
