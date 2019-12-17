package electricBillManager;

public class Customer extends Bill{
    private int number;
    private int unit;
    private int limit;
    public Customer() {

    }
    public Customer(int number, int unit, int limit) {
        this.number = number;
        this.unit = unit;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "number=" + number +
                ", unit=" + unit +
                ", limit=" + limit
                ;
    }

    public void input(){
        System.out.println("Mời bạn nhập số số lượng tiêu thụ : ");
        number = intNumber();
        System.out.println("Mời bạn nhập đơn giá điện : ");
        unit = intNumber();
        System.out.println("Mời bạn nhập định mức : ");
        limit = intNumber();
    }
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
