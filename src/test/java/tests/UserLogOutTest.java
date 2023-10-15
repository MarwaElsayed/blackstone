package tests;

import org.testng.Assert;
//import org.testng.Assert;
import org.testng.annotations.Test;

import pages.UserSignInPage;
import pages.DashboardPage;

public class UserLogOutTest extends TestBase {

	UserSignInPage signInObject;
	DashboardPage dashboardObject;

	@Test
	public void userSignUpsuccessfully() throws InterruptedException {

		signInObject = new UserSignInPage(driver);
		signInObject.UserSignIn("store@admin.com", "P@ssw0rd");
		Thread.sleep(3000);
		dashboardObject = new DashboardPage(driver);
		dashboardObject.ClickOnAvatar();
		dashboardObject.ClickOnLogOutBtn();
		String LogOutMessage = signInObject.LogOutMessage.getText();
		System.out.println(LogOutMessage);
		Assert.assertEquals(LogOutMessage, "Signed out successfully");

	}

}