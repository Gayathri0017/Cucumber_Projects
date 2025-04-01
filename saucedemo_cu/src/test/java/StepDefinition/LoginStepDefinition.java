package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDefinition {
	WebDriver driver;
	@Given("I am in the SauceDemo Login Page")
	public void i_am_in_the_sauce_demo_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	}
	@When("User provides the valid User name")
	public void user_provides_the_valid_user_name() {  
	   WebElement ip=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
	   ip.sendKeys("standard_user");
	}
	@When("User provides the valid password")
	public void user_provides_the_valid_password() {
	   WebElement pw=driver.findElement(By.xpath("//input[@id=\"password\"]"));
	   pw.sendKeys("secret_sauce");
	}
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
	    WebElement btn=driver.findElement(By.xpath("//input[@id=\"login-button\"]"));
	    btn.click();
	}
	@Then("I should see a dashboard")
	public void i_should_see_a_dashboard() {
	    WebElement tit=driver.findElement(By.xpath("//div[@class=\"app_logo\"]"));
	    String ex="Swag Labs";
	    String ac=tit.getText();
	}
	@When("User does not provides the User name")
	public void user_does_not_provides_the_user_name() {
		WebElement ip=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		ip.sendKeys("");
	}
	@Then("I should see the error message")
	public void i_should_see_the_error_message() {
		WebElement txt=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ex="Username is required";
		String ac=txt.getText();
		Assert.assertTrue(ac.contains(ex));
	}
	@When("User does not provide the password")
	public void user_does_not_provide_the_password() {
		WebElement pw=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pw.sendKeys("");
	}
	@Then("I should see the error messagee")
	public void i_should_see_the_error_messagee() {
		WebElement txt=driver.findElement(By.xpath("//h3[@data-test='error']"));
		String ex="Password is required";
		String ac=txt.getText();
		Assert.assertTrue(ac.contains(ex));
	}
	@When("User provides Invalid User name")
	public void user_provides_invalid_user_name() {
		WebElement ip=driver.findElement(By.xpath("//input[@id=\"user-name\"]"));
		ip.sendKeys("standard_userr");
	}
	@When("User provides Invalid password")
	public void user_provides_invalid_password() {
		WebElement pw=driver.findElement(By.xpath("//input[@id=\"password\"]"));
		pw.sendKeys("secret_saucee");
	}
	@Then("I should see the error messagee3")
	public void i_should_see_the_error_messagee3() {
	    WebElement err=driver.findElement(By.xpath("//h3"));
	    String ex="Epic sadface: Username and password do not match any user in this service";
	    String ac=err.getText();
	    Assert.assertEquals(ex,ac);
	}
	@Then("Close the application")
	public void close_the_application() {
	    driver.quit();
	}
}
