package prototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Dept clonedCSE = DeptCache.getDeptDetails("CSE");
        clonedCSE.rank();
        System.out.println("Dept name: "+ clonedCSE.getDeptType());

        Dept clonedECE = DeptCache.getDeptDetails("ECE");
        clonedECE.rank();
        System.out.println("Dept name: "+ clonedECE.getDeptType());

    }
}
