import java.time.LocalDate;

public class FullTimeEmployee extends Employee {

    private final double empMonthlySalary;

    FullTimeEmployee(int empAadharId, String empName,long empMobileNo, LocalDate empDateOfJoining, double empMonthlySalary){

        super(empAadharId, empName,empMobileNo, empDateOfJoining);
        this.empMonthlySalary = empMonthlySalary;

    }

    @Override
    public double getEmpTotalSalary() {
        return empMonthlySalary;
    }
}
