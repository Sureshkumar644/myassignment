package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGround {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //URL
		 driver.get("https://leafground.com/select.xhtml;jsessionid=node01726s9tfcenpf1bsn9pis5zxhx417425.node0");
		 
		// Click Tool dropdown
				 WebElement selectool = driver.findElement(By.className("ui-selectonemenu"));
				 Select tool = new Select(selectool);
				 tool.selectByVisibleText("Selenium");
				 selectool.sendKeys(Keys.TAB);
				 
	    //click country dropdown
				 driver.findElement(By.xpath("//label[@id='j_idt87:country_label']")).click();
			WebElement selectcountry= driver.findElement(By.xpath("//li[@id='j_idt87:country_3']"));
			selectcountry.click();
		
		    
			
	    //Click cities dropdown
				 driver.findElement(By.xpath("//label[contains(@id,'j_idt87:city_label')]")).click();
			WebElement selectcity =driver.findElement(By.xpath("//li[contains(text(),'Chennai')]"));
           selectcity.click();
          
		
           //Click course dropdown
  		 driver.findElement(By.xpath("//button[@type='button']")).click();
  		WebElement course = driver.findElement(By.xpath("//li[text()='JMeter']"));
  		course.click();
  		
  		
  		//Click language dropdown
  		
  		driver.findElement(By.xpath("//label[contains(@id,'j_idt87:lang_label')]")).click();
  		WebElement language =driver.findElement(By.xpath("//li[contains(text(),'English')]"));
  		language.click();
  		
  		//click language two
  		
  		driver.findElement(By.xpath("//label[contains(@id,'j_idt87:value_label')]")).click();  		
  		WebElement number = driver.findElement(By.xpath("//li[contains(text(),'Two')]"));
  		number.click();
         
				 
	}

}
