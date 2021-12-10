package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletecontact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.id("username")).sendKeys("DemosalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Find Leads")).click();
	    driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9344140052");
		driver.findElement(By.xpath("//button[text()='Find Leads']/parent::em")).click();
		Thread.sleep(5000);
		String text = driver.findElement(By.xpath("//a[text()='SATHISH']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//a[text()='SATHISH']")).click();
		
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
        driver.findElement(By.linkText("Find Leads")).click();
        if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
        
        driver.close();
		 
	    	
	    }
	    

	}


