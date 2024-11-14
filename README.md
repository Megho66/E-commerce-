E-commerce Checkout Automation Testing
This project automates the testing of the checkout process for an e-commerce platform to ensure that it is functioning as expected. Using Selenium WebDriver and TestNG,
this suite covers multiple steps in the checkout flow, including adding items to the cart, verifying cart details,
entering customer information, selecting payment methods, and confirming the order.

Project Structure
src/test/java: Contains all test classes and the Page Object Model (POM) classes for different pages.
src/main/resources: Contains configurations (e.g., test data files) for the test suite.
testng.xml: TestNG configuration file to specify which tests to run and configure parallel execution if needed.
pom.xml: Maven configuration file to manage dependencies like Selenium, TestNG, and reporting tools (Extent Reports/Allure).
Tools and Frameworks Used
Selenium WebDriver: Automates browser interactions for simulating user actions in the checkout process.
TestNG: Manages and executes test cases, including parallel testing, setup/teardown, and assertions.
Maven: Handles dependencies and builds the project.
