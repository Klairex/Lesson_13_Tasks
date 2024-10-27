package Task2;

import Task1.*;

import java.util.List;

public class MeetingRoom {
    private List<AttendTraining> employee;

    public MeetingRoom(List<AttendTraining> employee){
        this.employee = employee;

    }

    public void showWhoIsAtTraining(){
        for (AttendTraining workers : employee) {
            workers.attendTraining();
        }
    }
}
