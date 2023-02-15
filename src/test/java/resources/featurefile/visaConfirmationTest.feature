Feature:Visa Confirmation Test
  User Should able to visit Government Home Office website
  Scenario:User From Australia Comin To UK For Tourism
    Given User on HomePage
    When User click on accept Cookies
    And User click on Start Button
    And User Should select Nationality Australia
    And User click on Continue Button
    And User click on Tourism
    And User click on Continue Button
    Then User Should verify Text "You will not need a visa to come to the UK"
  Scenario: User From Chilean Coming To The UK For Work And Plans On Staying
    Given User on Home Page
    When User click on accept Cookies
    And User click on Start Button
    And Usr Should select Nationality Chile
    And User click on Continue Button
    And User click on Work academic visit or business
    And User click on Continue button
    And User click on longer than 6 months
    And User click on Continue button
    And User click on Health and care professional
    And User click on Continue Button
    Then User Should verify Text "You may need a visa Text"
  Scenario: User From Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article 10Or20Card
    Given User On Home Page
    And User click on Start Button
    And User Should select Nationality Colombia
    And User click on Continue Button
    And User click on Join partner or family for a long stay
    And User click on Continue Button
    Then User Should verify Text "You may need a visa"