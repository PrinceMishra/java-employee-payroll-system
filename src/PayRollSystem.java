import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PayRollSystem {

    private ArrayList<Employee> employeeList;

         PayRollSystem(){
            employeeList=new ArrayList<>();
    }

    public voidaddEmployee(Employee emp){
             employeeList.add(emp);
    }

    public void viewEmployeeDetails(int empAadharId){
        Employee employeeToShow = null;
        for (Employee emp : employeeList)
        {
            if(emp.getEmpAadharId()== empAadharId){
                employeeToShow=emp;
            }
        }

        if(employeeToShow!=null){
            System.out.println("Employee's Name: "+employeeToShow.getEmpId() );
            System.out.println("Employee's Name: "+employeeToShow.getEmpName() );
            System.out.println("Employee's date of joining: "+employeeToShow.getEmpJoiningDate() );
            System.out.println("Employee's Monthly Salary: "+employeeToShow.getEmpMonthlySalary() );
        }
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
                 System.out.println("✅ Employee Details Updated Successfully");
             }
    }

    public void deleteEmployee(int empAadharId){
             Employee employeeToDelete=null;
             for(Employee emp : employeeList){

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
                 System.out.println("2. View Employee details by Aadhar Id: ");
                 System.out.println("3. Update Existing Employee: ");
                 System.out.println("4. Delete Employee by Aadhar Id: ");
                 System.out.println("5. Generate Payslip by Aadhar Id: ");
                 System.out.println("6. List All Employees: ");
                 System.out.println("7. Show Total Number Of Employees: ");
                 System.out.println();
                 System.out.println("Enter choice: ");
                 Scanner sc = new Scanner(System.in);
                 int choice = Integer.parseInt(sc.nextLine());

                 switch(choice){

                     case 1:
                         System.out.println("1. Full Time Employee:");
                         System.out.println("2. Part Time Employee: ");
                         System.out.println();
                         System.out.println("Enter Choice: ");
                         int choiceEmployee=Integer.parseInt(sc.nextLine());
                         if(choiceEmployee==1){
                             System.out.println("Please enter Aadhar number of an employee: ");
                             int empAadharNumber = sc.nextInt();
                             sc.nextLine();
                             System.out.println("Please enter name of an employee: ");
                             String empName = sc.nextLine();
                             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                             System.out.println("Please enter date of joining of an employee (dd-MM-yyyy): ");
                             String empDateOfJoining = sc.nextLine();
                             LocalDate empJoiningDate = LocalDate.parse(empDateOfJoining, formatter);
                             System.out.println("Please enter monthly salary of an employee");
                             double empMonthlySalary = sc.nextDouble();

                             FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(empAadharNumber,empName,empJoiningDate,empMonthlySalary);
                             addEmployee(fullTimeEmployee);
                             System.out.println("✅ Full Time Employee added successfully.");
                         }

                         else if (choiceEmployee == 2) {
                             System.out.println("Please enter employee's Aadhar number : ");
                             int empAadharNumber = sc.nextInt();
                             sc.nextLine();
                             System.out.println("Please enter employee's name : ");
                             String empName = sc.nextLine();
                             DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                             System.out.println("Please enter date of joining of an employee (dd-MM-yyyy): ");
                             String empDateOfJoining = sc.nextLine();
                             LocalDate empJoiningDate = LocalDate.parse(empDateOfJoining, formatter);
                             System.out.println("Please enter total working hours of an employee");
                             double empTotalWorkHours = sc.nextDouble();
                             System.out.println("Please enter the employee's hourly working rate:");
                             double empHourlyRate = sc.nextDouble();

                             PartTimeEmployee partTimeEmployee = new PartTimeEmployee(empAadharNumber,empName,empJoiningDate,empTotalWorkHours,empHourlyRate);
                             addEmployee(partTimeEmployee);
                             System.out.println("✅ Part Time Employee added successfully.");
                         }

                         else {
                             System.out.println("❌ invalid choice, choose correct option");
                         }
                         break;

                     case 2:
                         System.out.println("Enter aadhar Id to know the details of an employee: ");
                         int empAadharId= sc.nextInt();
                         viewEmployeeDetails(empAadharId);
                         break;

                     case 3:
                         System.out.println("Enter aadhar Id to update employee's detail: ");
                         int empUpdateAadharId= sc.nextInt();
                         updateEmployee(empUpdateAadharId);
                         break;

                     case 4:
                         System.out.println("Enter aadhar Id to delete employee: ");
                         int empDeleteAadharId= sc.nextInt();
                         deleteEmployee(empDeleteAadharId);
                         break;

                     case 5:
                         System.out.println("Enter aadhar Id to generate employee's payslip: ");
                         int empPaySlipAadharId= sc.nextInt();
                         deleteEmployee(empPaySlipAadharId);
                         break;


                     case 6:
                         System.out.println("Listing all Employees:  ");
                         viewEmployeeList();
                         break;


                     case 7:
                         System.out.println("Total number of Employees: ");
                         Employee.getEmpCalculateId();
                         break;

                 }

             }
    }
}
