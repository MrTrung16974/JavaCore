package Transfare;

public class main {
    public static void main(String[] args) {
        acount acountA = new acount(1, "Con gà", 0.0);
        acount acountB = new acount(2, "Con heo", 0.0);
        acountA.credit(2000);
        acountB.credit(1000);

        acountA.debit(-12);
        acountA.debit(11112);
        System.out.println("__________________");
        acountA.tranferTo(acountB, 1000);
    }
}
