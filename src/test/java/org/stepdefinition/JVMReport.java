package org.stepdefinition;

import java.io.File;
import java.util.*;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {

	public static void generateJvmReport(String jsonPath) {
		
		//1.File Location
		File f=new File(System.getProperty("user.dir")+"\\AllReports\\JvmReport");
		
		//2.Add details
		Configuration c=new Configuration(f, "FACEBOOK APPLICATION");
		
		c.addClassifications("Platform", "Windows 10");
		c.addClassifications("JDK", "1.8");
		c.addClassifications("Selenium", "4.1.2");
		c.addClassifications("Cucumber", "4.8.0");
		
		//3.
		List<String>l=new ArrayList<String>();
		l.add(jsonPath);
		
		//4.
		ReportBuilder r=new ReportBuilder(l, c);
		r.generateReports();
		
		
		
		
		
		
		
		
		
		
	}
}
