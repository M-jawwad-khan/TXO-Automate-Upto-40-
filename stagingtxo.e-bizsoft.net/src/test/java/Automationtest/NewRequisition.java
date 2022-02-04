package Automationtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewRequisition {

	WebDriver driver;

	public NewRequisition(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, NewRequisition.this);
	}

	Actions actions = new Actions(driver);

	@FindBy(xpath = "//span[@class = 'prefix lefields-big  class-autocomplete-vendor  search']")
	WebElement ClickOnVendorIcon;

	@FindBy(xpath = "//input[@id = 'filterVendor' and @class='filterInput']")
	WebElement SearchVendorByName;

	@FindBy(id = "cboShipVia")
	WebElement DDSelectShipVia;

	@FindBy(id = "ddlShipToType")
	WebElement DDShipType;

	@FindBy(xpath = "//span[@class = 'prefix lefields-big  class-autocomplete-header-customer  search']")
	WebElement ClickOnCustomerIcon;

	@FindBy(id = "filterShipToType")
	WebElement SearchCus;

	@FindBy(id = "txtMemo")
	WebElement txtMemo;

	@FindBy(id = "txtMesgToVen")
	WebElement TxtNotes;

	@FindBy(id = "ddlPriority")
	WebElement DDpriority;

	@FindBy(xpath = "//input[@id = 'Text23']")
	WebElement SelectPromiseDate;

	@FindBy(id = "Search")
	WebElement SearchItem;

	@FindBy(xpath = "//td[@class = ' css-checkbox1']")
	WebElement Selectitem;

	@FindBy(xpath = "//span[@class = 'ui-datepicker-month']")
	WebElement getMonth;

	@FindBy(xpath = "//span[@class = 'ui-datepicker-year']")
	WebElement getYear;

	@FindBy(xpath = "//span[text() = 'Next']")
	WebElement NextBtn;

	public void SelectVendor(String VendorName) {
		ClickOnVendorIcon.click();
		SearchVendorByName.sendKeys(VendorName);
		WebElement doubleclick = driver
				.findElement(By.xpath("/html/body/form/div[9]/div/div[4]/div/div[3]/div[2]/table/tbody/tr[1]/td"));
		actions.doubleClick(doubleclick).perform();
	}

	public void SelectCustomer(String CustomerName) {
		ClickOnCustomerIcon.click();
		SearchCus.sendKeys(CustomerName);
		WebElement doubleclick = driver
				.findElement(By.xpath("/html/body/form/div[12]/div/div[4]/div/div[3]/div[2]/table/tbody/tr[1]/td"));
		actions.doubleClick(doubleclick).perform();
	}

	@FindBy(xpath = "//div[@class = 'ui-datepicker-title']//span[@class='ui-datepicker-month']")
	WebElement getmonth;

	@FindBy(xpath = "//div[@class = 'ui-datepicker-title']//span[@class='ui-datepicker-year']")
	WebElement getyear;

	@FindBy(xpath = "//a[@data-handler='next']//span[text()='Next']")
	WebElement btnNext;

	@FindBy(xpath = "td[@data-month='11' and @data-year='2021']//a[text() = '31'] ")
	WebElement SelectDate;

	public void SelectYourPromiseDate(String Month, String year, String Date) throws InterruptedException {

		String GY = getyear.getText();
		String GM = getmonth.getText();

		while (Month.equals(GM) && year.equals(GY)) {
			Thread.sleep(100);
			btnNext.click();
		}
		WebElement SelectPromiseDate = driver.findElement(
				By.xpath("td[@data-month='" + Month + "' and @data-year = '" + year + "'//a[text() = '" + Date + "'"));
		SelectPromiseDate.click();
	}

	@FindBy(xpath = "//textarea[@name ='txtMemo']")
	WebElement txtmemo;

	public void AddMemo(String memo) {
		txtmemo.sendKeys(memo);
	}

	@FindBy(xpath = "//textarea[@name ='txtMesgToVen']")
	WebElement txtNotes;

	public void AddNotes(String Notes) {
		txtmemo.sendKeys(Notes);
	}

	@FindBy(id = "btnAddToRequisition")
	WebElement BtnAddToReq;

	public void selectItem(String ItemName) throws InterruptedException {

		String[] EachItem = ItemName.split(" ");
		for (int i = 0; i >= EachItem.length - 1; i++) {
			SearchItem.sendKeys(EachItem[i]);
			Thread.sleep(100);
			Selectitem.click();
			SearchItem.clear();
		}
		BtnAddToReq.click();
	}

}
