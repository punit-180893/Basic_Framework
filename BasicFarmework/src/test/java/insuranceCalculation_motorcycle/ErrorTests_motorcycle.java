package insuranceCalculation_motorcycle;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import testbase.TestBase;

public class ErrorTests_motorcycle extends TestBase{

	@Test(enabled=true)
	public void errorMessage_PayloadField() {
		
		homepage.clickOnMotorCycleLink();
		vehdata.enterCylinderCapacity("3300");
		
		String actualErrorMeassage=vehdata.getErrorMessageOnCylinderCapacity();
		String expectedErrorMessage="Must be a number between 1 and 2000";
		Assert.assertEquals(actualErrorMeassage, expectedErrorMessage);
	}
	
	@Test(enabled=true)
	public void errorMessage_PayloadField1() {
		
		homepage.clickOnMotorCycleLink();
		vehdata.enterCylinderCapacity("3300");
		
		String actualErrorMeassage=vehdata.getErrorMessageOnCylinderCapacity();
		String expectedErrorMessage="dummy";
		Assert.assertEquals(actualErrorMeassage, expectedErrorMessage);
	}
	
	@Test(enabled=true)
	public void verifyModelDropdownOptions() {
		homepage.clickOnMotorCycleLink();
		
		List<String>actualValues=vehdata.getDropdownOptions_model();
		
		List<String>expectedValues=Arrays.asList("– please select –","Scooter","Three-Wheeler","Moped","Motorcycle");
		
		Assert.assertEquals(actualValues, expectedValues);
	}
}
