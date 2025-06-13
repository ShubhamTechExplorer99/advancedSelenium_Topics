package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SHUBHAM\\Downloads\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[normalize-space()='Sign up for Facebook']")).click();
		
		//1st way
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='1']")).click();//Female
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='2']")).click();//Male
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();//Custam
		
		//2nd way
		
	    List<WebElement> radios = driver.findElements(By.xpath("//input[@type='radio']"));
	    System.out.println("Total radios button  : "+ radios.size());
	    System.out.println(radios.get(0).isSelected());//false
	    System.out.println(radios.get(1).isEnabled());//true
	    System.out.println(radios.get(2).isDisplayed());//true
	    Thread.sleep(2000);
	    radios.get(1).click();//Male
	    System.out.println(radios.get(2).isSelected());//False
	    
	    //3rd Way
	    List<WebElement> radioText = driver.findElements(By.xpath(" //label[@class='_58mt']"));
	    System.out.println("Total RadioText Button  : "+ radioText.size());
	    String expResult = "Female";
	    for(int i =0; i<radioText.size(); i++) {
	    	if(radioText.get(i).getText().equalsIgnoreCase(expResult)){
	    		radioText.get(i).click();
	    		System.out.println(expResult + "Clicked");
	    		
	    		Thread.sleep(3000);
	    		//driver.close();
	    	}
	    	
	    }
	    
	    
	    
	    

	}
}
