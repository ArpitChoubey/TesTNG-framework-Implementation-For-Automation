# TestNG Repository

## 👨‍💻 Author

**Arpit Choubey — SDET | QA | Automation Engineer**
🔗 **LinkedIn** | **Medium**

## ⭐ Support

If this repository helps you, please **Star 🌟** it!

---

## Overview

This repository contains **TestNG examples**, covering:

* TestNG annotations
* DataProviders
* Assertion types (Hard & Soft Assertions)
* Test execution flow
* Running grouped tests
* Understanding basic TestNG structure

These programs help you learn how TestNG works in real automation frameworks.

---

## What is TestNG?

**TestNG (Test Next Generation)** is a powerful testing framework designed to simplify:

* Unit testing
* Functional testing
* Integration testing

### ✔ Key Features of TestNG

* Supports annotations like `@Test`, `@BeforeMethod`, `@AfterMethod`, etc.
* Enables Data-Driven testing using **DataProvider**.
* Allows parallel test execution.
* Supports soft and hard assertions.
* Easy grouping and prioritization of tests.
* Generates HTML and XML-based reports.

---

## Important Concepts Covered in This Repository

### 🔹 1. TestNG Annotations

Located under: `src/test/java/Annotations/`

* `@Test`
* `@BeforeSuite`, `@BeforeClass`, `@BeforeMethod`
* `@AfterSuite`, `@AfterClass`, `@AfterMethod`
* `@Ignore`
* Factory design using TestNG

### 🔹 2. DataProvider Examples

Files include:

* `DataProvider.java`
* `DataProviderExamples.java`
* `Dataproviderdemo.java`

These demonstrate how to run the same test with multiple data sets.

### 🔹 3. Assertions

Located under: `src/test/java/AssertionTest/`

* `HardTest.java`
* `SoftAssertTest.java`

Hard assertions stop test execution on failure, while soft assertions continue execution.

### 🔹 4. First TestNG Programs

Located under: `src/test/java/FirstProgram/`

* Basic examples demonstrating how TestNG runs tests and methods.
* Includes `FirstClass.java`, `SecondClass.java`, etc.

---

## Folder Structure

```
TesTNG-/
├── src/
│   └── test/
│       └── java/
│           ├── Annotations/
│           │   ├── DataProvider.java
│           │   ├── DataProviderExamples.java
│           │   ├── Dataproviderdemo.java
│           │   ├── FactoryDemo.java
│           │   ├── FactoryRunner.java
│           │   ├── HomePage.java
│           │   ├── LoginPage.java
│           │   ├── NewTest.java
│           │   └── NewTest14.java
│           │
│           ├── AssertionTest/
│           │   ├── HardTest.java
│           │   └── SoftAssertTest.java
│           │
│           ├── FirstProgram/
│           │   ├── FirstClass.java
│           │   ├── IgnoreTest.java
│           │   ├── NewTest.java
│           │   └── SecondClass.java
│           │
│           └── ... (more test files)
│
├── test-output/
├── .classpath
├── .gitignore
├── .project
├── pom.xml
├── testng.xml
└── Atlestngsvr.xml
```

---

## How to Run TestNG Tests

1. Import project into **Eclipse/IntelliJ**.
2. Right-click any test class → **Run As → TestNG Test**.
3. Or run via `testng.xml` to execute the whole suite.

---

## Notes

* This repository is helpful for beginners learning TestNG from basics to intermediate level.
* You can extend this structure into a full Selenium automation framework.

---

