$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("visaConfirmationTest.feature");
formatter.feature({
  "line": 1,
  "name": "Visa Confirmation Test",
  "description": "User Should able to visit Government Home Office website",
  "id": "visa-confirmation-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24712779500,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User From Australia Comin To UK For Tourism",
  "description": "",
  "id": "visa-confirmation-test;user-from-australia-comin-to-uk-for-tourism",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on accept Cookies",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on Start Button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User Should select Nationality Australia",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click on Tourism",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User Should verify Text \"You will not need a visa to come to the UK\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsAustralia.user_on_HomePage()"
});
formatter.result({
  "duration": 1184722400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.userClickOnAcceptCookies()"
});
formatter.result({
  "duration": 359266200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Start_Button()"
});
formatter.result({
  "duration": 669360700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.userShouldSelectNationalityAustralia()"
});
formatter.result({
  "duration": 89321400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 655867400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Tourism()"
});
formatter.result({
  "duration": 130545500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 726315700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You will not need a visa to come to the UK",
      "offset": 25
    }
  ],
  "location": "MyStepsAustralia.userShouldVerifyText(String)"
});
formatter.result({
  "duration": 65261900,
  "status": "passed"
});
formatter.after({
  "duration": 214800,
  "status": "passed"
});
formatter.before({
  "duration": 8226919300,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User From Chilean Coming To The UK For Work And Plans On Staying",
  "description": "",
  "id": "visa-confirmation-test;user-from-chilean-coming-to-the-uk-for-work-and-plans-on-staying",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "User on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User click on accept Cookies",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User click on Start Button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Usr Should select Nationality Chile",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on Work academic visit or business",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click on longer than 6 months",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User click on Continue button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User click on Health and care professional",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Should verify Text \"You may need a visa Text\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepsChile.user_on_Home_Page()"
});
formatter.result({
  "duration": 63000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.userClickOnAcceptCookies()"
});
formatter.result({
  "duration": 200360900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Start_Button()"
});
formatter.result({
  "duration": 1329841600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsChile.usr_Should_select_Nationality_Chile()"
});
formatter.result({
  "duration": 90538200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 879455800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsChile.user_click_on_Work_academic_visit_or_business()"
});
formatter.result({
  "duration": 117657700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsChile.user_click_on_Continue_button()"
});
formatter.result({
  "duration": 24900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 26
    }
  ],
  "location": "MyStepsChile.user_click_on_longer_than_months(int)"
});
formatter.result({
  "duration": 101519200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsChile.user_click_on_Continue_button()"
});
formatter.result({
  "duration": 31100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsChile.user_click_on_Health_and_care_professional()"
});
formatter.result({
  "duration": 143335400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 1021008300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You may need a visa Text",
      "offset": 25
    }
  ],
  "location": "MyStepsAustralia.userShouldVerifyText(String)"
});
formatter.result({
  "duration": 62040200,
  "status": "passed"
});
formatter.after({
  "duration": 102400,
  "status": "passed"
});
formatter.before({
  "duration": 10877455100,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User From Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or20Card",
  "description": "",
  "id": "visa-confirmation-test;user-from-columbian-national-coming-to-the-uk-to-join-a-partner-for-a-long-stay-they-do-have-an-article-10or20card",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 26,
  "name": "User On Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "User click on Start Button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "User Should select Nationality Colombia",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User click on Join partner or family for a long stay",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User click on Continue Button",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User Should verify Text \"You may need a visa\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepColombia.user_On_Home_Page()"
});
formatter.result({
  "duration": 76900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Start_Button()"
});
formatter.result({
  "duration": 571705000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepColombia.user_Should_select_Nationality_Colombia()"
});
formatter.result({
  "duration": 91454500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 596737400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepColombia.user_click_on_Join_partner_or_family_for_a_long_stay()"
});
formatter.result({
  "duration": 132336100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepsAustralia.user_click_on_Continue_Button()"
});
formatter.result({
  "duration": 626445600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "You may need a visa",
      "offset": 25
    }
  ],
  "location": "MyStepsAustralia.userShouldVerifyText(String)"
});
formatter.result({
  "duration": 71455700,
  "status": "passed"
});
formatter.after({
  "duration": 30400,
  "status": "passed"
});
});