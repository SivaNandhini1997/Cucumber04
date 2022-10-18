package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\resources\\Featurefiles",glue="org.stepdefinition",
dryRun=false,monochrome=true,strict=true,tags= {"@Login,@Forgot"},plugin= {"pretty",
		"html:F:\\Cucumber\\AllReports\\HtmlReport",
		"json:F:\\Cucumber\\AllReports\\JsonReport\\fb.json",
		"junit:F:\\Cucumber\\AllReports\\JunitReport\\fb.xml",
		"rerun:F:\\Cucumber\\Rerun\\failed.txt"})

public class Runner {
	
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\AllReports\\JsonReport\\fb.json");
	}

}
