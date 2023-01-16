package Homeworks.Steps;

import Homeworks.Pages.renastechHomePage;
import code.utils.BrowserUtils;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class renastechSteps extends BrowserUtils {
        renastechHomePage renastechHomePage=new renastechHomePage();

    @Given("The user wants to go to Renastech Practice Website")
    public void the_user_wants_to_go_to_renastech_practice_website() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("renastechPractice"));
    }
    @When("The user wants to click Insurance Button")
    public void the_user_wants_to_click_insurance_button() {
        renastechHomePage.getInsuranceButton();
    }
    @When("The user wants to click Get a Quote Button")
    public void the_user_wants_to_click_button() {
        renastechHomePage.getQuoteButton();
    }
    @Then("The user wants to be make sure Navigated")
    public void the_user_wants_to_be_make_sure_navigated() {
        renastechHomePage.getDetailsHeader();
    }

    @When("The user wants to click Finance Details")
    public void the_user_wants_to_click_finance_details() {
        renastechHomePage.getFinancedDetails();
    }
    @Then("The user wants to select only one option")
    public void the_user_wants_to_select_only_one_option() {
        renastechHomePage.getLeasedButton();
    }

    @When("The user wants to select vehicle year,make and model")
    public void the_user_wants_to_select_vehicle_year_make_and_model() {
        renastechHomePage.getVehicleYear();
        renastechHomePage.getVehicleMake();
        renastechHomePage.getVehicleModel();
        renastechHomePage.getFirstNext();
    }
    @Then("The user wants to enter {string}")
    public void the_user_wants_to_enter(String string) {
        renastechHomePage.getSecondNext();
        renastechHomePage.getDrivingDistance(string);
    }
    @Then("The user wants to click annual distance")
    public void the_user_wants_to_click_annual_distance() {
        renastechHomePage.getSelectDistance();
        renastechHomePage.getThirdNext();
    }
    @Then("The user wants to choose a {string}")
    public void the_user_wants_to_choose_a(String string) {
        renastechHomePage.getChooseDate(string);
        renastechHomePage.getFourthNext();

    }
    @Then("The user wants to decide for winter tires")
    public void the_user_wants_to_decide_for_winter_tires() {
        renastechHomePage.getTires();
    }
    @Then("The user wants to decide for saving program")
    public void the_user_wants_to_decide_for_saving_program() {
        renastechHomePage.getSavingProgram();
        renastechHomePage.getFifthNext();
    }
    @Then("The user wants to enter driver license number")
    public void the_user_wants_to_enter_driver_license_number() {
        renastechHomePage.getDriverLicense("A3546841651");
        renastechHomePage.getSixthNext();
    }
    @Then("The user wants to select does he have a another driver license")
    public void the_user_wants_to_select_does_he_have_a_another_driver_license() {
        renastechHomePage.getDriverSelect();
    }
    @Then("The user wants to click Submit button")
    public void the_user_wants_to_click_submit_button() {
        renastechHomePage.getSubmitButton();
    }
    @Then("The user wants to verify that {string} button is displayed")
    public void the_user_wants_to_verify_that_button_is_displayed(String string) {
        renastechHomePage.getLetusCall(string);
    }


}
