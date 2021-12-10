package AssignmentWeek2;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Dropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Dropdown.html");
         driver.manage().window().maximize();
         String title = driver.getTitle();
         System.out.println(title);
         WebElement ele1=driver.findElement(By.id("dropdown1"));
         Select s1=new Select(ele1);
         s1.selectByIndex(2);
         WebElement ele2=driver.findElement(By.name("dropdown2"));
         Select s2=new Select(ele2);
         s2.selectByVisibleText("Appium");
         WebElement ele3=driver.findElement(By.id("dropdown3"));
         Select s3=new Select(ele3);
         s3.selectByValue("3");
         List<WebElement> options = s3.getOptions();
         
 	    System.out.println(options);
 	   int size= options.size();
		System.out.println("TOtal options are: "+size);
 	  
		WebElement select5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		select5.sendKeys("A");
		WebElement select6 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
 	   Select multiselect = new Select(select5);
		
		
		multiselect.selectByIndex(4);
 	    driver.close();
 	    
 	    
 	    
 	    
 	    
 	    
 	 
	}

}
