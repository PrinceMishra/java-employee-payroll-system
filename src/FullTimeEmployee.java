import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

    private final double empMonthlySalary;

    FullTimeEmployee(int empId, String empName, LocalDate empDob, double empSalary){

        super(empId, empName, empDob);
        this.empMonthlySalary = empSalary;

    }

    @Override
    public double empSalary() {
        return empMonthlySalary;
    }
}
