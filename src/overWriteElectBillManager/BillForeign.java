package overWriteElectBillManager;

import checkYear.Date;

public class BillForeign extends Bill {
    private String national;
    private int number;
    private int unit;

    public BillForeign(String id, String name, Date date, String national, int number, int unit) {
        super(id, name, date);
        this.national = national;
        this.number = number;
        this.unit = unit;
    }

    public BillForeign(String id, String national, int number, int unit) {
        super(id);
        this.national = national;
        this.number = number;
        this.unit = unit;
    }

    @Override
    public float pay() {
        float sumMony = this.getNumber() * this.unit;
        System.out.println("Số tiền điện của khách hàng " + this.getName() + " là  : " + sumMony);
        return sumMony;
    }

    @Override
    public String toString() {
        return "BillForeign{" +
                super.toString() +
                "national='" + national + '\'' +
                ", number=" + number +
                ", unit=" + unit +
                '}';
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
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


}
