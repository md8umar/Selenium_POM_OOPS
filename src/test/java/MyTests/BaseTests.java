package MyTests;

import com.mypages.BasePage;
import com.mypages.Page;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTests {
    WebDriver driver;
    public Page page;
    @BeforeMethod
    @Parameters(value = {"browser"})
    public void setup(String browser){
        if(browser.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();

        }
        else if(browser.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }
        else{
            System.out.println("No browser defined");
        }
        page= new BasePage(driver);
        driver.get("http://www.wikipedia.org/");
}

@AfterMethod
    public void teardown(){
        driver.quit();
}
}
