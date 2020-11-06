package com.automation.RUNNER;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
		
		plugin = {
				"html:target/cucumber_report",
				"json:target/cucumber_report/cucumber.json",
				"rerun:target/rerun.txt" //1 //
			},
			features = {"src/test/resources/Features/login.feature"},
			glue = {"com.automation.login"},
//			tags = {
//					"@loginTechcenter"//, "~@contactUs" //tilde to skip scenarios/features 
//					},
			monochrome = true, // (for avoiding ugly view)
			
			dryRun = false     //  ( for normal execution )
			     //  true      // ( for getting unimplemented steps in feature file )
			
		
		
		)
public class RUNNER {

}
