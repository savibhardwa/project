package com.firstcrystore.testcases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import firstcrystore.testcases.Signup;
import com.firstcrystore.pageobject.MyAccountPage;

public class TC_MyAccountPageTest extends BaseClass {


	@Test
	public void verifyRegistrationAndLogin()
	{
 

     driver.get(baseUrl);
		Signup pg = new Signup(driver);

		pg.clickOnSignup();
		
		MyAccountPage myAcpg = new MyAccountPage(driver);
		myAcpg.EnterCreateEmailAddress("savitab0973@gmail.com");
		
		myAcpg.clickOnAccount();

		

	
	}
}
