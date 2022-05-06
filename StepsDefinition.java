package prog;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition {
	WebDriver driver=null;
	
	@Given("user is on form filling page")
	public void user_is_on_form_filling_page() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		 driver.get("http://assignmentbucket123.s3-website.us-east-2.amazonaws.com/");
	    
	}

	@And("fill the form with below user details")
	public void fill_the_form_with_below_user_details(DataTable dataTable) {
		 List<List<String>> rows = dataTable.asLists(String.class);
		   int i=0;
		    	WebElement FirstName=driver.findElement(By.xpath("//input[@name='firstname']"));
				FirstName.sendKeys(rows.get(i).get(1));
				i++;
				WebElement MiddleName=driver.findElement(By.xpath("//input[@name='middlename']"));
				MiddleName.sendKeys(rows.get(i).get(1));
				i++;
				WebElement LastName=driver.findElement(By.xpath("//input[@name='lastname']"));
				LastName.sendKeys(rows.get(i).get(1));
				i++;
				Select Course=new Select(driver.findElement(By.xpath("/html/body/form/select")));
			    Course.selectByVisibleText(rows.get(i).get(1));
				i++;
			    WebElement Gender1=driver.findElement(By.xpath("//input[@name='"+rows.get(i).get(1)+"']"));
			    Gender1.click();
				i++;
			    
			    WebElement Phone=driver.findElement(By.xpath("//input[@name='phone']"));
			    Phone.sendKeys(rows.get(i).get(1));
				i++;
			    
			    WebElement Address=driver.findElement(By.xpath("/html/body/form/textarea"));
			    Address.sendKeys(rows.get(i).get(1));
				i++;
			    
			    WebElement Email =driver.findElement(By.xpath("//input[@name='email']"));
			    Email.sendKeys(rows.get(i).get(1));
				i++;
			    WebElement Password=driver.findElement(By.xpath("//input[@name='pass']"));
			    Password.sendKeys(rows.get(i).get(1));
				i++;
			    
			    WebElement Repass=driver.findElement(By.xpath("//input[@name='repass']"));
			    Repass.sendKeys(rows.get(i).get(1));
				i++;
		    }
	

	@When("I click on submit")
	public void i_click_on_submit() throws Throwable {
		 WebElement submit=driver.findElement(By.xpath("/html/body/form/a/input"));
		    submit.click();
	}

	@Then("it return to thank you page")
	public void it_return_to_thank_you_page() {
		Assert.assertEquals(driver.getTitle(),"Title");
	}

	
}
