package yahoo;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

 
public class TestSignin {
	
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
     driver.get("https://www.facebook.com/");
     driver.manage().window().maximize();
    
     driver.findElement(By.id("email")).sendKeys("phukanmeghali@gmail.com");
     driver.findElement(By.id("pass")).sendKeys("danieljimmi@16");
     driver.findElement(By.id("u_0_b")).click();
     driver.navigate().to("https://www.facebook.com/meghali.phukan.7");
   //Verify Title
     
     String ar=driver.getTitle();
     String er="Meghali Phukan";
     driver.close();
    
     //TestTitle
    
  
    if(ar.equalsIgnoreCase(er));
     {
	 System.out.println("Test title successful");
     }
     
  }
 
} 
 
 




	 
	 
 
	 
	
 
 
 

