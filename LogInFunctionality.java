package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInFunctionality {


    public static void main(String[] args)  throws InterruptedException{

        System.setProperty("webdriver.gecko.driver", "C:\\SeleniumLearning1\\Drivers\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get ("https://demo.nopcommerce.com/");
        //driver.manage().window().getPosition();
        String title = driver.getTitle();
        System.out.print(title);
        if (title.equals("nopCommerce demo store")){
            System.out.println(" : You are in correct Page!!");
        }
        else {
            System.out.println("incorrect Page");
        }
        Thread.sleep(3000);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(5000);
        driver.close();
    }

}






