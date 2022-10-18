package org.loc;

import java.util.List;
import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends BaseClass {
	
	public LoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private List<WebElement> user;
	
	//AND Operator
	@CacheLookup
	@FindBys({
		
		@FindBy(id="pass"),	//T
		@FindBy(xpath="//input[@type='password']")  //T
		
	})
	private WebElement paswrd;
	
	//OR Operator
	@CacheLookup
	@FindAll({
		@FindBy(name="login"),   //T
		@FindBy(xpath="//button[@type='submi']")   //F
		
	})
	private WebElement lgn;
	
	public WebElement getLgn() {
		return lgn;
	}

	public List<WebElement> getUser() {
		return user;
	}

	public WebElement getPaswrd() {
		return paswrd;
	}
	
	
	

}





















