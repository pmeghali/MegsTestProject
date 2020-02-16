package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage {
	@Test
	public void Testcase() 
	{
      System.out.println("This is TC1");
	}
 public static void main(String[] args) throws InterruptedException  {
		
	 
	 //Trigger Browser
 
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\MEGHALI\\Downloads\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
     //Automate Login
     driver.get("C:\\Users\\MEGHALI\\Desktop\\Meg.html");
     driver.manage().window().maximize();
    //Verify Title
     
     String ar=driver.getTitle();
     String er="Admin Login Page";
     //driver.close();
    
     //TestTitle
    
  
    if(ar.equalsIgnoreCase(er));
     {
	 System.out.println("Test title successful");
     }
     
 }
} 

	


