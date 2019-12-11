package EmployeeManager;

public class main {
    public static void main(String[] args) {
        int numberEmployee = 0, mediumSalary = 0, totalSealary = 0;
        System.out.println("Mời bạn nhập số nhân viên ");
        Employee employee1 = new Employee();
        numberEmployee = employee1.intNumber();
        Employee[] employee = new Employee[numberEmployee];
        for(int i = 0; i < numberEmployee; i++) {
            System.out.println("Nhập nhân viên thứ " + i+1 + " : ");
            System.out.println("Chọn loại nhân viên 1(Lập trình viên ), 2(kiểm soát viên) : ");
            int choose = employee1.intNumber();
            if(choose == 1) {
                employee[i] = new Programmer();
            }else if(choose == 2) {
                employee[i] = new Proofeader();
            }else {
                System.out.println("Ko có loại nhân viên mà bạn muốn lựa chọn");
            }
            employee[i].input();
            employee[i].sumSalary();
        }
        System.out.println("**************************************************************");
        System.out.println("Thông tin của tất cả các nhân viên là : ");
        for(int i = 0; i < numberEmployee; i++) {
            System.out.println("*********************");
            System.out.println("Nhân viên thứ " +  (i + 1) + " : ");
            System.out.println(employee[i].toString());
        }
        System.out.println("\n***********************************************************");
        System.out.println("Danh sách nhân viên có mực lương thấp hơn trung bình của các nhân viên trong công ti là : ");
        for(int i = 0; i < numberEmployee; i++) {
            totalSealary += employee[i].sumSalary();
        }
        mediumSalary = totalSealary / numberEmployee;
        for(int i = 0; i < numberEmployee; i++) {
            if(employee[i].sumSalary() <= mediumSalary) {
                System.out.println("***********************");
                System.out.println(employee[i].toString());
            }
        }
    }
}
