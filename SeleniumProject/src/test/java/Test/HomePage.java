package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	@FindBy(xpath = "//button[text()='Log in']")
    private WebElement loginButton;
	
	@FindBy(xpath = "//button[text()='Sign up']")
    private WebElement signInButton;
    

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public void openHomePageThenClickLogin(WebDriver driver) {
    	driver.get("https://www.groobaonline.com/");
    	this.clickLoginButton(driver);
    	
    }
    
    public void openHomePageThenClickSignUp(WebDriver driver) {
    	driver.get("https://www.groobaonline.com/");
    	this.clickSignUpButton(driver);
    	
    }

    // Open Home Page then Login button
    public void clickLoginButton(WebDriver driver) {
    	driver.get("https://www.groobaonline.com/");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginBtn.click();
    }
    
    // Open Home Page then Sign In button
    public void clickSignUpButton(WebDriver driver) {
    	driver.get("https://www.groobaonline.com/");
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        signInButton.click();
    }
    
    public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	HomePage hp = new HomePage(driver);
    	
    	
    	// Comment out which one you don't want to run
//    	hp.openHomePageThenClickLogin(driver);
    	
    	hp.openHomePageThenClickSignUp(driver);
    	
 
    }

	
	
	

}
