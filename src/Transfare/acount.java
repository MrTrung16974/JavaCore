package Transfare;

import static java.awt.Color.black;

public class acount {
    private int id;
    private String name;
    private double balance;

    public acount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public acount() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(int amount ) {
        if(amount < 0) {
            System.out.println("Số tiền của bạn chuyền vào số tiền âm");
            return ;
        }
        this.setBalance(this.getBalance() + amount);
        System.out.println("Số dư trong tài khoản của " + this.name + " : " + this.balance );
    }

    public void debit(int amount) {
        if(amount < 0 || amount > this.balance ) {
            System.out.println("Số tiền tiền ko hợp lệ");
            return;
        }
        this.setBalance(this.getBalance() - amount);
        System.out.println("Số dư trong tài khoản của " + this.name + " : " + this.balance );
    }
    public void tranferTo(acount act, int amount) {
        if(amount < 0 || amount > this.balance ) {
            System.out.println("Số tiền muốn chuyễn ko hợp lệ");
            return;
        }
        this.setBalance(getBalance() - amount);
        act.setBalance(act.getBalance() + amount);
        System.out.println("Số dư trong tài khoản của " + this.name + " : " + this.balance );
        System.out.println("Số dư trong tài khoản của " + act.name + " : " + act.balance );
    }

}
