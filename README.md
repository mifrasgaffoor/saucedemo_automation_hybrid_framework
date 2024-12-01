# 🚀 **Selenium Test Automation Project for SauceDemo**

This project demonstrates a comprehensive suite of automated tests for the **[SauceDemo](https://www.saucedemo.com/)** website using **Selenium WebDriver**. The framework is built with **Java**, **TestNG**, and **Maven** to ensure efficient test execution, easy management, and maintainable test code.

---

## 📊 **Project Overview**

The **Selenium Test Automation** suite is designed to ensure robust **system testing** and validate the **user workflow** of the **SauceDemo** e-commerce website.

---

## 🔑 **Key Features**

- **📐 Page Object Model (POM)**: A structured framework design pattern for maintaining clean and reusable test code.
- **🖱️ PageFactory**: A mechanism for initializing web elements, improving readability and reducing maintenance overhead.
- **🔧 WebDriverManager**: Automates browser driver management for more reliable test execution.
- **🔍 Assertions with AssertJ**: Powerful and easy-to-read assertions to validate expected behavior.
- **🎲 Java Faker**: Generates dynamic test data for realistic checkout processes.
- **🔁 Common Test Base Class**: Manages consistent setup and teardown for all tests, improving efficiency and reducing redundancy.
- **📄 ReportNG**: Provides a detailed HTML test report for better insights and traceability.
- **🌍 Cross-Browser Testing**: Ensures compatibility across different browsers like **Chrome** and **Microsoft Edge**.
- **📦 POJO Classes**: Encapsulates product data into Plain Old Java Objects (POJOs) for easier data manipulation.
- **📸 Screenshot Functionality**: Captures screenshots during test execution for debugging purposes.

---

## 📝 **Test Cases**

The test cases are structured to validate key functionality across the **SauceDemo** site:

- **Login Test**: Validates both valid and invalid login attempts.
- **Add to Cart**: Ensures the user can successfully add products to the cart.
- **Checkout Flow**: Verifies the entire checkout process, using dynamically generated test data.
- **Cross-Browser Compatibility**: Ensures the website works consistently across multiple browsers (Chrome, Edge).

Each test case is designed to target a particular user interaction, ensuring that the site functions correctly under various conditions.

---

## 💻 **Prerequisites**

Before running the project, ensure the following are installed:

- **JDK 8 or newer**
- **Apache Maven** for build automation
- **IntelliJ IDEA** (or any IDE of your choice, like Eclipse)
- **Browsers**: Chrome, Microsoft Edge, or any other preferred browser

---

## 🛠️ **Installation Steps**

Follow these steps to set up the project:

1. **Clone the Repository**:

   ```bash
   git clone https://github.com/yourusername/SauceDemo-Automation.git
   cd SauceDemo-Automation
