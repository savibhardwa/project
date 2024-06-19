package com.firstcrystore.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup {
	
		//1. create object of webdriver
			WebDriver ldriver;

			//constructor
			public Signup (WebDriver rdriver)
			{
				ldriver = rdriver;
				

				PageFactory.initElements(rdriver, this);
			}


			//identify web elements
			@FindBy(xpath=("//input[@name='firstname']"))
			WebElement firstname;
			
			@FindBy(xpath=("//input[@name='lastname']")) 
			WebElement lastname;
			
			@FindBy(xpath=("//input[@name='email']")) 
			WebElement email;
			
			@FindBy(xpath=("//input[@name='password']")) 
			WebElement password;
			
			@FindBy(xpath=("//input[@name='confirmpassword']")) 
			WebElement confirmpassword;
			
			@FindBy(xpath=("//button[@type='submit']")) 
			WebElement submit;
			
			public void enterCreateEmailAddress(String emailAdd) 
			{
				createEmailId.sendKeys(emailAdd);
			}

			
			public void clickSubmitCreate()
			{
				SubmitCreate.click();
			}
			
			//ACTIONS METHODS FOR ALREADY REGISTERED USERS
			
			public void enterEmailAddress(String emailAdd) 
			{
				registeredUsersEmail.sendKeys(emailAdd);
			}

			public void enterPassword(String pwd) 
			{
				registeredUsersPwd.sendKeys(pwd);
			}

			
			public void clickSignIn()
			{
				submitLogin.click();
			}
			
			//identify action on web element
			public void Signup() {
				Signup.click();
				}

}
