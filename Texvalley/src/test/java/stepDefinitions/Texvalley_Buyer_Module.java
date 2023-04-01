package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;







public class Texvalley_Buyer_Module 
{
	public static WebDriver driver;
	
	@Given("^User able to click the buyer module link$")
	public void user_able_to_click_the_buyer_module_link() throws Throwable 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Soft\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://texvalley.1clxlite.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  

		
	  WebElement buyerLink = driver.findElement(By.linkText("For Buyers"));
	  buyerLink.click();
	  Thread.sleep(2000);
	  
	}

	@When("^User enters the Company name$")
	public void user_enters_the_Company_name() throws Throwable 
	{
	  WebElement companyName = driver.findElement(By.xpath("//input[@name='company_name']"));
	  companyName.sendKeys("Company name");
	  Thread.sleep(2000);

	  
	}

	@When("^User enters the Brand name$")
	public void user_enters_the_Brand_name() throws Throwable 
	{
	    WebElement brandName = driver.findElement(By.xpath("//input[@name='brand_name']"));
	    brandName.sendKeys("Brand name");
		  Thread.sleep(2000);

	}

	@When("^User enters the Address$")
	public void user_enters_the_Address() throws Throwable 
	{
	     WebElement address = driver.findElement(By.xpath("//input[@name='address']"));
         address.sendKeys("Address");
   	  Thread.sleep(2000);

	}

	@When("^User enters the Managing Director$")
	public void user_enters_the_Managing_Director() throws Throwable 
	{
	  WebElement mngDiret = driver.findElement(By.xpath("//input[@name='managing_director']"));
	  mngDiret.sendKeys("Managing Director");
	  Thread.sleep(2000);

	}

	@When("^User enters the RefMobile Number$")
	public void user_enters_the_RefMobile_Number() throws Throwable 
	{
	   WebElement ref_mobnum = driver.findElement(By.xpath("//input[@name='referal_mobile_no']"));
	   ref_mobnum.sendKeys("Ref-Mob number-12345");
		  Thread.sleep(2000);

	}

	@When("^User enters the Contact Person$")
	public void user_enters_the_Contact_Person() throws Throwable 
	{
		WebElement contact_person = driver.findElement(By.xpath("//input[@name='contact_person']"));
		contact_person.sendKeys("contact_person");
		  Thread.sleep(2000);

		
	}

	@When("^User enters the Designation$")
	public void user_enters_the_Designation() throws Throwable 
	{
		WebElement designation = driver.findElement(By.xpath("//input[@name='designation']"));
		designation.sendKeys("Designation");
		  Thread.sleep(2000);

		
	}

	@When("^User enters the GST_No$")
	public void user_enters_the_GST_No() throws Throwable 
	{
		WebElement gstnum = driver.findElement(By.xpath("//input[@name='gst_no']"));
		gstnum.sendKeys("Gst num");
		  Thread.sleep(2000);

	}

	@When("^User enters the EMail_ID$")
	public void user_enters_the_EMail_ID() throws Throwable 
	{
		WebElement mailid = driver.findElement(By.xpath("//input[@name='email_id']"));
		mailid.sendKeys("Email2gmail.com");
		  Thread.sleep(2000);

	}

	@When("^User enters the Mobile_No$")
	public void user_enters_the_Mobile_No() throws Throwable 
	{
		WebElement mobileNum = driver.findElement(By.xpath("//input[@name='mobile_no']"));
		mobileNum.sendKeys("Mobile09636378272");
		  Thread.sleep(2000);

	}

	@When("^User enters the Website$")
	public void user_enters_the_Website() throws Throwable 
	{
		WebElement website = driver.findElement(By.xpath("//input[@name='website']"));
		website.sendKeys("Website");
		  Thread.sleep(2000);

	}

	@When("^User enters the Association Details$")
	public void user_enters_the_Association_Details() throws Throwable 
	{
		WebElement ass_details = driver.findElement(By.xpath("//input[@name='association_details']"));
		ass_details.sendKeys("Association Details");
		  Thread.sleep(2000);

		
	}

	@When("^User choose their Business Type$")
	public void user_choose_their_Business_Type() throws Throwable 
	{
		WebElement businesstype1 = driver.findElement(By.xpath("//input[@value='Wholesaler']"));
		businesstype1.click();
		
		WebElement businesstype2 = driver.findElement(By.xpath("//input[@value='Franchise']"));
		businesstype2.click();
		
		  Thread.sleep(2000);

		
		
	}

	@When("^User choose their interest Product$")
	public void user_choose_their_interest_Product() throws Throwable 
	{
		WebElement product1= driver.findElement(By.xpath("//input[@value='Womens']"));
		product1.click();
		
		WebElement product2 = driver.findElement(By.xpath("//input[@value='Kids']"));
		product2.click();
		
		  Thread.sleep(2000);

	}

	@When("^User enters B(\\d+)B Meeting interest$")
	public void user_enters_B_B_Meeting_interest(int arg1) throws Throwable 
	{
		WebElement b2b_meeting = driver.findElement(By.xpath("//input[@id='interest_b2b_meet']"));
		b2b_meeting.click();
		
		WebElement meeting_date = driver.findElement(By.xpath("//input[@value='29 Jan 2022']"));
		meeting_date.click();
		
		  Thread.sleep(2000);

		
	}

	@When("^User enters Fashion Show Visit interest$")
	public void user_enters_Fashion_Show_Visit_interest() throws Throwable 
	{
		WebElement fashionshowvisit = driver.findElement(By.xpath("//input[@name='fashion_show_visit'][@value='no']"));
		fashionshowvisit.click();
		
		  Thread.sleep(2000);

		
	}

	@When("^User enters the Any Other Requirements$")
	public void user_enters_the_Any_Other_Requirements() throws Throwable 
	{
		
		WebElement otherreq = driver.findElement(By.xpath("//input[@name='other_requirement']"));
		otherreq.sendKeys("Other_requirements");
		
		  Thread.sleep(2000);

		
	}

	@When("^User enters the Password$")
	public void user_enters_the_Password() throws Throwable 
	{
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Password");
		
		  Thread.sleep(2000);

		
	}

	@When("^User clicks the Acknowledgment checkbox$")
	public void user_clicks_the_Acknowledgment_checkbox() throws Throwable
	{
		WebElement acknowledgeclick = driver.findElement(By.xpath("//input[@id='acknowledge_check']"));
		acknowledgeclick.click();
		
		  Thread.sleep(2000);

	}

	@Then("^User clicks the Register button$")
	public void user_clicks_the_Register_button() throws Throwable 
	{
		WebElement register = driver.findElement(By.xpath("//button[text()='Register']"));
		register.click();
		
		  Thread.sleep(2000);

		
	}
	
	

}
