package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverinitilization {

	public static WebDriver driver;

	private Properties prop;

	public TakesScreenshot screenShot() throws IOException {
		int num = (int) (Math.random() * 100 + 1);
		Date now = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH_mm_ss");
		String formattedDate = formatter.format(now);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		File DestinationFile = new File("C:\\Screenshot\\SS " + num + " " + formattedDate + ".png");
		FileUtils.copyFile(sourceFile, DestinationFile);
		// FileUtils.delete(DestinationFile);

		return ts;

	}

	public Driverinitilization() throws IOException {

		prop = new Properties();
		// TODO Auto-generated method stub
		try {

			FileInputStream input = new FileInputStream(
					"C:\\Users\\r186\\Downloads\\IndBazaar-master\\IndBazaar-master\\src\\test\\resources\\new.properties");

			prop.load(input);

			input.close();

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}

	@Test(invocationCount = 1)
	@Parameters({ "url" })
	public void driverSetup(String url) throws IOException {

		String baseURL = prop.getProperty("baseURL");

		/*
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("disable-infobars");
		 * options.addArguments("disable-notifications");
		 * options.addArguments("--enable-strict-powerful-feature-restrictions");
		 * options.addArguments("--disable-geolocation");
		 */

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get(url);

		driver.manage().window().maximize();
		screenShot();
		driver.close();

	}

}
