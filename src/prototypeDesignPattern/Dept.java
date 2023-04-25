package prototypeDesignPattern;

public abstract class Dept implements Cloneable {

    private String deptId;
    protected String deptType;

    // Non-abstract methods
    public String getDeptType() {
        return deptType;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    // Abstract methods
    protected abstract void rank();

    // As a part of cloneable interface
    @Override
    protected Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
}
