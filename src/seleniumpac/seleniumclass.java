package seleniumpac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumclass {

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Thread.sleep(4000);
		WebElement firstext= driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]"));
		firstext.sendKeys("Kalyani");
		WebElement lasttext=driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]"));
		lasttext.sendKeys("Pole");
		
		Thread.sleep(3000);
		
		driver.close();
//		driver.navigate().to("https://www.amazon.in/");
//		driver.navigate().back();
//		driver.navigate().forward();
//		driver.navigate().refresh();
//		//driver.get("https://www.amazon.in/");
		
		
//		String url= driver.getCurrentUrl();
//		System.out.println("url is:" +url);
//		String title=driver.getTitle();
//		System.out.println("Title is:" +title);
//		String pagecode=driver.getPageSource();
//		System.out.println(pagecode);
//		driver.close();
//		
	
		
		
		
		
		
		
		
	}

}
