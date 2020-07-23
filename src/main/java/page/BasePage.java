package page;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static void waitForElement(WebDriver driver, int timeInSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		}

	public static void dropDown(WebElement LOCATOR, String visibleText) {
		Select sel= new Select(LOCATOR);
		sel.selectByVisibleText(visibleText);
	}
	
	public static int randomNumGenerator() {

		Random rnd = new Random();
		int randomNum = rnd.nextInt(999);
		return randomNum;
	}


}
