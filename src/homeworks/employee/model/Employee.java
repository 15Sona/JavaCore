package homeworks.employee.model;
import java.util.Objects;

public class Employee {
    private String name;
    private String surname;
    private String emplyeeId;
    private double salary;
    private String company;
    private String position;

    public Employee(String name, String surname, String emplyeeId, double salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.emplyeeId = emplyeeId;
        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmplyeeId() {
        return emplyeeId;
    }

    public void setEmplyeeId(String emplyeeId) {
        this.emplyeeId = emplyeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name)
                && Objects.equals(surname, employee.surname) && Objects.equals(emplyeeId, employee.emplyeeId)
                && Objects.equals(company, employee.company) && Objects.equals(position, employee.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, emplyeeId, salary, company, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", emplyeeId='" + emplyeeId + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
