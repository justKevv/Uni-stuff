package app.src.main.java.week3;

public class MemberDemo {
    public static void main(String[] args) {

        Member member1 = new Member("Nova", "Batu");

        System.out.println("Deposito "+member1.getName()+" Rp. "+member1.getDeposit());

        member1.setName("Kevin");
        member1.setAddress("Malang");
        member1.deposit(1000000);
        System.out.println("Deposito "+member1.getName()+" Rp. "+member1.getDeposit());

        member1.loan(500000);
        System.out.println("Deposito "+member1.getName()+" Rp. "+member1.getDeposit());
    }
}
