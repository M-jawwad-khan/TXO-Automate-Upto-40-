package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class TxoLogin {
	
	
	WebDriver driver;
	public TxoLogin(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver,TxoLogin.this );
	}
	
	@FindBy(id ="txtUserName")
	WebElement txt_username;
	
	@FindBy(id ="txtPWD")
	WebElement txt_password;
	
	
	@FindBy(id ="Img_Login")
	WebElement btn_login;
	
	@FindBy(id="lblUserLoginError")
	WebElement LgnErrorMsg;
	
	public void CheckTitleName(String TitleName) {
		
		String Title = driver.getTitle();
		if(Title.equals(TitleName))
		{
			System.out.println("Title Name is Correct : " +Title);
		}
		else
		{
			System.out.println("Title Name is Not Correct : " +Title);
		}	
	}
	
	public void CheckLoginErrorMsg(String User_Name,String Password,String Message) throws InterruptedException 
	{
		txt_username.sendKeys(User_Name);
		txt_password.sendKeys(Password);
		Thread.sleep(2000);
		String ErrorMsg = LgnErrorMsg.getText();
		if(ErrorMsg.equals(Message)) 
		{
			System.out.println("The Error Message is Correct : "+ErrorMsg);
		}
		else 
		{
			System.out.println("The Error Message is Not Correct : "+ErrorMsg);
		}
	}
	
	
	public void enter_username_and_password(String username,String password) 
	{
		txt_username.sendKeys(username);
		txt_password.sendKeys(password);
	}
	
	public void hitenter() {
		btn_login.click();
	}
	
	

}
