import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG_2case {
    WebDriver driver;
    @Test(priority = 1)
    void OpenBrowser(){
        System.out.println("OpenBrowser");
        WebDriverManager.edgedriver().setup();
        WebDriver driver1 = new EdgeDriver();
        driver1.manage().window().maximize();
        driver1.get("https://demo.nopcommerce.com/");
    }
    @Test(priority = 2)
    void EnterDetails() {
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("Krishnakanani@1995gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Krishna1995");
        driver.findElement(By.id("RememberMe")).click();
    }
@Test(priority = 3)
    void ClickOnLoggin(){
        driver.findElement(By.className("class=\"button-1 login-button\"")).click();
    }
}
