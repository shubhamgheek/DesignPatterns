package observerDesignPattern.sessionNotification;

public class Main {
    public static void main(String[] args) {
        ISession javaSession = new Session("Java Backend Dev");
        ISession linuxSession = new Session("Kali Linux");

        IStudent shubham = new Student("Shubham");
        IStudent sanskar = new Student("Sanskar");
        IStudent vikash = new Student("Vikash");

        javaSession.register(shubham);
        linuxSession.register(sanskar);

        shubham.setSession(javaSession);
        sanskar.setSession(linuxSession);

        javaSession.notifyStudents();
        System.out.println();
        linuxSession.notifyStudents();
        System.out.println();
        System.out.println(javaSession.getUpdate(vikash));
    }
}
