package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmSubscriptionChanges {
	
	WebDriver driver;
	public ConfirmSubscriptionChanges(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, ConfirmSubscriptionChanges.this);
	}
	
	@FindBy(id = "btnSave")
	WebElement BtnSave;
	
	@FindBy(id = "txtContactPassword")
	WebElement ConfirmPassword;
	
	@FindBy(id = "lblNoOfUSers")
	WebElement CurrentNofUser;
	
	@FindBy(id = "lblTotalAmount")
	WebElement CurrentAmount;
	
	
	@FindBy(id = "lblNewNoOfUSers")
	WebElement NewNoofUser;
	
	@FindBy(id = "lblNewTotalAmount")
	WebElement NewAmount;
	
	@FindBy(id = "lblCreditCardEnding")
	WebElement EndCreditCardNum;
	
	@FindBy(id = "lblPaymenttype")
	WebElement Paymenttype;
	
	
	
	String getCurUser = CurrentNofUser.getText();
	String getCurAmount= CurrentAmount.getText();
	String getNewUser = NewNoofUser.getText();
	String getNewAmount = NewAmount.getText();
	String GetDigit = EndCreditCardNum.getText();
	String getPaymenttype = Paymenttype.getText();
	String ACHtype = "Account Number ending - ";
	String CCType ="Credit card ending - ";
	
	
	public void checkcurrentusersubscriptionandamount(String User,String Amount) {
		
		if(getCurUser.equals(User) && getCurAmount.equals(Amount)) {
			System.out.println("Correct Current User Are : " +User +" Current Amount is : "+Amount);
		}
		else {
			System.out.println("Expected Current User and Amount is not Same the Correct Current User Are : " +User +" Current Amount is : "+Amount);
		}
	}
	
	public void checknewusersubscriptionandamount(String NUser, String NAmount) {
		if(getCurUser.equals(NUser) && getCurAmount.equals(NAmount)) {
			System.out.println("Correct New User Are : " +NUser +" Current Amount is : "+NAmount);
		}
		else {
			System.out.println("Expected New User and Amount is not Same the Correct Current User Are : " +NUser +" Current Amount is : "+NAmount);
		}
	}
	
	public void checkCreditcardAccountNum(String LastDigit) {
		if(getPaymenttype.equals(CCType) && GetDigit.equals(LastDigit)) {
			System.out.println("CreditCard Account Num Last Digit And Payment type is Correct");
		}
		else {
			
			System.out.println("Payment Type or Credit Card No is Not Correct");
		}
	}
	
	public void checkAchAccNum(String LastDigit) {
		if(getPaymenttype.equals(ACHtype) && GetDigit.equals(LastDigit)) {
			System.out.println("ACH Account Num Last Digit And Payment type is Correct");
		}
		else {
			
			System.out.println("Payment Type or Account No is Not Correct");
		}
	}
	public void EnterPassword(String Password) {
		ConfirmPassword.sendKeys(Password);
		BtnSave.click();
	}
	
	

}
