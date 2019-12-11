package electricBillManager;

public class CustomerVietnamese extends Customer {
    private int amount;
    private int unitPrice;
    private int quota;
    private float intoMony;

    public CustomerVietnamese() {

    }

    public CustomerVietnamese(int maKH, String name, int day, int month, int year, int amount, int unitPrice, int quota) {
        super(maKH, name, day, month, year);
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.quota = quota;
    }

    @Override
    public void input(){
        System.out.println("Khách hàng Việt Nam : ");
        super.input();
        System.out.println("Mời bạn nhập số số lượng tiêu thụ : ");
        amount = intNumber();
        System.out.println("Mời bạn nhập đơn giá điện : ");
        unitPrice = intNumber();
        System.out.println("Mời bạn nhập định mức : ");
        quota = intNumber();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public float getIntoMony() {
        return intoMony;
    }

    public void setIntoMony(float intoMony) {
        this.intoMony = intoMony;
    }

    @Override
    public int sumAmount() {
        int sumAmount = 0;
        sumAmount =  this.amount;
        return sumAmount;
    }

    @Override
    public String toString() {
        return super.toString() +
                "CustomerVietnamese{" +
                "amount=" + amount +
                ", unitPrice=" + unitPrice +
                ", quota=" + quota +
                ", intoMony=" + intoMony +
                '}';
    }
    @Override
    public float sumPrice() {
        if(amount <= quota ) {
            this.intoMony = amount * unitPrice;
        }
        int amountOfPasses = amount - quota;
        this.intoMony = (float) (amount * unitPrice * quota + amountOfPasses * unitPrice * 2.5);
        return this.intoMony;
    }

}
