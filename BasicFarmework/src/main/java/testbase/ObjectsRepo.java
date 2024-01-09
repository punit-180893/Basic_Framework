package testbase;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import PageObjects.EnterVehicleDataPageObjects;
import PageObjects.HomePageObjects;
import reuseableComponents.CommonMethods;

public class ObjectsRepo {

	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	public static HomePageObjects homepage;
	public static EnterVehicleDataPageObjects vehdata;
	public CommonMethods cm =new CommonMethods();
}
