# 🧩 Design Document – Selenium Automation Framework

## 📌 Overview
This project is a Selenium-based automation framework developed using **Java, TestNG, and Maven**.  
It follows the **Page Object Model (POM)** design pattern to ensure maintainability, scalability, and reusability.

---

## 🎯 Objective
The goal of this framework is to automate UI testing for various components of a web application including forms, tables, alerts, frames, and widgets.

---

## 🏗️ Framework Architecture

The framework is structured into multiple layers:

### 🔹 1. Base Layer
- Handles WebDriver initialization and teardown
- Manages browser setup using WebDriverManager
- Contains reusable driver setup logic

---

### 🔹 2. Page Layer
- Contains Page Classes
- Each class represents a UI page/module
- Includes:
  - Web element locators
  - Action methods (click, sendKeys, etc.)

---

### 🔹 3. Test Layer
- Contains test classes
- Executes test scenarios
- Uses TestNG annotations (`@Test`, `@DataProvider`)

---

### 🔹 4. Utility Layer
- Handles reusable utilities
- Includes:
  - Extent Report generation
  - Configuration reading

---

### 🔹 5. Listener Layer
- Implements TestNG listeners
- Captures:
  - Test success/failure
  - Screenshots on failure
  - Logs for reporting

---

## 🔄 Execution Flow

1. TestNG triggers execution using `testng.xml`
2. BaseTest initializes WebDriver
3. Test classes call Page class methods
4. Page classes interact with UI elements
5. Listener captures results and failures
6. Extent Report generates execution summary

---

## 🧪 Modules Covered

### ✔ Forms
- Input handling
- Form submission
- Data-driven testing using DataProvider

---

### ✔ Web Tables
- Add record
- Search record
- Delete record

---

### ✔ Alerts
- Simple alert handling
- Confirmation alert handling
- Prompt alert handling

---

### ✔ Frames
- Switch to iframe
- Perform actions
- Switch back to main content

---

### ✔ Widgets
- Date Picker interaction
- Slider manipulation
- Accordion interaction

---

## ⚙️ Design Principles

- Separation of concerns (Test vs UI logic)
- Reusability of code
- Maintainability of framework
- Scalability for future enhancements

---

## 📊 Reporting Mechanism

- Implemented using Extent Reports
- Generates HTML report after execution
- Includes:
  - Test results
  - Logs
  - Failure details

---

## 📸 Screenshot Mechanism

- Implemented using TestNG Listener
- Captures screenshot automatically on test failure
- Stored in `/screenshots` directory

---

## 🧠 Advantages of This Framework

- Easy to extend with new test cases
- Reduced code duplication
- Clear separation of logic
- Supports data-driven testing
- Handles dynamic web elements effectively

---

## 🔮 Future Enhancements

- Parallel test execution
- Cross-browser support
- Integration with CI/CD tools (Jenkins)
- Cloud execution (Selenium Grid)

---

## 🏁 Conclusion

This framework provides a structured and efficient approach for UI automation testing.  
It ensures high reliability, maintainability, and scalability, making it suitable for real-world applications.
