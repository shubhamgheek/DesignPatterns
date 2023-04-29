package observerDesignPattern.sessionNotification;

public interface ISession {
    void register(IStudent student);
    void unRegister(IStudent student);
    String getUpdate(IStudent student);
    void notifyStudents();

    String getSessionName();
}
