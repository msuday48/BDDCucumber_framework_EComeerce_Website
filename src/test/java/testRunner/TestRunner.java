package testRunner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {"C:\\Users\\ASUS\\Downloads\\BDD_Cucumber_framework_EComeerce_Website\\src\\test\\java\\features"},
					//features= {"C:\Users\ASUS\Downloads\BDD_Cucumber_framework_EComeerce_Website\src\test\java\features\Login.feature"},
					//features= {"C:\Users\ASUS\Downloads\BDD_Cucumber_framework_EComeerce_Website\src\test\java\features\LoginDDTExcel.feature"},
				//	features= {"C:\Users\ASUS\Downloads\BDD_Cucumber_framework_EComeerce_Website\src\test\java\features\Login.feature","C:\Users\ASUS\Downloads\BDD_Cucumber_framework_EComeerce_Website\src\test\java\features\Registration.feature"},
					//features= {"@target/rerun.txt"},
					glue={"stepsDefinitions","hooks"},
					plugin= {"pretty", "html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
		            dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					//tags="@regression"
					//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
					//tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
					//tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
		)
public class TestRunner {
		}