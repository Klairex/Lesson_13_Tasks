import Task1.*;
import Task2.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager("Ion",30,"Economie");
        Programmer programmer = new Programmer("Petru",25,"JAVA");

        manager.attendTraining();
        manager.conductInterview();

        programmer.attendTraining();
        System.out.println();

        List<AttendTraining> workers = new ArrayList<>();
        workers.add(manager);
        workers.add(programmer);

        MeetingRoom meetingRoom = new MeetingRoom(workers);
        meetingRoom.showWhoIsAtTraining();


        //Task 3
        System.out.println();
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Ana", 35, "IT"));
        employees.add(new Programmer("Sergiu", 28, "C++"));
        employees.add(new Manager("Alexandru", 40, "HR"));
        employees.add(new Programmer("Diana", 30, "Python"));

        for (Employee employee : employees) {
            if (employee instanceof AttendTraining) {
                ((AttendTraining) employee).attendTraining();
            }
            if (employee instanceof ConductInterview) {
                ((ConductInterview) employee).conductInterview();
            }
        }


    }
}



