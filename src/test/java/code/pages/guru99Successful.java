package code.pages;

import code.utils.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class guru99Successful {
    public guru99Successful(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//h2[contains(text(),'Payment successfull!')]")
    private WebElement verificationText;


        public void setVerificationText(String expectedMessage){
            Assert.assertEquals(verificationText.getText(),expectedMessage);
        }

}
