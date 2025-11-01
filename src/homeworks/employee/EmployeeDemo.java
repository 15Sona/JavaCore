package homeworks.employee;
import homeworks.employee.model.Employee;
import homeworks.employee.storage.EmployeeStorage;

import java.util.Scanner;

public class EmployeeDemo implements Commands {
    static private final Scanner scanner = new Scanner(System.in);
    static private final EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_EMPLOYEE:
                    addEmployee();
                    break;
                case PRINT_ALL_EMPLOYEE:
                    employeeStorage.printAllEmployee();
                    break;
                case SEARCH_EMPLOYEE_BY_EMPLOYEE_ID:
                    System.out.println("Please input EMPLOYEE_ID");
                    String imployerId = scanner.nextLine();
                    employeeStorage.searchEmployeeByEmployeeId(imployerId);
                    break;
                case SEARCH_EMPLOYEE_BY_COMPANY_NAME:
                    System.out.println("Please input COMPANY NAME ");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                    break;
                default:
                    System.out.println("wrong command");

            }
        }
    }
    public static void printCommands () {
                System.out.println("Enter " + EXIT + " to EXIT");
                System.out.println("Enter " + ADD_EMPLOYEE + " to ADD A NEW EMPLOYEE");
                System.out.println("Enter " + PRINT_ALL_EMPLOYEE + " to PRINT ALL EMPLOYEES");
                System.out.println("Enter " + SEARCH_EMPLOYEE_BY_EMPLOYEE_ID + " to SEARCH EMPLOYEE BY ID");
                System.out.println("Enter " + SEARCH_EMPLOYEE_BY_COMPANY_NAME + " to SEARCH EMPLOYEE BY COMPANY NAME ");
            }

    private static void addEmployee () {
            System.out.println("Please input employee name: ");
            String employeeName = scanner.nextLine();
            System.out.println("Please input employee surname: ");
            String employeSurename = scanner.nextLine();
            System.out.println("Please input emplyee ID: ");
            String emplyeeID = scanner.nextLine();
            System.out.println("Please input employee salary: ");
            double salary = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input employee company: ");
            String company = scanner.nextLine();
            System.out.println("Please input employee position: ");
            String position = scanner.nextLine();
            Employee employee = new Employee(employeeName, employeSurename, emplyeeID, salary, company, position);
            employeeStorage.add(employee);

        }

    }