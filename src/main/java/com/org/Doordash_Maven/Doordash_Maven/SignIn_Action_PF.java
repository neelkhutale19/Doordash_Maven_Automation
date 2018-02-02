package com.org.Doordash_Maven.Doordash_Maven;



import org.openqa.selenium.WebDriver;

import PageFactory.HomePage_PF;

import PageFactory.LoginPage_PF;

import Utility.ExcelUtils;

// Now this method does not need any arguments

public class SignIn_Action_PF {

public static void Execute(WebDriver driver) throws Exception{

	//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

	String sUserName = ExcelUtils.getCellData(1, 1);

	String sPassword = ExcelUtils.getCellData(1, 2);

//	HomePage.btn_Menu(driver).click();

	LoginPage_PF.txtbx_Email.sendKeys(sUserName);

	LoginPage_PF.txtbx_Password.sendKeys(sPassword);

	LoginPage_PF.Signin_Btn.click();

}

}