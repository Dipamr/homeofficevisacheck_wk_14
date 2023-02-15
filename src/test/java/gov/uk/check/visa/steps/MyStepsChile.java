package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import gov.uk.check.visa.pages.FirstPage;
import gov.uk.check.visa.pages.StartPage;

public class MyStepsChile {
    @Given("^User on Home Page$")
    public void user_on_Home_Page() {

    }

//    @When("^User click on accept Cookies$")
//    public void userClickOnAcceptCookies() {
//        new StartPage().clickOnacceptAdditionalCookies();
//    }
        @And("^Usr Should select Nationality Chile$")
        public void usr_Should_select_Nationality_Chile () {
            new FirstPage().clickOnNationality();
        }

        @And("^User click on Work academic visit or business$")
        public void user_click_on_Work_academic_visit_or_business () {
            new FirstPage().clickOnWorkacademicvisitorbusiness();
        }

        @And("^User click on Continue button$")
        public void user_click_on_Continue_button () {


        }

        @And("^User click on longer than (\\d+) months$")
        public void user_click_on_longer_than_months ( int mon){
            new FirstPage().clickOnlongerthan6months();
        }

        @And("^User click on Health and care professional$")
        public void user_click_on_Health_and_care_professional () {
            new FirstPage().clickOnHealthandcareprofessional();
        }
//    @And("^User click on Start Button$")
//    public void user_click_on_Start_Button()  {
//        new StartPage().clickOnstartNowButton();
//    }
    }

