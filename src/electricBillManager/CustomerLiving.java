package electricBillManager;

public class CustomerLiving extends Customer {
    private String name = "Living";
    public CustomerLiving() {

    }
    public CustomerLiving(String name, int number, int unit, int limit) {
        super(number, unit, limit);
        this.name = name;
    }

    @Override
    public void input() {
        super.input();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                super.toString() + "}";
    }
}
