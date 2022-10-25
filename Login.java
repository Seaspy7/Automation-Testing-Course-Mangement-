import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login {

    @Test

    public void loginpage(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("http://www.ezhrs.com/ezCourses/admin/admin.asp?action=admin");

        //Locating those fields
        driver.findElement(By.name("uname")).sendKeys("Admin"); //auto enters admin
        driver.findElement(By.name("password")).sendKeys("z"); //auto enters z
        driver.findElement(By.name("SUBMIT")).click();

    }



}
