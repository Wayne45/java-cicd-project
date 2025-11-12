# Spring Boot Hello World

This project is a simple Spring Boot application that demonstrates the basic setup and functionality of a Spring Boot project.

## Prerequisites

- Java 17
- Maven 3.6 or later

## Setup

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/spring-boot-hello-world.git
   cd spring-boot-hello-world
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

The application will start on `http://localhost:8080`.

## Project Structure

- `src/main/java/com/example/Application.java`: Main application class
- `src/main/java/com/example/config/AppConfig.java`: Application configuration
- `src/main/java/com/example/controllers/HelloController.java`: REST controller
- `src/main/resources/application.properties`: Application properties
- `src/main/resources/logback-spring.xml`: Logging configuration
- `src/test/resources/application-test.properties`: Test-specific properties
- `pom.xml`: Project dependencies and build configuration

## Features

- Spring Boot 2.7.5
- Spring Web for RESTful endpoints
- Spring Actuator for application monitoring
- Spring Shell for CLI interface
- Custom application properties
- Logging with SLF4J and Logback
- Micrometer for metrics collection

## REST Endpoints

- Hello World: `GET http://localhost:8080/hello`
    - Returns: "Hello, World!"

To test the endpoint, you can use curl:
```
curl http://localhost:8080/hello
```

Or simply open the URL in your web browser.

## Testing

To run the tests, execute:
```
mvn test
```

The project includes both unit tests and integration tests for the Hello World endpoint.

## Using Spring Shell

After starting the application, you can use the Spring Shell CLI. For example:
```
shell:>hello YourName
```

## Actuator Endpoints

- Health check: `http://localhost:8080/actuator/health`
- Info: `http://localhost:8080/actuator/info`
- Metrics: `http://localhost:8080/actuator/metrics`

## Contributing

Please read `CONTRIBUTING.md` for details on our code of conduct, and the process for submitting pull requests.

## License

This project is licensed under the MIT License - see the `LICENSE.md` file for details.