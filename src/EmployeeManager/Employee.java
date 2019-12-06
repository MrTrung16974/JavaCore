package EmployeeManager;

import java.util.Scanner;

public class Employee {
    private int MaNV;
    private String hoTen;
    private int phone;
    private String email;
    private int basicSalary;

    Scanner scanner = new Scanner(System.in);



    @Override
    public String toString() {
        return  "\n Mã nhân viên là : " + MaNV + ". " +
                "\n Họ tên nhân viên là : " + hoTen + ". " +
                "\n Số điện thoại của nhân viên là : " + phone + ". " +
                "\n Email của nhân viên là : " + email + '\'' + ". " +
                "\n Lương cơ bản của nhân viên là : " + basicSalary + ". ";
    }

    public int getMaNV() {
        return MaNV;
    }

    public void setMaNV(int maNV) {
        MaNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
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
        System.out.println("\n Mời bạn nhập mã nhân viên : ");
        MaNV = intNumber();
        scanner.nextLine();
        System.out.println("Mời bạn nhập họ tên nhân viên : ");
        hoTen = scanner.nextLine();
        System.out.println("Mời bạn nhập số điện thoại của nhân viên : ");
        phone = intNumber();
        scanner.nextLine();
        System.out.println("Mời bạn nhập email của nhân viên : ");
        email = scanner.nextLine();
        System.out.println("Mời bạn nhập lương cơ bạn của nhân viên : ");
        basicSalary = intNumber();
    }
    public int sumSalary() {
        return 0;
    }
}
