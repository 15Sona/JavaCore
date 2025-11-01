package homeworks.employee.storage;

import homeworks.employee.model.Employee;

public class EmployeeStorage {
    private Employee[] employees = new Employee[10];
    private int size = 0;

    public void add(Employee employee) {

        if (existByID(employee.getEmplyeeId())) {
            System.out.println("Employee with ID [" + employee.getEmplyeeId() + "] already exists!");
            return;
        }
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
        System.out.println("Employee successfully added");

    }
    private boolean existByID(String id){
        for (int i = 0; i < size; i++) {
            if(employees[i].getEmplyeeId().equals(id)){
                return true;
            }

        }
        return false;

    }

    private void extend() {
        Employee[] tmp = new Employee[size + 10];
        System.arraycopy(employees, 0, tmp, 0, size);
        employees = tmp;

    }

    public void printAllEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }
    }

    public void searchEmployeeByEmployeeId(String employeeId) {
        for (int i = 0; i < size; i++){
            if(employees!= null && employees[i].getEmplyeeId().contains(employeeId)){
                System.out.println(employees[i]);
                return;

            }
        }
            System.out.println("No employee found with ID: " + employeeId);
    }

    public void searchEmployeeByCompanyName(String companyName) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getCompany().contains(companyName)) {
                System.out.println(employees[i]);
            }
        }
    }
}