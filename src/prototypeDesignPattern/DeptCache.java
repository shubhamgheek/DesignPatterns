package prototypeDesignPattern;

import java.util.HashMap;
import java.util.Map;

public class DeptCache {

    private static Map<String, Dept> deptMap = new HashMap<>();

    static {
        CSE cse = new CSE();
        cse.setDeptId("CSE");

        ECE ece = new ECE();
        ece.setDeptId("ECE");

        deptMap.put(cse.getDeptId(), cse);
        deptMap.put(ece.getDeptId(), ece);
    }

    public static Dept getDeptDetails(String deptId){
        Dept dept = deptMap.get(deptId);
        return (Dept) dept.clone();
    }
}
