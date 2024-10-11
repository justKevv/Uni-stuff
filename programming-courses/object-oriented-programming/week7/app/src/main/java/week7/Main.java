package week7;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program Testing Class Manager & Staff");

        Manager man[] = new Manager[2];
        Staff staff1[] = new Staff[2];
        Staff staff2[] = new Staff[3];

        man[0] = new Manager();
        man[0].setName("Tedjo");
        man[0].setNip("0101");
        man[0].setLevel("1");
        man[0].setAllowance(2500000);
        man[0].setDepartment("Administration");

        man[1] = new Manager();
        man[1].setName("Atika");
        man[1].setNip("0201");
        man[1].setLevel("1");
        man[1].setAllowance(2500000);
        man[1].setDepartment("Marketing");

        staff1[0] = new Staff();
        staff1[0].setName("Usman");
        staff1[0].setNip("0003");
        staff1[0].setLevel("2");
        staff1[0].setOvertimeHours(10);
        staff1[0].setOvertimePay(10000);

        staff1[1] = new Staff();
        staff1[1].setName("Anugrah");
        staff1[1].setNip("0005");
        staff1[1].setLevel("2");
        staff1[1].setOvertimeHours(10);
        staff1[1].setOvertimePay(5500);
        man[0].setStaff(staff1);

        staff2[0] = new Staff();
        staff2[0].setName("Hendra");
        staff2[0].setNip("0004");
        staff2[0].setLevel("3");
        staff2[0].setOvertimeHours(15);
        staff2[0].setOvertimePay(5500);
        man[1].setStaff(staff2);

        staff2[1] = new Staff();
        staff2[1].setName("Arie");
        staff2[1].setNip("0006");
        staff2[1].setLevel("4");
        staff2[1].setOvertimeHours(5);
        staff2[1].setOvertimePay(100000);

        staff2[2] = new Staff();
        staff2[2].setName("Mentari");
        staff2[2].setNip("0007");
        staff2[2].setLevel("3");
        staff2[2].setOvertimeHours(6);
        staff2[2].setOvertimePay(20000);
        man[1].setStaff(staff2);

        // Print information from managers and their staff
        man[0].showInfo();
        man[1].showInfo();

    }
}
