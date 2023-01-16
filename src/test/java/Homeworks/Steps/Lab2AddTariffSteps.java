package Homeworks.Steps;

import Homeworks.Pages.Lab2AddTariffPage;
import code.utils.ConfigurationsReader;
import code.utils.Driver;
import io.cucumber.java.en.*;

import java.util.Map;

public class Lab2AddTariffSteps {
    Lab2AddTariffPage lab2AddTariffPage=new Lab2AddTariffPage();
    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {
        Driver.getDriver().get(ConfigurationsReader.getProperties("guru99DemoSite"));
    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {
        lab2AddTariffPage.setAddTariffButton();
    }
    @Then("The user wants to verify {string} headerr")
    public void the_user_wants_to_verify_headerr(String string) {
        lab2AddTariffPage.setAddTariffHeader(string);
    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String > dataTable) {
        lab2AddTariffPage.setMonthlyRental(dataTable.get("MonthlyRental"));
        lab2AddTariffPage.setLocalMinutes(dataTable.get("FreeLocalMinutes"));
        lab2AddTariffPage.setInternationalMinutes(dataTable.get("FreeInternationalMinutes"));
        lab2AddTariffPage.setSmsPack(dataTable.get("FreeSMSPack"));
        lab2AddTariffPage.setLocalMinutesCharges(dataTable.get("LocalPerMinutesCharges"));
        lab2AddTariffPage.setInternationalMinutesCharges(dataTable.get("InternationalPerMinutesCharges"));
        lab2AddTariffPage.setSmsCharges(dataTable.get("SMSPerCharges"));
    }
    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        lab2AddTariffPage.setSubmitButton();
    }
    @Then("The user wants to verify message as a {string}")
    public void the_user_wants_to_verify_message_as_a(String string) {
        lab2AddTariffPage.setVerifyMessage(string);
    }

}
