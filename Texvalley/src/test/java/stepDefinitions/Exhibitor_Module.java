package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Exhibitor_Module 
{
	public static WebDriver driver;
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	@Given("when user clicks the for exhibitor link")
	public void when_user_clicks_the_for_exhibitor_link() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		  driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.tagexpo.in/");
		 
		WebElement exh_link = driver.findElement(By.linkText("For Exhibitors"));
		exh_link.click();
		Thread.sleep(2000);
	}
	@When("user sees the MSME claim popup and click the Exhibitor button")
	public void user_sees_the_msme_claim_popup_and_click_the_exhibitor_button() throws InterruptedException 
	{
		WebElement exh_btn = driver.findElement(By.xpath("//button[text()='Click to Exhibit']"));
		exh_btn.click();
		Thread.sleep(2000);
		
	}
	@When("user enters the Company Name")
	public void user_enters_the_company_name() throws InterruptedException 
	{
		WebElement company_name = driver.findElement(By.xpath("//input[@id='name']"));
		company_name.sendKeys("Company Name");
		Thread.sleep(2000);
	}
	@When("user enters the Brand Name")
	public void user_enters_the_brand_name() throws InterruptedException 
	{
		WebElement brand_name = driver.findElement(By.xpath("//input[@id='brand_name']"));
		brand_name.sendKeys("Brand_name");
		Thread.sleep(2000);
	}
	@When("user enters the Address")
	public void user_enters_the_address() throws InterruptedException 
	{
		WebElement address = driver.findElement(By.xpath("//input[@id='address']"));
		address.sendKeys("Address");
		Thread.sleep(2000);
		
	}
	@When("user enters the Managing Director")
	public void user_enters_the_managing_director() throws InterruptedException 
	{
		WebElement mng_dr = driver.findElement(By.xpath("//input[@id='managing_director']"));
		mng_dr.sendKeys("Managing Director");
		Thread.sleep(2000);
	}
	@When("user enters the Mobile Number")
	public void user_enters_the_mobile_number() throws InterruptedException 
	{
		WebElement mob_num = driver.findElement(By.xpath("//input[@id='mobile_number']"));
		mob_num.sendKeys("0123456789");
		Thread.sleep(2000);
		
	}
	@When("user enters the Contact Person")
	public void user_enters_the_contact_person() throws InterruptedException
	{
	   WebElement cont_per = driver.findElement(By.xpath("//input[@id='contact_person']"));
	   cont_per.sendKeys("Contact Person");
	   Thread.sleep(2000);
	   
	}
	@When("user enters the Designation")
	public void user_enters_the_designation() throws InterruptedException 
	{
		 WebElement desig = driver.findElement(By.xpath("//input[@id='designation']"));
		 desig.sendKeys("PCVDBHDJ67H");
		    Thread.sleep(2000);
		
	}
	@When("user enters the Pan_Number")
	public void user_enters_the_pan_number() throws InterruptedException 
	{
	    WebElement panNum = driver.findElement(By.xpath("//input[@id='pan_no']"));
	    panNum.sendKeys("PCVDBHDJ67H");
	    Thread.sleep(2000);
	    
	}
	@When("user enters the GST_Number")
	public void user_enters_the_gst_number() throws InterruptedException
	{
		WebElement pan_num = driver.findElement(By.xpath("//input[@id='gst_no']"));
		pan_num.sendKeys("Gst Number");
		Thread.sleep(2000);

	}
	@When("user enters the Phone_Number")
	public void user_enters_the_phone_number() throws InterruptedException
	{
		WebElement ph_num = driver.findElement(By.xpath("//input[@id='phone_no']"));
		ph_num.sendKeys("8373766272");
		Thread.sleep(2000);

	}
	@When("user enters the E-Mail")
	public void user_enters_the_e_mail() throws InterruptedException 
	{
		WebElement email = driver.findElement(By.xpath("//input[@id='email_id']"));
		email.sendKeys("sachu@gmail.com");
		Thread.sleep(2000);

	}
	
	@When("user enters the Website")
	public void user_enters_the_website() throws InterruptedException 
	{
		WebElement website = driver.findElement(By.xpath("//input[@id='website']"));
	    website.sendKeys("Website");
		Thread.sleep(2000);

	}
	
	@When("user clicks the proceed button and sees further details")
	public void user_clicks_the_proceed_button_and_sees_further_details() throws InterruptedException 
	{
		WebElement pro_btn = driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		pro_btn.click();
		Thread.sleep(2000);

	}
	@When("user choose their CATEGORIES")
	public void user_choose_their_categories() throws InterruptedException
	{
		WebElement category1 = driver.findElement(By.xpath("//input[@id='category_2']"));
		js.executeScript("arguments[0].click();", category1);
		//category1.click();
		Thread.sleep(2000);

		WebElement category2 = driver.findElement(By.xpath("//input[@id='category_4']"));
		js.executeScript("arguments[0].click();", category2);
//		category2.click();
		Thread.sleep(2000);

	}
	@When("user choose their Products")
	public void user_choose_their_products() throws InterruptedException 
	{
		WebElement prod1 = driver.findElement(By.xpath("//input[@id='products_on_display_1']"));
		prod1.click();
		Thread.sleep(2000);

		WebElement prod2 = driver.findElement(By.xpath("//input[@id='products_on_display_2']"));
		prod2.click();
		Thread.sleep(2000);

	}
	
	@When("user clicks the acknowledge checkbox")
	public void user_clicks_the_acknowledge_checkbox() throws InterruptedException 
	{
		WebElement acknowledge = driver.findElement(By.xpath("//input[@id='acknowledge_check']"));
		acknowledge.click();
		Thread.sleep(2000);

		
	}
	
	@Then("user clicks submit button")
	public void user_clicks_submit_button() throws InterruptedException 
	{
		WebElement proc_btn = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		proc_btn.click();
		Thread.sleep(2000);

	}



}
