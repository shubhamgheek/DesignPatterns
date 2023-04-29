package observerDesignPattern.sessionNotification;

public class Student implements IStudent{
    private final String studentName;
    private ISession session;

    public Student(String studentName){
        this.studentName = studentName;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public void notifyStudent(){
        System.out.println(studentName+": Session update => "+session.getUpdate(this));
    }

    public void setSession(ISession session){
        this.session = session;
    }
}
