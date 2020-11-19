package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SuccessfulLogin {
	public WebDriver driver;
	@Given("application launched already")
	public void application_launched_already() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com"); 
	}

	@When("correct credentials are provided")
	public void correct_credentials_are_provided() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("manipal822@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("manipal123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//input[@type= 'submit' and @value='Log in']")).click();
	}

	@Then("successfully logged in to application")
	public void successfully_logged_in_to_application() {
		String pageTitle1=driver.getTitle();
		System.out.println(pageTitle1);
		driver.quit();
	}


}
