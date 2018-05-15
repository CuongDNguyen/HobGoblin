package settingsTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	public SettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input [@id='input_3']")
	public WebElement timeLineTrainersPerPageInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"select_2555\"]")
	public WebElement defaultBatchLocationSelector;
}
