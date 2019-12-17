package electricBillManager;

import java.util.Scanner;

public class CustomerManufacturing extends Customer {
    private String name = " Manafacturing";
    public CustomerManufacturing() {

    }
    public CustomerManufacturing(String name, int number, int unit, int limit) {
        super(number, unit, limit);
        this.name = name;
    }


    @Override
    public void input() {
        super.input();
        System.out.println("");
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                super.toString() + "}";
    }
}
