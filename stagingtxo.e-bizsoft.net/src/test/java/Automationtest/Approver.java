package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Approver {

	WebDriver driver;

	public Approver(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, Approver.this);
	}

	// Approver 1

	@FindBy(id = "gvWholeComapny_CheckBox5_0")
	WebElement ChkApprover1;

	@FindBy(id = "gvWholeComapny_ddlApp1_0")
	WebElement User1;

	@FindBy(id = "gvWholeComapny_chk1_0")
	WebElement ChkLimit1;

	@FindBy(id = "gvWholeComapny_txtAmt1_0")
	WebElement txtLimit1;

	// Approver 2

	@FindBy(id = "gvWholeComapny_CheckBox1_0")
	WebElement ChkApprover2;

	@FindBy(id = "gvWholeComapny_ddlApp2_0")
	WebElement User2;

	@FindBy(id = "gvWholeComapny_chk2_0")
	WebElement ChkLimit2;

	@FindBy(id = "gvWholeComapny_txtAmt2_0")
	WebElement txtLimit2;

	// Approver 3

	@FindBy(id = "gvWholeComapny_CheckBox2_0")
	WebElement ChkApprover3;

	@FindBy(id = "gvWholeComapny_ddlApp2_0")
	WebElement User3;

	@FindBy(id = "gvWholeComapny_chk2_0")
	WebElement ChkLimit3;

	@FindBy(id = "gvWholeComapny_txtAmt3_0")
	WebElement txtLimit3;

	// Approver 4

	@FindBy(id = "gvWholeComapny_CheckBox3_0")
	WebElement ChkApprover4;

	@FindBy(id = "gvWholeComapny_ddlApp3_0")
	WebElement User4;

	@FindBy(id = "gvWholeComapny_chk4_0")
	WebElement ChkLimit4;

	@FindBy(id = "gvWholeComapny_txtAmt4_0")
	WebElement txtLimit4;

	// Approver 5

	@FindBy(id = "gvWholeComapny_CheckBox4_0")
	WebElement ChkApprover5;

	@FindBy(id = "gvWholeComapny_ddlApp4_0")
	WebElement User5;

	@FindBy(id = "gvWholeComapny_chk5_0")
	WebElement ChkLimit5;

	@FindBy(id = "gvWholeComapny_txtAmt5_0")
	WebElement txtLimit5;

	// Approver 6

	@FindBy(id = "gvwholecomapny_checkbox14_0")
	WebElement ChkApprover6;

	@FindBy(id = "gvWholeComapny_ddlApp5_0")
	WebElement User6;

	public void Create_Approval(String NoofApprover, String UserName1, String Limit1, String UserName2, String Limit2, String UserName3,
			String Limit3, String UserName4, String Limit4, String UserName5, String Limit5, String UserName6)
					throws InterruptedException {

		if(NoofApprover.equals("1")) {
			// Approver 1
			ChkApprover1.click();
			Thread.sleep(2000);
			Select DDrop1 = new Select(User1);
			DDrop1.selectByValue(UserName1);
			Thread.sleep(1000);
			ChkLimit1.click();
			Thread.sleep(1000);
			txtLimit1.sendKeys(Limit1);
		}
		else if(NoofApprover.equals("2")) {
			// Approver 1
			ChkApprover1.click();
			Thread.sleep(2000);
			Select DDrop1 = new Select(User1);
			DDrop1.selectByValue(UserName1);
			Thread.sleep(1000);
			ChkLimit1.click();
			Thread.sleep(1000);
			txtLimit1.sendKeys(Limit1);
			// Approver 2
			ChkApprover2.click();
			Thread.sleep(2000);
			Select DDrop2 = new Select(User2);
			DDrop2.selectByValue(UserName2);
			Thread.sleep(1000);
			ChkLimit2.click();
			Thread.sleep(1000);
			txtLimit2.sendKeys(Limit2);
		}
		else if(NoofApprover.equals("3")) {
			// Approver 1
			ChkApprover1.click();
			Thread.sleep(2000);
			Select DDrop1 = new Select(User1);
			DDrop1.selectByValue(UserName1);
			Thread.sleep(1000);
			ChkLimit1.click();
			Thread.sleep(1000);
			txtLimit1.sendKeys(Limit1);
			// Approver 2
			ChkApprover2.click();
			Thread.sleep(2000);
			Select DDrop2 = new Select(User2);
			DDrop2.selectByValue(UserName2);
			Thread.sleep(1000);
			ChkLimit2.click();
			Thread.sleep(1000);
			txtLimit2.sendKeys(Limit2);

			// Approver 3
			ChkApprover3.click();
			Thread.sleep(2000);
			Select DDrop3 = new Select(User3);
			DDrop3.selectByValue(UserName3);
			Thread.sleep(1000);
			ChkLimit3.click();
			Thread.sleep(1000);
			txtLimit3.sendKeys(Limit3);
		}

		else if(NoofApprover.equals("4")) {
			// Approver 1
			ChkApprover1.click();
			Thread.sleep(2000);
			Select DDrop1 = new Select(User1);
			DDrop1.selectByValue(UserName1);
			Thread.sleep(1000);
			ChkLimit1.click();
			Thread.sleep(1000);
			txtLimit1.sendKeys(Limit1);
			// Approver 2
			ChkApprover2.click();
			Thread.sleep(2000);
			Select DDrop2 = new Select(User2);
			DDrop2.selectByValue(UserName2);
			Thread.sleep(1000);
			ChkLimit2.click();
			Thread.sleep(1000);
			txtLimit2.sendKeys(Limit2);

			// Approver 3
			ChkApprover3.click();
			Thread.sleep(2000);
			Select DDrop3 = new Select(User3);
			DDrop3.selectByValue(UserName3);
			Thread.sleep(1000);
			ChkLimit3.click();
			Thread.sleep(1000);
			txtLimit3.sendKeys(Limit3);
			// Approver 4
			ChkApprover4.click();
			Thread.sleep(2000);
			Select DDrop4 = new Select(User4);
			DDrop4.selectByValue(UserName4);
			Thread.sleep(1000);
			ChkLimit4.click();
			Thread.sleep(1000);
			txtLimit4.sendKeys(Limit4);

		}
		else if(NoofApprover.equals("5")) {
			// Approver 1
			ChkApprover1.click();
			Thread.sleep(2000);
			Select DDrop1 = new Select(User1);
			DDrop1.selectByValue(UserName1);
			Thread.sleep(1000);
			ChkLimit1.click();
			Thread.sleep(1000);
			txtLimit1.sendKeys(Limit1);
			// Approver 2
			ChkApprover2.click();
			Thread.sleep(2000);
			Select DDrop2 = new Select(User2);
			DDrop2.selectByValue(UserName2);
			Thread.sleep(1000);
			ChkLimit2.click();
			Thread.sleep(1000);
			txtLimit2.sendKeys(Limit2);

			// Approver 3
			ChkApprover3.click();
			Thread.sleep(2000);
			Select DDrop3 = new Select(User3);
			DDrop3.selectByValue(UserName3);
			Thread.sleep(1000);
			ChkLimit3.click();
			Thread.sleep(1000);
			txtLimit3.sendKeys(Limit3);
			// Approver 4
			ChkApprover4.click();
			Thread.sleep(2000);
			Select DDrop4 = new Select(User4);
			DDrop4.selectByValue(UserName4);
			Thread.sleep(1000);
			ChkLimit4.click();
			Thread.sleep(1000);
			txtLimit4.sendKeys(Limit4);

			// Approver 5
			ChkApprover5.click();
			Thread.sleep(2000);
			Select DDrop5 = new Select(User5);
			DDrop5.selectByValue(UserName5);
			Thread.sleep(1000);
			ChkLimit5.click();
			Thread.sleep(1000);
			txtLimit5.sendKeys(Limit5);
		}


		else if(NoofApprover.equals("5")) {
			// Approver 1
			ChkApprover1.click();
			Thread.sleep(2000);
			Select DDrop1 = new Select(User1);
			DDrop1.selectByValue(UserName1);
			Thread.sleep(1000);
			ChkLimit1.click();
			Thread.sleep(1000);
			txtLimit1.sendKeys(Limit1);
			// Approver 2
			ChkApprover2.click();
			Thread.sleep(2000);
			Select DDrop2 = new Select(User2);
			DDrop2.selectByValue(UserName2);
			Thread.sleep(1000);
			ChkLimit2.click();
			Thread.sleep(1000);
			txtLimit2.sendKeys(Limit2);

			// Approver 3
			ChkApprover3.click();
			Thread.sleep(2000);
			Select DDrop3 = new Select(User3);
			DDrop3.selectByValue(UserName3);
			Thread.sleep(1000);
			ChkLimit3.click();
			Thread.sleep(1000);
			txtLimit3.sendKeys(Limit3);
			// Approver 4
			ChkApprover4.click();
			Thread.sleep(2000);
			Select DDrop4 = new Select(User4);
			DDrop4.selectByValue(UserName4);
			Thread.sleep(1000);
			ChkLimit4.click();
			Thread.sleep(1000);
			txtLimit4.sendKeys(Limit4);

			// Approver 5
			ChkApprover5.click();
			Thread.sleep(2000);
			Select DDrop5 = new Select(User5);
			DDrop5.selectByValue(UserName5);
			Thread.sleep(1000);
			ChkLimit5.click();
			Thread.sleep(1000);
			txtLimit5.sendKeys(Limit5);
			// Approver 6
			ChkApprover6.click();
			Thread.sleep(2000);
			Select DDrop6 = new Select(User6);
			DDrop6.selectByValue(UserName6);
			Thread.sleep(1000);

		}
		
		else {
			System.out.println("No Approver Selected");
		}


	}

}
