package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 //URL
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 // Login Username
		WebElement username= driver.findElement(By.name("USERNAME"));
		 username.sendKeys("DemoSalesManager");
		 
		 //Login Password
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 
		 // Login Button
		 WebElement login =driver.findElement(By.className("decorativeSubmit"));
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
        
        //Firstname Local
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SK");
        
        //Department
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA");
        
        //Description
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Welcome to TestLeaf");
        
        //Email Id
        driver.findElement(By.name("primaryEmail")).sendKeys("abc@gmail.com");
        
        //State province
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dropdown = new Select(state);
        dropdown.selectByVisibleText("Texas");
       
        //Click create button
        driver.findElement(By.name("submitButton")).click();
	     
        //Tile of page
        System.out.println("The title of page is" +driver.getTitle());
	}

}
