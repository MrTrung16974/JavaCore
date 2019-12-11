package Transfare;

public class main {
    public static void main(String[] args) {
        acount acountA = new acount(1, "Con gà", 50);
        acount acountB = new acount(2, "Con heo", 100);
        System.out.println("số tiền của con gà là : " + acountA.credit(200));
        System.out.println("Số tiền còn lại của gà là : " + acountA.debit(100));
        System.out.println("Số tiền còn lại của gà sau khi chuyển cho heo là : " + acountA.tranferTo(acountB, 10));
        System.out.println("Số Tiền của heo sau khi được gà chuyển tiền cho là : " + acountB.getBalance());

    }
}
