import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PayRollSystem {

    private ArrayList<Employee> employeeList;

         PayRollSystem(){
            employeeList=new ArrayList<>();
    }

    public void addEmployee(Employee emp){
             employeeList.add(emp);
    }

    public void viewEmployeeList(){
             for(Employee emp : employeeList){
                 employeeList.toString();
             }
    }

    public void removeEmployee(Employee employee){

             Employee employeeToRemove = null;
             for (Employee emp : employeeList)
             {
                 if(emp.getEmpAadharId()== employee.getEmpAadharId()){
                     employeeToRemove=emp;
                 }
             }

             if(employeeToRemove!=null){
                 employeeList.remove(employeeToRemove);
             }

    }

    public void updateEmployee(long empAadharId){

             Employee employeeToUpdate= null;
             for (Employee emp: employeeList){
                 if (emp.getEmpAadharId() == empAadharId){
                     employeeToUpdate=emp;
                     break;
                 }
             }

             if(employeeToUpdate==null){
                 System.out.println("❌ Employee with Aadhar ID " + empAadharId + " not found.");
             }

             if (employeeToUpdate!= null){
                 System.out.println("🔄 Updating Employee: " + employeeToUpdate.getEmpName());
                 Scanner input = new Scanner(System.in);
                 System.out.println("Update Name (current: " + employeeToUpdate.getEmpName());
                 String empName= input.nextLine();
                 if (!empName.isEmpty()){
                     employeeToUpdate.setEmpName(empName);
                 }
                 System.out.println("Update Mobile Number (current: " + employeeToUpdate.getEmpMobileNo());
                 long empMobile=input.nextLong();
                 if (empMobile != 0){
                    employeeToUpdate.setEmpMobileNo(empMobile);
                 }
                 System.out.println("Employee Details Updated Successfully");
             }
    }


    public void menu(){
             while(true)
             {
                 System.out.println("==================================================");
                 System.out.println("                    PAYOUTLY");
                 System.out.println("--------------------------------------------------");
                 System.out.println("             EMPLOYEE PAY ROLL SYSTEM");
                 System.out.println("==================================================");

                 System.out.println("1. Add New Employee: ");
                 System.out.println("1. View Employee details by Aadhar Id: ");
                 System.out.println("1. Update Existing Employee: ");
                 System.out.println("1. Delete Employee by Aadhar Id: ");
                 System.out.println("1. Generate Payslip by Aadhar Id: ");
                 System.out.println("1. List All Employees: ");
                 System.out.println("7. Show Total Number Of Employees: ");

                 Scanner sc = new Scanner(System.in);
                 int choice = Integer.parseInt(sc.nextLine());
                 if (choice==1){
                     System.out.println("1. Full Time Employee:");
                     System.out.println("2. Part Time Employee: ");
                     int choiceEmployee=Integer.parseInt(sc.nextLine());
                     if(choiceEmployee==1){
                         System.out.println("Please enter the name of an employee");
                         String name = sc.nextLine();
                         System.out.println("Please enter the name of an employee");
                         String name = sc.nextLine();
                         System.out.println("Please enter the name of an employee");
                         String name = sc.nextLine();
                         System.out.println("Please enter the name of an employee");
                         String name = sc.nextLine();
                         System.out.println("Please enter the name of an employee");
                         String name = sc.nextLine();
                         System.out.println("Please enter the name of an employee");
                         String name = sc.nextLine();
                     }
                 }


             }
    }
}
