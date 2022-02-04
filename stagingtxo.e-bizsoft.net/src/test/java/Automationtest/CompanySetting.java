package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CompanySetting {

	
	
	WebDriver driver;
	public CompanySetting(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, CompanySetting.this);
	}
	
	
	//Billing
	
		@FindBy(id = "txtCompanyName")
		WebElement TxtCompany;
		String ComName = TxtCompany.getText();
		
		@FindBy(id = "txtAddressLine1")
		WebElement TxtAddress1;
		String Add1 = TxtAddress1.getText();
		
		@FindBy(id = "txtAddressLine2")
		WebElement TxtAddress2;
		String Add2 = TxtAddress2.getText();
		
		@FindBy(id = "txtCity")
		WebElement TxtCity;
		String city= TxtCity.getText();
		
		@FindBy(id = "cboState")
		WebElement CmbProvince;
		String State = CmbProvince.getText();
		
		@FindBy(id = "txtPhone")
		WebElement MobileNum;
		String Mobilenum = MobileNum.getText();
		
		@FindBy(id = "cboCountry")
		WebElement CmbCountry;
		String Country = CmbCountry.getText();
		
		@FindBy(id = "txtZipCode")
		WebElement TxtZip;
		String zip = TxtZip.getText();
		
		@FindBy(id = "txtEmail")
		WebElement txtEmail;
		String em = txtEmail.getText();
		
		@FindBy(id = "btnSave")
		WebElement BtnSave;
		
		@FindBy(xpath = "//button[@class='confirm']")
		WebElement Popbtn;
		
		@FindBy(xpath = "/html/body/div[2]/h2")
		WebElement Success;
		
		@FindBy(xpath = "/html/body/div[2]/p")
		WebElement PopText;
		
		Select CS = new Select(CmbCountry);
		Select SS = new Select(CmbProvince);
		
		
		public void UpdateCompany(String CN, String AD1, String City, String SV, String ZC, String CV, String Number, String EA) throws InterruptedException 

		{
				if (CN == " ")
				{
					System.out.println("Company Name is not Change");
				} 
				else if (CN == ComName)
				{
					System.out.println("Company Name is Same");
				}
				else
				{
					TxtCompany.clear();
					TxtCompany.sendKeys(CN);
				}
				if (AD1 == " ")
				{
					System.out.println("Address 1 is not Change");
				}
				else if (AD1 == Add1)
				{
					System.out.println("Address Name is Same");
				} 
				else 
				{
					TxtAddress1.clear();
					TxtAddress1.sendKeys(AD1);
				}
				if (City == " ") 
				{
					System.out.println("City Name is not Change");
				}
				else if (City == city) 
				{
					System.out.println("City Name is Same");
				} 
				else
				{
					TxtCity.clear();
					TxtCity.sendKeys(City);
				}
				if (Number == " ") 
				{
					System.out.println("City Name is not Change");
				}
				else if (Number == Mobilenum) 
				{
					System.out.println("City Name is Same");
				}
				else 
				{
					MobileNum.clear();
					MobileNum.sendKeys(Number);
				}
				if (ZC == " ") 
				{
					System.out.println("City Name is not Change");
				} 
				else if (ZC == zip) 
				{
					System.out.println("City Name is Same");
				} 
				else 
				{
					TxtZip.clear();
					TxtZip.sendKeys(ZC);
				}	
				if (EA == " ")
				{
					System.out.println("EmailAddress is not Change");
				}
				else if (EA == em) 
				{
					System.out.println("EmailAddress is Same");
				}
				else 
				{
					txtEmail.clear();
					txtEmail.sendKeys(EA);
				}
				if (CV == " ") 
					{
					System.out.println("State Name is not Change");
					} 
				else
					{
						CS.selectByValue(CV);
						Thread.sleep(2000);
					}
				if (SV == " ")
				{
					System.out.println("Country Name is not Change");
				}
				else 
				{
					SS.selectByValue(SV);
				}

				System.out.println("Billing Information is Update");

		}
		

		public void OnlyUpdateCOuntryandState(String CV, String SV) throws InterruptedException{ 

		if(CV == " " || SV == " ")
		{ 

			System.out.println("State and Country is not change");

		}
		else 
		{
			CS.selectByValue(CV); 
			Thread.sleep(2000); 
			SS.selectByValue(SV); 
			System.out.println("Country and State Updated");
		} 
			
		}
		
		
		public void EnterSave() {
			BtnSave.click();
		}
		
		public void PoponClick() throws InterruptedException {
			Thread.sleep(500);
			String Suc= Success.getText();
			if(Suc.equals("Success")) {
				System.out.println(Suc);
				System.out.println(PopText.getText());
				Popbtn.click();
			}
			else {
				System.out.println("Wrong POP Msg Display");
			}
		}
}
