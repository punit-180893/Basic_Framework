package insuranceCalculation_motorcycle;




import org.testng.annotations.Test;

import testbase.TestBase;

public class EndToEndTests_motorcycle extends TestBase{
	
	
	
	@Test
	public void insuranceCalculate_Volvomotor() throws Exception {
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void insuranceCalculate_Fordmoter() throws Exception {
		System.out.println(driver.getCurrentUrl());
	}
	
	
}
