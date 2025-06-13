package seleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulationSingleDraggable {
	
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\SHUBHAM\\\\Downloads\\\\chromedriver-win64 (3)\\\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/draggable/");
		
		//switching frame
		driver.switchTo().frame(0);
		System.out.println("Switched to the frame");
		
		//Draggable the webElement
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		//Drag And Drop Using Actions Class
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 100, 100).build().perform();
	}

}
