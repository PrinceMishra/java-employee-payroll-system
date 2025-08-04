import java.time.LocalDate;

public abstract class Employee {

    private static int empCalculateId;
    private final long empAadharId;
    private String empName;
    private LocalDate empJoiningDate;
    private long empMobileNo;
    private long empId;

    Employee(int empAadharId, String empName, LocalDate empJoiningDate){
        empId=empCalculateId++;
        this.empAadharId = empAadharId;
        this.empName=empName;
        this.empJoiningDate =empJoiningDate;
    }

    public long getEmpAadharId() {
        return empAadharId;
    }
    public String getEmpName(){
        return empName;
    }
    public LocalDate getEmpJoiningDate() {
        return empJoiningDate;
    }
    public long getEmpMobileNo(){
        return empMobileNo;
    }
    public long getEmpId(){
        return empId;
    }

    public void setEmpName(String empUpdatedName){
        this.empName=empUpdatedName;
    }

    public void setEmpMobileNo(long empMobileNo){
        this.empMobileNo=empMobileNo;
    }

    @Override
    public String toString() {
        return "Employee Id : "+ empAadharId +" Employee Name : "+empName+" Employee Joining Date : "+empJoiningDate;
    }

    public abstract double empSalary();
}
