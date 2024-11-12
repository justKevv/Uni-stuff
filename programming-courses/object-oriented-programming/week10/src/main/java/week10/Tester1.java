package week10;

import week10.interfaces.Payable;

public class Tester1 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("John", 500);
        IntershipEmployee iEmp = new IntershipEmployee("Jane", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");

        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;


    }
}
