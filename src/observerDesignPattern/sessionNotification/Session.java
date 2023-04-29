package observerDesignPattern.sessionNotification;

import java.util.ArrayList;
import java.util.List;

public class Session implements ISession{

    private final String sessionName;
    private List<IStudent> studentList;

    public Session(String sessionName){
        this.sessionName = sessionName;
        this.studentList = new ArrayList<>();
    }

    @Override
    public void register(IStudent student) {
        System.out.println("Student with name: "+ student.getStudentName()+" registered for session: "+sessionName);
        studentList.add(student);
    }

    @Override
    public void unRegister(IStudent student) {
        System.out.println("Student with name: "+ student.getStudentName()+" un-registered for session: "+sessionName);
        studentList.remove(student);
    }

    @Override
    public String getUpdate(IStudent student) {
        if(studentList.contains(student)){
            return this.sessionName;
        }
        return null;
    }

    @Override
    public void notifyStudents() {
        for(IStudent student : studentList){
            student.notifyStudent();
        }
    }

    @Override
    public String getSessionName() {
        return sessionName;
    }
}
