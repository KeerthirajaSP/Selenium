package JsExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ExecutorDemo {
//code for Flashing the web element 
	public static void flash(WebElement element, WebDriver driver){
		
		String bgcolor = element.getCssValue("backgroundColor"); // green
		for (int i = 0; i < 25; i++) {
			changeColor("#681fc7", element,driver); //1 #000000 Represent black color
			changeColor(bgcolor, element,driver); //2
		}
	}
	public static void changeColor(String color, WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
		js.executeScript("arguments[0].style.backgroundColor= '"+color+"'", element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			
		}
	}
	
//Code for drawing the border to web element
public static void DrawBorder(WebElement element, WebDriver driver) {
		
		JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
		js.executeScript("arguments[0].style.border= '5px solid red'", element);
	}

//Code for get title by using executor method
public static String getTitleByJs(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
	String title = js.executeScript("return document.title;").toString();
	return title;
}
//Code for click method by using executor method
public static void clickElementByJs(WebElement element, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
	js.executeScript("arguments[0].click();", element);
}
// Code for generate alert message
public static void generateAlert(String message, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
	js.executeScript("alert('"+message+"');");
}
// Code for refreshing the browser by using executor
public static void refreshBrowserByJs(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
	js.executeScript("history.go(0)");
}
// Code for scroll the page till we found element
public static void ScrollIntoView(WebElement element, WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
	js.executeScript("arguments[0].scrollIntoView(true);", element);
}
//Code for scroll the page till end of page
public static void ScrollIntoPageDown(WebDriver driver) {
	
	JavascriptExecutor js =((JavascriptExecutor)driver); // casting the driver object in java script executor
	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
}
