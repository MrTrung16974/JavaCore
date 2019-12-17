package electricBillManager;

import java.util.Arrays;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberVN = 0, numberNG = 0;
        String objCustomer = null;
                Bill bill = new Bill();
        BillVietnamese vn = new BillVietnamese();
        BillForeign fn = new BillForeign();
        Repository repository = new Repository();
        System.out.println("Mời bạn nhấp số hóa đợn của khách hàng việt nam : ");
        numberVN = bill.intNumber();
        BillVietnamese[] vietnameses = new BillVietnamese[numberVN];

        for(int i = 0; i < numberVN; i++ ) {
            System.out.println("Khách hàng thứ " + (i+1) + " : ");
            vietnameses[i] = new BillVietnamese();
            vietnameses[i].input();
            System.out.println("\n******************************\n");
        }
        repository.setListBillVienNam(Arrays.asList(vietnameses));
        System.out.println("Mời bạn nhấp số hóa đơn của khách hàng nước ngoài : ");
        numberNG = bill.intNumber();
        BillForeign[] foreigns = new BillForeign[numberNG];
        for(int i = 0; i < numberNG; i++ ) {
            System.out.println("Khách hàng thứ " + (i+1) + " : ");
            foreigns[i] = new BillForeign();
            foreigns[i].input();
            System.out.println("\n******************************\n");
        }
        repository.setListBillForeing(Arrays.asList(foreigns));
        System.out.println("******************************************");
        System.out.println("Xuất ra tất cả các hóa đơn : ");
        for(BillVietnamese vietnamese : vietnameses) {
            System.out.println(vietnamese.toString());
        }
        for(BillForeign foreign : foreigns) {
            System.out.println(foreign.toString());
        }

        System.out.println("*******************************************");
//        xuất ra số lượng hóa đơn của khách nước ngoài và việt nam
        repository.numberUnit();

        System.out.println("********************************************");
//        tính số tiền trung binh của khách nước ngoài
        repository.averagePayFG();

        System.out.println("********************************************");
//        tìm những hóa đơn có trong tháng 9 và năm 2013
        repository.findCustomer(9, 2013);
    }

}

