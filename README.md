# Selenium Automation Testing Framework (ElementMaster)

##  Overview
This project is a Selenium-based test automation framework developed using **Java, TestNG, and Maven**, following the **Page Object Model (POM)** design pattern.

The framework automates UI components from the DemoQA practice site and covers modules like forms, web tables, alerts, frames, and widgets.



## Objectives
- Automate UI interactions using Selenium WebDriver
- Implement Page Object Model for maintainability
- Handle dynamic elements (alerts, frames, widgets)
- Use DataProvider for data-driven testing
- Generate reports and capture screenshots on failure



##  Features Implemented

###  Forms Module
- Enter text inputs (name, email)
- Submit form
- Data-driven testing using TestNG DataProvider

---

### Web Tables Module
- Add new record
- Search record
- Delete record

---

###  Alerts Module
- Handle simple alert (accept)
- Handle confirmation alert (dismiss)
- Handle prompt alert (input + accept)

---

###  Frames Module
- Switch to iframe
- Perform actions inside frame
- Switch back to main content

---

###  Widgets Module
- Date Picker interaction
- Slider movement
- Accordion interaction

---

## Framework Architecture

This project follows the **Page Object Model (POM)**:

- Page classes → locators + actions
- Test classes → test logic
- Base classes → driver setup
- Utilities → reporting & helpers

---

##  Project Structure

```
elementmaster/
│
├── src/main/java/
│   ├── base/
│   ├── pages/
│   ├── config/
│   ├── utils/
│
├── src/test/java/
│   ├── tests/
│   ├── listeners/
│
├── screenshots/
├── reports/
├── design/
│
├── pom.xml
├── testng.xml
```

---

## Tech Stack

- Java
- Selenium WebDriver
- TestNG
- Maven
- Extent Reports

---

##  Test Execution Flow

1. TestNG runs test cases
2. BaseTest initializes WebDriver
3. Test calls Page methods
4. Page interacts with UI
5. Listener captures failures
6. Report is generated


## Reporting

- HTML report generated using Extent Reports
- Shows:
  - Test status
  - Logs
  - Failures

---

## Screenshot on Failure

- Implemented using TestNG Listener
- Captures screenshot automatically
- Stored in `/screenshots` folder



##  How to Run

1. Import project into Eclipse as Maven project
2. Right click on `testng.xml`
3. Select **Run As → TestNG Suite**

---

##  Execution Result

- Total Tests: 6  
- Passed: 6  
- Failed: 0  

All test cases executed successfully.

##  Key Highlights

- Clean POM structure
- Reusable code
- Handles dynamic UI elements
- Data-driven testing
- Reporting + screenshot integration


##  Future Enhancements

- Parallel execution
- Cross-browser testing
- CI/CD integration
- Advanced reporting

---

##  Author

Developed by Dhathri Putty as part of Selenium Automation Hackathon.