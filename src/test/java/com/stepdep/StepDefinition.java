package com.stepdep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	public static WebDriver driver;
	@Given("user launch Facebook Web Application")
	public void user_launch_Facebook_Web_Application() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	}
	@When("user enter invalid username and invalid password")
	public void user_enter_invalid_username_and_invalid_password() {
	   driver.findElement(By.id("email")).sendKeys("Kumar96");
	   driver.findElement(By.name("pass")).sendKeys("Arun@12345");
	   
	}
	@When("clicks login button")
	public void clicks_login_button() {
	    driver.findElement(By.name("login")).click();
	}
	@Then("user verify error message is displayed or not")
	public void user_verify_error_message_is_displayed_or_not() {
	    
	}
	@When("user clicks create new account button")
	public void user_clicks_create_new_account_button() {
	   driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	}
	@Then("user verify sign up text is displayed")
	public void user_verify_sign_up_text_is_displayed() {
	    WebElement text = driver.findElement(By.xpath("//div[text()='Sign Up']"));
	    String signup = text.getText();
	    System.out.println(signup);
	    boolean signdisplay = signup.contains("Sign");
	    System.out.println(signdisplay);
	    
	}
}
