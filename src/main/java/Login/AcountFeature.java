package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcountFeature {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;


        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();


//    TC-OrdersHistory
        driver.navigate().to("http://103.226.139.66:8080/en/login");
        driver.findElement(By.id("email")).sendKeys("as@f.com");
        driver.findElement(By.id("passwd")).sendKeys("123654");
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".caret")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[aria-labelledby] [title='View my customer account']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[title='Orders'] > span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
        System.out.println("TC-OrdersHistory");

 //   TC-CreditSlips
    driver.findElement(By.cssSelector("a[title='Credit slips'] > span")).click();
    driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
        System.out.println("TC-CreditSlips");


 //   TC-AddressesAreListedisted
        driver.findElement(By.cssSelector("a[title='Addresses'] > span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
        System.out.println("TC-AddressesAreListed");

   // TC-PersonalInformation
        driver.findElement(By.cssSelector("a[title='Information'] > span")).click();
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
        System.out.println("TC-PersonalInformation");
// //       TC-AddAddress
//        driver.get("http://103.226.139.66:8080/en/login");
//        driver.findElement(By.id("email")).sendKeys("as@k.com");
//        driver.findElement(By.id("passwd")).click();
//        driver.findElement(By.id("passwd")).sendKeys("123654");
//        Thread.sleep(2000);
//        driver.findElement(By.id("SubmitLogin")).click();
//        driver.findElement(By.cssSelector(".caret")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("[aria-labelledby] [title='View my customer account']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector("a[title='Add my first address'] > span")).click();
//        driver.findElement(By.cssSelector("input#company")).sendKeys("Compan");
//        driver.findElement(By.cssSelector("input[name='address1']")).sendKeys("address1");
//        driver.findElement(By.cssSelector("input[name='address2']")).sendKeys("address2");
//        driver.findElement(By.id("postcode")).sendKeys("52365");
//        driver.findElement(By.id("city")).sendKeys("Purwasuka");
//        driver.findElement(By.id("id_state")).click();
//        driver.findElement(By.xpath("//*[@id=\"id_state\"]/option[22]")).click();
//        driver.findElement(By.id("phone")).sendKeys("2032562541");
//        driver.findElement(By.id("phone_mobile")).sendKeys("086542326549");
//        Thread.sleep(2000);
//        driver.findElement(By.id("submitAddress")).click();
//        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/a/span")).click();
//        Thread.sleep(5000);

    }
}