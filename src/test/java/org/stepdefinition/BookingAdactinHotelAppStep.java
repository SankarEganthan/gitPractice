package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookingAdactinHotelAppStep extends BaseClass {
	@Given("User is on the Adactin Hotel App")
	public void user_is_on_the_adactin_hotel_app() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/index.php");
		maximizeWindow();

	}

	@When("User should enter {string} and {string}")
	public void user_should_enter_and(String userName, String password) {
		WebElement element = elementFindById("username");
		element.sendKeys(userName);
		WebElement element2 = elementFindById("password");
		element2.sendKeys(password);
		WebElement element3 = elementFindById("login");
		element3.click();

	}

	@And("User should enter {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_enter_and(String location, String hotels, String roomType, String noOfRooms,
			String checkInDate, String checkOutDate, String adults, String children) {
		WebElement element = elementFindById("location");
		selectByVisibleText(element, location);
		WebElement element2 = elementFindById("hotels");
		selectByVisibleText(element2, hotels);
		WebElement element3 = elementFindById("room_type");
		selectByVisibleText(element3, roomType);
		WebElement element4 = elementFindById("room_nos");
		selectByVisibleText(element4, noOfRooms);
		WebElement element5 = elementFindById("datepick_in");
		element5.sendKeys(checkInDate);
		WebElement element6 = elementFindById("datepick_out");
		element6.sendKeys(checkOutDate);
		WebElement element7 = elementFindById("adult_room");
		selectByVisibleText(element7, adults);
		WebElement element8 = elementFindById("child_room");
		selectByVisibleText(element8, children);
		WebElement element9 = elementFindById("Submit");
		element9.click();
	}

	@And("User should select Hotel")
	public void user_should_select_hotel() {
		WebElement element = elementFindById("radiobutton_0");
		element.click();
		WebElement element2 = elementFindById("continue");
		element2.click();
	}

	@And("User should enter details {string}, {string}, {string}, {string}, {string}, {string}, {string} and {string}")
	public void user_should_enter_details_and(String firstName, String lastName, String billingAddress, String creditCardNo,
			String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) throws InterruptedException {
		WebElement element = elementFindById("first_name");
		element.sendKeys(firstName);
		WebElement element1 = elementFindById("last_name");
		element1.sendKeys(lastName);
		WebElement element2 = elementFindById("address");
		element2.sendKeys(billingAddress);
		WebElement element3 = elementFindById("cc_num");
		element3.sendKeys(creditCardNo);
		WebElement element4 = elementFindById("cc_type");
		selectByVisibleText(element4, creditCardType);
		WebElement element5 = elementFindById("cc_exp_month");
		selectByVisibleText(element5, expiryMonth);
		WebElement element6 = elementFindById("cc_exp_year");
		selectByVisibleText(element6, expiryYear);
		WebElement element7 = elementFindById("cc_cvv");
		element7.sendKeys(cvvNumber);
		WebElement element8 = elementFindById("book_now");
		element8.click();
		Thread.sleep(5000);

	}

	@Then("User should verify booking successful")
	public void user_should_verify_booking_successful() {WebElement element = elementFindById("order_no");
	String orderId = elementGetAttribute(element);
	System.out.println(orderId);
	WebElement element2 = elementFindById("logout");
	element2.click();
	quit();
	}

}
