package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test(enabled=true)
	public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		String customerName = f.getExcelData("createCustomer", 1, 1);
		String desc = f.getExcelData("createCustomer", 1, 2);
		t.getAddNewBtn().click();
		t.getNewCustBtn().click();
		t.getCustNameTbx().sendKeys(customerName);
		t.getCustDescTbx().sendKeys(desc);
		t.getCompanyDropdown().click();
		t.getOutCompOption().click();
		Thread.sleep(2000);
		t.getCreateCustBtn().click();
		String text = t.getVerifyMsg().getText();
		Assert.assertEquals(text, "Customer '"+customerName+"' has been created");//Compare complete value
		boolean res = text.contains(customerName);
		Assert.assertTrue(res);//Compare partial value
	}
	@Test
	public void deleteCustomer() throws InterruptedException, EncryptedDocumentException, IOException {
		HomePage h=new HomePage(driver);
		h.setTask();
		TaskListPage t=new TaskListPage(driver);
		String customerName = f.getExcelData("createCustomer", 1, 1);
		t.setSearchTbx(customerName);
		t.clickSettingsBtn();
		Thread.sleep(2000);
		t.deletCustomer();
		String text = t.getVerifyMsg().getText();
		boolean res = text.contains(customerName);
		SoftAssert s=new SoftAssert();
		s.assertTrue(res);
		s.assertAll();
	}
}
