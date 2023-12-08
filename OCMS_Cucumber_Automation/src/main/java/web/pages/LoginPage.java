package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	@FindBy(how = How.ID, using = "exampleInputEmail1")
	private WebElement emailID;

	@FindBy(how = How.ID, using = "password-1")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='login-form']/button")
	private WebElement login;

	@FindBy(how = How.XPATH, using = "//h3[normalize-space()='Welcome, Shweta Sonar']")
	private WebElement welcomeMessage;

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void enterEmailID(String email)
	{
		emailID.sendKeys(email);
	}


	public void enterPassword(String pass)
	{
		password.sendKeys(pass);
	}


	public void clickOnSignIn()
	{
		login.click();
	}

	public void see_Welcome_Username(String ExpectedUserMessage) {
		String actualTitlefield = welcomeMessage.getText();
		Assert.assertEquals(actualTitlefield, ExpectedUserMessage);
		System.out.println("Message found as  " + actualTitlefield);
	}
}