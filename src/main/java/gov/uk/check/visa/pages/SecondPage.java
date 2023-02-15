package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage extends Utility {
    private static final Logger log = LogManager.getLogger(SecondPage.class.getName());

    public SecondPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;


    @CacheLookup
    @FindBy(xpath = "//select[@id='response']/option[47]")
    WebElement clickOnNationality;

    @CacheLookup
    @FindBy(xpath = "//input[@id='response-4']")
    WebElement Joinpartnerorfamilyforalongstay;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement YoumayneedavisaText;


    public void clickOnstartNowButton() {
        clickOnElement(startNowButton);
        log.info("clickin on Start Now Button:" + startNowButton.toString());
    }


    public void clickOnNationality() {
        clickOnElement(clickOnNationality);
    }


    public void Joinpartnerorfamilyforalongstay() {
        clickOnElement(Joinpartnerorfamilyforalongstay);
    }

    public String getYoumayneedavisaTextText() {
        return getTextFromElement(YoumayneedavisaText);
    }

}











