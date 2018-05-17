package settingsTab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SettingsPage {
	public static final String URL = "https://dev.assignforce.revaturelabs.com/settings";
	
	public SettingsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[1]/md-input-container/input")
	public WebElement timeLineTrainersPerPageInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/section/button[1]")
	public WebElement submitButton;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/section/button[2]")
	public WebElement resetButton;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[4]/md-input-container/md-select")
	public WebElement defaultBatchLocationSelector;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[6]/md-input-container/input")
	public WebElement minBatchSizeInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[7]/md-input-container/input")
	public WebElement maxBatchSizeInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[8]/md-input-container/input")
	public WebElement defaultBatchLengthInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[2]/md-input-container/input")
	public WebElement reportsOutgoingGradsInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[3]/md-input-container/input")
	public WebElement reportsCandidatesIncomingInput;
	
	@FindBy(xpath = "//*[@id=\"view\"]/md-card/md-content/md-list/md-list-item[9]/md-input-container/input")
	public WebElement minDayBetweenTrainerBatchesInput;
}
