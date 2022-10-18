package org.stepdefinition;

import java.util.List;
import java.util.Map;
import org.helper.BaseClass;
import org.loc.LoginPojo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	@Given("User login facebook application through chrome browser")
	public void user_login_facebook_application_through_chrome_browser() {
		chromeBrowser();
		launchUrl("https://www.facebook.com/");
		maxWindow();
	}

	@Then("User is in invalid credentials page")
	public void user_is_in_invalid_credentials_page() {
		String url = pageUrl();
		if (url.contains("privacy")) {
			System.out.println("User is in invalid credentials page");
		}
	}

	@Then("user should close the browser")
	public void user_should_close_the_browser() {
		closeBroswer();
	}

	// 2D Map
	@When("User enter valid email and invalid password")
	public void user_enter_valid_email_and_invalid_password(io.cucumber.datatable.DataTable d) {
		List<Map<String, String>> mp = d.asMaps();
		String mail = mp.get(0).get("email");
		String pass = mp.get(0).get("password");
		
		LoginPojo l=new LoginPojo();
		fillTextBox(l.getUser().get(0), mail);
		fillTextBox(l.getPaswrd(), pass);
		
		System.out.println(mail);
		System.out.println(pass);
	}

	// Forgot password----->2nd feature file
	@When("User clicks forgot password link")
	public void user_clicks_forgot_password_link() throws InterruptedException {
		WebElement frgt = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		frgt.click();
	}
	//1D Map
	@Then("user searches the account linked with mobilenumber")
	public void user_searches_the_account_linked_with_mobilenumber(io.cucumber.datatable.DataTable d) {
		Map<String, String> mp = d.asMap(String.class, String.class);
		String user = mp.get("username");

		WebElement txtBox = driver.findElement(By.xpath("//input[@placeholder='Email address or mobile number']"));
		txtBox.sendKeys(user);
		
		System.out.println(user);

	}

	@Then("user click search")
	public void user_click_search() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(3000);
	}

}
