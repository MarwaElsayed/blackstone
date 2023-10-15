package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage  {

	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//p[contains(text(),'Welcome To Dashboard')]")
	public WebElement WelcomeMessage;
   
	@FindBy(xpath = "//body/app-root[1]/admin-layout[1]/section[1]/div[2]/breadcrumb[1]/section[1]/p[1]")
	public WebElement HomePagetitle;
	
	@FindBy(xpath = "//header/section[1]/navbar[1]/div[1]/div[2]/nav-actions[1]/div[1]/ul[1]/li[3]/div[1]/div[2]/img[1]")
	public WebElement avatar;
	
	@FindBy(xpath = "//li[contains(text(),'Logout')]")
	public WebElement logOutBtn;
	
	public void ClickOnAvatar() {
		clicklink(avatar);
	}
	
	public void ClickOnLogOutBtn() {
		clicklink(logOutBtn);
	}
	
}
