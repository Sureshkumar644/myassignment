package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWeb {

	public static void main(String[] args) {

				 WebDriverManager.chromedriver().setup();
				 ChromeDriver driver=new ChromeDriver();
				 driver.manage().window().maximize();
				 
				 //URL
				 driver.get("http://leaftaps.com/opentaps/control/main");
				 
				 // Login Username
				WebElement username= driver.findElement(By.xpath("//input[@name='USERNAME']"));
				 username.sendKeys("DemoSalesManager");
				 
				 //Login Password
				 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				 
				 // Login Button
				 WebElement login =driver.findElement(By.xpath("//input[@value='Login']"));
	             login.click();
	             
	             //API link
	             driver.findElement(By.linkText("CRM/SFA")).click();
	             
	             //Leads click
	             driver.findElement(By.linkText("Leads")).click();
	             
	             //Create Leads
	             driver.findElement(By.linkText("Create Lead")).click();
	             
	             //Company name
	             driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	             
	             //Firstname
	             driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suresh");
	             
	             //Last name
	             driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
	             
	             //Dropdown code
	             WebElement pass = driver.findElement(By.id("createLeadForm_dataSourceId"));
	             Select dropdown = new Select(pass);
	             dropdown.selectByVisibleText("Direct Mail");
	             
	             driver.findElement(By.name("submitButton")).click();
	       
	             
	}
	}

