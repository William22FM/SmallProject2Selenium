package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        By inputEmail = By.id("email_create");
        By btnCreateAccount = By.xpath("//*[@id=\"SubmitCreate\"]");
        By textLogin = By.xpath("//*[@id=\"header\"]/div[3]/div/div/div[7]/ul/li/a/span");
        By rbtGander = By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]");
        By firstName = By.id("customer_firstname");
        By lastName = By.id("customer_lastname");


//        TC-RegisterWrongEmailFormat
        driver.get("http://qa2.cilsy.id:8080");
        driver.findElement(textLogin).click();
        driver.findElement(inputEmail).sendKeys("as@c");
        driver.findElement(btnCreateAccount).click();
        Thread.sleep(2000);
        boolean status = driver.findElement(By.id("create_account_error")).isDisplayed();
        System.out.println(status);


//        TC-RegisterEmptyEmail
        driver.findElement(textLogin).click();
        driver.findElement(btnCreateAccount).click();
        Thread.sleep(2000);
        boolean status1 = driver.findElement(By.id("create_account_error")).isDisplayed();
        System.out.println(status1);

//       TC-RegisterRightEmailandDidn’t FillFullContentRequirements
        driver.findElement(inputEmail).sendKeys("as@p.com");
        driver.findElement(btnCreateAccount).click();
        Thread.sleep(8000);
        driver.findElement(rbtGander).click();
        driver.findElement(firstName ).sendKeys("Will");
        driver.findElement(lastName ).sendKeys("iam");
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[19]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("submitAccount")).click();
        boolean status2 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p[1]")).isDisplayed();
        System.out.println(status2);
        Thread.sleep(2000);

//       TC-RegisterRightEmailandFillAllContentRequirements
        driver.navigate().to("http://103.226.139.66:8080/en/login");
        driver.findElement(textLogin).click();
        driver.findElement(inputEmail).sendKeys("as@p.com");
        Thread.sleep(8000);
        driver.findElement(btnCreateAccount).click();
        driver.findElement(rbtGander).click();
        driver.findElement(firstName ).sendKeys("Will");
        driver.findElement(lastName ).sendKeys("iam");
        driver.findElement(By.id("passwd")).sendKeys("123654");
        driver.findElement(By.xpath("//*[@id=\"days\"]/option[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();
        driver.findElement(By.xpath("//*[@id=\"years\"]/option[19]")).click();
        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.id("submitAccount")).click();
        WebDriverWait w = new WebDriverWait(driver,5);
        w.until(ExpectedConditions.presenceOfElementLocated (By.xpath("//*[@id=\"center_column\"]/h1")));
        Thread.sleep(5000);
        driver.close();


//        TC-LoginWrongFormatEmail-Message_invalid_email_address
        Thread.sleep(5000);
        driver.get("http://103.226.139.66:8080/en/login");
        //driver.navigate().to("http://103.226.139.66:8080/en/login?back=my-account");
        driver.findElement(By.id("email")).sendKeys("as@e");
        driver.findElement(By.id("passwd")).sendKeys("12354");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(2000);
        boolean status4 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1] ")).isDisplayed();
        System.out.println(status4);


//       TC-LoginWrongEmail-Message_authentication_failed
        driver.findElement(By.id("email")).sendKeys("as@z.com");
        driver.findElement(By.id("passwd")).sendKeys("12354");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(2000);
        boolean status5 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).isDisplayed();
        System.out.println(status5);


//        TC-LoginWrongPassword
        driver.findElement(By.id("email")).sendKeys("as@e.com");
        driver.findElement(By.id("passwd")).sendKeys("987654");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(2000);
        boolean status6 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).isDisplayed();
        System.out.println(status6);


 //        TC-LoginRight
        driver.findElement(By.id("email")).sendKeys("as@e.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123654");
        Thread.sleep(2000);
        driver.findElement(By.id("SubmitLogin")).click();
        boolean status7 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).isDisplayed();
        System.out.println(status7);

//        TC-Logout
         driver.findElement(By.id("user_info_acc")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".dropdown-menu \\ a[title='Log me out']")).click();


    }
}
