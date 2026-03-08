# Demo Web Shop Automation

## Project Overview
This project demonstrates automated testing of the Demo Web Shop e-commerce application using Selenium WebDriver. The framework automates key user workflows such as login, product selection, and cart management.

The project follows the Page Object Model (POM) design pattern to improve code maintainability and reusability.

## Tools and Technologies
- Java
- Selenium WebDriver
- TestNG
- Page Object Model (POM)
- Maven

## Test Scenarios Automated
- User Login
- Product Search
- Add Product to Cart
- Remove Product from Cart
- Logout

## Framework Design
The framework is designed using the Page Object Model (POM) where:
- Each page has its own class
- Locators and actions are separated from test logic
- Test classes interact with page classes to execute test scenarios

## Synchronization
Explicit waits are used to handle synchronization issues and ensure elements are visible or clickable before performing actions.

## Project Structure
src
├── pages
├── tests
├── utilities


## How to Run the Tests
1. Clone the repository
2. Open the project in an IDE (Eclipse / IntelliJ)
3. Install dependencies using Maven
4. Run the TestNG test suite

## Author
Jorden
