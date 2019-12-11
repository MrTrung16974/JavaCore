package Transfare;

public class acount {
    private int id;
    private String name;
    private int balance;

    public acount(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
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

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int credit(int amount ) {
        if(amount % 2== 0) {
            this.balance += amount;
        }else {
            System.out.println("Bạn phải truyền vào số dương");
        }
        return this.balance;
    }

    public int debit(int amount) {
        if(this.balance > amount && this.balance != 0 ) {
            this.balance -= amount;
        }else {
            System.out.println("Bạn không thể thanh toán số tiên lớn hơn số tiền trong tài khoản");
        }
        return this.balance;
    }
    public int tranferTo(acount act, int amount) {
        if(this.balance > amount && this.balance != 0 ) {
            this.balance -= amount;
            int mony = act.getBalance();
            mony += amount;
        }else {
            System.out.println("Lỗi ko thể chuyển tiền");
        }
        return this.balance ;
    }

}
