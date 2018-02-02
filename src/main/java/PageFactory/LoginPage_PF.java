package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginPage_PF {

	
	private static WebElement element = null;
	
	
	final WebDriver driver;
		
	 public LoginPage_PF(WebDriver driver){

	        this.driver = driver;

	        //This initElements method will create all WebElements

	     //   PageFactory.initElements(driver, this);

	    }
		
	
		
		@FindBy(how = How.XPATH, using=".//*[@id='login-form']/label[1]/input")
		public static WebElement txtbx_Email;
		
		
	
		@FindBy(how = How.XPATH, using=".//*[@id='login-form']/label[2]/div[3]/input")
		public static WebElement txtbx_Password;
		
		
	
		@FindBy(how = How.XPATH, using=".//*[@id='login-form']/button/span[1]")
		public static WebElement Signin_Btn;
			
	
	
	
}
