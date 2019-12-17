package electricBillManager;

public class BillVietnamese extends Bill {
    private CustomerBusiness customer1 = new CustomerBusiness();
    private CustomerLiving customer2 = new CustomerLiving();
    private CustomerManufacturing customer3 = new CustomerManufacturing();
    private int choose = 5;
    private float intoMony;

    public BillVietnamese() {

    }

    public BillVietnamese(int maKH, String name, Date date, CustomerBusiness customer1, CustomerLiving customer2, CustomerManufacturing customer3, int choose, float intoMony) {
        super(maKH, name, date);
        this.customer1 = customer1;
        this.customer2 = customer2;
        this.customer3 = customer3;
        this.choose = choose;
        this.intoMony = intoMony;
    }

    public Customer objCustomer(int choose) {
        Customer customer = null;
        switch (choose) {
            case 1:
                customer = customer1;
                break;
            case 2:
                customer = customer2;
                break;
            case 3:
                customer = customer3;
                break;
            default:
                System.out.println("Lựa chọn của bạn không tồn tại");
                break;
        }
        return customer;
    }



    @Override
    public void input(){
        System.out.println("Khách hàng Việt Nam : ");
        super.input();
        System.out.println("Mời bạn nhập đói tượng khách hàng : ");
        while (choose > 3 || choose < 0) {
            System.out.println("1. CustomerBusiness");
            System.out.println("2. CustomerLiving");
            System.out.println("3. CustomerManufacturing");
            choose = intNumber();
            objCustomer(choose).input();
        }
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public CustomerBusiness getCustomer1() {
        return customer1;
    }

    public void setCustomer1(CustomerBusiness customer1) {
        this.customer1 = customer1;
    }

    public CustomerLiving getCustomer2() {
        return customer2;
    }

    public void setCustomer2(CustomerLiving customer2) {
        this.customer2 = customer2;
    }

    public CustomerManufacturing getCustomer3() {
        return customer3;
    }

    public void setCustomer3(CustomerManufacturing customer3) {
        this.customer3 = customer3;
    }

    public float getIntoMony() {
        return intoMony;
    }

    public void setIntoMony(float intoMony) {
        this.intoMony = intoMony;
    }

    @Override
    public float sumPrice() {
        if(this.customer1.getNumber() <= this.customer1.getLimit() ) {
            intoMony = (float) (this.objCustomer(choose).getNumber() * this.objCustomer(choose).getLimit());
        }else {
            intoMony = (float) (this.objCustomer(choose).getNumber() * this.objCustomer(choose).getUnit() * this.objCustomer(choose).getLimit() + (this.customer1.getNumber() - this.objCustomer(choose).getLimit()) * this.objCustomer(choose).getUnit() * 2.5);
        }
        return intoMony;
    }

    @Override
    public String toString() {
        return "CustomerVietnamese{" +
                super.toString() +
                objCustomer(choose).toString() +
                ", intoMony=" + intoMony +
                '}';
    }

}
