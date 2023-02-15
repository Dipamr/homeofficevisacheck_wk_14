package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptAdditionalCookies;
    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNowButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='response']/option[11]")
    WebElement clickOnNationality;
    @CacheLookup
    @FindBy(xpath = "//button[@class='gem-c-button govuk-button gem-c-button--bottom-margin']")
    WebElement ContinueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement Tourism;

    @CacheLookup
    
    @FindBy(xpath = "//h2[@class='gem-c-heading gem-c-heading--font-size-27 govuk-!-margin-bottom-6']")
    WebElement YouwillnotneedavisatocometotheUKText;


    public void clickOnacceptAdditionalCookies() {
        clickOnElement(acceptAdditionalCookies);
        log.info("clicking on Accept Additional Cookies:" + acceptAdditionalCookies.toString());
    }

    public void clickOnstartNowButton() {
        clickOnElement(startNowButton);
        log.info("clickin on Start Now Button:" + startNowButton.toString());

    }

//    public void SelectNationalityDropDown(String nationality) {
//        selectByValueFromDropDown(selectNationalityDropDown, nationality);
//
//    }

    public void clickOnNationality() {
        clickOnElement(clickOnNationality);
    }

    public void clickOnContinueButton() {
        clickOnElement(ContinueButton);
    }

    public void clickOnTourism() {
        clickOnElement(Tourism);
    }

public String getYouwillnotneedavisatocometotheUKText(){
        return getTextFromElement(YouwillnotneedavisatocometotheUKText);

}
}

