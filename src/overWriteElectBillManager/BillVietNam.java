package overWriteElectBillManager;

import checkYear.Date;

public class BillVietNam extends Bill {
    private Customer customer;

    public BillVietNam(String id, String name, Date date, Customer customer) {
        super(id, name, date);
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public float pay() {
//        từ khóa super đại điện cho thằng cha mà nó kết thừa
        float sumMony;
        if(this.getCustomer().getNumber() < this.getCustomer().getLimit()) {
            sumMony = this.getCustomer().getNumber() * this.getCustomer().getLimit();
            System.out.println("Số tiền tiền điện của khách hàng " + super.getName() + " là : " + sumMony);
        }else {
            sumMony = (float) (this.getCustomer().getNumber() * this.getCustomer().getLimit()
                    + (this.getCustomer().getNumber() - this.getCustomer().getLimit()) * 2.5 * this.getCustomer().getLimit());
            System.out.println("Số tiền tiền điện của khách hàng " + super.getName() + " là : " + sumMony);
        }
        return sumMony;
    }

    @Override
    public String toString() {
        return  "BillVietNam{" +
                super.toString() +
                "customer=" + customer +
                '}';
    }
}
