package electricBillManager;

import java.util.Scanner;

public class Bill {
    Scanner scanner = new Scanner(System.in);
    private int maKH;
    private String Name;
    private Date date = new Date();

    public Bill() {

    }

    @Override
    public String toString() {
        return " maKH=" + maKH +
                ", Name='" + Name + '\'' +
                ", day=" + date.getDay() + '\'' +
                ", month=" + date.getMonth() + '\'' +
                ", year=" + date.getYear() + '\''
                ;
    }

    public void input() {
        System.out.println("\n Mời bạn nhập mã khách hàng: ");
        maKH = intNumber();
        scanner.nextLine();
        System.out.println("Mời bạn nhập họ tên khách hàng : ");
        Name = scanner.nextLine();
        date.input();
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

    public Bill(int maKH, String name, Date date) {
        this.maKH = maKH;
        Name = name;
        this.date = date;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float sumPrice() {
        return 0.1f;
    }

}
