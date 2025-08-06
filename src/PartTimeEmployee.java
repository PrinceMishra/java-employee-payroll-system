import java.time.LocalDate;

public class PartTimeEmployee extends Employee {

    private double empWorkHours;
    private double empWorkHourRate;

    PartTimeEmployee(int empAadharId, String empName, LocalDate empJoiningDate, double empWorkHours, double empWorkHourRate){
        super(empAadharId,empName,empJoiningDate);
    }

    public double getEmpWorkHours(){
        return empWorkHours;
    }

    public double getEmpWorkHourRate(){
        return empWorkHourRate;
    }

    @Override
    public double getEmpMonthlySalary() {
        return empWorkHourRate * empWorkHours;
    }

}
