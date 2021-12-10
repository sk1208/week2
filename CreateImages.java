package AssignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateImages {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leafground.com/pages/Image.html");
         driver.manage().window().maximize();
         String title = driver.getTitle();
         System.out.println(title);
         driver.findElement(By.xpath("//img[@src='../images/testleaf_logo.png']"));
         String homepage=driver.getTitle();
         System.out.println(homepage);
         WebElement brokenimage=driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
         String attribute = brokenimage .getAttribute("src");
 		driver.navigate().to(attribute);
             String title1 = driver.getTitle();
		
		if(title1.contains("HTTP Status 404 – Not Found")) {
			System.out.println("I'm Broken image");
		}else {
			System.out.println("Not an broken image");
		}
		driver.navigate().back();
		
         driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
         driver.navigate().back();
 		
     	
         
         
	}

}
