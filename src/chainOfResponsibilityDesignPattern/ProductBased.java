package chainOfResponsibilityDesignPattern;

public class ProductBased implements IJobChain{

    private IJobChain jobChain;

    @Override
    public void setNextJob(IJobChain jobChain) {
        this.jobChain = jobChain;
    }

    @Override
    public void getJob(Person person) {
        if(person.getSkillType().equals("Product")){
            System.out.println("Got selected in Product group");
        }else{
            System.out.println("Got rejected in Product group");
            System.out.println("Applying for Service based companies...");
            this.jobChain.getJob(person);
        }
    }
}
