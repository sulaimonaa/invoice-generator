# Invoice Generator

A Spring Boot REST API application for generating and managing invoices with secure authentication and data persistence.

## Overview

Invoice Generator is a modern Java-based web application built with Spring Boot that provides comprehensive invoice management capabilities. The application features JWT-based authentication, MySQL database integration, and a robust API for invoice operations.

## Features

- **User Authentication & Security**
  - JWT (JSON Web Token) based authentication using JJWT
  - Spring Security integration for secure access control
  - User account management and authorization

- **Invoice Management**
  - Create, read, update, and delete invoices
  - Invoice data persistence with MySQL database
  - RESTful API endpoints for invoice operations

- **Data Validation**
  - Input validation using Spring Boot validation framework
  - Automated request body validation

- **Database Management**
  - MySQL database integration
  - Spring Data JPA for ORM (Object-Relational Mapping)
  - Automated entity management and queries

- **Developer Experience**
  - Lombok for reducing boilerplate code
  - Clean and maintainable code structure
  - Comprehensive testing framework

## Technology Stack

### Backend Framework
- **Spring Boot 4.0.6** - Modern Java application framework
- **Spring Data JPA** - Object-relational mapping and database access
- **Spring Security** - Authentication and authorization
- **Spring Validation** - Input validation

### Database
- **MySQL** - Primary relational database

### Authentication & Security
- **JJWT 0.11.5** - JSON Web Token implementation
  - jjwt-api
  - jjwt-impl
  - jjwt-jackson

### Tools & Libraries
- **Lombok** - Annotation-driven code generation
- **Maven** - Dependency management and build tool

### Java Version
- **Java 26** - Latest Java language features

## Project Structure

```
invoice-generator/
├── pom.xml                          # Maven configuration
├── src/
│   ├── main/java/com/invoice-generator/
│   │   ├── controllers/             # REST API endpoints
│   │   ├── services/                # Business logic
│   │   ├── repositories/            # Data access layer
│   │   ├── entities/                # JPA entities
│   │   ├── dto/                     # Data transfer objects
│   │   ├── security/                # Authentication & security
│   │   └── Application.java         # Main Spring Boot application
│   ├── resources/
│   │   └── application.properties   # Configuration
│   └── test/                        # Unit and integration tests
```

## Prerequisites

- Java 26+
- Maven 3.8+
- MySQL 8.0+
- Git

## Getting Started

### 1. Clone the Repository
```bash
git clone https://github.com/sulaimonaa/invoice-generator.git
cd invoice-generator
```

### 2. Configure Database
Update `src/main/resources/application.properties` with your MySQL credentials:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/invoice_generator
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update
```

### 3. Build the Project
```bash
mvn clean install
```

### 4. Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`

## API Endpoints

### Authentication
- `POST /api/auth/register` - Register new user
- `POST /api/auth/login` - User login (returns JWT token)

### Invoices
- `GET /api/invoices` - Retrieve all invoices
- `GET /api/invoices/{id}` - Retrieve invoice by ID
- `POST /api/invoices` - Create new invoice
- `PUT /api/invoices/{id}` - Update existing invoice
- `DELETE /api/invoices/{id}` - Delete invoice

*Note: API endpoints are protected and require JWT authentication*

## Usage Example

### 1. Register User
```bash
curl -X POST http://localhost:8080/api/auth/register \
  -H "Content-Type: application/json" \
  -d '{
    "username": "user@example.com",
    "password": "password123"
  }'
```

### 2. Login
```bash
curl -X POST http://localhost:8080/api/auth/login \
  -H "Content-Type: application/json" \
  -d '{
    "username": "user@example.com",
    "password": "password123"
  }'
```
Response includes JWT token for authenticated requests.

### 3. Create Invoice
```bash
curl -X POST http://localhost:8080/api/invoices \
  -H "Authorization: Bearer {JWT_TOKEN}" \
  -H "Content-Type: application/json" \
  -d '{
    "invoiceNumber": "INV-001",
    "clientName": "Client ABC",
    "amount": 5000.00,
    "dueDate": "2026-06-15"
  }'
```

## Testing

Run unit and integration tests:
```bash
mvn test
```

## Project Configuration

Key configurations in `pom.xml`:
- Spring Boot Starter Parent: Version 4.0.6
- Maven Compiler: Java 26 compatibility
- Lombok: Annotation processor configuration
- JJWT: JWT library with Jackson integration
- MySQL Connector: Runtime dependency for database connectivity

## Development

### Build
```bash
mvn clean build
```

### Run with Debug Mode
```bash
mvn spring-boot:run -Dspring-boot.run.arguments="--debug"
```

### Package as JAR
```bash
mvn clean package
```

The generated JAR will be in `target/demo-0.0.1-SNAPSHOT.jar`

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Author

Created by [sulaimonaa](https://github.com/sulaimonaa)

## Support

For issues, questions, or suggestions, please open an issue on the [GitHub Issues](https://github.com/sulaimonaa/invoice-generator/issues) page.

---

**Last Updated:** May 2026
