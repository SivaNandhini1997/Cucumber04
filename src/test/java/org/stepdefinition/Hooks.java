package org.stepdefinition;

import org.helper.BaseClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {
	
	@Before("@Login")
	public void befScenario() {
		System.out.println("Bef Scenario>>>>>>>>>>>");
	}

	@After("@Login")
	public void aftScenario(Scenario s) {
		System.out.println("Aft Scenario>>>>>>>>>>>>");
		if (s.isFailed()) {
			TakesScreenshot tk=(TakesScreenshot)driver;
			byte[] screen = tk.getScreenshotAs(OutputType.BYTES);
			s.embed(screen, "image/png");
		}
		
	}
	
}
