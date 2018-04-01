package org.start.Project102;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class One {
	public ExtentReports extentReports;
	public ExtentTest extentTest;
	
	@Test public void one_tc1() {
		System.out.println("one tc_01");
	}

	@Test
	public void one_tc2() {
		System.out.println("one tc_02");
	}

	/*
	 * @Test public void sg() throws InterruptedException{
	 * System.setProperty("webdriver.gecko.driver",
	 * "C:/Windows/geckodriver.exe"); WebDriver driver = new FirefoxDriver();
	 * driver.get(
	 * "http://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html"
	 * );
	 * 
	 * Thread.sleep(3000); driver.quit(); }
	 */

	@Test
	public void sg() throws InterruptedException {
		extentReports = new ExtentReports("./Reports/report.html", true);
		extentReports.addSystemInfo("Author Name ", "Satish Rathore");
		System.setProperty("webdriver.chrome.driver", "E:/softsel/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://maven.apache.org/surefire/maven-surefire-plugin/examples/single-test.html");
		 driver.findElement(By.id("eroor")).click();
		Thread.sleep(3000);
		driver.quit();
	}
}
