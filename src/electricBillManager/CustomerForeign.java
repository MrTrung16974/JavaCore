package electricBillManager;

public class CustomerForeign extends Customer {
    private String nationality;
    private int amount;
    private int unitPrice;
    private int quota;
    private float intoMony;

    public CustomerForeign() {
    }
    public CustomerForeign(int maKH, String name, int day, int month, int year, String nationality, int amount,int quota, int unitPrice) {
        super(maKH, name, day, month, year);
        this.nationality = nationality;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.quota = quota;
    }

    @Override
    public void input(){
        System.out.println("Khách hàng nước ngoài : ");
        super.input();
        scanner.nextLine();
        System.out.println("Mời bạn nhập quốc tịch của khách hàng : ");
        nationality = scanner.nextLine();
        System.out.println("Mời bạn nhập số số lượng tiêu thụ : ");
        amount = intNumber();
        System.out.println("Mời bạn nhập đơn giá điện : ");
        unitPrice = intNumber();
        System.out.println("Mời bạn nhập định mức : ");
        quota = intNumber();
    }

    @Override
    public String toString() {
        return super.toString() +
                "CustomerForeign{" +
                "nationality='" + nationality + '\'' +
                ", amount=" + amount +
                ", unitPrice=" + unitPrice +
                ", intoMony=" + intoMony +
                '}';
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
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

    @Override
    public int sumAmount() {
        int sumAmount = 0;
        sumAmount =  this.amount;
        return sumAmount;
    }

    @Override
    public float sumPrice() {
        this.intoMony = amount * unitPrice;
        return this.intoMony;
    }
}
