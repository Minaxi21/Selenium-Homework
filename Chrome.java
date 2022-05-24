package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumLearning1\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get ("https://www.google.com/");
        driver.manage().window().fullscreen();
        String title = driver.getTitle();
        System.out.print(title);
        if (title.equals("Google")){
            System.out.println(": You are in correct Page!!");
        }
        else {
            System.out.println("        : Incorrect page!!");
        }
        driver.close();

    }

}
