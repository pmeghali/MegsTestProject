package testGmail;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 
public class Gmail {
	
	@Test
	public void Testcase() 
	{
      System.out.println("This is TC1");
	}
 public static void main(String[] args) throws InterruptedException  {
		
	 
	 //Trigger Broswer
 
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEGHALI\\Downloads\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     //Automate Login
     driver.get("https://accounts.google.com");
     driver.manage().window().maximize();
     driver.findElement(By.id("identifierId")).sendKeys("phukanmeghali@gmail.com");
     Thread.sleep(2000);
     /*driver.findElement(By.className("CwaK9")).click();
     driver.findElement(By.className("whsOnd zHQkBf")).sendKeys("rimjhim@21");
     driver.findElement(By.className("RveJvd snByac")).click();*/
    
     //Verify Title
    
     String ar=driver.getTitle();
     String er="Sign in-Google accounts";
     //driver.close();
    
     //TestTitle
    
  
    if(ar.equalsIgnoreCase(er));
     {
	 System.out.println("Test title successful");
     }
     
 }
}
    	 
   

	 
       
 
 
 
 




	 
	 
 
	 
	
 
 
 

