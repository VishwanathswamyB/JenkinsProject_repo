package Jenkins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoClassTest {
	@Test
	public void demo() {
		WebDriver driver = new ChromeDriver();
		Reporter.log("first script for jenkins",true);
	}

}
