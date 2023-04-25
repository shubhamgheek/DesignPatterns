package prototypeDesignPattern;

public class CSE extends Dept {

    public CSE() {
        deptType = "CSE";
    }

    @Override
    protected void rank() {
        System.out.println("Inside rank method -> CSE class");
    }
}
