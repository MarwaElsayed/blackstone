package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserSignInPage;
import pages.DashboardPage;


public class UserLogInTest extends TestBase {

	UserSignInPage signInObject;
	DashboardPage homeObject;
	

	@Test
	public void userSignUpsuccessfully() throws InterruptedException {

		signInObject = new UserSignInPage(driver);
		signInObject.UserSignIn("store@admin.com","P@ssw0rd");	
		Thread.sleep(3000);
		String welcomeMessage = homeObject.WelcomeMessage.getText();
		System.out.println(welcomeMessage);
		Assert.assertEquals(welcomeMessage, "Welcome To Dashboard");
		String title = homeObject.HomePagetitle.getText();
		System.out.println(title);

	}

}
