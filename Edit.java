package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.id("email")).sendKeys("sathishnamachi005@gmail.com");
	    driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("Append",Keys.TAB);
	    String attribute=driver.findElement(By.name("username")).getAttribute("value");
	    System.out.println(attribute);
	    driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
	    boolean enabled = driver.findElement(By.xpath("//input[@disabled='true']")).isEnabled();
		System.out.println(enabled);
		
	}

}
