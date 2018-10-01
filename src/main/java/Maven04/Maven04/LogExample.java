package Maven04.Maven04;

import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogExample {
	
	private static Logger logger = LogManager.getLogger(LogExample.class);

	public static void main(String[] args)
	{
		
	   System.setProperty("webdriver.chrome.driver", "G:/SOFTWARES/Testing software/chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 logger.info("Implicit wait given");
		 
		
		 driver.get("https://www.billdesk.com/pgidsk/pgmerc/vodafone/VODAFONEDN_details.jsp"); 
		 logger.info("Browser Opened");
		      
		 driver.findElement(By.id("txtCustomerID")).sendKeys("879587434");
		 
		 logger.info("Mobile no Entered");
		 
		
		/*  System.out.println("\n  Hello world ..! \n");
		
		  logger.trace("This is trace message");  
		  logger.info("This is information massage");
		  logger.error("This is error massage");
		  logger.warn("This is warnig massage");
		  logger.fatal("This is fatal massage");
		  
		  System.out.println("\n  completed");*/

	}

}
