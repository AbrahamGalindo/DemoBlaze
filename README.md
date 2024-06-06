# DemoBlaze

This project contains the test cases created for Demo blaze test.
These test cases are created in java with Gherkin language (Cucumber).

Tools and libraries used:

Tools

    *Java
    *IntelliJ
    *Maven

Libraries

    *JUnit
    *Cucumber
    *Extents reports

## Pre-requisites 📋

### Install tools

       JAVA 
       Maven
       IntelliJ  **optional

## Run the tests
- For run the first test (pay product(galaxy s6)) do you need run the next command on the project path
     ....\DemoBlaze\DemoBlaze> mvn test -D"cucumber.filter.tags=@buyProduct"

- For run the second test (pdelete product(nokia lumina 1520)) do you need run the next command on the project path
     ....\DemoBlaze\DemoBlaze> mvn test -D"cucumber.filter.tags=@addProductAndDelete"

- For run both scripts do you need run the next command on the project path
     ....\DemoBlaze\DemoBlaze> mvn -Dtest=RunnerTest test

- From IntelliJ rigth click on RunnerTest.class and selec run option.


### Reports

- You can check the reports on the next path
    ....\DemoBlaze\DemoBlaze\test-reports-demoBlaze


