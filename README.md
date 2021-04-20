# Sample Banking Application using Java8, Spring Boot, H2 DB

RESTful API to simulate simple banking operations. 

## Requirements

*	Create Account and Customer based on name and phone number.
*	Account number should be unique
*	Support to save the data in file based on configuration
*	Check the current balance for an account number
*	Retrieve all accounts whose balance is greater than or equal to given parameter
*	Internal amount transfer support


## Getting Started

1. Checkout the project from GitHub

```
git clone https://github.com/pvrmurthy76/bankapp

```
2. Enable Lombok support on your IDE

Refer to the following link for instructions:

```
https://projectlombok.org/setup/eclipse
https://projectlombok.org/setup/intellij

```
3. Open IDE of your choice and Import as existing maven project in your workspace

```
- Import existing maven project
- Run mvn clean install
- If using STS, Run As Spring Boot App

```
4. Default port for the api is 8989


### Prerequisites

* Java 8
* Spring Tool Suite 4 or similar IDE
* [Maven](https://maven.apache.org/) - Dependency Management

### Maven Dependencies

```
spring-boot-starter-actuator
spring-boot-starter-data-jpa
spring-boot-starter-security
spring-boot-starter-web
spring-boot-devtools
h2 - Inmemory database
lombok - to reduce boilerplate code

```

## H2 In-Memory Database

Make sure to use jdbc:h2:mem:testdb as your jdbc url. If you intend to you use custom database name, please
define datasource properties in application.yml

```
http://localhost:8989/bank-api/h2-console/

```

## Testing the FundmeBank App Rest Api

1. Browse to <project-root>/src/test/resources to find sample requests and urls for the same.


## Author

* **Ramamurthy**

