package PageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import testbase.TestBase;

public class EnterVehicleDataPageObjects extends TestBase{

	@FindBy(id="make")
	WebElement dd_make;
	
	@FindBy(id="model")
	WebElement dd_model;
	
	@FindBy(id="engineperformance")
	WebElement txt_engineperformance;
	
	@FindBy(id="cylindercapacity")
	WebElement txt_cylindercapacity;
	
	@FindBy(xpath="//input[@id='cylindercapacity']/following-sibling::span[@class='error']")
	WebElement error_cylindercapacity;
	
	@FindBy(id="dateofmanufacture")
	WebElement date_dateofmanufacture;
	
	@FindBy(xpath="//select[@id='numberofseats']")
	WebElement dd_seats;
	
	@FindBy(id="fuel")
	WebElement dd_fueltype;
	
	@FindBy(id="listprice")
	WebElement txt_listprice;
	
	@FindBy(id="licenseplatenumber")
	WebElement txt_licenseplatenumber;
	
	@FindBy(id="annualmileage")
	WebElement txt_annualmileage;
	
	@FindBy(id="nextenterinsurantdata")
	WebElement btn_next;
	
	public EnterVehicleDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	public void enterCylinderCapacity(String cylinderCap) {
		txt_cylindercapacity.sendKeys(cylinderCap);
	}
	
	public String getErrorMessageOnCylinderCapacity() {
		return error_cylindercapacity.getText();
	}
	
	public List<String>getDropdownOptions_model(){
		
		return cm.getDropDownoptions(dd_model);
	}
}
