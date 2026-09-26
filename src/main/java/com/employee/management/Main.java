package com.employee.management;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final EmployeeDAO employeeDAO = new EmployeeDAO();
    private static final Pattern EMAIL_PATTERN =
            Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", Pattern.CASE_INSENSITIVE);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int choice = readInt("Enter your choice: ");
            System.out.println();

            switch (choice) {
                case 1 -> addEmployee();
                case 2 -> viewEmployees();
                case 3 -> searchEmployee();
                case 4 -> updateEmployee();
                case 5 -> deleteEmployee();
                case 6 -> searchByDepartment();
                case 7 -> filterBySalary();
                case 8 -> {
                    System.out.println("Thank you for using Employee Management System!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice. Please select 1-8.");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("===============================================");
        System.out.println("          EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("===============================================");
        System.out.println("1. Add Employee");
        System.out.println("2. View All Employees");
        System.out.println("3. Search Employee by ID");
        System.out.println("4. Update Employee");
        System.out.println("5. Delete Employee");
        System.out.println("6. Search by Department");
        System.out.println("7. Filter by Minimum Salary");
        System.out.println("8. Exit");
        System.out.println("===============================================");
    }

    private static void addEmployee() {
        System.out.println("--- Add Employee ---");
        String name = readNonEmpty("Name: ");
        String email = readEmail("Email: ");
        String department = readNonEmpty("Department: ");
        double salary = readPositiveDouble("Salary: ");
        employeeDAO.addEmployee(new Employee(name, email, department, salary));
    }

    private static void viewEmployees() {
        System.out.println("--- Employee List ---");
        printEmployees(employeeDAO.getAllEmployees());
    }

    private static void searchEmployee() {
        int id = readPositiveInt("Enter employee ID: ");
        Employee employee = employeeDAO.getEmployeeById(id);
        if (employee == null) System.out.println("Employee not found.");
        else System.out.println(employee);
    }

    private static void updateEmployee() {
        int id = readPositiveInt("Enter employee ID: ");
        Employee existing = employeeDAO.getEmployeeById(id);
        if (existing == null) {
            System.out.println("Employee not found.");
            return;
        }
        System.out.println("Enter new details:");
        String name = readNonEmpty("Name: ");
        String email = readEmail("Email: ");
        String department = readNonEmpty("Department: ");
        double salary = readPositiveDouble("Salary: ");
        employeeDAO.updateEmployee(new Employee(id, name, email, department, salary));
    }

    private static void deleteEmployee() {
        int id = readPositiveInt("Enter employee ID: ");
        employeeDAO.deleteEmployee(id);
    }

    private static void searchByDepartment() {
        String department = readNonEmpty("Enter department: ");
        System.out.println("--- Employees in " + department + " ---");
        printEmployees(employeeDAO.searchByDepartment(department));
    }

    private static void filterBySalary() {
        double salary = readPositiveDouble("Enter minimum salary: ");
        System.out.println("--- Employees with salary >= " + salary + " ---");
        printEmployees(employeeDAO.getEmployeesByMinimumSalary(salary));
    }

    private static void printEmployees(List<Employee> employees) {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        employees.forEach(System.out::println);
    }

    private static String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) return value;
            System.out.println("Value cannot be empty.");
        }
    }

    private static String readEmail(String prompt) {
        while (true) {
            String email = readNonEmpty(prompt);
            if (EMAIL_PATTERN.matcher(email).matches()) return email;
            System.out.println("Please enter a valid email address.");
        }
    }

    private static int readPositiveInt(String prompt) {
        while (true) {
            int value = readInt(prompt);
            if (value > 0) return value;
            System.out.println("Value must be greater than 0.");
        }
    }

    private static double readPositiveDouble(String prompt) {
        while (true) {
            try {
                double value = Double.parseDouble(readNonEmpty(prompt));
                if (value > 0) return value;
            } catch (NumberFormatException ignored) {}
            System.out.println("Please enter a valid positive number.");
        }
    }

    private static int readInt(String prompt) {
        while (true) {
            try {
                return Integer.parseInt(readNonEmpty(prompt));
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
    }
}
