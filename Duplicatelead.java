package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead{

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
	    driver.findElement(By.linkText("Email")).click();
	    driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mrcute12@gmail.com");
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    Thread.sleep(6000);
	    String text = driver.findElement(By.xpath("//a[text()='SATHISH']")).getText();
	    System.out.println(text);
	    driver.findElement(By.xpath("//a[text()='SATHISH']")).click();
	    driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
	    String text1= driver.getTitle();
	    System.out.println(text1);
	    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
	    String text2 = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	    System.out.println(text2);
	    if(text.equalsIgnoreCase(text2)) {
	    	System.out.println("lead duplicate");
	    }
	driver.close();
		

	}

}
