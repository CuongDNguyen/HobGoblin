package locationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageMethods {
	public static String navigateTo(WebDriver wd) {
		wd.findElement(By.name("locations")).click();
		System.out.println(wd.getCurrentUrl());
		return wd.getCurrentUrl();
	}
}
