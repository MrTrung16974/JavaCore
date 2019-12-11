package electricBillManager;

import java.util.Scanner;

public class Customer {
    Scanner scanner = new Scanner(System.in);
    private int maKH;
    private String Name;
    private int day;
    private int month;
    private int year;

    public Customer() {

    }

    public void input() {
        System.out.println("\n Mời bạn nhập mã khách hàng: ");
        maKH = intNumber();
        scanner.nextLine();
        System.out.println("Mời bạn nhập họ tên khách hàng : ");
        Name = scanner.nextLine();
        System.out.println("Mời bạn nhập ngày : ");
        day = intNumber();
        scanner.nextLine();
        System.out.println("Mời bạn nhập tháng : ");
        month = intNumber();
        System.out.println("Mời bạn nhập năm : ");
        year = intNumber();
    }

    public int intNumber() {
        int n = 0;
        boolean check = false;
        while (!check) {
            try {
                n = scanner.nextInt();
                check = true;
            }catch (Exception e) {
                System.out.println("Bạn phải nhập một số!Hãy nhập lại...");
                scanner.nextLine();
            }
        }
        return n;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Customer(int maKH, String name, int day, int month, int year) {
        this.maKH = maKH;
        Name = name;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public float sumPrice() {
        return 0.1f;
    }
    public int sumAmount() {
        return 0;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "maKH=" + maKH +
                ", Name='" + Name + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
