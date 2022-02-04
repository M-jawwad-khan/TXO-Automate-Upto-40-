package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Subscription {

	WebDriver driver;

	public Subscription(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, Subscription.this);
	}

	@FindBy(id = "lblNoOfUSers")
	WebElement Cur_Users;

	@FindBy(id = "lblTotalAmount")
	WebElement Cur_Amount;

	@FindBy(id = "lblActiveUsers")
	WebElement Cur_Active;

	@FindBy(id = "lblInActiveUsers")
	WebElement Cur_InActive;

	@FindBy(id = "ddlUserRate")
	WebElement NewSubscriptionUserSlab;

	@FindBy(id = "txtNoOfUser")
	WebElement Newtxtuser;

	@FindBy(xpath = "/html/body/form/div[3]/div[4]/div/table/tbody/tr[3]/td[2]/div/div/table/tbody/tr[3]/td/span[1]/strong")
	WebElement NewTotal;

	// Click New Payment Method

	@FindBy(id = "rdoNewPaymentInfo")
	WebElement RdNewPayment;

	// Ach

	@FindBy(id = "rdb_ACH")
	WebElement BtnAch;

	@FindBy(id = "txtAccTitle")
	WebElement TxtACHAccountTitle;

	@FindBy(id = "ddlAccountType")
	WebElement ChkACHAccoutType;

	@FindBy(id = "txtRoutingNumber")
	WebElement TxtACHRoutingNum;

	@FindBy(id = "txtAccountNumber")
	WebElement TxtACHAccountNum;

	// Credit Card

	@FindBy(id = "rdb_card")
	WebElement BtnCreditCard;

	@FindBy(id = "txtCreditCardNumber")
	WebElement TxtCCN;

	@FindBy(id = "txtCreditCardCVVNumber")
	WebElement CVVN;

	@FindBy(id = "txtCreditCardNameOnCard")
	WebElement TxtCN;

	// Billing

	@FindBy(id = "txtBillingCompanyName")
	WebElement TxtCompany;
	String ComName = TxtCompany.getText();

	@FindBy(id = "txtBillingAddressLine1")
	WebElement TxtAddress1;
	String Add1 = TxtAddress1.getText();

	@FindBy(id = "txtBillingAddressLine2")
	WebElement TxtAddress2;
	String Add2 = TxtAddress2.getText();

	@FindBy(id = "txtBillingCity")
	WebElement TxtCity;
	String city = TxtCity.getText();

	@FindBy(id = "cboBillingState")
	WebElement CmbProvince;
	String State = CmbProvince.getText();

	@FindBy(id = "txtBillingPhone")
	WebElement MobileNum;
	String Mobilenum = MobileNum.getText();

	@FindBy(id = "cboBillingCountry")
	WebElement CmbCountry;
	String Country = CmbCountry.getText();

	@FindBy(id = "txtBillingZipCode")
	WebElement TxtZip;
	String zip = TxtZip.getText();

	@FindBy(id = "txtBillingEmail")
	WebElement txtEmail;
	String em = txtEmail.getText();

	@FindBy(id = "btnSave")
	WebElement BtnSave;

	@FindBy(id = "txtContactPassword")
	WebElement ConfirmPassword;

	Select CS = new Select(CmbCountry);
	Select SS = new Select(CmbProvince);

	/*
	 * public void HCheckCurrentUserWithAmount(String Users,String Amount) { String
	 * CU = Cur_Users.getText(); String CA = Cur_Amount.getText();
	 * 
	 * if(CU.equals(Users) || CA.equals(Amount)) {
	 * System.out.println("Current Subscription is According to the \n User : "+CU
	 * +"and Amount : " +CA + "\n Equal To Actual User : " +Users +" and Amount : "
	 * +Amount); } else { System.out.
	 * println("User and Amount is Not According to the Current Subscription" +
	 * " \n User are : "+CU +" and Amount is : "+CA); } }
	 * 
	 * public void HCheckActiveAndInActiveStatus(String Active,String InActive) {
	 * String CA = Cur_Active.getText(); String CINA = Cur_InActive.getText();
	 * if(CA.equals(Active) || CINA.equals(InActive)) {
	 * System.out.println("The App Activer user are : "+CA
	 * +" The Actual Active user are : "+Active);
	 * System.out.println("The App InActiver user are : "+CINA
	 * +" The Actual InActive user are : "+InActive); } else {
	 * System.out.println("Active and Active Is Shown InCorrect"); } }
	 */

	public void UpdateUsersalabWithAmount(String Value, String User) {

		Select DDown = new Select(NewSubscriptionUserSlab);

		String Value1 = "1";

		if (Value1 != Value) {

			DDown.selectByValue(Value);

			if (Value.equals("2")) {

				System.out.println("5 Users @ $58.45 per month");

			}

			else if (Value.equals("3")) {

				System.out.println("10 Users @ $113.91 per month");

			}

			else if (Value.equals("4")) {

				System.out.println("20 Users @ $221.82 per month");

			}

			else if (Value.equals("5")) {

				System.out.println("40 Users @ $431.64 per month");

			}

			else if (Value.equals("6")) {

				System.out.println("50 Users @ $524.56 per month");

			}

			else if (Value.equals("7")) {

				System.out.println("75 Users @ $764.36 per month");

			}

			else {

				System.out.println("100 Users @ $989.18 per month");

			}

		}

		else {

			DDown.selectByValue(Value1);

			Newtxtuser.sendKeys(User);

			Float i = Float.parseFloat(User);

			String NA = NewTotal.getText();

			Double k = i * 11.99;

			String dollar = "$";

			String SA = dollar + k.toString();

			if (NA.equals(SA)) {

				System.out.println("Amount : " + NA + "  is Correct According to the user : " + User);

			} else {

				System.out.println("Amount :" + NA + " is Not Correct According to the user : " + User);

			}
		}

	}

	public void HCheckActiveandInActiveUsers(int Active, int InActive) {

		String AU = Cur_Active.getText();

		String INAU = Cur_InActive.getText();

		int IAU = Integer.parseInt(AU);

		int IINAU = Integer.parseInt(INAU);

		if ((IAU == Active) && (IINAU == InActive)) {

			System.out.println("Active and InActive Status is Correct");

			System.out.println("Application Active user are : " + IAU + " Actual Active User are : " + Active);

			System.out.println("Application INActive user are : " + IINAU + " Actual INActive User are : " + InActive);

		} else {

			System.out.println("Active and InActive Status is Not Correct");

			System.out.println("Application Active user are : " + IAU + " Actual Active User are : " + Active);

			System.out.println("Application INActive user are : " + IINAU + " Actual INActive User are : " + InActive);

		}

	}

	public void NewCCPayment(String CCNumber, String CVV, String CardName) {
		RdNewPayment.click();
		BtnCreditCard.click();
		TxtCCN.sendKeys(CCNumber);
		CVVN.sendKeys("CVV");
		TxtCN.sendKeys(CardName);
	}

	public void NewACHPayment(String ACName, String CMBAT, String ABA, String ACHNumber) {
		RdNewPayment.click();
		BtnAch.click();
		TxtACHAccountTitle.sendKeys(ACName);
		Select Acccounttype = new Select(ChkACHAccoutType);
		Acccounttype.selectByValue(CMBAT);
		TxtACHRoutingNum.sendKeys(ABA);
		;
		TxtACHAccountNum.sendKeys(ACHNumber);

	}

	public void UpdateBilling(String CN, String AD1, String City, String SV, String ZC, String CV, String Number,
			String EA) throws InterruptedException

	{
		if (CN == " ") {
			System.out.println("Company Name is not Change");
		} else if (CN == ComName) {
			System.out.println("Company Name is Same");
		} else {
			TxtCompany.clear();
			TxtCompany.sendKeys(CN);
		}
		if (AD1 == " ") {
			System.out.println("Address 1 is not Change");
		} else if (AD1 == Add1) {
			System.out.println("Address Name is Same");
		} else {
			TxtAddress1.clear();
			TxtAddress1.sendKeys(AD1);
		}
		if (City == " ") {
			System.out.println("City Name is not Change");
		} else if (City == city) {
			System.out.println("City Name is Same");
		} else {
			TxtCity.clear();
			TxtCity.sendKeys(City);
		}
		if (Number == " ") {
			System.out.println("Number is not Change");
		} else if (Number == Mobilenum) {
			System.out.println("Number Name is Same");
		} else {
			MobileNum.clear();
			MobileNum.sendKeys(Number);
		}
		if (ZC == " ") {
			System.out.println("ZipCode is not Change");
		} else if (ZC == zip) {
			System.out.println("ZipCode is Same");
		} else {
			TxtZip.clear();
			TxtZip.sendKeys(ZC);
		}
		if (EA == " ") {
			System.out.println("EmailAddress is not Change");
		} else if (EA == em) {
			System.out.println("EmailAddress is Same");
		} else {
			txtEmail.clear();
			txtEmail.sendKeys(EA);
		}
		if (CV == " ") {
			System.out.println("Country Name is not Change");
		} else {
			CS.selectByVisibleText(CV);
			Thread.sleep(2000);
		}
		if (SV == " ") {
			System.out.println("State Name is not Change");
		} else {
			SS.selectByVisibleText(SV);
		}

		System.out.println("Billing Information is Update");

	}

	public void OnlyUpdateCOuntryandState(String CV, String SV) throws InterruptedException {

		if (CV == " " || SV == " ") {

			System.out.println("State and Country is not change");

		} else {
			CS.selectByValue(CV);
			Thread.sleep(2000);
			SS.selectByValue(SV);
			System.out.println("Country and State Updated");

		}
	}

	public void EnterSave() {
		BtnSave.click();
	}

}

// Now for Subscription Change

//	 
//
//	Public Void Passwordandsave(String Password){ 
//
//	Txtpass.sendkeys(Password); 
//
//	Btnsave.click(); 
//
//	} 
//
//	Public void WrongPassword(String Password){ 
//
//	Txtpass.sendkeys(Password); 
//
//	Btnsave.click(); 
//
//	} 
//
//	Public voud back(){ 
//
//	Btnback.click(); 
//
//	} 
//
//	 
//	
