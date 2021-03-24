import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;


import io.github.bonigarcia.wdm.*;

public class TesteAmbiente {
		
		
		private WebDriver driver;

	    @BeforeClass
	    public static void setupClass() {
	        WebDriverManager.chromedriver().setup();
	    }

	    @Before
	    public void setupTest() {
	        driver = new ChromeDriver();
	        driver.get("https://seubarriga.wcaquino");
	    }

	    @After
	    public void teardown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }

	    @Test
	    public void test() {
	        // Your test code here
	    }

	}


