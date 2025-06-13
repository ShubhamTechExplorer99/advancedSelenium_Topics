package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		Actions act = new Actions(driver);
		
		WebElement min_slider = driver.findElement(By.xpath("//div[@id=\"slider\"]"));
		System.out.println(min_slider.getLocation());
		
		act.dragAndDropBy(min_slider, 20, 8).perform();
		System.out.println("min_slider after location "+min_slider.getLocation());
		
		System.out.println(min_slider.getLocation().getX());
		System.out.println(min_slider.getLocation().getY());
		
		
	}

}
