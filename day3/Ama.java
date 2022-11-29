package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ama {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
        
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		//Pass phone in search
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Phone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//List of mob price
		List <WebElement> mobileprice = driver.findElements(By.className("a-price-whole"));
		List<Integer> prices = new ArrayList<Integer>();
		
		
		/*
		 * for (WebElement eachMblEle : mobileprice) {
		 * System.out.println(eachMblEle.getText()); String text
		 * =eachMblEle.getText().replace(",","").replace("₹",""); int price
		 * =Integer.parseInt(text); prices.add(price); }
		 */
		
		 for(int i=0;i<mobileprice.size();i++)
		  { 
		WebElement mobcost = mobileprice.get(i);
	  String pr =mobcost.getText().replace(",","").replace("₹",""); 
	  System.out.println(pr);
	  //String tr = pr.trim();
	 // System.out.println(tr);
	 // System.out.println(tr);
	 // int price =Integer.parseInt(pr);
	  
		  //boolean emp = pr.isEmpty();	
			//System.out.println(emp);
		//String tr = price.trim();
			//System.out.println(tr);
			//int price =Integer.parseInt(tr);
		    //prices.add(price); 
		  }
		 
		 
		//Collections.sort(prices);
		//System.out.println(prices);
		//System.out.println("Least Price: " + prices.get(0));
	}

}
