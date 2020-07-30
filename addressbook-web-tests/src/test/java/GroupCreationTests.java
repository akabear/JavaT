import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupCreationTests {
  FirefoxDriver wd;

  @BeforeMethod
  public void setUp() throws Exception {
    System.setProperty("webdriver.gecko.driver", "C:\\TST\\Gecko\\geckodriver.exe");
    wd = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(wd, 3);
    //wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://localhost/addressbook/");
    Login("admin", "secret");
    Thread.sleep(1000L);
    wd.findElement(By.xpath("//form[@id='LoginForm']/input[3]")).click();
  }

  private void Login(String username, String password) throws Exception{
    wd.findElement(By.name("user")).click();
    wd.findElement(By.name("user")).clear();
    wd.findElement(By.name("user")).sendKeys(username);
    Thread.sleep(1000L);
    wd.findElement(By.name("pass")).click();
    wd.findElement(By.name("pass")).clear();
    wd.findElement(By.name("pass")).sendKeys(password);
  }

  @Test
  public void groupCreationTests() {

    Assert.assertEquals(25, 25);

  }
}