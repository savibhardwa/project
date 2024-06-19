package com.firstcrystore.pageobject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//1. create object of webdriver
			WebDriver ldriver;

			//constructor
			public Homepage(WebDriver rdriver)
			{
				ldriver = rdriver;
				

				PageFactory.initElements(rdriver, this);
			}


			//identify web elements
			@FindBy(xpath=("//span[normalize-space()='Account']"))
			WebElement Account;
			
			//identify action on web element
			public void clickOnAccount() {
				Account.click();

	
			}
}
