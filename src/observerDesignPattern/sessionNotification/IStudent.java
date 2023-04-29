package observerDesignPattern.sessionNotification;

public interface IStudent {
    String getStudentName();
    void notifyStudent();
    void setSession(ISession session);
}
