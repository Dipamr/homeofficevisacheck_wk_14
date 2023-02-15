package gov.uk.check.visa.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import gov.uk.check.visa.pages.SecondPage;

public class MyStepColombia {
    @Given("^User On Home Page$")
    public void user_On_Home_Page()  {

    }

    @And("^User Should select Nationality Colombia$")
    public void user_Should_select_Nationality_Colombia()  {
        new SecondPage().clickOnNationality();
    }

    @And("^User click on Join partner or family for a long stay$")
    public void user_click_on_Join_partner_or_family_for_a_long_stay()  {
        new SecondPage().Joinpartnerorfamilyforalongstay();
    }
}
