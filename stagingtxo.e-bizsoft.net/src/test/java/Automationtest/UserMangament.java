package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserMangament {

	WebDriver driver;

	public UserMangament(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, UserMangament.this);
	}

	@FindBy(id = "btn_AddNewValue")
	WebElement AddNewUser;

	@FindBy(id = "btn_Delete")
	WebElement DeleteUser;

	@FindBy(id = "ddlUser")
	WebElement SelectUser;

	@FindBy(id = "txtFirstName")
	WebElement FirstName;

	@FindBy(id = "txtLastName")
	WebElement LastName;

	@FindBy(id = "txtEmail")
	WebElement Email;

	@FindBy(id = "ddlDepartment")
	WebElement Department;

	@FindBy(id = "chkUserStatus")
	WebElement ChkInactive;

	@FindBy(id = "chkSysAdmin")
	WebElement ChkAdmin;

	@FindBy(id = "btn_Insert")
	WebElement BtnSave;

	public void AddUser(String FN, String LN, String EM, String Dpt, String Admin, String Inactive)
			throws InterruptedException {

		if (FN.equals(" ") || LN.equals(" ") || EM.equals(" ")) {
			System.out.println("Filled Not Filled");
		} else {
			AddNewUser.click();
			Thread.sleep(2000);
			FirstName.sendKeys(FN);
			LastName.sendKeys(LN);
			Email.sendKeys(EM);
			Select DDown = new Select(Department);
			DDown.selectByVisibleText(Dpt);
			if (Admin.equals("Yes")) {
				ChkAdmin.click();
			} else {

			}
			if (Inactive.equals("Yes")) {
				ChkAdmin.click();
			} else {

			}
			BtnSave.click();
		}
	}

	public void AddUserManually(String FN, String LN, String EM, String Dpt, String Admin, String Inactive)
			throws InterruptedException {
		AddNewUser.click();
		Thread.sleep(2000);
		FirstName.sendKeys(FN);
		LastName.sendKeys(LN);
		Email.sendKeys(EM);
		Select DDown = new Select(Department);
		DDown.selectByValue(Dpt);
		if (Admin.equals("Yes")) {
			ChkAdmin.click();
		}
		if (Inactive.equals("Yes")) {
			ChkAdmin.click();
		}

		if (FN.equals("") || LN.equals("") || EM.equals("")) {
			System.out.println("Filled Not Filled");
		} else {
			BtnSave.click();
		}

	}

	public void DeleteUser(String UserName) throws InterruptedException {
		Select DDown = new Select(SelectUser);
		DDown.selectByValue(UserName);
		Thread.sleep(2000);
		DeleteUser.click();
	}

	public void InActiveUser_To_ActiveUser(String UserName) throws InterruptedException {
		Select DDown = new Select(SelectUser);
		DDown.selectByValue(UserName);
		Thread.sleep(2000);
		if (ChkInactive.isSelected()) {
			ChkInactive.click();
			BtnSave.click();
		} else {
			BtnSave.click();
		}
	}

	public void ActiveUser_To_InActiveUser(String UserName) throws InterruptedException {
		Select DDown = new Select(SelectUser);
		DDown.selectByValue(UserName);
		Thread.sleep(2000);
		if (ChkInactive.isSelected()) {
			BtnSave.click();
		} else {
			ChkInactive.click();
			BtnSave.click();
		}
	}

}
