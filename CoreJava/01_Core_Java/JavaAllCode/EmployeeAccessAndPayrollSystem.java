package one;
// EmployeeAccessAndPayrollSystem.java

interface Payroll {
    double calculateSalary() throws InvalidSalaryException;
}

class UnauthorizedAccessException extends RuntimeException {
    public UnauthorizedAccessException(String message) {
        super(message);
    }
}

class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}


abstract class Employee implements Payroll {
    private int id;
    private String name;
    private String role;
    private double salary;

    public Employee(int id, String name, String role, double salary) throws InvalidSalaryException {
        this.id = id;
        this.name = name;
        this.role = role;
        setSalary(role, salary);
    }

    public void setSalary(String updaterRole, double salary) throws InvalidSalaryException {
        if (!"HR".equalsIgnoreCase(updaterRole)) {
            throw new UnauthorizedAccessException("Only HR can modify salary");
        }
        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than zero");
        }
        this.salary = salary;
    }

    protected double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary(double bonus) throws InvalidSalaryException {
        double total = calculateSalary() + bonus;
        if (total <= 0) {
            throw new InvalidSalaryException("Final salary invalid");
        }
        return total;
    }
}

class FullTimeEmployee extends Employee {

    public FullTimeEmployee(int id, String name, String role, double salary)
            throws InvalidSalaryException {
        super(id, name, role, salary);
    }

    @Override
    public double calculateSalary() throws InvalidSalaryException {
        return getSalary() + (getSalary() * 0.20); 
    }
}


class ContractEmployee extends Employee {

    public ContractEmployee(int id, String name, String role, double salary)
            throws InvalidSalaryException {
        super(id, name, role, salary);
    }

    @Override
    public double calculateSalary() throws InvalidSalaryException {
        return getSalary(); // no allowance
    }
}

// ----------- Driver Class -----------

public class EmployeeAccessAndPayrollSystem {
    public static void main(String[] args) {
        try {
            Employee e1 = new FullTimeEmployee(1, "John", "HR", 50000);
            Employee e2 = new ContractEmployee(2, "Sara", "HR", 30000);

            System.out.println("Full-Time Salary: " + e1.calculateSalary());
            System.out.println("Contract Salary with Bonus: " + e2.calculateSalary(5000));

            // Unauthorized salary update
            e1.setSalary("EMPLOYEE", 60000);

        } catch (InvalidSalaryException e) {
            System.out.println("Salary Error: " + e.getMessage());
        } catch (UnauthorizedAccessException e) {
            System.out.println("Access Error: " + e.getMessage());
        }
    }
}
