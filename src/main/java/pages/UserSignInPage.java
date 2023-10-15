package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserSignInPage extends BasePage {

	public UserSignInPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "mat-input-0")
	WebElement Email;

	@FindBy(id = "mat-input-1")
	WebElement Password;

	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement SignInBtn;
	
	@FindBy(xpath = "//p[contains(text(),'Signed out successfully')]")
	 public WebElement LogOutMessage;
	
	public void UserSignIn(String username, String password) {
		setTextElementText(Email, username);
		setTextElementText(Password, password);
		clickButton(SignInBtn);
	}
}
