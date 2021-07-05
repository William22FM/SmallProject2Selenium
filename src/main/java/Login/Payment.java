package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Payment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverWait wait = null;

        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,20);


//    TC-PaymentBankWire
        driver.navigate().to("http://103.226.139.66:8080/en/login");
        driver.findElement(By.id("email")).sendKeys("as@e.com");
        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("123654");
        Thread.sleep(2000);
        driver.findElement(By.id("SubmitLogin")).click();
        driver.navigate().to("http://103.226.139.66:8080/en/6-the-hotel-prime?date_from=2021-08-03&date_to=2021-08-11");

        driver.findElement(By.xpath("//*[@id=\"category_data_cont\"]/div[1]/div/div[2]/a/span")).click();
        Thread.sleep(3000);
        boolean status1 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
        System.out.println("User booking");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();

        driver.findElement(By.cssSelector("[title='View my booking cart']")).click();
        driver.findElement(By.cssSelector(".card-body a[title='Proceed to checkout']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[title='Proceed to Payment']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#cgv")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector("[title='Pay by bank wire']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
        //Element Should Contain    css:.page-heading    Order confirmation
        System.out.println("TC-PaymentBankWire");


//TC-PaymentCheck
        driver.navigate().to("http://103.226.139.66:8080/en/6-the-hotel-prime?date_from=2021-08-03&date_to=2021-08-11");

        driver.findElement(By.cssSelector("#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span")).click();
        Thread.sleep(3000);
        boolean status10 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
        System.out.println(status10);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("span[title='Continue shopping'] > span")).click();

        driver.findElement(By.cssSelector("[title='View my booking cart']")).click();
        driver.findElement(By.cssSelector(".card-body a[title='Proceed to checkout']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[title='Proceed to Payment']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#cgv")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector("[title='Pay by check\\.']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#cart_navigation span")).click();
        //Element Should Contain    css:.page-heading    Order confirmation
        System.out.println("TC-PaymentCheck");


//TC-PaymentPaypal
        driver.navigate().to("http://103.226.139.66:8080/en/6-the-hotel-prime?date_from=2021-08-03&date_to=2021-08-11");

        driver.findElement(By.cssSelector("#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span")).click();
        Thread.sleep(3000);
        boolean status12 = driver.findElement(By.cssSelector("#layer_cart_product_title")).isDisplayed();
        System.out.println(status12);
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("span[title='Continue shopping'] > span")).click();

        driver.findElement(By.cssSelector("[title='View my booking cart']")).click();
        driver.findElement(By.cssSelector(".card-body a[title='Proceed to checkout']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("[title='Proceed to Payment']")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input#cgv")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector("[onclick]")).click();
        Thread.sleep(3000);
        System.out.println("TC-PaymentPaypal");


  /*  [Tags]    Payment
    open browser    http://103.226.139.66:8080/en/    chrome
    Maximize Browser Window
    Input Text    email    as@e.com
    click element    passwd
    Input Text    passwd    123654
    sleep    2s
    click button    SubmitLogin
    sleep    2s
    goto    http://103.226.139.66:8080/en/
    Input Text    css:input#hotel_location    Aceh
    click element    css:button#id_hotel_button
    sleep    5s
    click element    css:[data-id-hotel]
    click element    css:input#check_in_time
    click element    css:.ui-icon.ui-icon-circle-triangle-e
    click element    css:tr:nth-of-type(3) > td:nth-of-type(3) > .ui-state-default
    click element    css:input#check_out_time
    click element    css:tr:nth-of-type(4) > td:nth-of-type(4) > .ui-state-default
    sleep    5s
    click element    css:button#search_room_submit > span
    sleep    10s
    Element Should Contain    css:div#left_column p    Search Rooms
    click element    css:#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span
    sleep    5s
    Element Should Contain    css:#layer_cart_product_title    General Rooms
    click element    css:[title='Continue shopping'] span
    click element    css:[title='View my booking cart']
    sleep    5s
    click element    css:.card-body a[title='Proceed to checkout']
    sleep    5s
    click element    css:[title='Proceed to Payment'] span
    sleep    5s
    click element    css:input#cgv
    sleep    10s
    click element    css:[title='Pay by bank wire']
    sleep    5s
    click element    css:#cart_navigation span
    Element Should Contain    css:.page-heading    ORDER CONFIRMATION
    close browser

TC-PaymentCheck
    [Tags]    Payment
    open browser    http://103.226.139.66:8080/en/login?back=my-account    chrome
    Maximize Browser Window
    Input Text    email    as@e.com
    click element    passwd
    Input Text    passwd    123654
    sleep    2s
    click button    SubmitLogin
    sleep    2s
    goto    http://103.226.139.66:8080/en/
    Input Text    css:input#hotel_location    Aceh
    click element    css:button#id_hotel_button
    sleep    5s
    click element    css:[data-id-hotel]
    click element    css:input#check_in_time
    click element    css:.ui-icon.ui-icon-circle-triangle-e
    click element    css:tr:nth-of-type(3) > td:nth-of-type(3) > .ui-state-default
    click element    css:input#check_out_time
    click element    css:tr:nth-of-type(4) > td:nth-of-type(4) > .ui-state-default
    sleep    5s
    click element    css:button#search_room_submit > span
    sleep    10s
    Element Should Contain    css:div#left_column p    Search Rooms
    click element    css:#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span
    sleep    5s
    Element Should Contain    css:#layer_cart_product_title    General Rooms
    click element    css:[title='Continue shopping'] span
    click element    css:[title='View my booking cart']
    sleep    5s
    click element    css:.card-body a[title='Proceed to checkout']
    sleep    5s
    click element    css:[title='Proceed to Payment'] span
    sleep    5s
    click element    css:input#cgv
    sleep    10s
    click element    css:[title='Pay by check.']
    sleep    5s
    click element    css:#cart_navigation span
    Element Should Contain    css:.page-heading    ORDER CONFIRMATION
    close browser

TC-PaymentPaypal
    [Tags]    Payment
    open browser    http://103.226.139.66:8080/en/login?back=my-account    chrome
    Maximize Browser Window
    Input Text    email    as@e.com
    click element    passwd
    Input Text    passwd    123654
    sleep    2s
    click button    SubmitLogin
    sleep    2s
    goto    http://103.226.139.66:8080/en/
    Input Text    css:input#hotel_location    Aceh
    click element    css:button#id_hotel_button
    sleep    5s
    click element    css:[data-id-hotel]
    click element    css:input#check_in_time
    click element    css:.ui-icon.ui-icon-circle-triangle-e
    click element    css:tr:nth-of-type(3) > td:nth-of-type(3) > .ui-state-default
    click element    css:input#check_out_time
    click element    css:tr:nth-of-type(4) > td:nth-of-type(4) > .ui-state-default
    sleep    5s
    click element    css:button#search_room_submit > span
    sleep    10s
    Element Should Contain    css:div#left_column p    Search Rooms
    click element    css:#category_data_cont [class='col-sm-12 room_cont']:nth-of-type(1) .ajax_add_to_cart_button span
    sleep    5s
    Element Should Contain    css:#layer_cart_product_title    Delux Rooms
    click element    css:[title='Continue shopping'] span
    click element    css:[title='View my booking cart']
    sleep    5s
    click element    css:.card-body a[title='Proceed to checkout']
    sleep    5s
    click element    css:[title='Proceed to Payment'] span
    sleep    5s
    click element    css:input#cgv
    sleep    10s
    click element    css:[title='Pay with PayPal']
    sleep    5s
    Element Should Contain    css:#center_column h2    Error occurred:
    close browser

     */

    }
}