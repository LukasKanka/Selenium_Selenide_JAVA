import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// @neco je metota těmi začneme psát test
// void = metoda nevrací žádnou hodnotu
// setUP, test, tearDown názvy metod mohu si je pojmenovat jak chci

public class MyThirdTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost";
    @Before
    public void  setUp(){
        driver = new ChromeDriver();

    }
    @Test
    public  void test(){
        driver.get(BASE_URL + "/registracia.php");
        driver.findElement(By.name("email")).sendKeys("franta@borec.cz");
        driver.findElement(By.name("name")).sendKeys("Franta");
        driver.findElement(By.xpath("//form/div[3]/input")).sendKeys("frantík");

    }
    @After
    public void tearDown(){
        driver.quit();

    }
}
