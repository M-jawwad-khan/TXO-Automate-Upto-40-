package Automationtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TxoMenu {
	
	WebDriver driver;
	public TxoMenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, TxoMenu.this);
	}
	
	@FindBy(id = "menu")
	WebElement Menu;
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/li[1]/a")
	WebElement Home;
	
	public void menu() {
		Menu.click();
	}
	
	public void homemenu() {
		Home.click();
	}
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/li[2]/a")
	WebElement NewRequision;
	
	public void NewReqmenu() {
		NewRequision.click();
	}
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/li[3]/a")
	WebElement History;
	
	public void Historymenu() {
		History.click();
	}
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/li[4]/a")
	WebElement Setting;
	
	public void Settingmenu() {
		Setting.click();
	}
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/div[1]/ul/li[1]/a")
	WebElement UserManagment;

	public void UserManagmentmenu() {
		UserManagment.click();
	}
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/div[1]/ul/li[2]/a")
	WebElement WorkFlow;

	public void Workflowmenu() {
		WorkFlow.click();
	}
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/div[1]/ul/li[3]/a")
	WebElement Subscription;

	public void Subscriptionmenu() {
		Subscription.click();
	}
	
	
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/div[1]/ul/li[4]/a")
	WebElement CompanySetting;
	
	public void CompanySettingmenu() {
		CompanySetting.click();
	}
	@FindBy(xpath ="/html/body/form/div[3]/div[3]/div[1]/ul/li[5]/a")
	WebElement PasswordChange;
	
	@FindBy(id ="btnLogout")
	WebElement ClickLogout;
	
	@FindBy(id ="txtCurrentPswd")
	WebElement CurrentPas;
	
	@FindBy(id ="txtNewPswd")
	WebElement Newpas;
	
	@FindBy(id ="txtConfNewPswd")
	WebElement ConfirmPas;
	
	@FindBy(id ="btn_SavePswd")
	WebElement Save;
	
	
	public void PasswordChange(String CurrentPassword, String NewPassword) throws InterruptedException {
		PasswordChange.click();
		Thread.sleep(1000);
		CurrentPas.sendKeys(CurrentPassword);
		Newpas.sendKeys(NewPassword);
		ConfirmPas.sendKeys(NewPassword);
		Save.click();

		
	}
	
	public void Logout() {
		ClickLogout.click();
	}
	

}
