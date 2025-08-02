import java.time.LocalDate;

public class PartTimeEmployee extends Employee {

    private double empWorkHours;
    private double empWorkHourRate;

    PartTimeEmployee(int empId, String empName, LocalDate empDob,double empWorkHours, double empWorkHourRate){
        super(empId,empName,empDob);
    }

    public double getEmpWorkHours(){
        return empWorkHours;
    }

    public double getEmpWorkHourRate(){
        return empWorkHourRate;
    }

    @Override
    public double empSalary() {
        return empWorkHourRate * empWorkHours;
    }
}
