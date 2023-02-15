package gov.uk.check.visa.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.StartPage;

public class MyStepsAustralia {
    @Given("^User on HomePage$")
    public void user_on_HomePage()  {
    }

    @And("^User click on Start Button$")
    public void user_click_on_Start_Button()  {
        new StartPage().clickOnstartNowButton();
    }

    @And("^User click on Continue Button$")
    public void user_click_on_Continue_Button()  {
        new StartPage().clickOnContinueButton();
    }

    @And("^User click on Tourism$")
    public void user_click_on_Tourism()  {
        new StartPage().clickOnTourism();
    }

//    @Then("^User Should get Text$")
//    public void user_Should_get_Text() {
//        new StartPage().getYouwillnotneedavisatocometotheUKText();
//
//    }

    @When("^User click on accept Cookies$")
    public void userClickOnAcceptCookies() {
        new StartPage().clickOnacceptAdditionalCookies();
    }

    @And("^User Should select Nationality Australia$")
    public void userShouldSelectNationalityAustralia() {
        new StartPage().clickOnNationality();
    }

    @Then("^User Should verify Text \"([^\"]*)\"$")
    public void userShouldVerifyText(String vis)  {
        new StartPage().getYouwillnotneedavisatocometotheUKText();

    }
}
