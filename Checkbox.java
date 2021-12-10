package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/checkbox.html");
         driver.manage().window().maximize();
         String title = driver.getTitle();
         System.out.println(title);
         WebDriverManager.chromedriver().setup();
 		ChromeDriver driver1= new ChromeDriver();
 		driver1.manage().window().maximize();
 		driver1.get("http://www.leafground.com/pages/checkbox.html");
 		
 
 		
 		driver1.findElement(By.xpath("//div[text()='Java']/input")).click();
 		driver1.findElement(By.xpath("//div[text()='SQL']/input")).click();
 		driver1.findElement(By.xpath("//div[text()='C']/input")).click();
 		driver1.findElement(By.xpath("//div[text()='C++']/input")).click();
 	
 		 
 	 boolean selected = driver1.findElement(By.xpath("//div[text()='Selenium']/input")).isSelected();
 	 System.out.println(selected);
 	 
 	 
 	 
 	 driver1.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
 	 boolean deselect = driver1.findElement(By.xpath("//div[text()='I am Selected']/input")).isSelected();
 		if (deselect) {
 			System.out.println("The checkbox is not Deselected");
 		} else {
 			System.out.println("The checkbox is Deselected");
 		}


 		for (int i = 1; i <=5; i++) {
 			driver1.findElement(By.xpath("//div[text()='Option "+i+"']/input")).click();
 		}

	}

}
