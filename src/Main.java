import Task1.*;
import Task2.*;
import Task3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        Manager manager = new Manager("Ion",30,"Economie");
        Programmer programmer = new Programmer("Petru",25,"JAVA");

        manager.attendTraining();
        manager.conductInterview();

        programmer.attendTraining();


        System.out.println("Task2");
        List<AttendTraining> workers = new ArrayList<>();
        workers.add(manager);
        workers.add(programmer);

        MeetingRoom meetingRoom = new MeetingRoom(workers);
        meetingRoom.showWhoIsAtTraining();


        //Task 3
        System.out.println("Task3");
        List<Employee> employees = new ArrayList<>();
        employees.add(new Manager("Ana", 35, "IT"));
        employees.add(new Programmer("Sergiu", 28, "C++"));
        employees.add(new Manager("Alexandru", 40, "HR"));
        employees.add(new Programmer("Diana", 30, "Python"));

        EmployerList employerList = new EmployerList();
        employerList.ShowInfo(employees);


    }
}



