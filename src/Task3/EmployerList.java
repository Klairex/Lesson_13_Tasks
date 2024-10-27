package Task3;

import Task1.AttendTraining;
import Task1.ConductInterview;
import Task1.Employee;

import java.util.List;

public class EmployerList {

    public void ShowInfo (List<Employee> e){
        for (Employee employee : e) {
            if (employee instanceof AttendTraining) {
                ((AttendTraining) employee).attendTraining();
            }
            if (employee instanceof ConductInterview) {
                ((ConductInterview) employee).conductInterview();
            }
        }
    }
}
