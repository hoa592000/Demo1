import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.time.Duration;


public class SeleniumMaven{


    @Test
    public void Setup() {
        GlobalValuesDrive gd;

        //Properties prop=new Properties();
       // FileInputStream fis= new FileInputStream("C:\\Users\\admin\\thanhhoa\\data.properties");
// Chrome
        System.setProperty("webdriver.chrome.driver", "D:\\AutoTest\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//Firefox

        /* System.setProperty("webdriver.gecko.driver", "D:\\AutoTest\\geckodriver-v0.30.0-win64(1)\\geckodriver.exe");

        WebDriver driver1 = new FirefoxDriver();

//Microsoft Edge

        System.setProperty("webdriver.edge.driver", "D:\\AutoTest\\edgedriver_win64\\msedgedriver.exe");

        WebDriver driver2 = new EdgeDriver(); */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //driver1.get("https://rahulshettyacademy.com");
        //driver2.get("https://rahulshettyacademy.com");
        driver.findElement(By.id("inputUsername")).sendKeys("thanhoa");
        driver.findElement(By.name("inputPassword")).sendKeys("thanhhoa777");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("thanhhoa");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("thanhhoa592000@gmail.com");
        driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("0998");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
        driver.close();

//driver.quit();
    }
}
