package testcses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Hotels')]"));
		Actions action   = new Actions(driver);
		action.moveToElement(element).click().perform();
		WebElement dateChekIn  =	driver.findElement(By.id("ctl00_mainContent_txt_Fromdate_MST"));
		WebElement dateChekOut  =	driver.findElement(By.id("ctl00_mainContent_txt_Todate_MST"));
		String dateChein = "03-03-2021";
		String datechecout = "05-10-2021";
		selectDateByJS(driver,dateChekIn,dateChein);
		selectDateByJS(driver,dateChekOut,datechecout);
			
	}

	public static void selectDateByJS(WebDriver driver, WebElement element, String value)
	{
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].setAttribute('value','"+value+"');",element);
	}
	
}
