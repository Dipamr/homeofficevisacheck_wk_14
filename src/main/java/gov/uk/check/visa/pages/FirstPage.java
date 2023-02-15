package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage extends Utility {
    private static final Logger log = LogManager.getLogger(FirstPage.class.getName());

    public FirstPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    //    @CacheLookup
//    @FindBy(xpath = "//select[@id='response']")
//    WebElement selectNationalityDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='response']/option[45]")
    WebElement clickOnNationality;
    //    @CacheLookup
//    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
//    WebElement ContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement Workacademicvisitorbusiness;
    //    @CacheLookup
//    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
//    WebElement Continuebutton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement longerthan6months;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement Healthandcareprofessional;
    @CacheLookup
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement YouneedavisatocometotheUKText;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptAdditionalCookies;

    public void clickOnstartNowButton() {
        clickOnElement(startNowButton);
        log.info("clickin on Start Now Button:" + startNowButton.toString());


    }

//    public void SelectNationalityDropDown(String nationality) {
//        selectByValueFromDropDown(selectNationalityDropDown, nationality);
//    }

    public void clickOnNationality() {
        clickOnElement(clickOnNationality);
    }

//    public void clickOnContinueButton() {
//        clickOnElement(ContinueButton);
//    }

    public void clickOnWorkacademicvisitorbusiness() {
        clickOnElement(Workacademicvisitorbusiness);
    }

//    public void clickOnContinuebutton() {
//        clickOnElement(Continuebutton);
//    }

    public void clickOnlongerthan6months() {
        clickOnElement(longerthan6months);
    }

    public void clickOnHealthandcareprofessional() {
        clickOnElement(Healthandcareprofessional);
    }

    public String getYouneedavisatocometotheUKText() {
        return getTextFromElement(YouneedavisatocometotheUKText);
    }

    public void clickOnacceptAdditionalCookies() {
        clickOnElement(acceptAdditionalCookies);
        log.info("clicking on Accept Additional Cookies:" + acceptAdditionalCookies.toString());
    }
}
