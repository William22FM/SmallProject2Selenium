package Login;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Booking {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverWait wait;

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,20);

//        TC-SearchHotelAceh

        driver.navigate().to("http://103.226.139.66:8080/en/login");
        driver.findElement(By.id("email")).sendKeys("as@e.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123654");
        Thread.sleep(2000);
        driver.findElement(By.id("SubmitLogin")).click();
        boolean status7 = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div[1]")).isDisplayed();
        System.out.println(status7);
        driver.findElement(By.cssSelector("input#hotel_location")).sendKeys("Aceh");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button#id_hotel_button")));
        driver.findElement(By.cssSelector("button#id_hotel_button")).click();
        Thread.sleep(5000);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[data-id-hotel]")));
        driver.findElement(By.cssSelector("[data-id-hotel]")).click();
        Thread.sleep(10000);
        driver.findElement(By.cssSelector("input#check_in_time")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//*[text()=28]")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("check_out_time")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]//*[text()=29]")).click();
        Thread.sleep(8000);
        driver.findElement(By.cssSelector("button#search_room_submit > span")).click();
        Thread.sleep(10000);
        boolean status = driver.findElement(By.cssSelector("div#left_column p")).isDisplayed();
        System.out.println(status);

//  TC-BookingGeneral
    driver.findElement(By.cssSelector("#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span")).click();
    Thread.sleep(3000);
    boolean status1 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
    System.out.println(status1);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("span[title='Continue shopping'] > span")).click();



//TC-BookingDelux
    driver.findElement(By.cssSelector("#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span")).click();
    Thread.sleep(3000);
    boolean status2 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
    System.out.println(status2);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("span[title='Continue shopping'] > span")).click();


//TC-BookingExecutive
    driver.findElement(By.cssSelector("#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(2) .ajax_add_to_cart_button span")).click();
    Thread.sleep(3000);
    boolean status3 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
    System.out.println(status3);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("span[title='Continue shopping'] > span")).click();



//TC-BookingLuxury
    driver.findElement(By.cssSelector("#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(3) .ajax_add_to_cart_button span")).click();
    Thread.sleep(3000);
    boolean status4 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
    System.out.println(status4);
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("span[title='Close window']")).click();



//TC-SeeOrder
    driver.findElement(By.cssSelector("[title='View my booking cart']")).click();
   // click element    css:[title='View my booking cart']

//TC-Remove,Booked1
    driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[1]/p[2]/a")).click();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[2]/div[1]/p[2]/a")).click();
    Thread.sleep(3000);
    //driver.findElement(By.xpath("//*[@id=\"collapse-shopping-cart\"]/div/div[2]/div[1]/div[1]/p[2]/a")).click();
    Thread.sleep(3000);
    System.out.println("status5");

//TC-CheckOut
    driver.findElement(By.cssSelector(".card-body a[title='Proceed to checkout']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("[title='Proceed to Payment']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("input#cgv")).click();
    Thread.sleep(25000);
    driver.findElement(By.cssSelector("[title='Pay by bank wire']")).click();
    Thread.sleep(3000);
    driver.findElement(By.cssSelector("#cart_navigation span")).click();
    //Element Should Contain    css:.page-heading    Order confirmation

    }
}