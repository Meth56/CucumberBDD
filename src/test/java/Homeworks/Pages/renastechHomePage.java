package Homeworks.Pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class renastechHomePage extends BrowserUtils {
    public renastechHomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//mat-card[@id='project-Insurance']")
    private WebElement insuranceButton;
    @FindBy(xpath = "//span[contains(text(),'Get a Quote')]")
    private WebElement quoteButton;
    @FindBy(xpath = "//h2[contains(text(),'Vehicle Details')]")
    private WebElement detailsHeader;
    @FindBy(xpath = "//h2[contains(text(),'Finance Details')]")
    private WebElement financeDetails;
    @FindBy(id = "mat-button-toggle-5-button")
    private WebElement leasedButton;

    @FindBy(css = "#mat-select-0")
    private WebElement vehicleYear;
    @FindBy(xpath = "//span[contains(text(),'2001')]")
    private WebElement vehicleYearOption;
    @FindBy(css = "#mat-select-2")
    private WebElement vehicleMake;
    @FindBy(xpath = "//span[contains(text(),'Cadillac')]")
    private WebElement vehicleMakeOption;
    @FindBy(css = "#mat-select-4")
    private WebElement vehicleModel;
    @FindBy(xpath = "//span[contains(text(),'Seville')]")
    private WebElement vehicleModelOption;
    @FindBy(xpath = "//button[@id='next-step']")
    private WebElement firstNext;
    @FindBy(xpath = "//button[@id='next-step2']")
    private WebElement secondNext;
    @FindBy(css = "input#mat-input-0")
    private WebElement drivingDistance;
    @FindBy(css = "span.mat-checkbox-inner-container")
    private WebElement selectDistance;
    @FindBy(xpath = "//button[@id='next-step3']")
    private WebElement thirdNext;
    @FindBy(css = "input#mat-input-1")
    private WebElement chooseDate;
    @FindBy(xpath = "//button[@id='next-step4']")
    private WebElement fourthNext;
    @FindBy(id = "mat-button-toggle-8-button")
    private WebElement tires;
    @FindBy(css = "button#mat-button-toggle-10-button")
    private WebElement savingProgram;
    @FindBy(xpath = "//button[@id='next-step5']")
    private WebElement fifthNext;
    @FindBy(css = "#mat-input-2")
    private WebElement driverLicense;
    @FindBy(xpath = "//button[@id='next-step6']")
    private WebElement sixthNext;
    @FindBy(css = "#mat-button-toggle-12-button")
    private WebElement driverSelect;
    @FindBy(xpath = "//button[@id='next-step7']")
    private WebElement submitButton;
    @FindBy(xpath = "//button[@id='let-us-call-you']")
    private WebElement letusCall;


    public void getInsuranceButton() {
        clickWithWait(insuranceButton);
    }

    public void getQuoteButton() {
        clickWithWait(quoteButton);
    }

    public void getDetailsHeader() {
        Assert.assertEquals(detailsHeader.getText(),"Vehicle Details");
    }

    public void getFinancedDetails() {
        clickWithWait(financeDetails);
    }

    public void getLeasedButton() {
        clickWithWait(leasedButton);
    }


    public void getVehicleYear() {
        vehicleYear.click();
        clickWithWait(vehicleYearOption);
    }
    public void getVehicleMake() {
        vehicleMake.click();
        clickWithWait(vehicleMakeOption);
    }
    public void getVehicleModel() {
        vehicleModel.click();
        clickWithWait(vehicleModelOption);
    }

    public void getFirstNext() {
        clickWithWait(firstNext);
    }

    public void getSecondNext() {
        clickWithWait(secondNext);
    }

    public void getDrivingDistance(String param1) {
        clickWithWait(drivingDistance);
        drivingDistance.sendKeys(param1);
    }

    public void getSelectDistance() {
        clickWithWait(selectDistance);
    }

    public void getThirdNext() {
        thirdNext.click();
    }

    public void getChooseDate(String param1) {
        clickWithWait(chooseDate);
        chooseDate.sendKeys(param1);
    }

    public void getFourthNext() {
        fourthNext.click();
    }
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),10);

    public void getTires() {
        wait.until(ExpectedConditions.visibilityOf(tires)).click();
    }

    public void getSavingProgram() {
        clickWithWait(savingProgram);
    }

    public void getFifthNext() {
        clickWithWait(fifthNext);
    }

    public void getDriverLicense(String param1) {
        clickWithWait(driverLicense);
        driverLicense.sendKeys(param1);
    }

    public void getSixthNext() {
        sixthNext.click();
    }

    public void getDriverSelect() {
        wait.until(ExpectedConditions.visibilityOf(driverSelect)).click();
    }

    public void getSubmitButton() {
        clickWithWait(submitButton);
    }

    public void getLetusCall(String param1) {
        Assert.assertEquals(param1,"Let us call you");
    }
}
