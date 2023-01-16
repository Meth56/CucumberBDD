package code.pages;

import code.utils.BrowserUtils;
import code.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99Payment extends BrowserUtils {
    public guru99Payment(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='card_nmuber']")
    private WebElement cardNumber;
    @FindBy(xpath = "//select[@id='month']")
    private WebElement expMonth;
    @FindBy(xpath = "//select[@name='year']")
    private WebElement expYear;
    @FindBy(xpath = "//input[@id='cvv_code']")
    private WebElement cvvCode;
    @FindBy(xpath = "//input[@name='submit']")
    private WebElement payButton;

    public void setCardNumber(String cardnumber) {
        staticWait(1);
        cardNumber.sendKeys(cardnumber);
    }

    public void setExpMonth(String  Month) {
        staticWait(1);
        selectFromDropdown(expMonth,Month);
    }

    public void setExpYear(String Year) {
        staticWait(1);
        selectFromDropdown(expYear,Year);
    }

    public void setCvvCode(String cvv) {
        staticWait(1);
        cvvCode.sendKeys(cvv);
    }

    public void setPayButton() {
        payButton.click();
    }
}
