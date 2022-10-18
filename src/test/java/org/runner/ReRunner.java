package org.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JVMReport;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="@Rerun\\failed.txt",glue="org.stepdefinition",
dryRun=false,tags= {"@Login,@Forgot"},plugin= {
		"rerun:F:\\Cucumber\\Rerun\\failed.txt"})

public class ReRunner {

	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport(System.getProperty("user.dir")+"\\AllReports\\JsonReport\\fb.json");
	}

}
