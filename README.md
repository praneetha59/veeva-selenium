# Selenium Automation Journey

### A structured, step-by-step record of my learning in Selenium WebDriver with Java, built to prepare for a **QA Automation Engineer** role.

This repository contains hands-on practice scripts, topic-wise notes, and projects. Every topic is practised with working code, committed regularly, and ticked off in the checklist below once complete.

---

## Tech Stack

| Category | Tool |
| --- | --- |
| Language | Java 17 |
| Automation | Selenium WebDriver 4 |
| Test Framework | TestNG |
| Build Tool | Maven |
| IDE | IntelliJ IDEA |
| Version Control | Git and GitHub |
| Reporting (planned) | Extent Reports / Allure |
| BDD (planned) | Cucumber |
| CI (planned) | Jenkins / GitHub Actions |

---

## Learning Roadmap and Progress

Legend: `[x]` completed, `[ ]` not started yet.

### Phase 1: Java Foundation for Automation
- [ ] OOP concepts (classes, inheritance, polymorphism, abstraction, encapsulation, interfaces)
- [ ] Collections (List, Set, Map) and iteration
- [ ] Exception handling
- [ ] String methods, static and final keywords, constructors
- [ ] File handling and Properties files
- [ ] Reading Excel data with Apache POI

### Phase 2: Selenium Core
- [ ] Selenium architecture and WebDriver interface
- [ ] Browser setup (Chrome, Firefox, Edge) and Selenium Manager
- [ ] Browser commands (`get`, `navigate`, `back`, `forward`, `refresh`, `getTitle`, `getCurrentUrl`, `close` vs `quit`)
- [ ] Locators: ID, Name, ClassName, TagName, LinkText, PartialLinkText
- [ ] CSS Selectors (attribute, child, sibling, `nth-child`)
- [ ] XPath: absolute vs relative, `contains()`, `starts-with()`, `text()`, `and` / `or`
- [ ] XPath axes (parent, ancestor, following-sibling, preceding-sibling, etc.)
- [ ] WebElement methods (`click`, `sendKeys`, `clear`, `getText`, `getAttribute`, `isDisplayed`, `isEnabled`, `isSelected`)
- [ ] `findElement` vs `findElements`
- [ ] Handling `StaleElementReferenceException` and `NoSuchElementException`

### Phase 3: Handling Web Components
- [ ] Dropdowns (`Select` class and custom dropdowns)
- [ ] Checkboxes and radio buttons
- [ ] Alerts (simple, confirm, prompt)
- [ ] Frames and iframes
- [ ] Multiple windows and tabs (window handles)
- [ ] Web tables (static, dynamic, pagination)
- [ ] Calendar and date pickers
- [ ] Autosuggest dropdowns
- [ ] File upload and file download
- [ ] Authentication pop-ups
- [ ] Shadow DOM (advanced)

### Phase 4: Advanced Interactions
- [ ] Actions class (hover, right-click, double-click, drag and drop, keyboard keys)
- [ ] JavaScriptExecutor (scroll, click, set values)
- [ ] Scrolling techniques
- [ ] Screenshots (full page and element)
- [ ] Relative locators (Selenium 4)
- [ ] New window and tab API (Selenium 4)
- [ ] Headless browser execution
- [ ] Browser options and capabilities
- [ ] Cookies handling

### Phase 5: Synchronization
- [ ] Implicit wait
- [ ] Explicit wait (`WebDriverWait` + `ExpectedConditions`)
- [ ] Fluent wait
- [ ] Why to avoid `Thread.sleep`
- [ ] Page load timeout and dynamic element handling

### Phase 6: TestNG
- [ ] Annotations (`@Test`, `@BeforeMethod`, `@AfterMethod`, `@BeforeClass`, `@AfterClass`, `@BeforeSuite`, `@AfterSuite`)
- [ ] Assertions (hard and soft)
- [ ] `priority`, `enabled`, `dependsOnMethods`, `invocationCount`
- [ ] Groups and `testng.xml`
- [ ] Parameters and `@DataProvider`
- [ ] Parallel execution
- [ ] Retry analyzer
- [ ] Listeners (`ITestListener`)

### Phase 7: Framework Design
- [ ] Page Object Model (POM)
- [ ] Page Factory
- [ ] Base class and reusable utilities (waits, screenshots, config reader)
- [ ] Data-driven testing (Excel, JSON, properties)
- [ ] Reporting (Extent Reports / Allure)
- [ ] Logging with Log4j2
- [ ] Cross-browser testing
- [ ] Parallel execution with `ThreadLocal` WebDriver
- [ ] Cucumber BDD (feature files, step definitions, hooks, runner, tags)

### Phase 8: Integration and DevOps
- [ ] Git and GitHub workflow (branches, pull requests)
- [ ] Maven lifecycle and Surefire plugin
- [ ] Running tests from the command line
- [ ] Jenkins CI basics
- [ ] GitHub Actions basics
- [ ] Selenium Grid and Docker basics
- [ ] API testing basics with RestAssured
- [ ] SQL basics for data validation

### Phase 9: Projects
- [ ] E-commerce end-to-end automation (login, search, cart, checkout)
- [ ] Complete framework (POM + TestNG + Reports + Logs)
- [ ] BDD version of the same project

---

## Project Structure

```
Selenium-Automation-Journey/
│
├── notes/                      # Topic-wise notes and learnings
│
├── src/
│   ├── main/java/              # Reusable utilities (later phases)
│   └── test/java/
│       ├── basics/             # Browser setup and commands
│       ├── locators/           # All locator practice
│       ├── xpath/              # XPath and CSS selectors
│       ├── webelements/        # WebElement methods
│       ├── dropdowns/
│       ├── alerts/
│       ├── frames/
│       ├── windows/
│       ├── webtables/
│       ├── actions/            # Actions class
│       ├── javascript/         # JavaScriptExecutor
│       ├── waits/              # Implicit, explicit, fluent
│       ├── testng/             # TestNG features
│       ├── pom/                # Page Object Model
│       ├── framework/          # Complete framework
│       ├── cucumber/           # BDD
│       └── projects/           # End-to-end projects
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## How to Run

1. **Clone the repository**
   ```
   git clone https://github.com/<your-username>/Selenium-Automation-Journey.git
   ```
2. **Open the project** in IntelliJ IDEA and let Maven download the dependencies.
3. **Run any test**: open a class under `src/test/java`, then click the green run arrow.
4. **Run all tests from the terminal**
   ```
   mvn test
   ```

**Prerequisites:** JDK 17 or higher, Maven, and Google Chrome installed.

---

## Practice Websites Used

| Site | Used for |
| --- | --- |
| [SauceDemo](https://www.saucedemo.com) | Login, cart, checkout flows |
| [The Internet](https://the-internet.herokuapp.com) | Alerts, frames, windows, dropdowns, uploads |
| [Automation Practice](https://automationexercise.com) | E-commerce end-to-end scenarios |

---

## Progress Log

| Date | What I learned |
| --- | --- |
| 21 Nov 2026 | Project setup, Maven dependencies (Selenium + TestNG), README created |
|  |  |
|  |  |

*(Add a new row every time you finish a topic.)*

---

## Key Learnings and Notes

Short notes on each topic live in the `notes/` folder, covering what the topic is, when to use it, common mistakes, and interview questions.

---

## About Me

Aspiring QA Automation Engineer, learning step by step and documenting everything here.

**Goal:** build strong Selenium and Java automation skills through consistent practice.

*Learn. Practise. Automate. Improve.*
