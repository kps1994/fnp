package lg4j;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pom 
	{
		@FindBy(xpath="//input[@id='twotabsearchtextbox']") public WebElement sbox;
		@FindBy(id="nav-search-submit-button") public WebElement sbutton;
		
		public void searchbox(String a)
		{
			sbox.sendKeys(a);
		}
		public void searchbutton()
		{
			sbutton.click();
		}

	}