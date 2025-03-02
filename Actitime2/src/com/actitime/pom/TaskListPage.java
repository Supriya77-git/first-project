package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class TaskListPage {
	//Create Customer
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement newCustBtn;
@FindBy(id = "customerLightBox_nameField")
private WebElement custNameTbx;
@FindBy(id = "customerLightBox_descriptionField")
private WebElement custDescTbx;
@FindBy(xpath = "//button[contains(text(),'Select an active customer')]")
private WebElement companyDropdown;
@FindBy(linkText = "Our Company")
private WebElement outCompOption;
@FindBy(id = "customerLightBox_commitBtn")
private WebElement createCustBtn;
@FindBy(className = "innerHtml")
private WebElement verifyMsg;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustBtn() {
	return newCustBtn;
}
public WebElement getCustNameTbx() {
	return custNameTbx;
}
public WebElement getCustDescTbx() {
	return custDescTbx;
}
public WebElement getCompanyDropdown() {
	return companyDropdown;
}
public WebElement getOutCompOption() {
	return outCompOption;
}
public WebElement getCreateCustBtn() {
	return createCustBtn;
}
public WebElement getVerifyMsg() {
	return verifyMsg;
}
//Delete Customer
@FindBy(xpath = "//input[@placeholder='Start typing name ...']")
private WebElement searchTbx;
@FindBy(xpath = "//span[@class='highlightToken']/../../div[@class='editButton available']")
private WebElement settingsBtn;
@FindBy(xpath = "//div[contains(@class,'edit_customer')]//div[text()='ACTIONS']")
private WebElement actionsBtn;
@FindBy(xpath = "//div[.='Delete']")
private WebElement deleteBtn;
@FindBy(id="customerPanel_deleteConfirm_submitTitle")
private WebElement delPerBtn;
public void setSearchTbx(String value) {
	searchTbx.sendKeys(value);
}
public void clickSettingsBtn() {
	settingsBtn.click();
}
public void deletCustomer() {
	actionsBtn.click();
	deleteBtn.click();
	delPerBtn.click();
}

}
