# Selenium Test Automation Project for SauceDemo

This project demonstrates a comprehensive suite of automated tests for the SauceDemo website using **Selenium WebDriver**. The framework is built with **Java**, **TestNG**, and **Maven** to ensure efficient test execution and management.

## Project Overview

The automated testing solution covers multiple functionalities on the SauceDemo site, ensuring robust system testing and user workflow validation.

### Key Features

- **Page Object Model (POM)**: Structuring of pages for maintainable code, improving test readability and reusability.
- **PageFactory**: Used for initializing web elements, enhancing readability, and maintaining separation of concerns between tests and page elements.
- **WebDriverManager**: Manages browser drivers automatically, simplifying setup and teardown of the tests.
- **Assertions with AssertJ**: Simplifies and enhances verification steps for better test result validation.
- **Java Faker**: Generates dynamic test data for checkout processes to simulate real-world use cases.
- **Common Test Base Class**: Manages common setup and teardown processes, ensuring consistency across all tests.
- **ReportNG**: Provides a detailed HTML report of test results, making it easier to analyze test execution results.
- **Cross-Browser Testing**: Supports testing across multiple browsers to ensure compatibility (Chrome, Microsoft Edge, etc.).
- **POJO Classes**: Utilizes Plain Old Java Objects (POJOs) to encapsulate product data for easier management and manipulation within tests.
- **Screenshot Functionality**: Incorporates functionality to take screenshots during test execution, especially useful for debugging and test reporting.

## Test Cases

The test cases cover multiple functionalities of the SauceDemo site, including but not limited to:

- **Login**: Validates user login functionality with valid and invalid credentials.
- **Add to Cart**: Tests the ability to add products to the shopping cart.
- **Checkout Process**: Verifies the checkout process using dynamically generated test data.
- **Cross-Browser Compatibility**: Ensures the site works correctly on different browsers (Chrome, Microsoft Edge, etc.).

Each test case is designed to validate a specific aspect of the user workflow and ensure that the application is functioning as expected.

## Prerequisites

To run the project locally, ensure the following are installed:

- **Java Development Kit (JDK)**: Version 8 or newer.
- **Apache Maven**: For dependency management and project build.
- **IntelliJ IDEA**: For development (can also use other IDEs such as Eclipse).
- **Browsers**: Chrome, Microsoft Edge, or any browser that you want to test.
- **Maven Dependencies**: Ensure that all required dependencies are added in the `pom.xml` file.

## Installation

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/yourusername/SauceDemo-Automation.git
   cd SauceDemo-Automation
