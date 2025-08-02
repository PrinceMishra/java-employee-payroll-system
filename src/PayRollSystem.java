import java.util.ArrayList;

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
                 if(emp.getEmpId()== employee.getEmpId()){
                     employeeToRemove=emp;
                 }
             }

             if(employeeToRemove!=null){
                 employeeList.remove(employeeToRemove);
             }

    }


}
