package settingsTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavBarPage {
	public NavBarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[1]/a")
	public WebElement overviewTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[2]/a")
	public WebElement batchesTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[3]/a")
	public WebElement locationsTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[4]/a")
	public WebElement curriculaTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[5]/a")
	public WebElement trainersTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[6]/a")
	public WebElement reportsTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[8]/a")
	public WebElement settingsTab;
	
	@FindBy(xpath = "/html/body/div/div[1]/ng-include/div/md-content/md-nav-bar/div/nav/ul/li[9]/a")
	public WebElement logoutTab;
}
