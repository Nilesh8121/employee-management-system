# Employee Management System

A small resume-ready Java application for managing employee records using Java, JDBC, MySQL, Maven, and object-oriented programming.

## Features
- Add employee
- View all employees
- Search employee by ID
- Update employee
- Delete employee
- Search employees by department
- Filter employees by minimum salary
- Input validation for required fields, email, IDs, and salary
- MySQL persistent storage

## Technology Stack
- Java 17
- JDBC
- MySQL
- Maven
- OOP

## Project Structure
```text
EmployeeManagementSystem/
├── pom.xml
├── database.sql
├── README.md
└── src/main/java/com/employee/management/
    ├── Main.java
    ├── Employee.java
    ├── EmployeeDAO.java
    └── DBConnection.java
```

## Setup
1. Start MySQL Server.
2. Open MySQL Workbench.
3. Open `database.sql` and execute it.
4. Open `DBConnection.java` and set your MySQL password.
5. Open CMD in the project folder.
6. Run:

```bash
mvn clean compile
mvn exec:java
```

## Example Menu
```text
1. Add Employee
2. View All Employees
3. Search Employee by ID
4. Update Employee
5. Delete Employee
6. Search by Department
7. Filter by Minimum Salary
8. Exit
```

## Resume Description
**Employee Management System | Java, JDBC, MySQL**
- Developed a console-based employee management application using Java, JDBC, and MySQL.
- Implemented CRUD operations along with department-based search and salary filtering.
- Added input validation for employee details, email addresses, IDs, and salary values.
- Applied OOP, DAO, prepared statements, exception handling, and database connectivity concepts.

## Interview Topics
- OOP and encapsulation
- JDBC and PreparedStatement
- CRUD operations
- SQL queries
- DAO pattern
- Exception handling
- Input validation
- Maven dependency management
