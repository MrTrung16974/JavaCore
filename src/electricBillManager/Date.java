package electricBillManager;

import java.util.Scanner;

public class Date {
    Scanner scanner = new Scanner(System.in);
    private int day;
    private int month;
    private int year;

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
    public void input() {
        System.out.println("Mời bạn nhập ngày: ");
        day = intNumber();
        System.out.println("Mời bạn nhập tháng: ");
        month = intNumber();
        System.out.println("Mời bạn nhập năm: ");
        year = intNumber();
    }
}
