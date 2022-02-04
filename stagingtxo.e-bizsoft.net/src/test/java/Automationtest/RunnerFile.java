package Automationtest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/TestStepwithData.feature",glue= {"Automationtest"},monochrome = true
//plugin = {"pretty","html:target/HtmlReport"},
// = {"pretty","json:targert/report2.json"},
//plugin = {"pretty","junit:targert/juintreport/report.xml"},
//tags = "@pagefactorytest"
// there are many sunaerio to run a feature file like and or not 
)
public class RunnerFile {

}
