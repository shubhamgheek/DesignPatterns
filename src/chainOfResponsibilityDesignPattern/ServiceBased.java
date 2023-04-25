package chainOfResponsibilityDesignPattern;

public class ServiceBased implements IJobChain{

    // Knows who is the next in the job chain
    private IJobChain jobChain;

    @Override
    public void setNextJob(IJobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("Service")){
            System.out.println("Got Selected in Service group.");
        }else{
            System.out.println("Got rejected in Service group.");
            System.out.println("Please prepare more ...");
        }
    }
}
