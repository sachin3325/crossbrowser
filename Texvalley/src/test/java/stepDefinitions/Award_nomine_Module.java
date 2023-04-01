package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Award_nomine_Module 
{
	public static WebDriver driver;
	
	@Given("User clicks Award and Nomination link")
	public void user_clicks_award_and_nomination_link() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://texvalley.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		WebElement awardnomine = driver.findElement(By.linkText("Award Nominations"));
		awardnomine.click();
		Thread.sleep(2000);
	}
	@When("User enters the Name")
	public void user_enters_the_name() throws Throwable 
	{
		WebElement entername = driver.findElement(By.xpath("//input[@name='name']"));
		entername.sendKeys("Enter Name");
		Thread.sleep(2000);
		
	}
	@When("User enters the Email_ID")
	public void user_enters_the_email_id() throws Throwable 
	{
		 WebElement entermail = driver.findElement(By.xpath("//input[@name='email_id']"));
		 entermail.sendKeys("email@gmail.com");
		 Thread.sleep(2000);
	}
	@When("User enters the Country")
	public void user_enters_the_country() throws Throwable 
	{
	     WebElement entercountry = driver.findElement(By.xpath("//input[@id='country']"));
	     entercountry.sendKeys("Enter Country");
	     Thread.sleep(2000);
	}
	@When("User enters the Mobile_Number")
	public void user_enters_the_mobile_no() throws Throwable 
	{
		  WebElement entermob = driver.findElement(By.xpath("//input[@name='mobile_no']"));
		  entermob.sendKeys("Mobile123455666");
		  Thread.sleep(2000);
		  
	}
	@When("User enters the Password1")
	public void user_enters_the_password() throws Throwable 
	{
		WebElement enterpwd = driver.findElement(By.xpath("//input[@name='password']"));
		enterpwd.sendKeys("PassWord");
		Thread.sleep(2000);
		
	}
	@When("User enters the Confirm Password1")
	public void user_enters_the_confirm_password() throws Throwable 
	{
		WebElement pwdconfirm = driver.findElement(By.xpath("//input[@name='password_confirmation']"));
		pwdconfirm.sendKeys("Confirm_Pass");
		Thread.sleep(2000);
		
	}
	@Then("User clicks the Signup Button")
	public void user_clicks_the_signup_button() throws Throwable 
	{
		WebElement signupbtn = driver.findElement(By.xpath("//button/span[text()='Sign Me Up']"));
		signupbtn.click();
		Thread.sleep(2000);
	}


}
