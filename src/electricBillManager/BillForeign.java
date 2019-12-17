package electricBillManager;


public class BillForeign extends Bill {
    private String nationality;
    private int number;
    private int unitPrice;
    private int quota;
    private float intoMony;

    public BillForeign() {
    }

    public BillForeign(int maKH, String name, Date date, String nationality, int number, int unitPrice, int quota, float intoMony) {
        super(maKH, name, date);
        this.nationality = nationality;
        this.number = number;
        this.unitPrice = unitPrice;
        this.quota = quota;
        this.intoMony = intoMony;
    }

    @Override
    public void input(){
        System.out.println("Khách hàng nước ngoài : ");
        super.input();
        System.out.println("Mời bạn nhập quốc tịch của khách hàng : ");
        nationality = scanner.nextLine();
        System.out.println("Mời bạn nhập số số lượng tiêu thụ : ");
        number = intNumber();
        System.out.println("Mời bạn nhập đơn giá điện : ");
        unitPrice = intNumber();
        System.out.println("Mời bạn nhập định mức : ");
        quota = intNumber();
    }

    @Override
    public float sumPrice() {
        intoMony = (float)(number * unitPrice);
        return intoMony;
    }

    @Override
    public String toString() {
        return "CustomerForeign{" +
                super.toString() +
                "nationality='" + nationality + '\'' +
                ", amount=" + number +
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

}
