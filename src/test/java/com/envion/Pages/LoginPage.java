package com.envion.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(id="username")
	private WebElement login;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(xpath="//input[@class='button btnss']")
	private WebElement btnLogin;


	public void login(String name, String pass) {
		login.clear();
		login.sendKeys(name);
		password.clear();
		password.sendKeys(pass);
		btnLogin.click();
	}
}
