class Employee {
    // Private instance variables (attributes)
    private int employeeId;
    private String employeeName;
    private double salary;

    // Public constructor to initialize employee data
    public Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    // Getter method for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Setter method for employeeId
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    // Getter method for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter method for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter method for salary
    public double getSalary() {
        return salary;
    }

    // Setter method for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary value. Salary not updated.");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee(101, "John Doe", 50000.0);

        // Accessing and displaying employee data using getters
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: $" + employee.getSalary());

        // Modifying employee data using setters
        employee.setEmployeeId(102);
        employee.setEmployeeName("Jane Smith");
        employee.setSalary(55000.0);

        // Displaying modified employee data
        System.out.println("\nModified Employee Data:");
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Salary: $" + employee.getSalary());

        // Attempting to set an invalid salary value
        employee.setSalary(-1000.0);
    }
}
