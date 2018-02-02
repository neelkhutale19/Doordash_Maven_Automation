package PageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.openqa.selenium.support.How;


public class HomePage_PF {


		private static WebElement element = null;
	
		final WebDriver driver;
		
		 public HomePage_PF(WebDriver driver){

		        this.driver = driver;

		        //This initElements method will create all WebElements

		     //   PageFactory.initElements(driver, this);

		    }
			
		
		
		@FindBy(how = How.XPATH, using="//*[contains(@class,'SearchInput_input___3_IaW')]")
		public static WebElement txtbx_Search;
	
		
		
		@FindBy(how = How.XPATH, using=".//*[@id='ConsumerApp']/div/header/div[1]/div[1]/button")
		
		public WebElement btn_Menu;
	
		
		
		@FindBy(how = How.XPATH, using=".//*[@id='ConsumerApp']/div/header/div[1]/div[2]/button[2]")
		
		public WebElement btn_Address;
	
		
		
		@FindBy(how = How.XPATH, using=".//*[@id='ConsumerApp']/div/header/div[3]/div[2]/button/svg/path[1]")
		
		public WebElement btn_Cart;
	
	
		
	
	
}
