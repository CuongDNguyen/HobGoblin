package curriculaTab;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin={"progress","html:C:/Reports/CurriculaTests"},tags= {"@defaultCurricula"},
		features = {"C:/revature/TestCases/src/test/resources/curriculaTest.feature"}
		)
 
public class CurriculaRunner extends AbstractTestNGCucumberTests {

}
