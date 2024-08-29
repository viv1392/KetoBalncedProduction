

Feature: UserRegistration
   Background: 
    Given User goes to Landing page
    
  @MenNon-Veg
  Scenario: User regestration for ketobalanced 
    Then User navigated to gender page and select men
    Then User choose current body type
    Then User choose body type he want
    Then User want to achieve
    Then User choose target zone
    Then User choose when he was last happy with his weight
    Then User choose how much he has time for meal prepartaion
    Then User navigated to meal preferences and choose meat
    And User also chooses some veggies
    And User also prefers some other food items as non veg
    Then User select how active he is as no physical activity
    And User select his day at workplace
    Then User select multiple answer
    And User  select  Just Want to See how Keto Diet helps in weight loss.
    Then User enters the height in feet and inch without faker
    And User enters the weight in kg <currentWeight>
    Then User enters perfect weight in kg <targetWeight>
    And User enters his age <age>
    Then User sees his overall wellness 
    And User choose no event
    Then User goes one and only plan
    And User goes four week dieting chart
    Then User entrs mail<mail>
    And User goes on diet plan page
    Then User goes back to plan
    And User click on got it
    Then User click on Choose Plan button
    
     Examples:
    |height  |currentWeight |targetWeight|age|mail               |
    |175     |098           |085         |32 |delhi01@yopmail.com|
    |195     |100           |075         |46 |delhi02@yopmail.com|
    |130     |89            |75          |25 |delhi03@yopmail.com|
    |184     |42            |75          |40 |delhi04@yopmail.com|
    |189     |86            |80          |25 |noida01@yopmail.com|
    |166     |75            |66          |17 |noida02@yopmail.com|
    |156     |80            |56          |18 |noida03@yopmail.com|
    |195     |120           |90          |60 |nit02@yopmail.com  |
    |160     |86            |76          |61 |nit03@yopmail.com  |
    |188     |110           |95          |68 |viv01@yopmail.com  |
    |190     |101           |90          |74 |viv02@yopmail.com  |
    |165     |96            |86          |75 |viv04@yopmail.com  |
    |179     |99            |83          |76 |viv06@yopmail.com  |
    
     @WomenVeg
  Scenario: User regestration for ketobalanced 
    Then User navigated to gender page and select women
    Then User choose current body type as extra
    Then User choose body type he want
    Then User want to achieve
    Then User choose target zone
    Then User choose when he was last happy with his weight
    Then User choose how much he has time for meal prepartaion
    Then User navigated to meal preferences and choose vegetarian
    And User also chooses some veggies
    And User also prefers some other food items as vegetarian
    Then User select how active he is as no physical activity
    And User select his day at workplace
    Then User select multiple answer
    And User  select  Just Want to See how Keto Diet helps in weight loss.
    Then User enters the height in cm witoutfaker
    And User enters the weight in kg without faker
    Then User enters perfect weight he wants in kg without faker
    And User enters his age without faker
    Then User sees his overall wellness 
    And User choose no event
    Then User goes one and only plan
    And User goes four week dieting chart
    Then User entrs mail
    And User goes on diet plan page
    Then User goes back to plan
    And User click on got it
    Then User click on Choose Plan button
    
      Examples:
    | Ft |In    | CurrLbs      |TarLbs      |age|
    |2   |09    |120           |110         |32 |
    |03  |05    |190           |170         |46 |
    |4   |10    |198           |168         |25 |
    |05  |05    |220           |180         |40 |
    |5   |12    |240           |190         |25 |
    |6   |04    |260           |196         |36 |
    |7   |10    |180           |156         |18 |
    |5   |11    |250           |210         |68 |
    |6   |3     |260           |200         |76 |
    

