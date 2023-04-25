package prototypeDesignPattern;

public class ECE extends Dept{

    public ECE(){
        deptType = "ECE";
    }

    @Override
    protected void rank() {
        System.out.println("Inside rank method -> ECE class");
    }
}
