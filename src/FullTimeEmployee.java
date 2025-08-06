import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

    private final double empMonthlySalary;

    FullTimeEmployee(int empAadharId, String empName, LocalDate empDateOfJoining, double empMonthlySalary){

        super(empAadharId, empName, empDateOfJoining);
        this.empMonthlySalary = empMonthlySalary;

    }

    @Override
    public double getEmpMonthlySalary() {
        return empMonthlySalary;
    }
}
