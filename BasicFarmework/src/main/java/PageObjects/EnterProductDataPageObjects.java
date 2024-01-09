package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class EnterProductDataPageObjects extends TestBase {

	@FindBy(id="startdate")
	WebElement date_startdate;
	
	@FindBy(id="insurancesum")
	WebElement dd_insurancesum;
	
	@FindBy(id="meritrating")
	WebElement dd_meritrratings;
	
	@FindBy(id="damageinsurance")
	WebElement dd_damageinsurance;
	
	@FindBy(xpath="//input[@name='Optional Products[]']/parent::label")
	List<WebElement>chk_optionalproducts;
	
	@FindBy(id="courtesycar")
	WebElement dd_curtosycar;
	
	@FindBy(id="nextselectpriceoption")
	WebElement btn_Next;
	
	
	
	
	public EnterProductDataPageObjects() {
		PageFactory.initElements(driver, this);
	}
}
