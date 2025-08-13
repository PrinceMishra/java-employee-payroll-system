import java.time.LocalDate;

public class PartTimeEmployee extends Employee {

    private double empWorkHours;
    private double empWorkHourRate;

    PartTimeEmployee(int empAadharId, String empName,long empMobilNo, LocalDate empJoiningDate, double empWorkHours, double empWorkHourRate){
        super(empAadharId,empName,empMobilNo,empJoiningDate);
        this.empWorkHours=empWorkHours;
        this.empWorkHourRate=empWorkHourRate;
    }

    public double getEmpWorkHours(){
        return empWorkHours;
    }

    public double getEmpWorkHourRate(){
        return empWorkHourRate;
    }

    @Override
    public double getEmpTotalSalary() {
        return empWorkHourRate * empWorkHours;
    }

}
