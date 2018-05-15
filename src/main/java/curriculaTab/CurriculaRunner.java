package curriculaTab;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin={"progress","html:C:/Reports/CurriculaTests"},tags= {"@curriculaTest"},
		features = {"C:/revature/ServletAngular/src/test/resources/curriculaTest.feature"}
		)
 
public class CurriculaRunner extends AbstractTestNGCucumberTests {

}
