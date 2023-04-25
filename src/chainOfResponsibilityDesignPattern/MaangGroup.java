package chainOfResponsibilityDesignPattern;

public class MaangGroup implements IJobChain{

    private IJobChain jobChain;

    @Override
    public void setNextJob(IJobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("MAANG")){
            System.out.println("Got selected in MAANG group");
        }else{
            System.out.println("Got rejected in MAANG group");
            System.out.println("Applying for Product based companies...");
            this.jobChain.getJob(person);
        }
    }
}
