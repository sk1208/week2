package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	public static void main(String[] args) {
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
	    driver.findElement(By.linkText("Contacts")).click();
	    String title2 = driver.getTitle();
	    System.out.println(title2);
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("SATHISH");
	    
	    driver.findElement(By.id("lastNameField")).sendKeys("KUMAR");
	    
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sakthi");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("sivam");
	    driver.findElement(By.className("inputBox")).sendKeys("ENGINEER");
	    driver.findElement(By.id("createContactForm_birthDate")).sendKeys("12/08/1995");
	    driver.findElement(By.name("departmentName")).sendKeys("Electrical");
	    
	    WebElement dd2=driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select s1=new Select(dd2);
	    s1.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.id("updateContactForm_description")).clear();
	    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("i am an mr.perfect");
	    driver.findElement(By.xpath("//input[@value='Update']")).click();
	    driver.navigate().forward();
	    String title3= driver.getTitle();
	    System.out.println(title3);
	    
	    driver.close();
	    
	}

}
