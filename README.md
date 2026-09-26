# Employee Management System

A console-based Employee Management System developed using **Java, JDBC, MySQL, and Maven**. The application provides CRUD operations and employee filtering through a simple menu-driven interface.

## 🚀 Features

* Add new employees
* View all employees
* Search employee by ID
* Update employee information
* Delete employee records
* Search employees by department
* Filter employees by minimum salary
* Input validation
* MySQL database persistence
* JDBC-based database connectivity
* DAO-based database operations

## 🛠️ Technologies Used

| Technology   | Purpose                           |
| ------------ | --------------------------------- |
| Java 17      | Application development           |
| JDBC         | Database connectivity             |
| MySQL        | Data storage                      |
| Maven        | Dependency and project management |
| Git & GitHub | Version control                   |

## 📂 Project Structure

```text
EmployeeManagementSystem/
│
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── employee/
│                   └── management/
│                       ├── DBConnection.java
│                       ├── Employee.java
│                       ├── EmployeeDAO.java
│                       └── Main.java
│
├── database.sql
├── pom.xml
├── README.md
└── .gitignore
```

## 🗄️ Database

The project uses MySQL with the following database:

```text
employee_db
```

### Employee Table

```text
employees
├── id
├── name
├── email
├── department
└── salary
```

The complete database setup is available in:

```text
database.sql
```

## ⚙️ Requirements

Before running the project, install:

* JDK 17 or later
* Maven
* MySQL Server
* MySQL Workbench (recommended)

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/Nilesh8121/employee-management-system.git
```

### 2. Open the project

```bash
cd employee-management-system
```

### 3. Configure MySQL

Open:

```text
src/main/java/com/employee/management/DBConnection.java
```

Update the MySQL credentials:

```java
private static final String USER = "root";
private static final String PASSWORD = "your_password";
```

### 4. Create the database

Open MySQL Workbench and execute:

```text
database.sql
```

This creates the `employee_db` database and `employees` table.

### 5. Compile the project

```bash
mvn clean compile
```

### 6. Run the application

```bash
mvn exec:java
```

## 🖥️ Application Screenshots

### Main Menu

![Main Menu](screenshots/main-menu.png)

### Add Employee

![Add Employee](screenshots/add-employee.png)

### Employee List

![Employee List](screenshots/employee-list.png)

### Search and Filtering

![Search and Filtering](screenshots/search-filter.png)

## 🧠 Concepts Demonstrated

This project demonstrates practical knowledge of:

* Object-Oriented Programming
* Classes and Objects
* Encapsulation
* Constructors
* Exception Handling
* Collections
* JDBC
* SQL
* CRUD Operations
* Prepared Statements
* DAO Pattern
* Maven Project Management

## 📌 Resume Description

**Employee Management System | Java, JDBC, MySQL, Maven**

* Developed a console-based employee management application using Java and JDBC.
* Implemented CRUD operations for managing employee records with MySQL persistence.
* Added employee search, department filtering, salary filtering, and input validation.
* Applied object-oriented programming principles and DAO-based database architecture.

## 👨‍💻 Author

**Nilesh Jadhav**

GitHub: [Nilesh8121](https://github.com/Nilesh8121)
