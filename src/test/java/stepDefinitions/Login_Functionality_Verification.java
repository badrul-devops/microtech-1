package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Functionality_Verification extends Base{
	
	@Given("I am in Landing Home Page")
	public void i_am_in_Landing_Page() {
		navigateURL("https://it.microtechlimited.com/");
		String s = getText(By.xpath("//div//h1['Welcome to MicroTech NA.']"));
		assertEquals("Welcome to MicroTech NA.", s);
	}

	@When("I Click on Login")
	public void i_Click_on_Login() {
		click(By.xpath("//a[@href=\"elogin.php\"]"));
	}

	@Then("I will be in Login Page")
	public void i_will_be_in_Login_Page() {
		String s = getText(By.xpath("//div//h1"));
		assertEquals("Employee Login", s);
	}
	
	@Then("Click Customer Login")
	public void click_Customer_Login() {
		click(By.xpath("//a[@href=\"clogin.php\"]"));
		String customerLogin= getText(By.xpath("//div/h1"));
		assertEquals("Customer Login", customerLogin);		
	}

	@Then("I enter User Id {string}")
	public void i_enter_User_Id(String string) {
		sendKeys(By.name("mailuid"),string);
	}

	@Then("I enter Password {string}")
	public void i_enter_Password(String string) {
		sendKeys(By.name("pwd"),string);
	}
	
	@When("I click Login Button")
	public void i_click_Login_Button() {
	    click(By.xpath("//input[@name=\"login-submit\"]"));
	}
	
	@Then("I will see Customer Home Page")
	public void i_will_see_Customer_Home_Page() {
	    String s= getText(By.xpath("//h2[text()='Welcome David']"));
	    assertEquals("Welcome David",s);
	    System.out.println(s);
	}

}
