import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JobbyAppTest {

    public static void main(String[] args){

        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

        // Open Chrome Browser
        WebDriver driver = new ChromeDriver();

        // Navigate to the login page
        driver.get("https://qajobbyapp.ccbp.tech/login");

        // Find and fill in the form fields
        WebElement usernameEl = driver.findElement(By.cssSelector("input#userNameInput"));
        usernameEl.sendKeys("rahul");

        WebElement passwordEl = driver.findElement(By.cssSelector("input#passwordInput"));
        passwordEl.sendKeys("rahul@2021");

        WebElement buttonEl = driver.findElement(By.cssSelector("button[type='submit']"));
        buttonEl.submit();

        // Define the expected URL of the home page
        String homePageUrl=  "https://qajobbyapp.ccbp.tech/";

        // Wait for the expected URL to be loaded


        // Get the current URL and verify redirection to home page
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.equals(homePageUrl)){
            System.out.println("Navigation to home page is successful!");
        }

        // Find and click on the "Find Jobs" button
        WebElement findJobsButtonEl = driver.findElement(By.cssSelector("button.find-jobs-button"));
        findJobsButtonEl.click();

        // Define the expected URL of the home page
        String jobsPageUrl=  "https://qajobbyapp.ccbp.tech/jobs";

        // Wait for the expected URL to be loaded


        // Get the current URL and verify redirection to jobs page
        currentUrl = driver.getCurrentUrl();


        if(currentUrl.equals(jobsPageUrl)){
            System.out.println("Navigation to jobs page is successful!");
        }

    }
}
