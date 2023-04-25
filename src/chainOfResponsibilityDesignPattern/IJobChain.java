package chainOfResponsibilityDesignPattern;

public interface IJobChain {

    // setting the next Job
    void setNextJob(IJobChain jobChain);

    /*
        Helps person to get Job
        1. Maang
        2. Product based
        3. Service based
     */
    void getJob(Person person);
}
