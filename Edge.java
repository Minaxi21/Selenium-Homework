package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args)  throws InterruptedException{

        System.setProperty("webdriver.edge.driver", "C:\\SeleniumLearning1\\Drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get ("https://demo.nopcommerce.com/");
        driver.manage().window().getPosition();
        String title = driver.getTitle();
        System.out.print(title);
        if (title.equals("nopCommerce demo store")){
            System.out.println(" : You are in correct Page!!");
        }
        else {
            System.out.println("incorrect Page");
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[6]/a")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(2500);
        driver.findElement(By.className("ico-login")).click();
        Thread.sleep(2500);
        driver.navigate().refresh();
        driver.quit();
    }
}
