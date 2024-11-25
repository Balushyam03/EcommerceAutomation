package base;import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import java.time.Duration;

	public class BaseTest {
	    protected static WebDriver driver;

	    @BeforeClass
	    public static void setup() {
	        WebDriverManager.chromedriver().setup();
	       driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        driver.manage().window().maximize();
	       driver.get("https://www.saucedemo.com");
	    }

	    @AfterClass
	    public static void teardown() {
	        if (BaseTest.driver != null) {
	            BaseTest.driver.quit();
	        }
	    }
	}


