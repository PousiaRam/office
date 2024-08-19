package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverinitilization {

	public static WebDriver driver;

	private Properties prop;

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

	@Test
	public void driverSetup() {

		String baseURL = prop.getProperty("baseURL");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		options.addArguments("disable-notifications");
		options.addArguments("--enable-strict-powerful-feature-restrictions");
		options.addArguments("--disable-geolocation");

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver(options);

		driver.get(baseURL);

		driver.manage().window().maximize();

		/*
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * 
		 * driver.findElement(By.linkText("FLIGHTS")).click();
		 */

		// driver.close();

	}

}
