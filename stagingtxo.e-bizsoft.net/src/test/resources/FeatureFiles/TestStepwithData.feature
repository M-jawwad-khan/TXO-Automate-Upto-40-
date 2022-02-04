
Feature: Test All Feature of TXO Application

    Scenario: Test Login Funcionalty then Goto userManagment,Workflow,Subscription,CompanySetting,Create REQ
    Given open browser
    Then Enter Wrong UserName and Password and WrongMsg
    |Jawwad@gmail.com|Khan1234|Please enter a valid user ID and password.|
    When User is Login Goto the UserManagement
    Then Add User FirstName - LastName - Email - Dept - Admin - Inactive
    |Test|Suite1|testsuite1@gmail.com|Purchasing|Yes|No
    |Test|Suite2|testsuite2@gmail.com|Purchasing|No|No
    |Test|Suite3|testsuite3@gmail.com|Purchasing|No|No
    |Test|Suite4|testsuite4@gmail.com|Purchasing|No|No
    |Test|Suite5|testsuite5@gmail.com|Purchasing|No|Yes
    |Test|Suite6|testsuite6@gmail.com|Purchasing|No|No
    |Test|Suite7|testsuite7@gmail.com|Purchasing|No|No
    |Test|Suite8|testsuite8@gmail.com|Purchasing|No|No
    |Test|Suite9|testsuite9@gmail.com|Purchasing|No|No
    |Test|Suite10|testsuite10@gmail.com|Purchasing|Yes|No
    And All User Successfully Add then Goto the Subsciption page
    When user is on Subscription page then Enter Value and Enter the User
    |1|11|
    Then Enter the Value of Active and INActive User
    |10|1|
    Then 
     
     
   
    
    