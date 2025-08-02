import java.time.LocalDate;

public abstract class Employee {

    private int empId;
    private String empName;
    private LocalDate empJoiningDate;

    Employee(int empId,String empName, LocalDate empDob){
        this.empId=empId;
        this.empName=empName;
        this.empJoiningDate =empDob;
    }

    public int getEmpId() {
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public LocalDate getEmpJoiningDate() {
        return empJoiningDate;
    }

    @Override
    public String toString() {
        return "Employee Id : "+empId+" Employee Name : "+empName+" Employee Joining Date : "+empJoiningDate;
    }

    public abstract double empSalary();
}
