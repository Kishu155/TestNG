import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNG_1case {
    WebDriver driver;

    @Test(priority = 1)
    void OpenBrowser() {
        System.out.println("Open Browser");
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 2)
    void Registration() {
        System.out.println("click on ");
        System.out.println("click on ");
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.className("forcheckbox")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Krishna");
        driver.findElement(By.id("LastName")).sendKeys("Kanani");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]/option[16]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]/option[6]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]/option[84]")).click();
        driver.findElement(By.id("Email")).sendKeys("Krishnakanani1995@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Krishna1995");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Krishna1995");


    }
@Test(priority = 3)
    void ClickonRegistration() {
        driver.findElement(By.id("register-button")).click();
    }
}






