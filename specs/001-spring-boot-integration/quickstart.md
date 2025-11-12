# Quick Start Guide: Spring Boot Hello World Application

This guide will help you set up and run the Spring Boot Hello World application.

## Prerequisites

- Java Development Kit (JDK) 17
- Maven 3.6 or later

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/your-repo/spring-boot-hello-world.git
   cd spring-boot-hello-world
   ```

2. Build the project:
   ```
   mvn clean install
   ```

## Running the Application

### As a Web Application

1. Start the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

2. Open a web browser and navigate to `http://localhost:8080/hello`

3. You should see a JSON response with the message "Hello, World!"

### Using the CLI

1. Run the application with the Spring Shell:
   ```
   mvn spring-boot:run -Dspring-boot.run.profiles=shell
   ```

2. Once the shell starts, you can use the `hello` command:
   ```
   shell:>hello
   Hello, World!
   ```

## Configuration

You can customize the hello message by editing the `application.properties` file:

```
app.message=Your custom message here
```

## Accessing Actuator Endpoints

- Health check: `http://localhost:8080/actuator/health`
- Application info: `http://localhost:8080/actuator/info`
- Metrics: `http://localhost:8080/actuator/metrics`

## Running Tests

To run the tests, use the following command:

```
mvn test
```

## Next Steps

- Explore the codebase in your IDE
- Check out the API documentation in `contracts/api-spec.yaml`
- Review the implementation plan for more details on the project structure and design decisions

For any issues or questions, please refer to the project documentation or contact the development team.