package studentManager;

import java.util.Scanner;

public class student {
    private int Id;
    private String Name;
    private int Year;
    private String Address;
    private float Point;

    main QLSV = new main();
    public void inputInfoSV() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập mã sinh viên : ");
        Id = QLSV.nhapNumber();
        System.out.println("Mời bạn nhập tên sinh viên : ");
        Name = scanner.nextLine();
        System.out.println("Mời bạn nhập năm sinh của sinh viên : ");
        Year = QLSV.nhapNumber();
        System.out.println("Mời bạn nhập địa chỉ sinh viên : ");
        Address = scanner.nextLine();
        System.out.println("Mời bạn nhập điểm cho sinh viên : ");
        Point = QLSV.nhapNumber();
    }

    public void outputInfoSV() {
        System.out.println("Mã sinh viên là : " + Id + ", Tên của sinh viên là : " + Name + ", Sinh viên sinh năm : " + Year + ", Địa chỉ của sinh viên là : " + Address + ", Điểm của sinh viên là " + Point + " Đ");
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public float getPoint() {
        return Point;
    }

    public void setPoint(float point) {
        Point = point;
    }

}


