package code.stepsDefinitions;

import code.pages.guru99Home;
import code.pages.guru99Payment;
import code.pages.guru99Successful;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class guru99Steps extends BrowserUtils {
    guru99Home guru99Home=new guru99Home();
    guru99Payment guru99Payment=new guru99Payment();
    guru99Successful guru99Successful=new guru99Successful();


    @Given("User wants to go to Payment Gateway Website")
    public void user_wants_to_go_to_payment_gateway_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("guru99Demo"));
        setWaitTime();
    }
    @When("The user wants to buy an elephant toy")
    public void the_user_wants_to_buy_an_elephant_toy() {
        guru99Home.getQuantityDropdown("5");
        guru99Home.getBuyNowButton();
    }
    @Then("The user wants to provide requested payment information")
    public void the_user_wants_to_provide_requested_payment_information() {
        guru99Payment.setCardNumber("5465463546541654");
        guru99Payment.setExpMonth("05");
        guru99Payment.setExpYear("2026");
        guru99Payment.setCvvCode("215");
    }
    @Then("The user wants to click on pay now button")
    public void the_user_wants_to_click_on_pay_now_button() {
        guru99Payment.setPayButton();
    }
    @Then("The user wants to verify order is successful")
    public void the_user_wants_to_verify_order_is_successful() {
        guru99Successful.setVerificationText("Payment successfull!");
    }




    @When("The user wants to buy elephant toy as {string}")
    public void the_user_wants_to_buy_elephant_toy_as(String string) {
        guru99Home.getQuantityDropdown(string);
        guru99Home.getBuyNowButton();
    }
    @Then("The user wants to enter Credit Card Number as {string}")
    public void the_user_wants_to_enter_credit_card_number_as(String string) {
        guru99Payment.setCardNumber(string);
    }
    @Then("The user wants to enter Expiration Month as {string}")
    public void the_user_wants_to_enter_expiration_month_as(String string) {
        guru99Payment.setExpMonth(string);
    }
    @Then("The user wants to enter Expiration Year as {string}")
    public void the_user_wants_to_enter_expiration_year_as(String string) {
        guru99Payment.setExpYear(string);
    }
    @Then("The user wants to enter CVV Code as {string}")
    public void the_user_wants_to_enter_cvv_code_as(String string) {
        guru99Payment.setCvvCode(string);
    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String string) {
        guru99Successful.setVerificationText(string);
    }

    @When("The user wants to buy elephant toy as")
    public void the_user_wants_to_buy_elephant_toy_as(Map<String,String>  dataTable) {
        guru99Home.getQuantityDropdown(dataTable.get("Quantity"));
        guru99Home.getBuyNowButton();
    }
    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        guru99Payment.setCardNumber(dataTable.get("CreditCard"));
        guru99Payment.setExpMonth(dataTable.get("ExpirationMonth"));
        guru99Payment.setExpYear(dataTable.get("ExpirationYear"));
        guru99Payment.setCvvCode(dataTable.get("CvvCode"));
    }



}
