package com.envion.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage {
	@FindBy(id="logout")
	private WebElement linkLogout;

	@FindBy(id="login_header")
	private WebElement indentifierLoginPage;


    public void logout() {
        linkLogout.click();
    }

    public String indentifierLogout() {
        return indentifierLoginPage.getText();
    }

}
