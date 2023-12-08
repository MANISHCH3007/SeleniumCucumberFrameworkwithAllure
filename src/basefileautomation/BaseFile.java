package basefileautomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BaseFile {

	public static WebDriver driver;

	public static String configfileurl = "D:\\Seleniumjavaaselenium\\FunctionalSeleniumDucat\\src\\configFile\\TestData.properties";
	public static Properties loadconfigfile = new Properties();

	public static void launchbrowser() throws IOException {
		FileInputStream filepath = new FileInputStream(configfileurl);
		loadconfigfile.load(filepath);

		String browsername = loadconfigfile.getProperty("Browser");
		System.out.println(browsername);
		String webaddress = loadconfigfile.getProperty("url");
		System.out.println(webaddress);

		if (webaddress.equalsIgnoreCase("https://www.amazon.in/ref=nav_logo")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(webaddress);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		else if (webaddress.equalsIgnoreCase("https://www.amazon.in/ref=nav_logo")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(webaddress);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	
	}

	public static void main(String[] args) throws IOException {
		launchbrowser();
	}
}
