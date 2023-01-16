package Homeworks.Pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Lab2AddTariffPage extends BrowserUtils{
    public Lab2AddTariffPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@href='addtariffplans.php']")
    private WebElement addTariffButton;
    @FindBy(xpath = "//h1[contains(text(),'Add Tariff Plans')]")
    private WebElement addTariffHeader;
    @FindBy(xpath = "//input[@id='rental1']")
    private WebElement monthlyRental;
    @FindBy(xpath = "//input[@id='local_minutes']")
    private WebElement localMinutes;
    @FindBy(xpath = "//input[@id='inter_minutes']")
    private WebElement internationalMinutes;
    @FindBy(xpath = "//input[@id='sms_pack']")
    private WebElement smsPack;
    @FindBy(xpath = "//input[@id='minutes_charges']")
    private WebElement localMinutesCharges;
    @FindBy(xpath = "//input[@id='inter_charges']")
    private WebElement internationalMinutesCharges;
    @FindBy(xpath = "//input[@id='sms_charges']")
    private WebElement smsCharges;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//h2[contains(text(),'Congratulation you add Tariff Plan')]")
    private WebElement verifyMessage;

    public void setAddTariffButton() {
        clickWithWait(addTariffButton);
    }

    public void setAddTariffHeader(String param1) {
        Assert.assertEquals(param1,addTariffHeader.getText());
    }

    public void setMonthlyRental(String param1) {
        monthlyRental.sendKeys(param1);
    }

    public void setLocalMinutes(String param1) {
        localMinutes.sendKeys(param1);
    }

    public void setInternationalMinutes(String param1) {
        internationalMinutes.sendKeys(param1);
    }

    public void setSmsPack(String param1) {
        smsPack.sendKeys(param1);
    }

    public void setLocalMinutesCharges(String param1) {
        localMinutesCharges.sendKeys(param1);
    }

    public void setInternationalMinutesCharges(String param1) {
        internationalMinutesCharges.sendKeys(param1);
    }

    public void setSmsCharges(String param1) {
        smsCharges.sendKeys(param1);
    }

    public void setSubmitButton() {
        clickWithWait(submitButton);
    }

    public void setVerifyMessage(String param1) {
        Assert.assertEquals(param1,verifyMessage.getText());
    }
}
