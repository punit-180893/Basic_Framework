package reuseableComponents;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {

	
	//getting the dropdown list
	public List<String>getDropDownoptions(WebElement element){
		Select os =new Select(element);
		
		List<WebElement>list_webelement_model=os.getOptions();
		List<String>actualContent=new ArrayList<String>();
		for(WebElement ref:list_webelement_model) {
			actualContent.add(ref.getText());
		}
		return actualContent;
		
	}
}
