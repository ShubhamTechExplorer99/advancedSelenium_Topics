package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulationDragAndDrop {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		
		//Switching the frame
		driver.switchTo().frame(0);
		
		//Draggable the webElement
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		
		//Droppable the webElement
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		//Drag and Drop using Action class
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		
		
	}

}
