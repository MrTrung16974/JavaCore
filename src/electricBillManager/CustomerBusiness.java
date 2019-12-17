package electricBillManager;

public class CustomerBusiness extends Customer {
    private String name = "Busineass";
    public CustomerBusiness() {

    }
    public CustomerBusiness(String name, int number, int unit, int limit) {
        super(number, unit, limit);
        this.name = name;

    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                super.toString() + "}";
    }

    @Override
    public void input() {
        super.input();
    }
}
