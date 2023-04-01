package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opentexvalley_site
{
	public static WebDriver driver;
	
	@Given("User launches chrome browser")
	public void user_launches_chrome_browser() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
	}
	@When("user enters url")
	public void user_enters_url() 
	{
		 driver.get("http://texvalley.1clxlite.com/");
	}
	@Then("user sees entire site")
	public void user_sees_entire_site() 
	{
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}

}
